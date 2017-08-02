package io.pello.cleancode.samples.solid.isp.kernelsample.bad;

public class Keyboard {
	private Kernel kernel;

	public Keyboard(Kernel kernel) {
		this.kernel = kernel;
	}

	public KernelMessage getChar() {
		return kernel.getChar();
	}
}
