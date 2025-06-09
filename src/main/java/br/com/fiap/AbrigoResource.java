package br.com.fiap;

import br.com.fiap.beans.Abrigo;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/abrigos")
public class AbrigoResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Abrigo> listarAbrigos() {
        List<Abrigo> abrigos = new ArrayList<>();
        String[] enderecos = {
                "Rua Vergueiro, 1000 - Paraíso, São Paulo - SP, 04101-000",
                "Avenida Paulista, 1500 - Bela Vista, São Paulo - SP, 01310-200",
                "Rua Augusta, 200 - Consolação, São Paulo - SP, 01304-000",
                "Rua Oscar Freire, 500 - Jardim Paulista, São Paulo - SP, 01426-001",
                "Avenida Brigadeiro Faria Lima, 3000 - Itaim Bibi, São Paulo - SP, 04538-132"
        };

        for (int i = 1; i <= 100; i++) {
            String titulo = "Abrigo " + i;
            String descricao = "Descrição do abrigo número " + i;
            String endereco = enderecos[(i - 1) % enderecos.length];
            abrigos.add(new Abrigo(titulo, descricao, endereco));
        }
        return abrigos;
    }
}
