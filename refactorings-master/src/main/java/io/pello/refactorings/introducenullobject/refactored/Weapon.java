package io.pello.refactorings.introducenullobject.refactored;

import java.util.Random;

/**
 * Introduce null object
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Weapon {
	  private int damage;

	  public Weapon(int damage) {
		  this.damage = damage;
	  }

	  public int getDamage () {
	    return damage + new Random().nextInt(3);
	  }

}
