package io.pello.patterns.behavioral.iterator;

import io.pello.patterns.structural.composite.Squad;

/**
 * Class that makes use of the iterator
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class IteratorClient {
	public static void main (String args[]) {
		Squad squad1 = new Squad();
		Squad squad2 = new Squad();
		Squad squad3 = new Squad();
		
		HashtableStructure<String,Squad> squads = new HashtableStructure<String,Squad>();
		
		squads.append("Squad1",squad1);
		squads.append("Squad2",squad2);
		squads.append("Squad3",squad3);
		
		Iterator<Squad> iterator = squads.createIterator();
		while (iterator.isDone()) {
			iterator.next();
			Squad squad = iterator.currentItem();
			System.out.println("Squad data: "+ squad.toString());

		}
	}
}
