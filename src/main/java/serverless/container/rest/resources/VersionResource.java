package serverless.container.rest.resources;

import serverless.container.services.VersionService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("")
public class VersionResource {
    @GET
    @Path("/1.0/version")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVersion() throws IOException {

        VersionService versionService = new VersionService();
        return Response.status(Response.Status.OK).entity(versionService.getVersion()).build();

    }
}
