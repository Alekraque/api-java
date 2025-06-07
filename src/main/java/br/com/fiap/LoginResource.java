package br.com.fiap;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

@Path("/login")
public class LoginResource {

    // Credenciais fixas
    private static final String EMAIL_FIXO = "admin@fiap.com";
    private static final String SENHA_FIXA = "1234";

    public static class LoginRequest {
        @Schema(description = "Email do usuário", example = EMAIL_FIXO)
        public String email;

        @Schema(description = "Senha do usuário", example = SENHA_FIXA)
        public String senha;
    }

    public static class LoginResponse {
        public String mensagem;
        public boolean sucesso;

        public LoginResponse(String mensagem, boolean sucesso) {
            this.mensagem = mensagem;
            this.sucesso = sucesso;
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Realiza login com email e senha fixos")
    @APIResponse(responseCode = "200", description = "Login realizado com sucesso",
            content = @Content(mediaType = "application/json"))
    @APIResponse(responseCode = "401", description = "Usuário ou senha inválidos",
            content = @Content(mediaType = "application/json"))
    public Response login(@RequestBody(description = "Credenciais do usuário",
            required = true,
            content = @Content(schema = @Schema(implementation = LoginRequest.class)))
                          LoginRequest request) {

        if (EMAIL_FIXO.equals(request.email) && SENHA_FIXA.equals(request.senha)) {
            return Response.ok(new LoginResponse("Login realizado com sucesso!", true)).build();
        } else {
            return Response.status(Response.Status.UNAUTHORIZED)
                    .entity(new LoginResponse("Usuário ou senha inválidos!", false))
                    .build();
        }
    }
}
