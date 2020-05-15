package org.gluu.webapi.health;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.gluu.model.ApiHealth;

import org.slf4j.Logger;

import org.gluu.persist.PersistenceEntryManager;

import org.gluu.resource.BaseWebResource;

@Path("/health-check")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class HealthCheck extends BaseWebResource {
	
	@Inject
	private Logger log;
	
	@Inject
	private PersistenceEntryManager ldapEntryManager;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Operation(summary = "Return json object containing the sate of the api.")
	@APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = ApiHealth.class, required = true)))
	public Response health() {
		log.debug("\nHealthResource::health() - ldapEntryManager.getPersistenceType() = "+ldapEntryManager.getPersistenceType()+"\n");
		return Response.ok(ldapEntryManager.getPersistenceType()).build();
	}

}
