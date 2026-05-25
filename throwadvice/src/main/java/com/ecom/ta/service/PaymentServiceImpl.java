package com.ecom.ta.service;


import com.ecom.ta.exception.InvalidPaymentException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService{
    @Override
    public String makePayment(double amount) {
        log.info("Payment Started for Amount : {}", amount);
        if (amount <= 0) {
            throw new InvalidPaymentException("Invalid Payment Amount");
        }
        log.info("Payment Successful");
        return "PAYMENT SUCCESS";
    }
}
