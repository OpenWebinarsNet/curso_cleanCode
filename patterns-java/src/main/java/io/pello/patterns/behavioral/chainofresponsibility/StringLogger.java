package io.pello.patterns.behavioral.chainofresponsibility;

/**
 * Implements logger, String is shown on console
 * @author Pello Xabier Altadill Izura
 * @greet any
 */
public class StringLogger extends Logger {

	public StringLogger(int myLogType) {
		super(myLogType);
	}

	@Override
	protected void logMessage(LogMessage logMessage) {
		System.out.println("String Log: " + logMessage.getMsg());
	}
}
