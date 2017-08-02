package io.pello.cleancode.samples.solid.isp.kernelsample.better;

public class Kernel 
	implements  KernelInput,
				KernelOutput,
				KernelFilesystem,
				KernelCore {
	
	public KernelMessage boot () {
		return null;
	}
	
	public KernelMessage shutdown () {
		return null;
	}
	
	public KernelMessage openFile (String name, User user) {
		return null;
	}
	
	public KernelMessage createFile (String name, User user) {
		return null;
	}
	
	public KernelMessage removeFile (String name, User user) {
		return null;
	}
	
	public KernelMessage copyFile (String origin, String destiny, User user) {
		return null;
	}
	
	public KernelMessage execute (Process process) {
		return null;
	}
	
	public KernelMessage kill (Process process, int signal) {
		return null;
	}
	
	public KernelMessage getChar () {
		return null;
		
	}
	
	public KernelMessage putChar (char c) {
		return null;
	}
	
	
}
