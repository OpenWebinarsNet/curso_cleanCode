package org.cuatrovientos.junit.ju07repeattest;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
* Validator
* Validates Strings to check whether they are numbers o characters 
*/
public class Validator {
	
	private String textToValidate;

	public Validator(String textToValidate) {
		this.textToValidate = textToValidate;
	}
	
	public boolean isNumber () {
		Pattern pattern = Pattern.compile("^[0-9]+$");
		Matcher checker = pattern.matcher(textToValidate);
		
		return checker.find();
	}

	public boolean isText () {
		Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
		Matcher checker = pattern.matcher(textToValidate);
		
		return checker.find();
	}
	
	public boolean isSomethingElse() {
		return (!isText() && !isNumber());
	}

}