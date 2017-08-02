package io.pello.patterns.behavioral.observer;

/**
 * Extends observer to give XML output
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class XMLObserver extends Observer {

	public XMLObserver(Subject subject) {
		super(subject);
	}

	public void update() {
		observerState = "<!xml version=\"1.0\"><data>"
					+ subject.getState() + "</data>";
	}
}
