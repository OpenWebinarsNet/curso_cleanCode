package io.pello.refactorings.magicnumbers;

import java.util.Random;

/**
 * Magic Numbers This class is intended to be used as a refactoring playground
 * 
 * @author PELLO_ALTADILL
 */
public class PasswordGenerator {
	private Random random = new Random();
	private String characters = "abcdefghijkmnopqrstuvwxyz23456789";

	public String generatePassword(int length) throws Exception {
		if (length < 6 || length > 15) {
			throw new Exception("Wrong password length: " + length);
		} else {
			String password = "";

			for (int i = 0; i < length; i++)
				password += characters.charAt(random.nextInt(characters.length()));

			return password;
		}
	}
}
