package com.triangle.calc;

import java.util.Scanner;

public class AreaBaseHeight implements IArea {
    /** Fomula apartir da base e altura
     * A = (b * h) / 2
     * A => àrea
     * b => base do triângulo
     * h => altura do triângulo
     * */
    @Override
    public double calc() {
        Scanner scan = new Scanner(System.in);
        double b = 0;
        double h = 0;

        System.out.println("Àrea do triângulo base x altura");
        System.out.println("Insira os valores dos lados do triângulos nos campos abaixo");

        try {
            System.out.print("tamanho da base: ");
            b = scan.nextDouble();
        }
        catch(NumberFormatException e) {
            System.out.println("Insira apenas valores númericos!");
        }
        catch(Exception e) {
            System.out.println("Houve um problema inesperado na execução desse operação!");
        }

        try {
            System.out.print("tamanho da altura: ");
            h = scan.nextDouble();
        }
        catch(NumberFormatException e) {
            System.out.println("Insira apenas valores númericos!");
        }
        catch(Exception e) {
            System.out.println("Houve um problema inesperado na execução desse operação!");
        }

        System.out.println();
        double A = (b * h) / 2;
        return A;
    }

}
