package com.myorg;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
//        Logging
//        Authorization
//        Sanitize
        System.out.println("Checkout method from shopping cart");
    }

    public int quantity(){
        return  5;
    }
}
