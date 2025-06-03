package br.com.fiap.clients;

import br.com.fiap.dto.NominatimResult;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import java.util.List;

@RegisterRestClient(configKey = "nominatim-api")
public interface NominatimClient {

    @GET
    @Path("/search")
    List<NominatimResult> search(
            @QueryParam("q") String query,
            @QueryParam("format") String format,
            @QueryParam("limit") int limit
    );
}
