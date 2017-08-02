package io.pello.patterns.behavioral.chainofresponsibility;

/**
 * Abstract class to create chain of responsibility
 * @author Pello Xabier Altadill Izura
 * @greet any
 */
public abstract class Logger {
	protected Logger nextLogger;
	protected int myLogType;
	
	public Logger (int myLogType) {
		this.myLogType = myLogType;
	}
	
	/**
	 * stablish next logger in chain
	 */
	public Logger setNext (Logger logger) {
		nextLogger = logger;
		return logger;
	}
	
	/**
	 * This is called to perform log, if this class
	 * is not able, passes this task to the next in chain
	 */
	public void log (LogMessage logMessage) {
		if (myLogType == logMessage.getType()) {
			logMessage(logMessage);
		} else if (null != nextLogger) {
			nextLogger.log(logMessage);
		}
	}
		
	protected abstract void logMessage (LogMessage logMessage);
}
