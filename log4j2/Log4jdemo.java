package log4j2;

import org.apache.logging.log4j.LogManager;

public class Log4jdemo {
	
	 private static final org.apache.logging.log4j.Logger log = LogManager.getLogger("Log4jdemo");
	    public static void main(String[] args) {
	    	
	        log.info("Hello, World!");
	    }

}
