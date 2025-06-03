package org.example.javamvc.session11.bt2.controller;

import org.example.javamvc.session11.bt2.model.UserRegister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class Bt2Controller {
    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("userRegister", new UserRegister());
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@Valid @ModelAttribute("userRegister") UserRegister user,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        return "register_success";
    }
}
