-- SPDX-License-Identifier: MIT
-- Copyright (C) 2018-present iced project and contributors

-- ⚠️This file was generated by GENERATOR!🦹‍♂️

---Mnemonic condition code selector (eg. `JB` / `JC` / `JNAE`)
return {
	---`JB`, `CMOVB`, `SETB`
	b = 0,
	---`JC`, `CMOVC`, `SETC`
	c = 1,
	---`JNAE`, `CMOVNAE`, `SETNAE`
	nae = 2,
}
