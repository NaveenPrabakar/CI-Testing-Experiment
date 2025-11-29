
package com.teamproject.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testEquilateral() {
        Triangle t = new Triangle();
        assertEquals("equilateral", t.classify(3, 3, 3));
    }

    @Test
    public void testIsosceles() {
        Triangle t = new Triangle();
        assertEquals("isosceles", t.classify(3, 4, 4));
    }

    @Test
    public void testScalene() {
        Triangle t = new Triangle();
        assertEquals("scalene", t.classify(3, 4, 5));
    }

    @Test
    public void testInvalidNegative() {
        Triangle t = new Triangle();
        assertEquals("invalid", t.classify(-1, 4, 5));
    }

    @Test
    public void testInvalidInequality() {
        Triangle t = new Triangle();
        assertEquals("invalid", t.classify(1, 2, 3));  // 1+2 = 3 → invalid
    }
}
