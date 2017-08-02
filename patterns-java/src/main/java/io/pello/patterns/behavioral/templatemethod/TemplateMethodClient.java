package io.pello.patterns.behavioral.templatemethod;

import io.pello.patterns.behavioral.command.Army;

/**
 * Simple class to make use of TemplateMethod pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class TemplateMethodClient {
	public static void main (String args[]) {
		Army armyOfGood = new Army();
		Army armyOfEvil = new Army();
		
		Assault assault = new RandomAssault(armyOfGood, armyOfEvil);	
		assault.assault();
	}
}
