package com.dio.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExerciseLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        // Adicione 5 números inteiros: 3, 88, 20, 44, 3
        System.out.println("Adicione 5 números inteiros: 3, 88, 20, 44, 3");
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3); // Não adiciona valor por não atender os requisitos de valores repitidos

        // Navegue no Set exibindo cada número no console
        System.out.println("\nNavegue no Set exibindo cada número no console");
        Iterator<Integer> iterator = numeros.iterator();
        while(iterator.hasNext())
            System.out.println("número-> " +iterator.next());

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
