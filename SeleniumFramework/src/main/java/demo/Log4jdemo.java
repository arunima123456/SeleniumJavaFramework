package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jdemo {
	private static Logger logger=LogManager.getLogger(Log4jdemo.class);
	public static void main(String[] args) 
	{
		
		System.out.println("hello world");	
		logger.trace("This is a trace message");
		logger.info("this is information message ");
		logger.error("This is an error message");
		logger.warn("This is a warning  message");
		logger.fatal("This is a fatal message");
		System.out.println("COMPLEETD");
		}

}
