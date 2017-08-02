package io.pello.cleancode.samples.solid.isp.kernelsample.better;

import java.util.Date;

public class File {
	private Date date;
	private KernelFilesystem kernel;
	
	public File(KernelFilesystem kernel) {
		this.kernel = kernel;
	}
	
	public KernelMessage openFile (String name, User user) {
		return kernel.openFile(name, user);
	}
	
	public KernelMessage createFile (String name, User user) {
		return kernel.createFile(name, user);
	}
	
	public KernelMessage removeFile (String name, User user) {
		return kernel.removeFile(name, user);
	}
	
	public KernelMessage copyFile (String origin, String destiny, User user) {
		return kernel.copyFile(origin, destiny, user);
	}

	public Date getDate() {
		return date;
	}

}
