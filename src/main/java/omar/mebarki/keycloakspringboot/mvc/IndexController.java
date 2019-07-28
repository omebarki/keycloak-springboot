package omar.mebarki.keycloakspringboot.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(path = "/")
    public String indexInternal() {
        return "/static/indexInternal.html";
    }
}
