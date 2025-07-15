package com.bhuppi.simpleWebApp.controller;

import com.bhuppi.simpleWebApp.model.Product;
import com.bhuppi.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{pId}")
    public Product getProductById(@PathVariable int pId) {
        return service.getProductById(pId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product p) {
        System.out.println(p);
        service.addProduct(p);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product p) {
        service.updateProduct(p);
    }

    @DeleteMapping("/products/{pId}")
    public void deleteProduct(@PathVariable int pId) {
        service.deleteProduct(pId);
    }
}
