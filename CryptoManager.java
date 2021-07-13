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



public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		 for (int i = 0; i < plainText.length(); i++)
			 //runs the following code for as long as the value i is less than the length of the input
			 //in textfield plainText an increments i by 1
	       {
			 // checks if the length of the input is above the lower bound and below the upper bound
			 // returns false if not in bound
	           if (plainText.charAt(i) < LOWER_BOUND || plainText.charAt(i) > UPPER_BOUND)

	           { 

	               return false;

	           }

	       }

	       return true;
		}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		String caesar = "";
		//runs the following code for as long as the value i is less than the length of the input
		 //in textfield plainText and increments i by 1
	       for (int i = 0; i < plainText.length(); i++) {
	          
	           //if above statement is satisfied, it moves the character by the given key

	           int encrypted_Character = (int) plainText.charAt(i) + key;
	          
	           // This verifies that the variable encrypted_Character is with in the bounds.
	          
	           while (encrypted_Character > (int) UPPER_BOUND) {

	               encrypted_Character -= RANGE;

	           }

	           caesar += (char) encrypted_Character;

	       }

	       return caesar;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoString) {
		 String result = "";
		 	//Assigns the length of the string to a variable, bellasoStringLength
	       int bellasoStringLength = bellasoString.length();
	     //runs the following code for as long as the value i is less than the length of the input
	     //in textfield plainText and increments i by 1
	       for (int i = 0; i < plainText.length(); i++) {
	    	   // Assigns the character at the index to the variable choiceChar
	           char choiceChar = plainText.charAt(i);
	           // Assigns the variable encryptedCharacter the value of character at index of the input 
	           // + character at the remainder of the index character and the length of the bellaso String
	           // of the bellaso string 
	           int encryptedCharacter = ((int) choiceChar + (int) bellasoString.charAt(i % bellasoStringLength));
	           // decrements the value of the encryptedCharacter by the value of Range for as long
	           // as encrypted character is higher than the upper bound
	           while (encryptedCharacter > (int) UPPER_BOUND) {

	               encryptedCharacter -= RANGE;

	           }
	           // adds the character of encrypted character to variable result for as long as the
	           //value of index is lower than the length of the input at text field 
	           result += (char) encryptedCharacter;

	       }
	       //returns the value of result after the for loop is done iterating to present the full encrypted character 
	       return result;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedMessage, int key) {
		 String decryptedCaesar = "";
		//runs the following code for as long as the value i is less than the length of the encrypted character
		 // and increments i by 1
	       for (int i = 0; i < encryptedMessage.length(); i++) {
	          
	           //if the above statement is satisfied, this shifts the character by the given key
	    	   // and assigns the value to variable decrypterCharacter
	          
	           int decryptedCharacter = (int) encryptedMessage.charAt(i) - key;
	          
	           //This checks that the decryptedCharacter is with in the bounds
	           // and increments the decryptedCharacter by the value of range if it falls short
	          
	           while (decryptedCharacter < (int) LOWER_BOUND) {

	               decryptedCharacter += RANGE;

	           }
	           //this adds the character at decryptedCharacter to the variable decryptedCeasar 
	           decryptedCaesar += (char) decryptedCharacter;

	       }
	       // This returns the complete decryptedCeasar after the for loop is done iterating
	       return decryptedCaesar;

	   }
	
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoString) {
		 String keyInput = "";

	       String decryptedBellaso = "";

	       int counter = 0;
	       //runs for as long as the length of keyInput is different from that of the encrypted bellaso
	       //initializes the value of counter to 0
	       while (keyInput.length() != encryptedText.length()) {
	    	   // adds the value of the character at the value of the counter of the bellaso string to the 
	    	   // variable keyInput
	           keyInput = keyInput + bellasoString.charAt(counter);
	           // increments counter by 1
	           counter++;
	           // resets the value of counter when it reaches the value of the length of the bellaso string
	           if (counter == bellasoString.length())

	               counter = 0;

	       }
	       // runs for as long as the value of index is lower than that of the length of the encrypted bellaso
	       for (int i = 0; i < encryptedText.length(); i++) {
	    	   // assigns the difference of character at index of the encrpted text and keyInput to displacement 
	           int displacement = encryptedText.charAt(i) - keyInput.charAt(i);
	           // checks if displacement is below the lower bound
	           if (displacement < LOWER_BOUND) {
	        	   // adds the value of range to displacement for as long as the value of displacement comes below
	        	   // the bound
	               while (displacement < LOWER_BOUND)

	                   displacement = displacement + RANGE;

	           }
	           // adds the character at displacement to the variable decryptedBellaso 
	           decryptedBellaso = decryptedBellaso + (char) displacement;

	       }
	       // returns the whole decryptedBellaso when for loop is done iterating
	       return decryptedBellaso;

	   
	}
}