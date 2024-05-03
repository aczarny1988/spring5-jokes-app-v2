package aczarny.springframework.spring5jokesappv2.controllers;

import aczarny.springframework.spring5jokesappv2.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesService.printJoke());
        return "index";
    }


}
