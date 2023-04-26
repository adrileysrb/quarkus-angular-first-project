package org.example.controler;


import org.example.service.ArtistService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/artists")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArtistController {

    @Inject
    private ArtistService artistService;

    @GET
    public Response findAll(){
        return Response.ok(this.artistService.findAll()).build();
    }

    @GET()
    @Path("/pagination")
    public Response find(
            @QueryParam("query") String query,
            @QueryParam("sort") @DefaultValue("id") String sort,
            @QueryParam("pageIndex") @DefaultValue("0") Integer pageIndex,
            @QueryParam("pageSize") @DefaultValue("10") Integer pageSize

    ){
        return Response.ok(artistService.find(query, sort, pageIndex, pageSize)).build();
    }
}
