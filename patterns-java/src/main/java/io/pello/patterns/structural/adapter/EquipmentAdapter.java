package io.pello.patterns.structural.adapter;

/**
 * Adapter or wrapper for equipment class
 * 
 * @author Pello Xabier Altadill Izura 
 * On one hand it implements Inventory on
 *         the other hand it extends equipment so it can be used by our client.
 *         Coulb be done by composition of Equipment, that is Equipment as an
 *         attribute
 */
public class EquipmentAdapter extends Equipment implements Inventory {

	public void addItem(Item item) {
		this.addElement(item);
	}

	public void removeItem(int itemIndex) {
		this.remove(itemIndex);
	}

	public String showAll() {
		String result = "";

		for (int i = 0; i < this.size(); i++) {
			result += this.get(i).toString();
		}

		return result;
	}
}
