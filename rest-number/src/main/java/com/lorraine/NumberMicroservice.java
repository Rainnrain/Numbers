package com.lorraine;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.openapi.annotations.tags.Tags;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(title = "Number Microservices",
                description = "This microservice generates book numbers",
                version = "1.0",
                contact = @Contact(name = "@agoncal", url = "https://twistter/blah/blah")),
        externalDocs = @ExternalDocumentation(url = "https://github/code", description = "This is important stuff"),
        tags={
             @Tag(name = "api", description = "Public API that can blah"),
             @Tag(name = "numbers", description = "this is good")
        }
)


public class NumberMicroservice extends Application {
}
