package com.triangle.calc;

import java.util.Scanner;

public class AreaEquilateral implements IArea {
    /** Formula triângulo equilátero
     * A = (a²√[3])/4
     * a² = h² + (a/2)²
     * a² = h² + (a²/4)
     * h² = a² - (a²/4)
     * h² = (3a²)/4
     * h = √[(3a²)/4]
     * h = (a√[3])/2
     *
     * Àrea usando base x altura = (b * h) / 2
     * A = (a(a√[3]))/2
     * => (a²√[3])/2 * 1/2
     * => (a²√[3])/4
     * A = (a²√[3])/4
     * */
    @Override
    public double calc() {
        Scanner scan = new Scanner(System.in);
        double a = 0;

        System.out.println("Àrea do triângulo equilátero");
        System.out.println("Insira os valores dos lados do triângulos nos campos abaixo");
        System.out.println("* Para separa os decimais utilize vírgula(,)");

        try {
            System.out.print("tamanho do lado: ");
            a = scan.nextDouble();
        }
        catch(NumberFormatException e) {
            System.out.println("Insira apenas valores númericos!");
        }
        catch(Exception e) {
            System.out.println("Houve um problema inesperado na execução desse operação!");
        }

        double A = (Math.pow(a, 2) * Math.sqrt(3)) /4;
        return A;
    }

}
