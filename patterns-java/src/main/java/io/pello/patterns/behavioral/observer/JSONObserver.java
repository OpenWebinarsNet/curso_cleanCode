
package io.pello.patterns.behavioral.observer;

/**
 * Extends observer to give JSON output
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class JSONObserver extends Observer {

	public JSONObserver(Subject subject) {
		super(subject);
	}

	public void update() {
		observerState = "{\"data\" :\""
				+ subject.getState() + "\" }";
	}
}
