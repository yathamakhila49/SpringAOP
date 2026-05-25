package com.foodorder.service;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public String placeOrder(String item){
        return item +" Order placed Successfully";
    }
}
