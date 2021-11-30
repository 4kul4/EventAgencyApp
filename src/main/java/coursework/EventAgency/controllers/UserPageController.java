package coursework.EventAgency.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import coursework.EventAgency.entities.Client;

@Controller
public class UserPageController {
    @GetMapping("/userpage")
    public String UserPage(Model model) {
        model.addAttribute("client", (Client)SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return "html/userPage";
    }
}
