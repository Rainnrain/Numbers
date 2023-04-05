package com.lorraine;

import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.Instant;


@Path("/api/books")
public class BookResource {

    @Inject
    Logger logger;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createABook(@FormParam("title") String title, @FormParam("author") String author,@FormParam("year") int yearOfPublication, @FormParam("genre")String genre){
        Book book= new Book();
        book.isbn13="we will get it later from the Number Microservice";
        book.title=title;
        book.author=author;
        book.yearOfPublication=yearOfPublication;
        book.genre=genre;
        book.creationDate= Instant.now();

        logger.info("Book created: "+book);

        return Response.status(201).entity(book).build();
    }
}
