
package io.pello.patterns.structural.decorator;

/**
 * Makes use of decorated characters
 * @author Pello Xabier Altadill Izura
 *
 */
public class DecoratorClient {
	public static void main (String args[]) {
		Character hordeCharacter= new Orc(new SimpleCharacter("Thrall"));
		System.out.println(hordeCharacter.toString());
	}
}
