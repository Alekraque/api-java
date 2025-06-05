package br.com.fiap.services;

import br.com.fiap.dto.ShelterLocation;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/abrigos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AbrigosResource {

    @Inject
    AbrigoService abrigoService;

    @GET
    public List<ShelterLocation> getAbrigosProximos(
            @QueryParam("lat") double latitude,
            @QueryParam("lng") double longitude
    ) {
        return abrigoService.gerarAbrigosProximos(latitude, longitude);
    }
}
