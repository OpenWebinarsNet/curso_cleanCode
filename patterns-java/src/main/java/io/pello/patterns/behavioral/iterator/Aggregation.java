
package io.pello.patterns.behavioral.iterator;

/**
 * Defines interface for Aggregation types
 * @author Pello Xabier Altadill Izura
 * @param <T>
 * @greetz any
 */
public interface Aggregation<T> {
	public Iterator createIterator();
	public int count();
	public void append(T item);
	public void remove(T item);
}
