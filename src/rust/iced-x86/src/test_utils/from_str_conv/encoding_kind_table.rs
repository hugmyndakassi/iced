// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

use crate::EncodingKind;
use lazy_static::lazy_static;
use std::collections::HashMap;

lazy_static! {
	pub(super) static ref TO_ENCODING_KIND_HASH: HashMap<&'static str, EncodingKind> = {
		// GENERATOR-BEGIN: EncodingKindHash
		// ⚠️This was generated by GENERATOR!🦹‍♂️
		let mut h = HashMap::with_capacity(6);
		let _ = h.insert("Legacy", EncodingKind::Legacy);
		let _ = h.insert("VEX", EncodingKind::VEX);
		let _ = h.insert("EVEX", EncodingKind::EVEX);
		let _ = h.insert("XOP", EncodingKind::XOP);
		let _ = h.insert("D3NOW", EncodingKind::D3NOW);
		let _ = h.insert("MVEX", EncodingKind::MVEX);
		// GENERATOR-END: EncodingKindHash
		h
	};
}
