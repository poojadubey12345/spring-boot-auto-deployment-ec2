package com.example.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private  ProductService productService;

    @GetMapping("/product_list/{productValue}/{productAvailableTime}")
    public ResponseEntity<?> getProductList(@PathVariable("productValue") int productValue, @PathVariable("productAvailableTime") int productAvailableTime){
        List<Product> listProduct =  productService.getProductList(productValue,productAvailableTime);

        if(listProduct.isEmpty())
        {
            return  ResponseEntity.ok("Product details does not match");
        }
        return ResponseEntity.ok(listProduct);
    }




}
