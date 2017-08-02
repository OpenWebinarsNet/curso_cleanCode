
package io.pello.patterns.creational.singleton;


public class SingletonClient {

	public static void main(String args[]) {
		System.out.println("Let's roll the die");

		for (int i = 0; i < 10; i++) {
			System.out.println(Die.getInstance().roll());
		}
	}
}
