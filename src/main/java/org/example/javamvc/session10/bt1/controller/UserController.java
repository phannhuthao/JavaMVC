package org.example.javamvc.session10.bt1.controller;

import org.example.javamvc.session10.bt1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/user")
    public String showForm() {
        return "userForm";
    }

    @PostMapping("/user")
    public String submitForm(@RequestParam("name") String name,
                             @RequestParam("age") int age,
                             @RequestParam("address") String address,
                             Model model) {
        User user = new User(name, age, address);
        model.addAttribute("user", user);
        return "userResult";
    }
}
