package com.triangle.calc;

import java.util.Scanner;

public class Calc {
    IArea area;

    public Calc(IArea area) {
        this.area = area;
    }

    public double getValue() {
        return area.calc();
    }
}
