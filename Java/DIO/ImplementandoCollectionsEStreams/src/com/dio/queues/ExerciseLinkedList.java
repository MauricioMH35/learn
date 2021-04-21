package com.dio.queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExerciseLinkedList {
    public static void main(String[] args) {
        // Criar a instância da LinkedList
        Queue<String> nomes = new LinkedList<>();

        // Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        System.out.println("Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e Joãos");
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        // Navegue na fila exibindo cada nome no console
        System.out.println("\nNavegue na fila exibindo cada nome no console");
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()) {
            System.out.println("iterator-> " +iterator.next());
        }

        // Retornar o primeiro item da lista sem removê-lo
        System.out.println("\nRetornar o primeiro item da lista sem removê-lo");
        String primeiroNomeLista = nomes.peek();
        System.out.println(primeiroNomeLista);

        // Retorne o primeiro item da fila, removendo o mesmo
        System.out.println("\nRetorne o primeiro item da fila, removendo o mesmo");
        String primeiroNomeListRemove = nomes.poll();
        System.out.println(primeiroNomeListRemove);

        // Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila
        System.out.println("\nAdicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila");
        nomes.add("Daniel");
        int indice = 0;
        for(String nome : nomes) {
            if(nome.equals("Daniel"))
                System.out.println(indice);
            indice++;
        }

        // Retorne o tamanho da lista
        System.out.println("\nRetorne o tamanho da lista");
        int tamanhoDaLista = nomes.size();
        System.out.println(tamanhoDaLista);

        // Verifique se a lista esta vazia
        System.out.println("\nVerifique se a lista esta vazia");
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        // Verifique se o nome Carlos está na lista
        System.out.println("\nVerifique se o nome Carlos está na lista");
        boolean carlosNaLista = nomes.contains("Carlos");
        System.out.println(carlosNaLista);
    }
}
