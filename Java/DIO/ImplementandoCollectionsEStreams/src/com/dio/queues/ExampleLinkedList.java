package com.dio.queues;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleLinkedList {
    public static void main(String[] args) {
        Queue<String> filaDeBanco = new LinkedList<>();

        filaDeBanco.add("Patrícia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flávio");
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Anderson");

        System.out.println(filaDeBanco);

        // O uso do poll retorna o valor do primeiro item e remove esse item da lista.
        String clienteASerAtendido = filaDeBanco.poll();

        System.out.println(clienteASerAtendido);
        System.out.println(filaDeBanco);

        // Mostra o primeiro item da fila sem que o mesmo seja removido.
        String primeiroCliente = filaDeBanco.peek();

        // Retorna o primeiro item da fila, no entanto se a fila estiver vazia o element trata essa situação
        filaDeBanco.clear(); // Para limpar a lista.
        String primeiroClienteOuErro = filaDeBanco.element();
        System.out.println(primeiroClienteOuErro);
    }
}
