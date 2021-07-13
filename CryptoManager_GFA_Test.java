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

public class CryptoManager_GFA_Test {

	public static void main(String[] args) {

		String str1 = "\"THIS TEST SHOULD SUCCEED\"";
		String str4 = "HELLO WORLD";
		String str5 = "IFMMP!XPSME";


		boolean good = CryptoManager.stringInBounds(str1);
		System.out.println(str1+" Is it in bounds? "+good);
	}
}