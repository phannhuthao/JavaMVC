package org.example.javamvc.session7.bt5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
        @GetMapping("/a")
        public String showIndex() {
            return "index";
        }
}
