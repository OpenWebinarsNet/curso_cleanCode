package io.pello.patterns.behavioral.memento;

/**
 * Keeps an object state
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class UnitMemento {
	private State state;
	
	public void saveState(State state) {
		this.state = state;
	}
	
	public State getState () {
		return state;
	}
}
