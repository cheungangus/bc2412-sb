package com.calculator.demo_bc_calculator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.demo_bc_calculator.model.CalculatorDatabase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping(value = "/bc")
public class bcCalculator {
@Autowired
private bcCalculator bcCalculator;

@GetMapping(value = "/CalculatorDatabase{CalculatorDatabase}")
public Integer operate(@PathVariable CalculatorDatabase calculatorDatabase,
@RequestParam String x, @RequestParam String y
) {
    return this.bcCalculator.operate(CalculatorDatabase.CalculatorDatabase,x,y);
}

} 
