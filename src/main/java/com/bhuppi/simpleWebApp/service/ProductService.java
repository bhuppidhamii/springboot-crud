package com.bhuppi.simpleWebApp.service;

import com.bhuppi.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "iPhone", 5000),
            new Product(2, "MacBook", 100000),
            new Product(3, "iPad", 50000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int pId) {
        return products.stream()
                .filter(p -> p.getPId() == pId)
                .findFirst().orElse(new Product(69, "ohh yeahh", 9999));
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void updateProduct(Product p) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPId() == p.getPId()) {
                index = i;
                break;
            }
        }
        products.set(index, p);
    }

    public void deleteProduct(int pId) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPId() == pId) {
                index = i;
                break;
            }
        }

        products.remove(index);
    }
}
