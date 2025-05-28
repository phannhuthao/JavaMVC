package org.example.javamvc.session8.bt4;

import org.example.javamvc.session8.bt4.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @GetMapping("/Bt4register")
    public String showForm() {
        return "registration";
    }

    @PostMapping("/register")
    public String handleForm(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("phone") String phoneStr,
            Model model) {

        boolean hasError = false;

        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("phone", phoneStr);

        if (name == null || name.trim().isEmpty()) {
            model.addAttribute("errorName", "Tên không được để trống.");
            hasError = true;
        }

        if (email == null || !email.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            model.addAttribute("errorEmail", "Email không hợp lệ.");
            hasError = true;
        }

        int phone = 0;
        try {
            phone = Integer.parseInt(phoneStr);
            if (phoneStr.length() < 9 || phoneStr.length() > 11) {
                model.addAttribute("errorPhone", "Số điện thoại phải có từ 9 đến 11 chữ số.");
                hasError = true;
            }
        } catch (NumberFormatException e) {
            model.addAttribute("errorPhone", "Số điện thoại không hợp lệ.");
            hasError = true;
        }

        if (hasError) {
            return "registration";
        }

        User user = new User(name, email, phone);
        model.addAttribute("user", user);
        return "bt4result";
    }
}
