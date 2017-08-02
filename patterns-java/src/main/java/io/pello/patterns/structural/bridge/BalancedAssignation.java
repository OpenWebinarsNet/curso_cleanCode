package io.pello.patterns.structural.bridge;

/**
 * Implements Assignation interface 
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class BalancedAssignation implements Assignation {
	/**
	 * generate values in a compensated manner
	 */
	public int[] generateValues() {
		int [] values = new int[Assignation.TOTAL_VALUES];
		
		for (int i = 0; i<values.length; i++) {
			values[i] = (int) (Math.random() * (Assignation.MAX_VALUE/2)  + (Assignation.MAX_VALUE/2));
		}
		
		return values;
	}
}
