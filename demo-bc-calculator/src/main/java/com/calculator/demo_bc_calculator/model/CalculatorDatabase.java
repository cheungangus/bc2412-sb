package com.calculator.demo_bc_calculator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CalculatorDatabase {
    public static final CalculatorDatabase CalculatorDatabase = null;
    private static CalculatorDatabase calculatorDatabase;
    private Long sum;
    private Long sub;
    private Long mul;
    private Long div;
}
