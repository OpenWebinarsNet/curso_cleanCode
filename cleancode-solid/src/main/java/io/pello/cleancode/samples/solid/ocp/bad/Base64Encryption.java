package io.pello.cleancode.samples.solid.ocp.bad;



/**
 * Implements encryption interface with
 * -ehem- base64 encryption
 * @author Pello Altadill
 * @greetz 2 u
 */
public class Base64Encryption {
	public String encrypt(String textToEncrypt) {
		return "";//DatatypeConverter.printBase64Binary(textToEncrypt.getBytes());
	}
	
	public String decrypt(String textoToDecrypt) {
		return "";//DatatypeConverter.parseBase64Binary(textoToDecrypt).toString();
	}
}
