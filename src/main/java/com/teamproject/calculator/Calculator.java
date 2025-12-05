package com.teamproject.calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    public int mod(int a, int b){
        return a % b;
    }
}
