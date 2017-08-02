package io.pello.patterns.structural.flyweight;

/**
 * Creature keeps his attributes in an external cache.
 * We could also use a
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Creature {
	private String name;
	
	
	public Creature (String name) {
		this.name = name;
	}
	
	/**
	 * using the creature name, gets attributes
	 * @return
	 */
	public CreatureAttributes getAttributes () {
		return CreatureCache.getInstance().getCreatureAttributes(name);
	}

	@Override
	public String toString() {
		return "Creature [name=" + name + ", getAttributes()=" + getAttributes() + "]";
	}
	
	
}
