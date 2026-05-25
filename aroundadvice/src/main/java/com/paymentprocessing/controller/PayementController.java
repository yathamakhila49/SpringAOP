package com.paymentprocessing.controller;


import com.paymentprocessing.service.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PayementController {
    @Autowired
    private PaymentServiceImpl paymentService;
    @GetMapping("/payment")
    public String payAmount(@RequestParam int amount){
        return paymentService.payAmount(amount);
    }
}
