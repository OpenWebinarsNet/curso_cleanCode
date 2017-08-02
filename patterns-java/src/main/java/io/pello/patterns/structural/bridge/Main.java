package io.pello.patterns.structural.bridge;

public class Main {

	public static void main(String[] args) {
		PlayerCharacter player = new PlayerCharacter(new RandomAssignation(), "Eugene");
		ComputerCharacter computer = new ComputerCharacter(new BalancedAssignation(), "Bob");
	
		player.generateCharacter();
		computer.generateCharacter();
		
		System.out.println(player);
		System.out.println(computer);
	}
}
