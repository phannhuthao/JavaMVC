package org.example.javamvc.session5.bt5.controller;

import org.example.javamvc.session5.bt5.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/bt5")
public class Bt5StudentController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students = (List<Student>) request.getSession().getAttribute("students");

        if (students == null) {
            students = new ArrayList<>();
            students.add(new Student("Phan Nhựt Hào", 20, "Gia Kiệm"));
            students.add(new Student("Nguyễn Thanh Hạ", 20, "Long Khánh"));
            students.add(new Student("Nguyễn Ngọc Diệp", 20, "Long Khánh"));

            request.getSession().setAttribute("students", students);
        }

        request.setAttribute("students", students);
        request.getRequestDispatcher("/Session5/bt5.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String deleteIndex = request.getParameter("deleteIndex");

        if (deleteIndex != null) {
            int index = Integer.parseInt(deleteIndex);
            List<Student> students = (List<Student>) request.getSession().getAttribute("students");
            // Kiểm tra hợp lệ của index và danh sách không null
            if (students != null && index >= 0 && index < students.size()) {
                students.remove(index);
            }
            request.getSession().setAttribute("students", students);
        }

        response.sendRedirect("bt5");
    }


}
