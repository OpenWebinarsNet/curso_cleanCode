package io.pello.cleancode.samples.solid.isp.kernelsample.better;

public class Printer {
	private KernelOutput kernel;
	
	public Printer (KernelOutput kernel) {
		this.kernel = kernel;
	}
	
	public KernelMessage putChar(char c) {
		return kernel.putChar(c);
	}
}
