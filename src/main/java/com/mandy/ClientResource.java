package com.mandy;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.WebClient;

/**
 * Rest service which calls another (server)
 * service using local-jndi transport
 *
 * @author Mandy Warren
 */
public class ClientResource {

    @GET
    @Produces({"application/json"})
    public Response getResource() {
        // call the server..
        WebClient client = WebClient.create("local://server");
        Response response = client.get(Response.class);
        return Response.status(Response.Status.OK)
                .entity(response.readEntity(String.class))
                .build();
    }
}
