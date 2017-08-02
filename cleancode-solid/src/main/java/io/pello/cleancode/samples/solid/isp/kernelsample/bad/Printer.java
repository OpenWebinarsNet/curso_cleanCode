package io.pello.cleancode.samples.solid.isp.kernelsample.bad;

public class Printer {
	private Kernel kernel;

	public Printer(Kernel kernel) {
		this.kernel = kernel;
	}

	public KernelMessage putChar(char c) {

		return kernel.putChar(c);
	}
}
