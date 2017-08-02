package io.pello.cleancode.samples.solid.isp.kernelsample.better;

public interface KernelCore {
	public KernelMessage shutdown ();
	
	public KernelMessage execute (Process process);
	
	public KernelMessage kill (Process process, int signal);
	
}
