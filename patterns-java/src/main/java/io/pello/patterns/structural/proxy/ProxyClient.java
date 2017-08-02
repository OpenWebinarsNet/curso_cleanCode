package io.pello.patterns.structural.proxy;

/**
* Makes use of a complex object using a proxy
* @author Pello Xabier Altadill Izura
* @greetz any
*/
public class ProxyClient {
	public static void main (String args[]) {
		Scores scores = new ScoresProxy();
		System.out.println(scores.show());
	}
}
