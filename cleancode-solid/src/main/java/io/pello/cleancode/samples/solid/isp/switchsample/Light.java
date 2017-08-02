package io.pello.cleancode.samples.solid.isp.switchsample;

public class Light implements Switchable {
	private boolean isOn;
	
	public Light () {
		isOn = false;
	}

	public void turnOn() {
		isOn = true;
	}

	public void turnOff() {
		isOn = false;
	}

}
