package com.bhuppi.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Product {

    @Id // setting primary key
    private int pId;
    private String pName;
    private int price;

    Product() {
        this.pId = 0;
        this.pName = "null";
        this.price = 0;
    }
}
