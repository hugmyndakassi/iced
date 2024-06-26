// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.internal.dec;

/**
 * DO NOT USE: INTERNAL API
 */
public final class LegacyOpCodeHandlerKind {
	private LegacyOpCodeHandlerKind() {
	}

	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int BITNESS = 0;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int BITNESS_DONT_READ_MOD_RM = 1;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int INVALID = 2;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int INVALID_NO_MOD_RM = 3;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int INVALID2 = 4;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int DUP = 5;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int NULL = 6;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int HANDLER_REFERENCE = 7;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int ARRAY_REFERENCE = 8;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int RM = 9;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int OPTIONS3 = 10;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int OPTIONS5 = 11;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int OPTIONS_DONT_READ_MOD_RM = 12;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int ANOTHER_TABLE = 13;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GROUP = 14;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GROUP8X64 = 15;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GROUP8X8 = 16;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MANDATORY_PREFIX = 17;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MANDATORY_PREFIX4 = 18;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_REXW_1A = 19;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MANDATORY_PREFIX_NO_MOD_RM = 20;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MANDATORY_PREFIX3 = 21;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int D3NOW = 22;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EVEX = 23;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VEX2 = 24;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VEX3 = 25;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int XOP = 26;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int AL_DX = 27;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int AP = 28;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int B_BM = 29;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int B_EV = 30;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int B_MIB = 31;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int BM_B = 32;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int BRANCH_IW = 33;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int BRANCH_SIMPLE = 34;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int C_R_3A = 35;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int C_R_3B = 36;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int DX_AL = 37;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int DX_E_AX = 38;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int E_AX_DX = 39;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EB_1 = 40;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EB_2 = 41;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EB_CL = 42;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EB_GB_1 = 43;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EB_GB_2 = 44;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EB_IB_1 = 45;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EB_IB_2 = 46;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EB1 = 47;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int ED_V_IB = 48;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EP = 49;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_3A = 50;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_3B = 51;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_4 = 52;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_CL = 53;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_GV_32_64 = 54;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_GV_3A = 55;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_GV_3B = 56;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_GV_4 = 57;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_GV_CL = 58;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_GV_IB = 59;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_GV_REX = 60;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_IB_3 = 61;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_IB_4 = 62;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_IB2_3 = 63;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_IB2_4 = 64;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_IZ_3 = 65;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_IZ_4 = 66;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_P = 67;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_REXW = 68;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_SW = 69;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV_VX = 70;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EV1 = 71;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EVJ = 72;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EVW = 73;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EW = 74;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GB_EB = 75;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GDQ_EV = 76;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_EB = 77;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_EB_REX = 78;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_EV_32_64 = 79;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_EV_3A = 80;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_EV_3B = 81;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_EV_IB = 82;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_EV_IB_REX = 83;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_EV_IZ = 84;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_EV_REX = 85;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_EV2 = 86;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_EV3 = 87;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_EW = 88;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_M = 89;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_M_AS = 90;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_MA = 91;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_MP_2 = 92;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_MP_3 = 93;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_MV = 94;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_N = 95;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_N_IB_REX = 96;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_RX = 97;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_W = 98;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GV_M_VX_IB = 99;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int IB = 100;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int IB3 = 101;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int IB_REG = 102;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int IB_REG2 = 103;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int IW_IB = 104;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int JB = 105;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int JB2 = 106;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int JDISP = 107;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int JX = 108;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int JZ = 109;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int M_1 = 110;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int M_2 = 111;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int M_REXW_2 = 112;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int M_REXW_4 = 113;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MEM_BX = 114;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MF_1 = 115;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MF_2A = 116;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MF_2B = 117;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MIB_B = 118;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MP = 119;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MS = 120;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MV = 121;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MV_GV = 122;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MV_GV_REXW = 123;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int NIB = 124;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int OB_REG = 125;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int OV_REG = 126;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int P_EV = 127;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int P_EV_IB = 128;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int P_Q = 129;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int P_Q_IB = 130;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int P_R = 131;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int P_W = 132;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PUSH_EV = 133;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PUSH_IB2 = 134;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PUSH_IZ = 135;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PUSH_OP_SIZE_REG_4A = 136;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PUSH_OP_SIZE_REG_4B = 137;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PUSH_SIMPLE2 = 138;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PUSH_SIMPLE_REG = 139;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int Q_P = 140;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int R_C_3A = 141;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int R_C_3B = 142;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int R_DI_P_N = 143;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int R_DI_VX_RX = 144;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG = 145;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG_IB2 = 146;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG_IZ = 147;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG_OB = 148;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG_OV = 149;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG_XB = 150;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG_XV = 151;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG_XV2 = 152;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG_YB = 153;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG_YV = 154;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG_IB = 155;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG_IB3 = 156;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int REG_IZ2 = 157;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int RESERVEDNOP = 158;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int RIB = 159;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int RIB_IB = 160;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int RV = 161;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int RV_32_64 = 162;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int RV_MW_GW = 163;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SIMPLE = 164;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SIMPLE_MOD_RM = 165;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SIMPLE2_3A = 166;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SIMPLE2_3B = 167;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SIMPLE2_IW = 168;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SIMPLE3 = 169;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SIMPLE4 = 170;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SIMPLE5 = 171;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SIMPLE5_MOD_RM_AS = 172;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SIMPLE_REG = 173;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int ST_STI = 174;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int STI = 175;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int STI_ST = 176;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SW_EV = 177;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int V_EV = 178;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VM = 179;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VN = 180;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VQ = 181;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VRIB_IB = 182;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VW_2 = 183;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VW_3 = 184;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VWIB_2 = 185;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VWIB_3 = 186;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VX_E_IB = 187;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VX_EV = 188;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int WBINVD = 189;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int WV = 190;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int XB_YB = 191;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int XCHG_REG_R_AX = 192;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int XV_YV = 193;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int YB_REG = 194;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int YB_XB = 195;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int YV_REG = 196;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int YV_REG2 = 197;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int YV_XV = 198;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SIMPLE4B = 199;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int OPTIONS1632_1 = 200;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int OPTIONS1632_2 = 201;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int M_SW = 202;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SW_M = 203;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int RQ = 204;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int GD_RD = 205;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PREFIX_ES_CS_SS_DS = 206;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PREFIX_FS_GS = 207;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PREFIX66 = 208;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PREFIX67 = 209;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PREFIX_F0 = 210;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PREFIX_F2 = 211;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PREFIX_F3 = 212;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int PREFIX_REX = 213;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int SIMPLE5_A32 = 214;
}
