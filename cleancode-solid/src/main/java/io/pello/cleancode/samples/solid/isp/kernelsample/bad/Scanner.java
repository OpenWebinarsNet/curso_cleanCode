package io.pello.cleancode.samples.solid.isp.kernelsample.bad;

public class Scanner {
	private Kernel kernel;

	public Scanner(Kernel kernel) {
		this.kernel = kernel;
	}

	public KernelMessage getChar() {
		return kernel.getChar();
	}
}
