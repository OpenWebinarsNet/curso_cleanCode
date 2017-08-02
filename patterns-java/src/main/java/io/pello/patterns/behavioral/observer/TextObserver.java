package io.pello.patterns.behavioral.observer;

/**
 * Definition of observer pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class TextObserver extends Observer {

	public TextObserver(Subject subject) {
		super(subject);
	}

	public void update() {
		observerState = subject.getState();
	}
}
