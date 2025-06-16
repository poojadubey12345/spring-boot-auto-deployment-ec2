package com.example.interview;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    List<Product> productlist = Arrays.asList(
            new Product(1,"product 1",100,10),
            new Product(2,"product 2",1000,100),
            new Product(3,"product 3",1005,101),

            new Product(4,"product 4",1002,102),
            new Product(5,"product 5",1005,105)
    );

    public  List<Product> getProductList(int productValue, int productAvlTime){
        return productlist.stream().filter(getprod -> getprod.getProductValue() == productValue && getprod.productAvailableTime == productAvlTime)
                .collect(Collectors.toList());
    }



}
