package io.pello.refactorings.parameterobject;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/**
 * Introduce parameter object refactoring playground This class is intended to
 * be used as a refactoring playground
 * 
 * @author PELLO_ALTADILL
 */
public class Order {
	private Hashtable<String, Float> items = new Hashtable<String, Float>();

	public void addItem(Integer productID, String description, Integer quantity, Float price, Float discount) {
		items.put(productID + ": " + description, (quantity * price) - (quantity * price * discount));
	}

	public float calculateTotal() {
		float total = 0;
		Enumeration<String> keys = items.keys();

		while (keys.hasMoreElements()) {
			total = total + items.get(keys.nextElement());
		}
		return total;
	}
}
