package io.pello.cleancode.samples.solid.isp.kernelsample.better;

import java.util.Date;

public class Process {
	private Date date;
	private String command;
	private User user;
	private KernelCore kernel;
	
	public Process(KernelCore kernel, String command, User user) {
		this.kernel = kernel;
		this.command = command;
		this.user = user;
	}

	
	public KernelMessage shutdown () {
		return kernel.shutdown();
	}
	
	
	public KernelMessage execute () {
		return kernel.execute(this);
	}
	
	public KernelMessage kill (Process process, int signal) {
		return kernel.kill(process, signal);
	}

	public Date getDate() {
		return date;
	}

	public String getCommand() {
		return command;
	}
}
