package io.pello.cleancode.samples.solid.ocp.better;

/**
 * Implements encryption interface with
 * -ehem- base64 encryption
 * @author Pello Altadill
 * @greetz 2 u
 */
public class CaesarEncryption implements Encryption {
	
	private String alphabet = "abcdefghijklmnñopqrstuvwxyz";
	private final static int OFFSET = 3;

	@Override
	public String encrypt(String textToEncrypt) {
		// TODO Auto-generated method stub
		int index = 0;
		char letter = ' ';
		String result = "";
		textToEncrypt = textToEncrypt.toLowerCase();
		
		for (int i = 0; i< textToEncrypt.length();i++) {
			letter = textToEncrypt.charAt(i);
			if (alphabet.indexOf(letter) != -1) {
				index = (alphabet.indexOf(letter) + OFFSET) % alphabet.length();
				result += alphabet.charAt(index);
			} else { // If letter is not found, just copy it
				result += letter;
			}
		}
		return result;
	}

	@Override
	public String decrypt(String textoToDecrypt) {
		int index = 0;
		char letter = ' ';
		String result = "";
		textoToDecrypt = textoToDecrypt.toLowerCase();
		
		for (int i = 0; i< textoToDecrypt.length();i++) {
		
			letter = textoToDecrypt.charAt(i);
			if (alphabet.indexOf(letter) != -1) {
				index = Math.abs(alphabet.indexOf(letter) - OFFSET) % alphabet.length();
				index = (alphabet.indexOf(letter) - OFFSET>=0)?index:alphabet.length() - index;

				result += alphabet.charAt(index);
			} else { // If letter is not found, just copy it
				result += letter;
			}
		}
		return result;
	}

}
