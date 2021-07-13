/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg & Prof. Ashique Tanveer
 * Due: 7/12/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: _Rebecca Beyene_________
*/


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CryptoJUnitTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.stringInBounds("THIS TEST SHOULD SUCCEED"));
		assertFalse(CryptoManager.stringInBounds("THIS TEST THAT SHOULD FAIL BECAUSE { IS OUTSIDE THE RANGE"));
		assertFalse(CryptoManager.stringInBounds("This test should fail because of lowercase letters"));
		assertFalse(CryptoManager.stringInBounds("THIS TEST SHOULD FAIL BECAUSE OF ESC CHAR "+((char) 27)));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("UFTUJOH",CryptoManager.encryptCaesar("TESTING", 1));
		assertEquals(";,:;05.G(56;/,9G:;905.", CryptoManager.encryptCaesar("TESTING ANOTHER STRING", 999));
		assertEquals("4188;LC;>80", CryptoManager.encryptCaesar("HELLO WORLD", 300));
	}
	
	@Test
	public void testDecryptCaesar() {
		assertEquals("TESTING", CryptoManager.decryptCaesar("UFTUJOH", 1));
		assertEquals("TESTING ANOTHER STRING", CryptoManager.decryptCaesar(";,:;05.G(56;/,9G:;905.", 999));
		assertEquals("HELLO WORLD", CryptoManager.decryptCaesar("4188;LC;>80", 300));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("WN#\\N &", CryptoManager.encryptBellaso("TESTING", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("UJ^^((HT^X[YYM\"", CryptoManager.encryptBellaso("MERRY CHRISTMAS", "HELLO"));
		assertEquals("PR%UKP:K_\\VF=8V", CryptoManager.encryptBellaso("MERRY CHRISTMAS", "CMSC207")); 
		
	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("TESTING", CryptoManager.decryptBellaso("WN#\\N &", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("MERRY CHRISTMAS", CryptoManager.decryptBellaso("UJ^^((HT^X[YYM\"", "HELLO"));
		assertEquals("MERRY CHRISTMAS", CryptoManager.decryptBellaso("PR%UKP:K_\\VF=8V", "CMSC207")); 

	}

}