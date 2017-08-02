package io.pello.cleancode.samples.solid.ocp.better;

public class SecretMessage {
	private String message;
	private String from;
	private String to;
	
	public SecretMessage(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public String encrypt (Encryption encrypter) {
		String textToEncrypt = "From: " + from + "\n";
		textToEncrypt = "To: " + to + "\n";
		textToEncrypt = "Message: \n" + message + "\n";
		
		return encrypter.encrypt(textToEncrypt);
	}
	
	public String decrypt (Encryption encrypter) {
		return encrypter.decrypt(message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
