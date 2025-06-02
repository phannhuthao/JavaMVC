package org.example.javamvc.session9.bt1.controller;

import org.example.javamvc.session9.bt1.dao.CustomerDAO;
import org.example.javamvc.session9.bt1.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String processLogin(HttpServletRequest request, Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            model.addAttribute("error", "Tên đăng nhập và mật khẩu không được để trống!");
            return "login";
        }

        Customer customer = CustomerDAO.checkLogin(username, password);
        if (customer != null) {
            // Nếu đăng nhập thành công, chuyển sang home
            model.addAttribute("username", customer.getUsername());
            return "homebt1";
        } else {
            // Sai tài khoản hoặc mật khẩu
            model.addAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng!");
            return "login";
        }
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}
