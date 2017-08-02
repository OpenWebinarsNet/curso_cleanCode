package io.pello.patterns.behavioral.iterator;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableStructure<S,T> implements Aggregation<T> {
	private Hashtable<S,T> hashtable;
	
	public HashtableStructure () {
		hashtable = new Hashtable<S,T>();
	}
	
	@Override
	public Iterator<T> createIterator() {
		return new HashIterator<S,T>(hashtable);
	}

	@Override
	public int count() {
		return hashtable.size();
	}

	@Override
	public void append(T item) {
		
	}
	
	/**
	 * appènds a new element
	 * @param key
	 * @param item
	 */
	public void append(S key, T item) {
		hashtable.put(key, item);
	}

	@Override
	public void remove(T item) {
		Enumeration<S> keys = hashtable.keys();
		S key = null;
		while (keys.hasMoreElements()) {
			key = keys.nextElement();
			if (hashtable.get(key)==item) {
				hashtable.remove(key);
				break;
			}
		}
	}

}
