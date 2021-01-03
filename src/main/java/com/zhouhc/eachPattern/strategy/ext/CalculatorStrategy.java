package com.zhouhc.eachPattern.strategy.ext;

/**
 * 枚举策略模式
 */
public enum CalculatorStrategy {

    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };
    String value = "";

    CalculatorStrategy(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public abstract int exec(int a, int b);
}
