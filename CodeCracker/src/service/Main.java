package service;

public class Main {

	public static void main(String[] args) {

		
		CodeCracker code = new CodeCracker();
		
		String encrypted_msg = "bd&!b£(";  //mohamed
		String decrypted_msg = code.Decryption(encrypted_msg);
		
		System.out.println("decryption of the message : " + encrypted_msg + " is : " + decrypted_msg);
		
		String msgToEncrypt = "mohamed";  //bd&!b£(
		String msgDecrypted = code.encryption(msgToEncrypt);
		
		System.out.println("encryption of the message : " + msgToEncrypt + " is : " + msgDecrypted);
		
	}

}
