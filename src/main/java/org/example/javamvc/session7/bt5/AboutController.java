package org.example.javamvc.session7.bt5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String showAbout() {
        return "about";
    }
}
