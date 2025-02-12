package com.calculator.demo_bc_calculator.services;

import org.springframework.stereotype.Service;

import com.calculator.demo_bc_calculator.Controller.bcCalculator;
import com.calculator.demo_bc_calculator.model.CalculatorDatabase;

@Service
public class calculatorService {
    public Long operate(CalculatorDatabase calculatorDatabase, Long x, Long y){
        Long result = switch(bcCalculator) {
            case "sum" -> sum(x,y);
            case "sub" -> sub(x,y);
            case "mul" -> mul(x,y);
            case "div" -> div(x,y);
        };
        System.out.println("Result = " + result);
        return result;
    }
    private Long sum(Long x, Long y){
        return x + y;
    }
    private Long sub(Long x, Long y){
        return x - y;
    }
    private Long mul(Long x, Long y){
        return x * y;
    }
    private Long div(Long x, Long y){
        return x / y;
    }
}
