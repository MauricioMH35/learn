package com.dio.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExerciseHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        // Adicione 5 números inteiros: 3, 88, 20, 44, 3
        System.out.println("Adicione 5 números inteiros: 3, 88, 20, 44, 3");
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3); // Não adiciona, pois não atende a regre do HashSet de valores iguais

        // Navegue no Set exibindo cada número no console
        System.out.println("\nNavegue no Set exibindo cada número no console");
        Iterator<Integer> iterator = numeros.iterator();
        while(iterator.hasNext())
            System.out.println("numeros-> " +iterator.next());

        // Remova o primeiro item do Set
        System.out.println("\nRemova o primeiro item do Set");
        numeros.remove(0);

        // Adicione um novo número no Set: 23
        System.out.println("\nAdicione um novo número no Set: 23");
        numeros.add(23);

        // Verifique o tamanho do Set
        System.out.println("\nVerifique o tamanho do Set");
        int tamanhoDoSet = numeros.size();
        System.out.println(tamanhoDoSet);

        // Verifique se o Set está vazio
        System.out.println("\nVerifique se o Set está vazio");
        boolean numerosEstaVazio = numeros.isEmpty();
        System.out.println(numerosEstaVazio);
    }
}
