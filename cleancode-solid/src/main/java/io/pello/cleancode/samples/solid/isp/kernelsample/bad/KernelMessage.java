package io.pello.cleancode.samples.solid.isp.kernelsample.bad;

import java.util.Date;

public class KernelMessage {
	private Date date;
	private String message;

	public KernelMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public String getMessage() {
		return message;
	}

}
