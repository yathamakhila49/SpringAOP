package com.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int add(int a,int b){
        return a+b;
    }
    @Override
    public int divide(int a,int b){
        return a/b;
    }

}
