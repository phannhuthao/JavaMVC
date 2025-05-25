package org.example.javamvc.session5.bt3.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bt3")
public class Bt3StudentController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String strAge = request.getParameter("age");
        String address = request.getParameter("address");

        Integer age = Integer.valueOf(strAge);

        request.getSession().setAttribute("username", name);
        request.getSession().setAttribute("age", age);
        request.getSession().setAttribute("address", address);

        request.getRequestDispatcher("/Session5/bt3.jsp").forward(request, response);
    }
}
