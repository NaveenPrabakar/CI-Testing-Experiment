package com.teamproject.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(10, c.add(6, 4));
    }

    @Test
    public void testSub() {
        Calculator c = new Calculator();
        assertEquals(2, c.sub(6, 4));
    }

    @Test
    public void testMul() {
        Calculator c = new Calculator();
        assertEquals(24, c.mul(6, 4));
    }

    @Test
    public void testDiv() {
        Calculator c = new Calculator();
        assertEquals(2, c.div(8, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivByZero() {
        Calculator c = new Calculator();
        c.div(5, 0);
    }

    @Test
public void testMod() {
    Calculator c = new Calculator();
    assertEquals(2, c.mod(6, 4));   // 6 % 4 = 2
}

}
