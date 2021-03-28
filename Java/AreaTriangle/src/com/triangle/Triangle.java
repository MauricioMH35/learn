package com.triangle;

import com.triangle.calc.AreaBaseHeight;
import com.triangle.calc.AreaEquilateral;
import com.triangle.calc.AreaHeron;
import com.triangle.calc.Calc;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calc calc;
        double res = 0;

        System.out.println("Àrea do triangulo");
        System.out.println("Escolha uma das opções para efetuar o calculo:");
        System.out.println("[1] - Formula de Heron; \n[2] - Base x Altura; \n[3] - triângulo equilátero.");
        System.out.print("Opção: ");
        int choice = scan.nextInt();
        if(choice == 1) {
            calc = new Calc(new AreaHeron());
            res = calc.getValue();
        }
        else if(choice == 2) {
            calc = new Calc(new AreaBaseHeight());
            res = calc.getValue();
        }
        else if(choice == 3) {
            calc = new Calc(new AreaEquilateral());
            res = calc.getValue();
        }
        else {
            System.out.println("Escolha inválida!");
        }

        System.out.println("A área do triângulo é " + res);
    }
}
