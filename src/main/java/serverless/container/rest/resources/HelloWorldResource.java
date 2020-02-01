package serverless.container.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
public class HelloWorldResource {

    @GET
    @Path("/1.0/helloworld")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHelloWorld() {
        return Response.status(Response.Status.OK).entity("{\n\"Message\": \"Hello World\"\n}").build();
    }

}
