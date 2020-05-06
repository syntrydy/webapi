package org.gluu.resource;

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
import org.gluu.oxtrust.service.ClientService;

import org.slf4j.Logger;

@Path("/health")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class HealthResource extends BaseWebResource {
	
	@Inject
	ClientService clientService;
	
	@Inject
	private Logger log;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Operation(summary = "Return json object containing the sate of the api.")
	@APIResponse(responseCode = "200", content = @Content(mediaType = APPLICATION_JSON, schema = @Schema(implementation = ApiHealth.class, required = true)))
	public Response health() {
		log.debug("\nHealthResource::health() - getAllClients().size() = "+clientService.getAllClients().size()+"\n");
		return Response.ok(clientService.getAllClients().size()).build();
	}
}