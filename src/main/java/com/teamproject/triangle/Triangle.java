package com.teamproject.triangle;

public class Triangle {
    public String classify(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return "invalid";
        }
        
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "invalid";
        }

        if (a == b && b == c) {
            return "equilateral";
        }

        if (a == b || b == c || a == c) {
            return "isosceles";
        }

        return "scalene";
    }
}
