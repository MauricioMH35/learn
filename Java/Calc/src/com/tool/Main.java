package com.tool;

import com.tool.calculator.Calculator;
import com.tool.calculator.Operator;

/** Calculadora Aritmética
 * @author Mauricio Mityo Hidani
 * @version 1.0.0
 * */
public class Main {

    /** Método Principal
     * Objetivo: Efetuar cálculo de acordo com a escolha do usuário.
     * */
    public static void main(String[] args) {
        Operator op = new Operator();
        op.run();
    }
}
