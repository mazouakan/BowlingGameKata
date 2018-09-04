package service;

import java.util.HashMap;
import java.util.Map;

public class CodeCracker {
	
	private final static Map<Character, Character> DECRYPTION_KEY;
	private final static Map<Character, Character> ENCRYPTION_KEY;
	
	static {
		
		DECRYPTION_KEY = new HashMap<Character, Character>();
		DECRYPTION_KEY.put('!', 'a');
		DECRYPTION_KEY.put(')', 'b');
		DECRYPTION_KEY.put('"', 'c');
		DECRYPTION_KEY.put('(', 'd');
		DECRYPTION_KEY.put('£', 'e');
		DECRYPTION_KEY.put('*', 'f');
		DECRYPTION_KEY.put('%', 'g');
		DECRYPTION_KEY.put('&', 'h');
		DECRYPTION_KEY.put('>', 'i');
		DECRYPTION_KEY.put('<', 'j');     //  ! ) " ( £ * % & > < @ a b c d e f g h i j k l m n o 
		DECRYPTION_KEY.put('@', 'k');
		DECRYPTION_KEY.put('a', 'l');
		DECRYPTION_KEY.put('b', 'm');
		DECRYPTION_KEY.put('c', 'n');
		DECRYPTION_KEY.put('d', 'o');
		DECRYPTION_KEY.put('e', 'p');
		DECRYPTION_KEY.put('f', 'q');
		DECRYPTION_KEY.put('g', 'r');
		DECRYPTION_KEY.put('h', 's');
		DECRYPTION_KEY.put('i', 't');
		DECRYPTION_KEY.put('j', 'u');
		DECRYPTION_KEY.put('k', 'v');
		DECRYPTION_KEY.put('l', 'w');
		DECRYPTION_KEY.put('m', 'x');
		DECRYPTION_KEY.put('n', 'y');
		DECRYPTION_KEY.put('o', 'z');
		
	}
	
	
static {
		
	ENCRYPTION_KEY = new HashMap<Character, Character>();
	ENCRYPTION_KEY.put('a', '!');
	ENCRYPTION_KEY.put('b', ')');
	ENCRYPTION_KEY.put('c', '"');
	ENCRYPTION_KEY.put('d', '(');
	ENCRYPTION_KEY.put('e', '£');
	ENCRYPTION_KEY.put('f', '*');
	ENCRYPTION_KEY.put('g', '%');
	ENCRYPTION_KEY.put('h', '&');
	ENCRYPTION_KEY.put('i', '>');
	ENCRYPTION_KEY.put('j', '<');     //  ! ) " ( £ * % & > < @ a b c d e f g h i j k l m n o 
	ENCRYPTION_KEY.put('k', '@');
	ENCRYPTION_KEY.put('l', 'a');
	ENCRYPTION_KEY.put('m', 'b');
	ENCRYPTION_KEY.put('n', 'c');
	ENCRYPTION_KEY.put('o', 'd');
	ENCRYPTION_KEY.put('p', 'e');
	ENCRYPTION_KEY.put('q', 'f');
	ENCRYPTION_KEY.put('r', 'g');
	ENCRYPTION_KEY.put('s', 'h');
	ENCRYPTION_KEY.put('t', 'i');
	ENCRYPTION_KEY.put('u', 'j');
	ENCRYPTION_KEY.put('v', 'k');
	ENCRYPTION_KEY.put('w', 'l');
	ENCRYPTION_KEY.put('x', 'm');
	ENCRYPTION_KEY.put('y', 'n');
	ENCRYPTION_KEY.put('z', 'o');
			
	}
	
	public String Decryption(String encrypted_msg) {
		
		StringBuffer result = new StringBuffer();
		
		char[] char_tab = encrypted_msg.toCharArray();
		
		for(char c : char_tab) {
			result.append(DECRYPTION_KEY.get(c));
		}
		
		return result.toString();
	}
	
	public String encryption(String msgToEncrypt) {
		
		StringBuffer result = new StringBuffer();
		
		char[] char_tab = msgToEncrypt.toCharArray();
		
		for(char c : char_tab) {
			result.append(ENCRYPTION_KEY.get(c));
		}
		
		return result.toString();
	}

}
