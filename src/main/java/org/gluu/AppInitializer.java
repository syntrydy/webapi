package org.gluu;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.gluu.app.service.StartupService;
import org.gluu.persist.couchbase.impl.CouchbaseEntryManager;
import org.jboss.logging.Logger;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class AppInitializer {

	private static final Logger LOGGER = Logger.getLogger(AppInitializer.class);
	
	
	@Inject
	private StartupService startupService;
	
//	CouchbaseEntryManager entryManager;
	
	void onStart(@Observes StartupEvent ev) {
		LOGGER.info("The application is starting...");
		LOGGER.info("=========================================");
		startupService.sayHello();
		LOGGER.info("=========================================");
	}

	void onStop(@Observes ShutdownEvent ev) {
		LOGGER.info("The application is stopping...");
	}

}
