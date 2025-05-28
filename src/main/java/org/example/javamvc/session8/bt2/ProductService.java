package org.example.javamvc.session8.bt2;

import org.example.javamvc.session8.bt2.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Iphone", 1000));
        products.add(new Product(2, "Samsung", 800));
        products.add(new Product(3, "Oppo", 600));
        return products;
    }
}
