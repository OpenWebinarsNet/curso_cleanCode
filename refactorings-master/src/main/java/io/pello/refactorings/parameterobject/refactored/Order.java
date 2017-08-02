package io.pello.refactorings.parameterobject.refactored;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/**
* Refactored version
*/
public class Order {
	private Hashtable<String, Float> items = new Hashtable<String, Float>();
	
	public void addItem (OrderItem orderItem) {
		items.put(orderItem.getProductID() + ": " + orderItem.getDescription(), orderItem.totalItem());
	}
	
	public float calculateTotal () {
		float total = 0;
		Enumeration<String> keys = items.keys();
		
		while(keys.hasMoreElements()) {
		    total  = total + items.get(keys.nextElement());
		}
		
		return total;
	}
}
