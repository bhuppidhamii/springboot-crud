package com.bhuppi.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private int pId;
    private String pName;
    private int price;
}
