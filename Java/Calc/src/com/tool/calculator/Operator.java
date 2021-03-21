package com.tool.calculator;

import java.util.Scanner;

/** Operator de cálculo aritmético
 * @author Mauricio Mityo Hdiani
 * @version 1.0.0
 * */
public class Operator {
    private String operations =
            "-> Adição/Adicao/A" +
            "\n-> Subtração/Subtracao/S" +
            "\n-> Multiplicação/Multiplicacao/M" +
            "\n-> Divisão/Divisao/D" +
            "\n-> Sair/Exit/E";

    /** Método para executar a operação
     * Objetivo: executa o processo até que o usuário execute o comando para
     * finalizar o processo.
     * */
    public void run() {
        while(true) {
            System.out.println();
            System.out.println("Calculadora aritmética");

            System.out.println("Para executar a operação aritmética digite uma das operações listada abaixo:");
            System.out.println(operations);

            System.out.print("Operador: ");
            Scanner scan = new Scanner(System.in);
            String oper = scan.nextLine();

            boolean exit = oper.toLowerCase().equals("sair") ||
                    oper.toLowerCase().equals("exit") ||
                    oper.toLowerCase().equals("e");

            if(exit) {
                System.out.println("Operação finalizada!");
                break;
            }

            System.out.println();

            System.out.print("1.Número: ");
            double num1 = scan.nextDouble();

            System.out.print("2.Número: ");
            double num2 = scan.nextDouble();

            Calculator c = new Calculator();
            double resp = c.process(num1, num2, oper);

            System.out.println("Resultado: " + resp);
        }
    }
}
