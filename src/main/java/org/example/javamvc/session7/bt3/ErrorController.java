package org.example.javamvc.session7.bt3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
    @RequestMapping("/error")
    public String handleError() {
        return "error";
    }
}
