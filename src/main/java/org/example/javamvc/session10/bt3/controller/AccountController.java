package org.example.javamvc.session10.bt3.controller;

import org.example.javamvc.session10.bt3.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {

    @PostMapping("/account/register")
    public String register(@RequestParam String username,
                           @RequestParam String password,
                           @RequestParam String email,
                           Model model) {
        Account account = new Account(username, password, email);

        model.addAttribute("account", account);
        model.addAttribute("message", "Đăng ký thành công!");

        return "registerForm";
    }
}
