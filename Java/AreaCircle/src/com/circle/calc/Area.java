package com.circle.calc;

public class Area implements IArea {
    public double calc(double rad) {
        final double PI = 3.14159;
        double calc = PI * rad * rad;
        return calc;
    }

    public Area() {

    }

    public Area(double rad, double result) {
        result = calc(rad);
    }
}
