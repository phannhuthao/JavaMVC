package org.example.javamvc.session8.bt1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Bt1Controller {
    @GetMapping("/")
    public String showHome() {
        return "welcome";
    }
}
