package omar.mebarki.keycloakspringboot.mvc;

import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class IndexController {

    @GetMapping(path = "/")
    public String indexInternal() {
        return "indexInternal";
    }

    @GetMapping(path = "/secret")
    public String secret(Principal principal, Model model) {
        KeycloakSecurityContext token = (KeycloakSecurityContext) ((Authentication) principal).getCredentials();

        model.addAttribute("username", token.getIdToken());
        return "secret";
    }
}
