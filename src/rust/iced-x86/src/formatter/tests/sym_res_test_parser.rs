// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

use crate::formatter::enums_shared::SymbolFlags;
use crate::formatter::tests::enums::OptionsProps;
use crate::formatter::tests::opt_value::OptionValue;
use crate::formatter::tests::options_parser::parse_option;
use crate::formatter::tests::sym_res_test_case::*;
use crate::test_utils::from_str_conv::*;
use crate::test_utils::get_default_ip;
use crate::MemorySize;
use alloc::string::String;
use alloc::vec::Vec;
use core::iter::IntoIterator;
use std::collections::{HashMap, HashSet};
use std::fs::File;
use std::io::prelude::*;
use std::io::{BufReader, Lines};
use std::path::Path;

pub(super) struct SymbolResolverTestParser<'a> {
	filename: String,
	lines: Lines<BufReader<File>>,
	ignored: &'a mut HashSet<u32>,
}

impl<'a> SymbolResolverTestParser<'a> {
	pub(super) fn new(filename: &Path, ignored: &'a mut HashSet<u32>) -> Self {
		let display_filename = filename.display().to_string();
		let file = File::open(filename).unwrap_or_else(|_| panic!("Couldn't open file {}", display_filename));
		let lines = BufReader::new(file).lines();
		Self { filename: display_filename, lines, ignored }
	}
}

impl<'a> IntoIterator for SymbolResolverTestParser<'a> {
	type Item = SymbolResolverTestCase;
	type IntoIter = IntoIter<'a>;

	fn into_iter(self) -> Self::IntoIter {
		// GENERATOR-BEGIN: OptionsDict
		// ⚠️This was generated by GENERATOR!🦹‍♂️
		let mut to_flags: HashMap<&'static str, u32> = HashMap::with_capacity(2);
		let _ = to_flags.insert("rel", SymbolFlags::RELATIVE);
		let _ = to_flags.insert("signed", SymbolFlags::SIGNED);
		// GENERATOR-END: OptionsDict

		IntoIter { filename: self.filename, lines: self.lines, ignored: self.ignored, test_case_number: 0, line_number: 0, to_flags }
	}
}

pub(super) struct IntoIter<'a> {
	filename: String,
	lines: Lines<BufReader<File>>,
	ignored: &'a mut HashSet<u32>,
	test_case_number: u32,
	line_number: u32,
	to_flags: HashMap<&'static str, u32>,
}

impl Iterator for IntoIter<'_> {
	type Item = SymbolResolverTestCase;

	fn next(&mut self) -> Option<Self::Item> {
		loop {
			let result = match self.lines.next()? {
				Ok(line) => {
					self.line_number += 1;
					if line.is_empty() || line.starts_with('#') {
						continue;
					}
					self.test_case_number += 1;
					self.read_next_test_case(line, self.line_number)
				}
				Err(err) => Err(err.to_string()),
			};
			match result {
				Ok(tc) => {
					if let Some(tc) = tc {
						return Some(tc);
					} else {
						let _ = self.ignored.insert(self.test_case_number - 1);
						continue;
					}
				}
				Err(err) => panic!("Error parsing symbol resolver test case file '{}', line {}: {}", self.filename, self.line_number, err),
			}
		}
	}
}

impl IntoIter<'_> {
	fn read_next_test_case(&self, line: String, line_number: u32) -> Result<Option<SymbolResolverTestCase>, String> {
		let elems: Vec<_> = line.split(',').collect();
		const SYM_RES_INDEX: usize = 4;
		if elems.len() < SYM_RES_INDEX {
			return Err(format!("Invalid number of commas: {}", elems.len() - 1));
		}

		let bitness = to_u32(elems[0])?;
		let ip = get_default_ip(bitness);
		let hex_bytes = String::from(elems[1].trim());
		let _ = to_vec_u8(&hex_bytes)?;
		if is_ignored_code(elems[2]) {
			return Ok(None);
		}
		let code = to_code(elems[2])?;

		let mut options: Vec<(OptionsProps, OptionValue)> = Vec::new();
		for value in elems[3].split_whitespace() {
			if value.is_empty() {
				continue;
			}
			options.push(parse_option(value)?);
		}

		let mut symbol_results: Vec<SymbolResultTestCase> = Vec::with_capacity(elems.len() - SYM_RES_INDEX);
		for elem in &elems[SYM_RES_INDEX..] {
			let sym_parts: Vec<_> = elem.split(';').collect();
			if sym_parts.len() != 5 {
				return Err(format!("Invalid number of semicolons: {}", sym_parts.len() - 1));
			}

			let address = to_u64(sym_parts[0])?;
			let symbol_address = to_u64(sym_parts[1])?;
			let address_size = to_u32(sym_parts[2])?;
			let symbol_parts: Vec<String> = sym_parts[3].split('|').map(String::from).collect();

			let mut memory_size: Option<MemorySize> = None;
			let mut flags = SymbolFlags::NONE;
			for value in sym_parts[4].split_whitespace() {
				if value.is_empty() {
					continue;
				}
				if let Some(f) = self.to_flags.get(value) {
					flags |= *f;
				} else {
					memory_size = Some(to_memory_size(value)?);
				}
			}
			symbol_results.push(SymbolResultTestCase { address, symbol_address, address_size, flags, memory_size, symbol_parts })
		}

		let decoder_options = OptionValue::get_decoder_options(&options);
		Ok(Some(SymbolResolverTestCase { bitness, hex_bytes, ip, decoder_options, line_number, code, options, symbol_results }))
	}
}
