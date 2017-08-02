package io.pello.patterns.behavioral.chainofresponsibility;

/**
 * Implements logger, Json must be parsed is shown on console
 * @author Pello Xabier Altadill Izura
 * @greet any
 */
public class JsonLogger extends Logger {

	public JsonLogger(int myLogType) {
		super(myLogType);
	}

	@Override
	protected void logMessage(LogMessage logMessage) {
		// Do JSONparsing stuff...
		System.out.println("Json Log: " + logMessage.getMsg());
	}
}
