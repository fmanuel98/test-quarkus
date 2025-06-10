package fmanuel98.com.github;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Tag(name = "Pessoas", description = "Recurso de Pessoas")
@Path("/pessoas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaController {
    private final Utilizadores _utilizadores;

    public PessoaController(final Utilizadores utilizadores) {
        _utilizadores = utilizadores;
    }

    @GET
    public List<Utilizador> Listar() {
        return _utilizadores.listAll();
    }

    @POST
    @Transactional
    public Utilizador salvar(@Valid UtilizadorInput input) {
        final var domain = input.toDomain();
        return _utilizadores.salvar(domain);
    }

}
