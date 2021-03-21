package com.tool.calculator;

import java.util.Locale;

/** Calculadora
 * Objetivo: calcular a operação aritmética selecionada pelo usuário.
 * @author Mauricio Mityo Hidani
 * @version 1.0.0
 * */
public class Calculator {

    /** Método de verificação do operador Soma
     * @param operator
     * @return true/false
     * */
    protected boolean isSum(String operator) {
        return operator.toLowerCase().equals("a") ||
                operator.toLowerCase().equals("adicao") ||
                operator.toLowerCase().equals("adição");
    }

    /** Método de verificação do operador Subtração
     * @param operator
     * @return true/false
     * */
    protected boolean isSubtraction(String operator) {
        return operator.toLowerCase().equals("s") ||
                operator.toLowerCase().equals("subtracao") ||
                operator.toLowerCase().equals("subtração");
    }

    /** Método de verificação do operador Multiplicação
     * @param operator
     * @return true/false
     *  */
    protected boolean isMultiplication(String operator) {
        return operator.toLowerCase().equals("m") ||
                operator.toLowerCase().equals("multiplicacao") ||
                operator.toLowerCase().equals("multiplicação");
    }

    /** Método de verificação do operador Divisão
     * @param operator
     * @return true/false
     * */
    protected boolean isDivision(String operator) {
        return operator.toLowerCase().equals("d") ||
                operator.toLowerCase().equals("divisao") ||
                operator.toLowerCase().equals("divisão");
    }

    /** Método para executar os processos aritméticos
     * Objetivo: verifica a operação e executa os processos para o
     * cálculo aritmético.
     * @param num1
     * @param num2
     * @param operator
     * */
    public double process(double num1, double num2, String operator) {
        if(isSum(operator)) {
            System.out.print("Adição: ");
            Sum sum = new Sum(num1, num2);
            System.out.println(sum.toString());
            return sum.getResp();
        }
        else if(isSubtraction(operator)) {
            System.out.print("Subtração: ");
            Subtraction sub = new Subtraction(num1, num2);
            System.out.println(sub.toString());
            return sub.getResp();
        }
        else if(isMultiplication(operator)) {
            System.out.print("Multiplicação: ");
            Multiplication mul = new Multiplication(num1, num2);
            System.out.println(mul.toString());
            return mul.getResp();
        }
        else if(isDivision(operator)) {
            System.out.println("Divisão: ");
            Division div = new Division(num1, num2);
            System.out.println(div.toString());
            return div.getResp();
        } else {
            System.out.println("Operação inválida!");
            return 0;
        }
    }
}
