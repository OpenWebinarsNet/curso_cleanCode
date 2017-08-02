package io.pello.cleancode.samples.solid.isp.kernelsample.better;

public class Scanner {
	private KernelInput kernel;
	
	public Scanner (KernelInput kernel) {
		this.kernel = kernel;
	}
	
	public KernelMessage getChar() {
		return kernel.getChar();
	}
}
