package io.pello.cleancode.samples.solid.isp.kernelsample.better;

public interface KernelFilesystem {
	
	public KernelMessage openFile (String name, User user);
	
	public KernelMessage createFile (String name, User user);
	
	public KernelMessage removeFile (String name, User user);
	
	public KernelMessage copyFile (String origin, String destiny, User user);
}
