package org.example.javamvc.session11.bt1.controller;

import org.example.javamvc.session11.bt1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class Bt1Controller {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "bt1";
    }

    @PostMapping("/form")
    public String submitForm(@Valid @ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        return "success";
    }
}
