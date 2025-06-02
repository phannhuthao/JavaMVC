package org.example.javamvc.session7.bt1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeControllersBt1 {
    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "Welcome to Spring MVC!";
    }
}
