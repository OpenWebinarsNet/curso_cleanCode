package io.pello.cleancode.samples.solid.ocp.better;

/**
 * Interface to provide different encryption 
 * methods through implementations. So you must
 * implement encryption classes using this methods
 * @author Pello Altadill
 * @greetz for you and Bruce Schneier
 */
public interface Encryption {
	public String encrypt(String textToEncrypt);
	public String decrypt (String textoToDecrypt);
}
