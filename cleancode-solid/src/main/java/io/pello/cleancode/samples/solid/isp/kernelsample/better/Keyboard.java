package io.pello.cleancode.samples.solid.isp.kernelsample.better;

public class Keyboard {
	private KernelInput kernel;
	
	public Keyboard (KernelInput kernel) {
		this.kernel = kernel;
	}
	
	public KernelMessage getChar() {
		return kernel.getChar();
	}
}
