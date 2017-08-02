package io.pello.cleancode.samples.solid.ocp.better;

/**
 * Implements encryption interface with
 * -ehem- base64 encryption
 * @author Pello Altadill
 * @greetz 2 u
 */
public class DummyEncryption implements Encryption {

	@Override
	public String encrypt(String textToEncrypt) {
		// TODO Auto-generated method stub
		return textToEncrypt+"sec";
	}

	@Override
	public String decrypt(String textoToDecrypt) {
		// TODO Auto-generated method stub
		return textoToDecrypt+"unsec";
	}

}
