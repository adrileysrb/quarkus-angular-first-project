package org.example.controler;

import org.example.service.CDService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cds")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CDController {

    @Inject
    CDService cdService;

    @GET
    public Response findAll(){
        return Response.ok(this.cdService.findAll()).build();
    }

}
