package org.gluu.resource;

import org.slf4j.Logger;

public class BaseWebResource {
	
	protected static final String READ_ACCESS = "oxtrust-api-read";
	protected static final String WRITE_ACCESS = "oxtrust-api-write";

	public BaseWebResource() {
	}

	public void log(Logger logger, Exception e) {
		logger.debug("APIv1===================", e);
	}

	public void log(Logger logger, String message) {
		logger.info("APIv1=====================" + message + "===============================");
	}

}
