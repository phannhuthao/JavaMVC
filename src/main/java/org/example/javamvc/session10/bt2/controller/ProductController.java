package org.example.javamvc.session10.bt2.controller;

import org.example.javamvc.session10.bt2.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @GetMapping("/product")
    public String showForm() {
        return "productForm";
    }

    @PostMapping("/product")
    public String addProduct(@RequestParam("name") String name,
                             @RequestParam("price") double price,
                             @RequestParam("description") String description,
                             Model model) {

        Product product = new Product(name, price, description);
        model.addAttribute("product", product);
        return "productForm";
    }
}
