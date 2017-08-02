package io.pello.refactorings.introduceforeignmethod.refactored;

public class PasswordChecker {
	public String improvePassword (String password) {
		if (password.length() < 5) {
			return makeItPalindrome(password);
		} else {
			return password;
		}
	}
	
	// We extend String functionality
	private static String makeItPalindrome (String password) {
		return new String(password 
							+ new StringBuilder(password)
													.reverse()
														.toString());
	}
}
