package com.onlinepayemnt.controller;

import com.onlinepayemnt.service.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentServiceImpl service;

    @GetMapping("/pay")
    public String pay(@RequestParam int amount){
        return service.payAmount(amount);
    }
}
