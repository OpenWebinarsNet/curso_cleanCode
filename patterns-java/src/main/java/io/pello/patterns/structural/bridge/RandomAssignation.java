package io.pello.patterns.structural.bridge;

/**
 * Implements Assignation interface 
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class RandomAssignation implements Assignation {
	/**
	 * implements generateValues using random values
	 */
	public int[] generateValues() {
		int [] values = new int[Assignation.TOTAL_VALUES];
		
		for (int i = 0; i<values.length; i++) {
			values[i] = (int) (Math.random() * Assignation.MAX_VALUE);
		}
		
		return values;
	}

}
