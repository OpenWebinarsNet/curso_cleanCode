package io.pello.cleancode.samples.solid.isp.kernelsample.bad;

public class Display {
	private Kernel kernel;

	public Display(Kernel kernel) {
		this.kernel = kernel;
	}

	public KernelMessage putChar(char c) {
		return kernel.putChar(c);
	}
}
