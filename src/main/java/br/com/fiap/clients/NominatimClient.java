package br.com.fiap.client;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "https://nominatim.openstreetmap.org")
@Path("/search")
public interface NominatimClient {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    String geocode(
            @QueryParam("q") String query,
            @QueryParam("format") String format
    );
}
