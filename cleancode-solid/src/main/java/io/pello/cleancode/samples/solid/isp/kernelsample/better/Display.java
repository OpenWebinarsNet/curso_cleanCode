package io.pello.cleancode.samples.solid.isp.kernelsample.better;

public class Display {
	private KernelOutput kernel;
	
	public Display (KernelOutput kernel) {
		this.kernel = kernel;
	}
	
	public KernelMessage putChar(char c) {
		return kernel.putChar(c);
	}
}
