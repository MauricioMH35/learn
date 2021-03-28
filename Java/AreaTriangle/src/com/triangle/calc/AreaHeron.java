package com.triangle.calc;

import java.util.Scanner;

public class AreaHeron implements IArea {
    /** Formula de Heron
     * A = √(p * (p−a) * (p−b) * (p−c))
     *        A => àrea
     *        p => soma de todos os lados dividido por 2
     * a, b e c => lados do triângulo
     * */
    @Override
    public double calc() {
        Scanner scan = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println("Àrea do triângulo a partir da formula de Heron");
        System.out.println("Insira os valores dos lados do triângulos nos campos abaixo");

        try {
            System.out.print("tamanho lado \"a\": ");
            a = scan.nextDouble();
        }
        catch(NumberFormatException e) {
            System.out.println("Insira apenas valores númericos!");
        }
        catch(Exception e) {
            System.out.println("Houve um problema inesperado na execução desse operação!");
        }

        try {
            System.out.print("tamanho lado \"b\": ");
            b = scan.nextDouble();
        }
        catch(NumberFormatException e) {
            System.out.println("Insira apenas valores númericos!");
        }
        catch(Exception e) {
            System.out.println("Houve um problema inesperado na execução desse operação!");
        }

        try {
            System.out.print("tamanho lado \"c\": ");
            c = scan.nextDouble();
        }
        catch(NumberFormatException e) {
            System.out.println("Insira apenas valores númericos!");
        }
        catch(Exception e) {
            System.out.println("Houve um problema inesperado na execução desse operação!");
        }

        double p = (a + b + c) / 2;
        double A = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return A;
    }
}
