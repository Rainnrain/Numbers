package com.lorraine;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

@QuarkusTest
public class BookResourceTest {

    @Test
    public void shouldCreateABook() {
        given()
                .formParam("title", "Understanding Quarkus")
                .formParam("author", "Lorraine Can")
                .formParam("year", 2020)
                .formParam("genre", "IT").
                when()
                .post("/api/books")
                .then()
                .statusCode(201)
                .body("isbn_13", startsWith("13-"))
                .body("title", is("Understanding Quarkus"))
                .body("author", is("Lorraine Can"))
                .body("year_of_publication", is(2020))
                .body("genre", is("IT"))
                .body("creation_date", startsWith("20"));
    }

}