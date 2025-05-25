package org.example.javamvc.session5.bt2.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bt2")
public class StudentController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String strAge = request.getParameter("age");
        String address = request.getParameter("address");

        Integer age = Integer.parseInt(strAge);

        request.setAttribute("name", name);
        request.setAttribute("age", age);
        request.setAttribute("address", address);

        request.getRequestDispatcher("/Session5/bt2.jsp").forward(request, response);
    }
}
