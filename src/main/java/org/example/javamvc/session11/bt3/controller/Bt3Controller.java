package org.example.javamvc.session11.bt3.controller;

import org.example.javamvc.session11.bt2.model.UserRegister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class Bt3Controller {
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("userRegister", new UserRegister());
        return "register";
    }

    // Xử lý form đăng ký
    @PostMapping("/register")
    public String processRegister(
            @Valid @ModelAttribute("userRegister") UserRegister userRegister,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "register"; // Trả về lại form nếu có lỗi
        }

        // Nếu không có lỗi, hiển thị trang thành công
        return "register_success";
    }
}
