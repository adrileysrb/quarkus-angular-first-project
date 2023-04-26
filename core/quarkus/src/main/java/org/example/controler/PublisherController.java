package org.example.controler;

import org.example.service.PublisherService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/publishers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PublisherController {

    @Inject
    PublisherService publisherService;

    @GET
    public Response findAll(){
        return Response.ok(this.publisherService.findAll()).build();
    }

}
