package com.circle;

import com.circle.calc.Area;
import com.circle.calc.IArea;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calcula a área de uma circunferência.");
        System.out.println("Para separa os números decimais utilize virgula(,)");
        System.out.print("Digite o raio da circunferência: ");
        double rad = scan.nextDouble();
        IArea area = new Area();
        double calc = area.calc(rad);
        System.out.println("A área da circunferência é : " + calc);
    }
}
