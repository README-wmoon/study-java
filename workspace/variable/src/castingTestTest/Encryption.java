package castingTestTest;

public class Encryption {
	public static void main(String[] args) {
		String passward = "ehdtjrdl1234";
		String encryptedPassword = "", decryptedPassword = "";
		final int KEY = 3;
		for(int i =0; i<passward.length(); i++) {
			encryptedPassword += (char)(passward.charAt(i)*3);
		}
		
		System.out.println(encryptedPassword);
		
		for(int i=0; i< encryptedPassword.length(); i++) {
			decryptedPassword += (char)(encryptedPassword.charAt(i) / 3);
		}
		
		System.out.println(decryptedPassword);
	}
}
