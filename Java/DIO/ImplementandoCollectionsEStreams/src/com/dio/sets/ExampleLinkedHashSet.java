package com.dio.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        // Cria uma instância do LinkedHashSet, onde ela mantém a ordem de inserção dos elementos, e por
        // tentar manter a ordem dos elementos dentro da Collection faz com que seja mais lenta do que a
        // HashSetw
        System.out.println("Cria uma instância do LinkedHashSet.");
        Set<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adiciona os números para a sequência numerica
        System.out.println("\nAdiciona os números para a sequência numerica.");
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        // Mostra a sequência numerica criada com seus respectivos números adicionados
        System.out.println("\nMostra a sequência numerica criada com seus respectivos números adicionados.");
        System.out.println(sequenciaNumerica);

        // Remove o número 4 da sequência numerica do set
        System.out.println("\nRemove o número 4 da sequência numerica do set.");
        sequenciaNumerica.remove(4);

        // Mostra a sequência numerica após a remoção do número 4
        System.out.println("\nMostra a sequência numerica após a remoção do número 4.");
        System.out.println(sequenciaNumerica);

        // Mostra o retorno da quantidade de itens do set
        System.out.println("\nMostra o retorno da quantidade de itens do set.");
        System.out.println(sequenciaNumerica.size());

        // Navega entre os itens da sequência numerica com o iterator
        System.out.println("\nNavega entre os itens da sequência numerica com o iterator.");
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Navega entre os itens da sequência numerica com o foreach
        System.out.println("\nNavega entre os itens da sequência numerica com o foreach.");
        for(Integer numero : sequenciaNumerica) {
            System.out.println(numero);
        }

        // Mostra o retorno se a sequência numerica do set está vázia
        System.out.println("\nMostra o retorno se a sequência numerica do set está vázia.");
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
