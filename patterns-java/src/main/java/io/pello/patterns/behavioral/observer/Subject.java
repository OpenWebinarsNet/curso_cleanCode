package io.pello.patterns.behavioral.observer;

import java.util.ArrayList;

/**
 * Definition of generic Subject in observer pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public abstract class Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public abstract String getState();
	
	 // adds an observer to list
	public void attach (Observer observer) {
		observers.add(observer);
	}

	// removes observer from list
	public void dettach (Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers () {
		for (Observer observer : observers) {
			observer.update();
			System.out.println(observer.observerState);
		}
	}
}
