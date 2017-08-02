package io.pello.patterns.structural.adapter;

/**
 * This interface defines a structure to store things
 * @author Pello Xabier Altadill Izura
 */
public interface Inventory {
	public  void addItem (Item item);
	public  void removeItem (int itemIndex);
	public  String showAll();
}
