package fmanuel98.com.github;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

import jakarta.ws.rs.core.Application;

@OpenAPIDefinition(info = @Info(title = "Api para cadastro e listagem de pessoas", version = "1.0.1", contact = @Contact(name = "Meus contactos", url = "https://github.com/fmanuel98", email = "faugf320@gmail.com")))
public class App extends Application {

}
