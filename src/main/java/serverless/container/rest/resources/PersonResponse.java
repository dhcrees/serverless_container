package serverless.container.rest.resources;

import serverless.container.model.person.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("")
public class PersonResponse {

    @POST
    @Path("/1.0/person")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postPerson(Person person) {
        return Response.status(Response.Status.OK).entity(person).build();
    }

    @GET
    @Path("/1.0/person")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPerson(@QueryParam("firstName") String firstName,
                              @QueryParam("lastName") String lastName,
                              @QueryParam("phoneNumber") String phoneNumber) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setPhoneNumber(phoneNumber);
        return Response.status(Response.Status.OK).entity(person).build();
    }


    @GET
    @Path("/1.0/persons")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersons() {

        List<Person> persons = new ArrayList<>();

        Person person = new Person();
        person.setFirstName("Howard");
        person.setLastName("Rees");
        person.setPhoneNumber("0163983030");

        persons.add(person);
        persons.add(person);

        serverless.container.model.response.PersonResponse personResponse = new serverless.container.model.response.PersonResponse();

        personResponse.setPersons(persons);

        return Response.status(Response.Status.OK).entity(personResponse).build();
    }


    @GET
    @Path("1.0/{department}/person")
    public Response getPersonByDepartment(@PathParam("department") String department) {
        return Response.status(Response.Status.OK).entity("{\n\"Department\": \"" + department + "\"\n}").build();
    }
}
