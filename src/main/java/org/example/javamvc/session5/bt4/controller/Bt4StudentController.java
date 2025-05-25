package org.example.javamvc.session5.bt4.controller;

import org.example.javamvc.session5.bt4.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/bt4")
public class Bt4StudentController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Phan Nhựt Hào", 20, "Gia Kiệm"));
        students.add(new Student("Nguyễn Thanh Hạ", 20, "Long Khánh"));
        students.add(new Student("Nguyễn Ngọc Diệp", 20, "Long Khánh"));

        request.getSession().setAttribute("students", students);
        request.setAttribute("students", students);

        String editIndex = request.getParameter("editIndex");
        if (editIndex != null) {
            // Nếu có, chuyển sang kiểu số nguyên và lưu vào request attribute để JSP biết đang chỉnh sửa sinh viên nào
            request.setAttribute("editIndex", Integer.parseInt(editIndex));
        }

        request.getRequestDispatcher("/Session5/bt4.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int index = Integer.parseInt(request.getParameter("index"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");

        List<Student> students = (List<Student>) request.getSession().getAttribute("students");

        // Lấy sinh viên tại vị trí index và cập nhật thông tin mới
        Student student = students.get(index);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        request.setAttribute("students", students);
        request.getRequestDispatcher("/Session5/bt4.jsp").forward(request, response);
    }
}

