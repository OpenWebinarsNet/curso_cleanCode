package io.pello.patterns.structural.proxy;

/**
 * interface to define Scores manipulation methods
* @author Pello Xabier Altadill Izura
* @greetz any
*/
public interface Scores {
	public String show();
	public boolean save(String scores);
	public boolean eraseAll();
}
