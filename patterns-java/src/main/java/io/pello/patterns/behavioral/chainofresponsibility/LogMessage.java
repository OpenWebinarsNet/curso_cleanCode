package io.pello.patterns.behavioral.chainofresponsibility;

/**
 * LogMessage could be simple text, xml or json format
 * 
 * @author Pello Xabier Altadill Izura
 * @greet any
 */
public class LogMessage {
	private int type;
	private String msg;
	
	public LogMessage (int type, String msg) {
		this.type = type;
		this.msg = msg;
	}

	// getters/setters...
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}	
}
