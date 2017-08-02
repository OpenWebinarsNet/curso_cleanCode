package io.pello.cleancode.samples.solid.isp.kernelsample.bad;

public class File {

	private Kernel kernel;

	public File(Kernel kernel) {
		this.kernel = kernel;
	}

	public KernelMessage openFile(String name, User user) {
		return kernel.openFile(name, user);
	}

	public KernelMessage createFile(String name, User user) {
		return kernel.createFile(name, user);
	}

	public KernelMessage removeFile(String name, User user) {
		return kernel.removeFile(name, user);
	}

	public KernelMessage copyFile(String origin, String destiny, User user) {
		return copyFile(origin, destiny, user);
	}
}
