// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86;

/**
 * {@code RFLAGS} bits, FPU condition code bits and misc bits ({@code UIF}) supported by the instruction info code
 */
public final class RflagsBits {
	private RflagsBits() {
	}

	/**
	 * No bit is set
	 */
	public static final int NONE = 0x0000_0000;
	/**
	 * {@code RFLAGS.OF}
	 */
	public static final int OF = 0x0000_0001;
	/**
	 * {@code RFLAGS.SF}
	 */
	public static final int SF = 0x0000_0002;
	/**
	 * {@code RFLAGS.ZF}
	 */
	public static final int ZF = 0x0000_0004;
	/**
	 * {@code RFLAGS.AF}
	 */
	public static final int AF = 0x0000_0008;
	/**
	 * {@code RFLAGS.CF}
	 */
	public static final int CF = 0x0000_0010;
	/**
	 * {@code RFLAGS.PF}
	 */
	public static final int PF = 0x0000_0020;
	/**
	 * {@code RFLAGS.DF}
	 */
	public static final int DF = 0x0000_0040;
	/**
	 * {@code RFLAGS.IF}
	 */
	public static final int IF = 0x0000_0080;
	/**
	 * {@code RFLAGS.AC}
	 */
	public static final int AC = 0x0000_0100;
	/**
	 * {@code UIF}
	 */
	public static final int UIF = 0x0000_0200;
	/**
	 * FPU status word bit {@code C0}
	 */
	public static final int C0 = 0x0000_0400;
	/**
	 * FPU status word bit {@code C1}
	 */
	public static final int C1 = 0x0000_0800;
	/**
	 * FPU status word bit {@code C2}
	 */
	public static final int C2 = 0x0000_1000;
	/**
	 * FPU status word bit {@code C3}
	 */
	public static final int C3 = 0x0000_2000;
}
