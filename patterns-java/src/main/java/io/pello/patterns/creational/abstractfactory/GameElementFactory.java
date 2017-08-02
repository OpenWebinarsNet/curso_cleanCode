
package io.pello.patterns.creational.abstractfactory;

/**
 * Abstract class to encapsule game elements creation
 * using Abstract Factory
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public abstract class GameElementFactory {
    public GameElementFactory(){}
    
    /**
     * creates a character
     * @return new instance of an abstract warrior 
     */
    public abstract Character createCharacter ();

    /**
     * creates a building
     * @return new instance of an abstract building 
     */
    public abstract Building createBuilding ();

    /**
     * creates an artifact
     * @return new instance of an abstract artifact 
     */
    public abstract Weapon createWeapon ();

}
