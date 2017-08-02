
package io.pello.patterns.behavioral.observer;

/**
 * Simple client class to make use of Observer pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class ObserverClient {

	public static void main(String[] args) {
		PlayerSubject player = new PlayerSubject();
		Observer stringObserver = new TextObserver(player);
		Observer xmlObserver = new XMLObserver(player);
		Observer jsonObserver = new JSONObserver(player);
		
		player.attach(stringObserver);
		player.attach(xmlObserver);
		player.attach(jsonObserver);

		player.setState("I am alive");
		player.setState("I am dead");
		player.setState("Hola");
		
	}
}
