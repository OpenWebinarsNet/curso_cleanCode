
package io.pello.patterns.behavioral.observer;

/**
 * Concrete implementation of Subject in observer pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class PlayerSubject extends Subject {
	private String playerState;

	@Override
	public String getState() {
		return playerState;
	}

	/*
	 * sets player data
	 * and consequently notifies and changes observers
	 */
	public void setState (String state) {
		playerState = state;
		notifyObservers();
	}
}
