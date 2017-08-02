package io.pello.patterns.structural.bridge;
/**
 * Assignation interface is part of the bridge to
 * implementation
 * @author Pello Xabier Altadill Izura
 */
public interface Assignation {
	public static final int TOTAL_VALUES = 3;
	public static final double MAX_VALUE = 10;
	public int[] generateValues();
}
