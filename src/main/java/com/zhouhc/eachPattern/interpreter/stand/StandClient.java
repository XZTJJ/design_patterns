package com.zhouhc.eachPattern.interpreter.stand;

import com.zhouhc.eachPattern.interpreter.comm.Calculator;

public class StandClient {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        calculator.readFormula();
    }
}
