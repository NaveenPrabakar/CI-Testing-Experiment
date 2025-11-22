package com.teamproject.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(10, c.add(6, 4));
    }

    @Test
    void testSub() {
        Calculator c = new Calculator();
        assertEquals(2, c.sub(6, 4));
    }

    @Test
    void testMul() {
        Calculator c = new Calculator();
        assertEquals(24, c.mul(6, 4));
    }

    @Test
    void testDiv() {
        Calculator c = new Calculator();
        assertEquals(2, c.div(8, 4));
    }

    @Test
    void testDivByZero() {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class,
                () -> c.div(5, 0));
    }
}
