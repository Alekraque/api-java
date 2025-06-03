package br.com.fiap.clients;

import br.com.fiap.dto.ViaCepResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@RegisterRestClient(configKey = "viacep-api")
public interface ViaCepClient {

    @GET
    @Path("/{cep}/json/")
    ViaCepResponse getAddressByCep(@PathParam("cep") String cep);
}
