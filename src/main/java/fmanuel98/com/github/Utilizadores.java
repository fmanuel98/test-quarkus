package fmanuel98.com.github;

import java.util.Optional;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.BadRequestException;

@ApplicationScoped
public class Utilizadores implements PanacheRepositoryBase<Utilizador, Long> {
    public Optional<Utilizador> findByEmail(String email) {
        return find("email", email).firstResultOptional();
    }

    @Transactional
    public Utilizador salvar(Utilizador utilizador) {
        final var user = findByEmail(utilizador.email);
        if (user.isPresent()) {
            throw new BadRequestException("email ja cadastrado");
        }
        persist(utilizador);
        return utilizador;
    }
}
