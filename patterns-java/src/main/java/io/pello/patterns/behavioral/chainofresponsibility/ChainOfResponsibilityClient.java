package io.pello.patterns.behavioral.chainofresponsibility;

/**
 * Client class to make use of Chain Of Responsibility pattern
 * @author Pello Xabier Altadill Izura
 * @greet any
 */
public class ChainOfResponsibilityClient {
	public static final int STRING_LOGGER = 1;
	public static final int JSON_LOGGER = 2;
	public static final int XML_LOGGER = 3;
	
	public static void main (String args[]) {
		Logger logger = new StringLogger(STRING_LOGGER);
		logger.setNext(new JsonLogger(JSON_LOGGER)).setNext(new XmlLogger(XML_LOGGER));
		
		LogMessage message1 = new LogMessage(STRING_LOGGER,"hello");
		LogMessage message2 = new LogMessage(XML_LOGGER,"<!xml><greet>Hello</greet>");
		LogMessage message3 = new LogMessage(JSON_LOGGER,"{\"greet\":\"hello\"}");
		
		logger.log(message1);
		logger.log(message2);
		logger.log(message2);
		logger.log(message3);
		logger.log(message3);
	}
}
