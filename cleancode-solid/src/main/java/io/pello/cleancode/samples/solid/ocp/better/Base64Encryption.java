package io.pello.cleancode.samples.solid.ocp.better;



/**
 * Implements encryption interface with
 * -ehem- base64 encryption
 * @author Pello Altadill
 * @greetz 2 u
 */
public class Base64Encryption implements Encryption {

	@Override
	public String encrypt(String textToEncrypt) {
		// TODO Auto-generated method stub
		return "";//DatatypeConverter.printBase64Binary(textToEncrypt.getBytes());
	}

	@Override
	public String decrypt(String textoToDecrypt) {
		// TODO Auto-generated method stub
		return "";//DatatypeConverter.parseBase64Binary(textoToDecrypt).toString();
	}

}
