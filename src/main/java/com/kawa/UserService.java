package com.kawa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserService {

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAll() {
        return Response.status(Response.Status.OK).entity("yep").build();
    }
}
