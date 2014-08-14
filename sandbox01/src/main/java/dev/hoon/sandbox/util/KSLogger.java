package dev.hoon.sandbox.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KSLogger {
	private static Logger instance;
	
	@SuppressWarnings("rawtypes")
	public static Logger getInstance(Class c) {
		if(instance == null) {
			synchronized(KSLogger.class) {
				if(instance == null) {
					instance = LoggerFactory.getLogger(c);
				}
			}
		}
		
		return instance; 
	}
}
