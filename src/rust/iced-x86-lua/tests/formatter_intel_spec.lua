-- SPDX-License-Identifier: MIT
-- Copyright (C) 2018-present iced project and contributors

local from_hex = require("iced_test_utils").from_hex
local has_int64 = require("iced_test_utils").has_int64
local formatter_syntax = require("iced_x86.FormatterSyntax").Intel

describe("Formatter: intel", function()
	local CC_a = require("iced_x86.CC_a")
	local CC_ae = require("iced_x86.CC_ae")
	local CC_b = require("iced_x86.CC_b")
	local CC_be = require("iced_x86.CC_be")
	local CC_e = require("iced_x86.CC_e")
	local CC_g = require("iced_x86.CC_g")
	local CC_ge = require("iced_x86.CC_ge")
	local CC_l = require("iced_x86.CC_l")
	local CC_le = require("iced_x86.CC_le")
	local CC_ne = require("iced_x86.CC_ne")
	local CC_np = require("iced_x86.CC_np")
	local CC_p = require("iced_x86.CC_p")
	local Decoder = require("iced_x86.Decoder")
	local FormatMnemonicOptions = require("iced_x86.FormatMnemonicOptions")
	local Formatter = require("iced_x86.Formatter")
	local MemorySizeOptions = require("iced_x86.MemorySizeOptions")
	local Register = require("iced_x86.Register")

	it("default options", function()
		local formatter = Formatter.new(formatter_syntax)

		assert.is_false(formatter:uppercase_prefixes())
		assert.is_false(formatter:uppercase_mnemonics())
		assert.is_false(formatter:uppercase_registers())
		assert.is_false(formatter:uppercase_keywords())
		assert.is_false(formatter:uppercase_decorators())
		assert.is_false(formatter:uppercase_all())
		assert.equals(0, formatter:first_operand_char_index())
		assert.equals(0, formatter:tab_size())
		assert.is_false(formatter:space_after_operand_separator())
		assert.is_false(formatter:space_after_memory_bracket())
		assert.is_false(formatter:space_between_memory_add_operators())
		assert.is_false(formatter:space_between_memory_mul_operators())
		assert.is_false(formatter:scale_before_index())
		assert.is_false(formatter:always_show_scale())
		assert.is_false(formatter:always_show_segment_register())
		assert.is_false(formatter:show_zero_displacements())
		assert.equals("", formatter:hex_prefix())
		assert.equals("h", formatter:hex_suffix())
		assert.equals(4, formatter:hex_digit_group_size())
		assert.equals("", formatter:decimal_prefix())
		assert.equals("", formatter:decimal_suffix())
		assert.equals(3, formatter:decimal_digit_group_size())
		assert.equals("", formatter:octal_prefix())
		assert.equals("o", formatter:octal_suffix())
		assert.equals(4, formatter:octal_digit_group_size())
		assert.equals("", formatter:binary_prefix())
		assert.equals("b", formatter:binary_suffix())
		assert.equals(4, formatter:binary_digit_group_size())
		assert.equals("", formatter:digit_separator())
		assert.is_false(formatter:leading_zeros())
		assert.is_true(formatter:uppercase_hex())
		assert.is_true(formatter:small_hex_numbers_in_decimal())
		assert.is_true(formatter:add_leading_zero_to_hex_numbers())
		assert.equals(16, formatter:number_base())
		assert.is_true(formatter:branch_leading_zeros())
		assert.is_false(formatter:signed_immediate_operands())
		assert.is_true(formatter:signed_memory_displacements())
		assert.is_false(formatter:displacement_leading_zeros())
		assert.equals(MemorySizeOptions.Default, formatter:memory_size_options())
		assert.is_false(formatter:rip_relative_addresses())
		assert.is_true(formatter:show_branch_size())
		assert.is_true(formatter:use_pseudo_ops())
		assert.is_false(formatter:show_symbol_address())
		assert.is_false(formatter:gas_naked_registers())
		assert.is_false(formatter:gas_show_mnemonic_size_suffix())
		assert.is_false(formatter:gas_space_after_memory_operand_comma())
		assert.is_true(formatter:masm_add_ds_prefix32())
		assert.is_true(formatter:masm_symbol_displ_in_brackets())
		assert.is_true(formatter:masm_displ_in_brackets())
		assert.is_false(formatter:nasm_show_sign_extended_immediate_size())
		assert.is_false(formatter:prefer_st0())
		assert.is_false(formatter:show_useless_prefixes())
		assert.equals(CC_b.b, formatter:cc_b())
		assert.equals(CC_ae.ae, formatter:cc_ae())
		assert.equals(CC_e.e, formatter:cc_e())
		assert.equals(CC_ne.ne, formatter:cc_ne())
		assert.equals(CC_be.be, formatter:cc_be())
		assert.equals(CC_a.a, formatter:cc_a())
		assert.equals(CC_p.p, formatter:cc_p())
		assert.equals(CC_np.np, formatter:cc_np())
		assert.equals(CC_l.l, formatter:cc_l())
		assert.equals(CC_ge.ge, formatter:cc_ge())
		assert.equals(CC_le.le, formatter:cc_le())
		assert.equals(CC_g.g, formatter:cc_g())
	end)

	it("format", function()
		local decoder = Decoder.new(64, from_hex("62F24FDD725001F00018"))
		local instr = decoder:decode()
		local instr2 = decoder:decode()
		local formatter = Formatter.new(formatter_syntax)

		assert.equals("vcvtne2ps2bf16 zmm2{k5}{z},zmm6,[rax+4]{1to16}", formatter:format(instr))

		assert.equals("vcvtne2ps2bf16", formatter:format_mnemonic(instr))
		assert.equals("vcvtne2ps2bf16", formatter:format_mnemonic(instr, FormatMnemonicOptions.None))
		assert.equals("", formatter:format_mnemonic(instr, FormatMnemonicOptions.NoMnemonic))
		assert.equals("vcvtne2ps2bf16", formatter:format_mnemonic(instr, FormatMnemonicOptions.NoPrefixes))
		assert.equals(
			"",
			formatter:format_mnemonic(instr, FormatMnemonicOptions.NoMnemonic + FormatMnemonicOptions.NoPrefixes)
		)

		assert.equals("lock add", formatter:format_mnemonic(instr2))
		assert.equals("lock add", formatter:format_mnemonic(instr2, FormatMnemonicOptions.None))
		assert.equals("lock", formatter:format_mnemonic(instr2, FormatMnemonicOptions.NoMnemonic))
		assert.equals("add", formatter:format_mnemonic(instr2, FormatMnemonicOptions.NoPrefixes))
		assert.equals(
			"",
			formatter:format_mnemonic(instr2, FormatMnemonicOptions.NoMnemonic + FormatMnemonicOptions.NoPrefixes)
		)

		assert.equals(3, formatter:operand_count(instr))
		assert.is_nil(formatter:op_access(instr, 0))
		assert.equals(0, formatter:get_instruction_operand(instr, 0))
		assert.equals(1, formatter:get_instruction_operand(instr, 1))
		assert.equals(2, formatter:get_instruction_operand(instr, 2))
		assert.equals(0, formatter:get_formatter_operand(instr, 0))
		assert.equals(1, formatter:get_formatter_operand(instr, 1))
		assert.equals(2, formatter:get_formatter_operand(instr, 2))
		assert.equals("zmm2{k5}{z}", formatter:format_operand(instr, 0))
		assert.equals("zmm6", formatter:format_operand(instr, 1))
		assert.equals("[rax+4]{1to16}", formatter:format_operand(instr, 2))
		assert.equals(",", formatter:format_operand_separator(instr))
		assert.equals("zmm2{k5}{z},zmm6,[rax+4]{1to16}", formatter:format_all_operands(instr))

		assert.equals("rcx", formatter:format_register(Register.RCX))

		assert.equals("-12h", formatter:format_i8(-0x12))
		assert.equals("-80h", formatter:format_i8(-0x80))
		assert.equals("7Fh", formatter:format_i8(0x7F))
		assert.equals("-1", formatter:format_i8(0xFF))
		assert.equals("-1234h", formatter:format_i16(-0x1234))
		assert.equals("-8000h", formatter:format_i16(-0x8000))
		assert.equals("7FFFh", formatter:format_i16(0x7FFF))
		assert.equals("-1", formatter:format_i16(0xFFFF))
		assert.equals("-12345678h", formatter:format_i32(-0x12345678))
		assert.equals("-80000000h", formatter:format_i32(-0x80000000))
		assert.equals("7FFFFFFFh", formatter:format_i32(0x7FFFFFFF))
		assert.equals("-1", formatter:format_i32(0xFFFFFFFF))
		assert.equals("-123456789Ah", formatter:format_i64(-0x123456789A))
		if has_int64 then
			assert.equals("-123456789ABCDE0Fh", formatter:format_i64(-0x123456789ABCDE0F))
			assert.equals("-8000000000000000h", formatter:format_i64(-0x8000000000000000))
			assert.equals("7FFFFFFFFFFFFFFFh", formatter:format_i64(0x7FFFFFFFFFFFFFFF))
			assert.equals("-1", formatter:format_i64(0xFFFFFFFFFFFFFFFF))
		end
		assert.equals("89h", formatter:format_u8(0x89))
		assert.equals("80h", formatter:format_u8(-0x80))
		assert.equals("0FFh", formatter:format_u8(0xFF))
		assert.equals("89ABh", formatter:format_u16(0x89AB))
		assert.equals("8000h", formatter:format_u16(-0x8000))
		assert.equals("0FFFFh", formatter:format_u16(0xFFFF))
		assert.equals("89ABCDEFh", formatter:format_u32(0x89ABCDEF))
		assert.equals("80000000h", formatter:format_u32(-0x80000000))
		assert.equals("0FFFFFFFFh", formatter:format_u32(0xFFFFFFFF))
		assert.equals("0FEDCBA9876543000h", formatter:format_u64(0xFEDCBA9876543000))
		if has_int64 then
			assert.equals("0FEDCBA9876543201h", formatter:format_u64(0xFEDCBA9876543201))
			assert.equals("8000000000000000h", formatter:format_u64(-0x8000000000000000))
			assert.equals("0FFFFFFFFFFFFFFFFh", formatter:format_u64(0xFFFFFFFFFFFFFFFF))
		end
	end)
end)
