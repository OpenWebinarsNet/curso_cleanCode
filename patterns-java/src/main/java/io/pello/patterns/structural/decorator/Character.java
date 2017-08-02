package io.pello.patterns.structural.decorator;

/**
 * interface for game Character, will be extended through decoration
 * @author Pello Xabier Altadill Izura
 * @ greetz any
 */
public interface Character {
	public int move ();
	public int attack();
	public int defend();
}
