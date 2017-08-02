
package io.pello.patterns.behavioral.observer;

/**
 * Definition of observer pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public abstract class Observer {
	protected String observerState;
	protected Subject subject;
	
	// This method will update view
	public abstract void update ();

	public Observer (Subject subject) {
		this.subject = subject;
	}
	
	// getters/setters...

	public String getObserverState() {
		return observerState;
	}

	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}
}
