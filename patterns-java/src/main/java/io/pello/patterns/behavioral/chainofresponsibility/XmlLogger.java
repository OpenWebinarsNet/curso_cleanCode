package io.pello.patterns.behavioral.chainofresponsibility;

/**
 * Implements logger, Xml must be parsed is shown on console
 * @author Pello Xabier Altadill Izura
 * @greet any
 */
public class XmlLogger extends Logger {

	public XmlLogger( int myLogType) {
		super( myLogType);
	}

	@Override
	protected void logMessage(LogMessage logMessage) {
		// Do parsing stuff...
		System.out.println("XML Log: " + logMessage.getMsg());
	}
}
