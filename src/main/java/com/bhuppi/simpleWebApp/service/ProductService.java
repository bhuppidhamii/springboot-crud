package com.bhuppi.simpleWebApp.service;

import com.bhuppi.simpleWebApp.model.Product;
import com.bhuppi.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(1, "iPhone", 5000),
//            new Product(2, "MacBook", 100000),
//            new Product(3, "iPad", 50000)));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int pId) {
        return repo.findById(pId).orElse(new Product(69, "dummy", 9999));
    }

    public void addProduct(Product p) {
        repo.save(p);
    }

    public void updateProduct(Product p) {
//        it is same as add, but if the data is there it will update or else it will add

        repo.save(p);
    }

    public void deleteProduct(int pId) {
        repo.deleteById(pId);
    }
}
