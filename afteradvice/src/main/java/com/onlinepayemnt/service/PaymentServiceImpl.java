package com.onlinepayemnt.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PayementService {

    @Override
    public String payAmount(int amount){
        System.out.println("Payment Processing");
        return "Payment Success";
    }
}
