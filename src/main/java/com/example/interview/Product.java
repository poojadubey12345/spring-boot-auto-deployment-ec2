package com.example.interview;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    int productId;
    String productname;
    int productValue;
    int productAvailableTime;
    public Product(){

    }
    public Product(int productId, String productname, int productValue, int productAvailableTime) {
        this.productId = productId;
        this.productname = productname;
        this.productValue = productValue;
        this.productAvailableTime = productAvailableTime;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getProductValue() {
        return productValue;
    }

    public void setProductValue(int productValue) {
        this.productValue = productValue;
    }

    public int getProductAvailableTime() {
        return productAvailableTime;
    }

    public void setProductAvailableTime(int productAvailableTime) {
        this.productAvailableTime = productAvailableTime;
    }


}
