package io.pello.patterns.behavioral.command;

import java.util.Scanner;

/**
 * Client class to make use of Command pattern
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class CommandClient {
	public static void main (String args[]) {
		Army army = new Army();
		Command attackCommand = new AttackCommand(army);
		Command moveCommand = new MoveCommand(army);
		Invoker invoker = new Invoker();
		String option = "";
		Scanner reader = new Scanner(System.in);
		
		do {
			System.out.println("Your command: ");
			option = reader.nextLine();
			switch (option) {
				case "attack": 	
								invoker.storeAndExecute(attackCommand);
								break;
				case "move": 	
								invoker.storeAndExecute(moveCommand);
								break;
				case "undo":	
								invoker.undo();	
								break;
				case "exit":
								System.out.println("Hasta la vista");
								break;
				default:		System.out.println("unknown command");
								break;
				
			}
		} while (!option.equals("exit"));
	}
}
