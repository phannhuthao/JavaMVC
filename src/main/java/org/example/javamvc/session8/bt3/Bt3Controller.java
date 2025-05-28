package org.example.javamvc.session8.bt3;

import org.example.javamvc.session8.bt3.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Bt3Controller {

    @GetMapping("/products/add")
    public String show() {
        return "addProduct";
    }

    @PostMapping("/products/add")
    public String addProduct(
            @RequestParam("name") String name,
            @RequestParam("quantity") int quantity,
            @RequestParam("price") double price,
            Model model) {
        Product product = new Product();
        product.setName(name);
        product.setId(1);
        product.setQuantity(quantity);
        product.setPrice(price);

        List<Product> productList = new ArrayList<>();
        productList.add(product);

        model.addAttribute("products", productList);
        return "bt3views";
    }
}
