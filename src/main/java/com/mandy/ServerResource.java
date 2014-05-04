package com.mandy;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Rest service which says hello to the
 * calling (client) service
 *
 * @author Mandy Warren
 */
public class ServerResource {

    @GET
    @Produces({"application/json"})
    public Response getResource() {
        return Response.status(Response.Status.OK).entity("hello").build();
    }
}
