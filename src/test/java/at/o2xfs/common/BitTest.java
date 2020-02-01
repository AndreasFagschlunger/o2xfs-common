/*
 * Copyright (c) 2017, Andreas Fagschlunger. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package at.o2xfs.common;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BitTest {

	@Test
	public final void testAllBitsSet() {
		final byte b = Hex.decode("ff")[0];
		assertTrue(Bit.isSet(b, Bit.B1));
		assertTrue(Bit.isSet(b, Bit.B2));
		assertTrue(Bit.isSet(b, Bit.B3));
		assertTrue(Bit.isSet(b, Bit.B4));
		assertTrue(Bit.isSet(b, Bit.B5));
		assertTrue(Bit.isSet(b, Bit.B6));
		assertTrue(Bit.isSet(b, Bit.B7));
		assertTrue(Bit.isSet(b, Bit.B8));
	}

	@Test
	public final void testBit1() {
		assertTrue(Bit.isSet((byte) 1, Bit.B1));
		assertFalse(Bit.isSet((byte) 0, Bit.B1));
	}

	@Test
	public final void testBit8() {
		final byte b = Hex.decode("f0")[0];
		assertTrue(Bit.isSet(b, Bit.B8));
	}

}