package hse.homecare.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/homecare")
    public String home(Model model) {
        return "index";
    }

    @GetMapping("/home")
    public String home2(Model model) {
        return "home";
    }

}
