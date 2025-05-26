package org.example.javamvc.session6.bt2.controller;

import org.example.javamvc.session6.bt2.model.User;
import org.example.javamvc.session6.bt2.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
    private UserService userService = new UserService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Session6/bt2/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username").trim();
        String password = request.getParameter("password").trim();
        String email = request.getParameter("email").trim();
        int phone = Integer.parseInt(request.getParameter("phone").trim());

        User user = new User(0, username, password, email, phone);
        boolean success = userService.register(user);
        if (success) {
            response.sendRedirect("login");
        } else {
            request.setAttribute("error", "Đăng ký thất bại!");
            request.getRequestDispatcher("/Session6/Bt2/register.jsp").forward(request, response);
        }
    }
}
