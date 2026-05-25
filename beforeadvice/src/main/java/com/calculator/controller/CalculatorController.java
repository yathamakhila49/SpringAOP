package com.calculator.controller;

import com.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {
@Autowired
    private CalculatorService service;
@GetMapping("/add")
    public int add(@RequestParam int a , int b){
    return service.add(a,b);
}
    @GetMapping("/divide")
    public int divide(@RequestParam int a ,int b){
        return service.divide(a,b);
    }
}
