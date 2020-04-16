package org.gluu;

import javax.enterprise.context.RequestScoped;

import org.jboss.logging.Logger;

@RequestScoped
public class ReportService {
	private static final Logger LOGGER = Logger.getLogger(ReportService.class);
	
	public void showStartupMessage() {
		LOGGER.info("Reporting application startup------------");
	}

}
