package io.pello.refactorings.introduceforeignmethod;

public class PasswordChecker {
	public String improvePassword (String password) {
		if (password.length() < 5) {
			return "****" + password + "****";
		} else {
			return password;
		}
	}
}
