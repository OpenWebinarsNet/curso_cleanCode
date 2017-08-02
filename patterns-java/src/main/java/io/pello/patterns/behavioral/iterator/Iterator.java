
package io.pello.patterns.behavioral.iterator;

/**
 * This interface defines an iterable structure operations
 * NOTE: Java already offers this in java.util
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public interface Iterator<T> {
	public void first();
	public void next();
	public boolean isDone();
	public T currentItem();
}