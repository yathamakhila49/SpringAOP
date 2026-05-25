package com.paymentprocessing.service;


import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PayementService{
    public String payAmount(int amount){
        System.out.println("payment processing.....");
        return "payement successful";
    }
}
