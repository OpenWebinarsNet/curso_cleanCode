
package io.pello.patterns.structural.adapter;

/**
 * Makes use of the adapter class to manage Equipment
 * @author Pello Xabier Altadill Izura
 *
 */
public class AdapterClient {
	public void useEquipment () {
		EquipmentAdapter equipment = new EquipmentAdapter();		
		equipment.addItem(new Item());
		equipment.addItem(new Item());
		equipment.addItem(new Item());
		
	}
}
