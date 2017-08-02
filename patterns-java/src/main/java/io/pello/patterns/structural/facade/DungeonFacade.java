
package io.pello.patterns.structural.facade;

import io.pello.patterns.structural.decorator.Character;
import io.pello.patterns.structural.decorator.Orc;
import io.pello.patterns.structural.decorator.SimpleCharacter;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ArrayList;

/**
 * A facade to hide all the complexity of Dungeon generation
 * which consist in many different instances
 * @author Pello Xabier Altadill Izura
 *
 */
public class DungeonFacade {
	private ArrayList<Treasure> treasures;
	private Hashtable<String, Character> characters;
	private ArrayList<Trap> traps;
	
	public DungeonFacade () {
		treasures = new ArrayList<Treasure>();
		characters = new Hashtable<String,Character>();
		traps = new ArrayList<Trap>();
	}
	

	public void generate() {
		int total = (int)(Math.random() * 5);
		
		for (int i = 0;i < total; i++) {
			treasures.add(new Treasure("Gold",(int)(Math.random() * 5)));
		}
		
		total = (int)(Math.random() * 5);
		
		for (int i = 0;i < total; i++) {
			characters.put("Character" + i, new Orc(new SimpleCharacter("Orc" + i)));
		}

		total = (int)(Math.random() * 5);
		
		for (int i = 0;i < total; i++) {
			traps.add(new Trap("Spikes"));
		}

	}

	public String getProperties() {
		String report = "";
		report = "Dungeon properties";
		report += "Treasures\n";
		for (Treasure treasure: treasures) {
			report += "\t" + treasure.toString() + "\n"; 
		}
		
		report += "Characters\n";
		Enumeration<String> list = characters.keys();
		while (list.hasMoreElements()) {
			report += "\t" + characters.get(list.nextElement()).toString() + "\n"; 
		}
		
		report += "Traps\n";
		for (Trap trap: traps) {
			report += trap.toString();
		}
		return report;
	}
}
