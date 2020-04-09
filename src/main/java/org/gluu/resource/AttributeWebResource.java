package org.gluu.resource;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.gluu.model.GluuAttribute;
//import org.gluu.oxtrust.service.filter.ProtectedApi;
import org.gluu.service.AttributeService;
import org.slf4j.Logger;

@Path(ApiConstants.BASE_API_URL + ApiConstants.ATTRIBUTES)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class AttributeWebResource extends BaseWebResource {

	@Inject
	private Logger logger;

	@Inject
	private AttributeService attributeService;

	public AttributeWebResource() {
	}

//	@GET
//	@Operation(summary = "Get all attributes", description = "Gets all the gluu attributes")
//	@ApiResponses(value = {
//			@ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = GluuAttribute[].class)), description = "Success"),
//			@ApiResponse(responseCode = "500", description = "Server error") })
//	@ProtectedApi(scopes = { READ_ACCESS })
//	public Response getAllAttributes() {
//		log(logger, "Processing getAllAttributes()");
//		try {
//			List<GluuAttribute> gluuAttributes = attributeService.getAllAttributes();
//			return Response.ok(gluuAttributes).build();
//		} catch (Exception e) {
//			log(logger, e);
//			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
//		}
//	}

}
