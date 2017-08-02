package io.pello.patterns.structural.proxy;

/**
*Implements interface to define Scores manipulation methods
*
* @author Pello Xabier Altadill Izura
* @greetz any
*/
public class ScoresProxy implements Scores {
 
	private static Scores realScores;

	public ScoresProxy () {
		checkInstance();
	}
	
	private void checkInstance () {
		if (null == realScores) {
			realScores = new FileScores();
		}
	}
	
	public String show() {
		return null;
	}

	public boolean save(String scores) {
		return false;
	}

	public boolean eraseAll() {
		return false;
	}
}
