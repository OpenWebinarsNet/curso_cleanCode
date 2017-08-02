package io.pello.patterns.structural.composite;

import java.util.ArrayList;

/**
 * Interface for the War Unit Component.
 * Other classes may be simple leafs other could lead
 * to have more components inside.
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public interface WarUnitComponent {
	public void add (WarUnitComponent unit);
	public void del (WarUnitComponent unit);
	public int attack();
	public int defend();
	public ArrayList<WarUnitComponent> getChild();
}
