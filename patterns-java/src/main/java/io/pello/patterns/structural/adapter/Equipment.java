
package io.pello.patterns.structural.adapter;

import java.util.ArrayList;

/**
 * This class represents some kind of Inventory
 * but it does NOT implement that interface. So it must be used
 * with an adapter.
 * @author Pello Xabier Altadill Izura
 *
 */
public class Equipment extends ArrayList {
	
	public void addElement (Object object) {
		this.add(object);
	} 
	
	public void delete (int index) {
		this.remove(index);
	}
}
