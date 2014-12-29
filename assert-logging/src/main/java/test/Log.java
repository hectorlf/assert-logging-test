package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
	
	private final Logger logger;

	public Log(Class<?> cls) {
		logger = LoggerFactory.getLogger(cls);
	}

	public void debug(String msg) {
		assert _debug(msg);
	}

	private boolean _debug(String msg) {
		logger.debug(msg);
		return true;
	}

}