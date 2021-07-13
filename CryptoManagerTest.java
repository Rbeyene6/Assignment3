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


public class CryptoManagerTest  {

	public static void main(String[] args) {

		String str1 = "\"THIS TEST SHOULD SUCCEED\"";
		String str2 = "\"THIS TEST THAT SHOULD FAIL BECAUSE { IS OUTSIDE THE RANGE\"";
		String str3 = "\"This test should fail because of lowercase letters\""; 
		String str4 = "THIS IS ANOTHER TEST";
		String bellasoStr = "CMSC203";
		String str5 = "WKLV#LV#DQRWKHU#WHVW";
		String str6 = "WU\\VR9F#N!RF88U-'HED";
		
		String Ceas1 = "TESTING CEASAR TESTING ONE";
		String Ceas2 = "MY NAME IS REBECCA";
		String Ceas3 = "WHVWLQJ#FHDVDU#WHVWLQJ#RQH";
		String Ceas4 = "P\\#QDPH#LV#UHEHFFD";
		String Ceas5 = "WHVWLQJ#EHOODVR#WHVWLQJ#RQH";
		String Ceas6 = "P\\#ODVW#QDPH#LV#EH\\HQH";
		
		String Bell1 = "TESTING BELLASO TESTING ONE";
		String Bell2 = "MY LAST NAME IS BEYENE";
		String Bell3 = "^F)U:@:*C[M=3FY!*FDF<XH6P?7";
		String Bell4 = "WZ6M2EG*OWN6R<]!XFJ7AO";
		String Bell5 = "^F)U:@:*D[BD3E*U[TE;AQ!%O6";
		String Bell6 = "WZ6O2?8*J)!C75ODYB";
		
		String PersonalBell = "JAVA123";

		String FailingFeminist= "\"#Thi$ test should fail\"";

		boolean good = CryptoManager.stringInBounds(str1);
		boolean bad = CryptoManager.stringInBounds(str2);
		
		System.out.println(str1+" Is it in bounds? "+good);
		System.out.println(str2+" Is it in bounds? "+bad);
		bad = CryptoManager.stringInBounds(str3);
		System.out.println(str3+" Is it in bounds? "+bad);
		System.out.println("Caesar cipher of \""+str4+"\" should return \"WKLV#LV#DQRWKHU#WHVW\":   "+ CryptoManager.encryptCaesar(str4, 3));
		System.out.println("Bellaso cipher of \""+str4+"\" should return \"WU\\VR9F#N!RF88U-'HED\":    "+ CryptoManager.encryptBellaso(str4, bellasoStr));
		System.out.println("Caesar decryption of \""+str5+"\" should return \"THIS IS ANOTHER TEST\":    "+ CryptoManager.decryptCaesar(str5, 3));
		System.out.println("Bellaso decryption of \""+str6+"\" should return \"THIS IS ANOTHER TEST\":    "+ CryptoManager.decryptBellaso(str6, bellasoStr));
		System.out.println("             ");
		System.out.println("Caesar cipher of \""+Ceas1+"\" should return \"WHVWLQJ#FHDVDU#WHVWLQJ#RQH\":   "+ CryptoManager.encryptCaesar(Ceas1, 3));
		System.out.println("Caesar cipher of \""+Ceas2+"\" should return \"P\\#QDPH#LV#UHEHFFD\":   "+ CryptoManager.encryptCaesar(Ceas2, 3));
		System.out.println("Caesar cipher of \""+Bell1+"\" should return \"WHVWLQJ#EHOODVR#WHVWLQJ#RQH\":   "+ CryptoManager.encryptCaesar(Bell1, 3));
		System.out.println("Caesar cipher of \""+Bell2+"\" should return \"P\\#ODVW#QDPH#LV#EH\\HQH\":   "+ CryptoManager.encryptCaesar(Bell2, 3));
		System.out.println("             ");
		System.out.println("Bellaso cipher of \""+Bell1+"\" should return \"^F)U:@:*C[M=3FY!*FDF<XH6P?7\":    "+ CryptoManager.encryptBellaso(Bell1, PersonalBell));
		System.out.println("Bellaso cipher of \""+Bell2+"\" should return \"WZ6M2EG*OWN6R<]!XFJ7AO\":    "+ CryptoManager.encryptBellaso(Bell2, PersonalBell));
		System.out.println("Bellaso cipher of \""+Ceas1+"\" should return \"^F)U:@:*D[BD3E*U[TE;AQ!%O6\":    "+ CryptoManager.encryptBellaso(Ceas1, PersonalBell));
		System.out.println("Bellaso cipher of \""+Ceas2+"\" should return \"WZ6O2?8*J)!C75ODYB\":    "+ CryptoManager.encryptBellaso(Ceas2, PersonalBell));
		System.out.println("             ");
		System.out.println("Caesar decryption of \""+Ceas3+"\" should return \"TESTING CEASAR TESTING ONE\":    "+ CryptoManager.decryptCaesar(Ceas3, 3));
		System.out.println("Caesar decryption of \""+Ceas4+"\" should return \"MY NAME IS REBECCA\":    "+ CryptoManager.decryptCaesar(Ceas4, 3));
		System.out.println("Caesar decryption of \""+Ceas5+"\" should return \"TESTING BELLASO TESTING ONE\":    "+ CryptoManager.decryptCaesar(Ceas5, 3));
		System.out.println("Caesar decryption of \""+Ceas6+"\" should return \"MY LAST NAME IS BEYENE\":    "+ CryptoManager.decryptCaesar(Ceas6, 3));
		System.out.println("             ");
		System.out.println("Bellaso decryption of \""+Bell3+"\" should return \"TESTING BELLASO TESTING ONE\":    "+ CryptoManager.decryptBellaso(Bell3, PersonalBell));
		System.out.println("Bellaso decryption of \""+Bell4+"\" should return \"MY LAST NAME IS BEYENE\":    "+ CryptoManager.decryptBellaso(Bell4, PersonalBell));
		System.out.println("Bellaso decryption of \""+Bell5+"\" should return \"TESTING CEASAR TESTING ONE\":    "+ CryptoManager.decryptBellaso(Bell5, PersonalBell));
		System.out.println("Bellaso decryption of \""+Bell6+"\" should return \"MY NAME IS REBECCA\":    "+ CryptoManager.decryptBellaso(Bell6, PersonalBell));
		System.out.println("             ");
		bad = CryptoManager.stringInBounds(FailingFeminist);
		System.out.println(FailingFeminist+" Is it in bounds? "+bad);
		
		
	}

	
}