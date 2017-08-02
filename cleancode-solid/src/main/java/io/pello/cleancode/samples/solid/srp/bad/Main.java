package io.pello.cleancode.samples.solid.srp.bad;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Order order = new Order();
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		do {
			System.out.println("\n\nPlease choose:");
			System.out.println("1. Load order");
			System.out.println("2. Show total");
			System.out.println("3. Print Package Address");
			System.out.println("4. Get Status");
			System.out.println("5. Set Status");
			System.out.println("6. Show all");
			System.out.println("7. Exit");			
			System.out.println("Your choice: ");
			line = reader.nextLine();
			
			switch (line) {
			case "1":
				order.loadFromFile("order.txt");
				break;
			case "2":
				System.out.println("Total:" + order.calculateTotal());
				break;
			case "3":
				System.out.println(order.printPackageAddress());
				break;
			case "4":
				System.out.println(order.getStatus());
				break;
			case "5":
				System.out.println("Enter new Status");
				line = reader.nextLine(); // Bad use of temporary!
				order.setStatus(line);
				break;
			case "6":
				System.out.println(order.toString());
				break;
			case "7":
				System.out.println("See you soon");
				break;
			default:
				System.out.print("Wrong choice");
				break;
			}
		} while (!line.equals("7"));

		System.out.println(order);
		
	}

}
