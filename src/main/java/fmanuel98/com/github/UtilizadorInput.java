package fmanuel98.com.github;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UtilizadorInput {
    @NotBlank
    public String nome;
    @NotBlank
    @Email
    public String email;
    @NotBlank
    public String senha;

    public Utilizador toDomain() {
        final var user = new Utilizador();
        user.email = email;
        user.nome = nome;
        user.senha = senha;
        return user;
    }
}
