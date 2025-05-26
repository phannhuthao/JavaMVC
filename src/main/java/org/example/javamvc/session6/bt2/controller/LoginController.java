package org.example.javamvc.session6.bt2.controller;

import org.example.javamvc.session6.bt2.model.User;
import org.example.javamvc.session6.bt2.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    private UserService userService = new UserService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Session6/Bt2/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = userService.login(email, password);
        // getSession() là một phương thức của đối tượng HttpServletRequest được dùng để lấy hoặc
        // tạo mới một phiên làm việc
        // (session) giữa client (trình duyệt) và server.
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("/Session6/Bt1/listBook.jsp");
        } else {
            request.setAttribute("error", "Email hoặc mật khẩu không đúng!");
            request.getRequestDispatcher("/Session6/Bt2/login.jsp").forward(request, response);
        }
    }
}
