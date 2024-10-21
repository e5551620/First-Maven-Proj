package com.Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_Demo {
	static Logger log = LogManager.getLogger(Log4j_Demo.class);

	public static void main(String[] args){
		
		log.info("Info message");
		log.error("errror");
		log.fatal("Fatal");
		log.warn("warning");
		log.trace("Trace");
		System.out.println("------------xml--------------");
		
	}
}
