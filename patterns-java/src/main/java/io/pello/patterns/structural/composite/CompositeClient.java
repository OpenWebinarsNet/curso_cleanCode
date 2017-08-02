package io.pello.patterns.structural.composite;

/**
 * Makes use of the composite pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class CompositeClient {
	public static void main (String args[]) {
		Knight knight1 = new Knight();
		Knight knight2 = new Knight();
		Knight knight3 = new Knight();
		Knight knight4 = new Knight();
		Bowman bowman1 = new Bowman();
		Bowman bowman2 = new Bowman();
		Bowman bowman3 = new Bowman();
		Squad squad = new Squad();
		
		squad.add(knight1);
		squad.add(bowman1);
		squad.add(bowman2);
		
		System.out.println("knight 4 attack: " + knight4.attack());
		System.out.println("Squad attack: " + squad.attack());
	}
}
