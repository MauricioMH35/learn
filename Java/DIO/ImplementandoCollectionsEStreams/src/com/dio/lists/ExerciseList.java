package com.dio.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExerciseList {
    public static void main(String[] args) {
        // Crie uma lista.
        List<String> names = new ArrayList<>();

        // Adicione 5 nomes: Julia, Pedro, Carlos, Larissa e João.
        names.add("Julia");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        // Navegue na lista exibindo cada nome no console.
        for(String name : names) {
            System.out.println("> " +name);
        }

        // Substitua o nome Carlos por Roberto
        names.set(2, "Roberto");

        // Retorne o nome da posição 1
        System.out.println(names.get(1));

        // Remova o nome da posição 4
        System.out.println(names.get(4));

        // Remova o nome João
        names.remove("João");

        // Retorne a quantidade de itens na lista
        int qtd = names.size();
        System.out.println(qtd);

        // Verifique se o nome Juliano existe na lista
        boolean itemJuliano = names.contains("Juliano");
        System.out.println(itemJuliano);

        // Crie uma nova lista com os nomes: Ismael e Rodrigo.
        // Adicione todos os itens da nova lista na lista criada
        List<String> newNames = new ArrayList<>();
        newNames.add("Ismael");
        newNames.add("Rodrigo");
        Iterator<String> iterator = newNames.iterator();
        while(iterator.hasNext()) {
            names.add(iterator.next());
        }

        // Ordene os itens da lista por ordem alfabética
        Collections.sort(names);

        // Verifique se a lista está vázia
        boolean isEmptyNames = names.isEmpty();
        System.out.println(isEmptyNames);
    }
}
