package com.soumasoft.api.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/sheetmusic")
public class SheetmusicEndpont {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "hello";
    }
}
