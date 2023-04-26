package org.example.controler;

import org.example.service.BookService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookController {
    @Inject
    BookService bookService;

    @GET
    public Response findAll(){
        return Response.ok(this.bookService.findAll()).build();
    }

}
