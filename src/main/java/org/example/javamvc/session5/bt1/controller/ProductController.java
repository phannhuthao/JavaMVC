package org.example.javamvc.session5.bt1.controller;

import org.example.javamvc.session5.bt1.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/bt1")
public class ProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Socola", 20000, "Ngọt"));
        products.add(new Product(2, "Kẹo", 10000, "Chua"));
        products.add(new Product(3, "Bánh", 15000, "Giòn"));

        request.setAttribute("products", products);
        request.getRequestDispatcher("/Session5/bt1.jsp").forward(request, response);
    }

}
