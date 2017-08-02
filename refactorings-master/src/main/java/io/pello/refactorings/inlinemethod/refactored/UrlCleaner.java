package io.pello.refactorings.inlinemethod.refactored;

/**
* Refactored version
*/
public class UrlCleaner {
	public String clean (String title) {
		return title.trim()
					.replaceAll("[\\.\\:\\,\\?\\!\\_\\;]", "")  // Replaces special chars
					.replaceAll("[\\s]+"," ")                   // Replace duplicated spaces
					.replaceAll("[\\s]","-");                   // Replace spaces with hyphen
	}
}
