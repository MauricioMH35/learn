package com.dio.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {
        // Instanciando o HashSet, que é mais performático, não é ordenado, não permite repetição de
        // valores.
        System.out.println("Cria uma instância do HashSet.");
        Set<Double> notasAlunos = new HashSet<>();

        // O Uso do set é muito mais perfomático para efetuar operações em uma lista
        // Adiciona as notas dos alunos no set
        System.out.println("\nAdiciona notas para os alunos.");
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        // Mostra a lista de alunos adicionados
        System.out.println(notasAlunos);

        // Remove a nota dos alunos do set
        System.out.println("\nRemove nota 3.8 da lista de notas dos alunos.");
        notasAlunos.remove(3.8);

        // Mostra a lista de notas dos alunos após a remoção no set da nota 3.8
        System.out.println(notasAlunos);

        // Navega entre os itens do iterator
        System.out.println("\nNavega entre as notas dos alunos usando o iterator.");
        Iterator<Double> iterator = notasAlunos.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Navega entre os itens da lista com um foreach
        System.out.println("\nNavega entre as notas dos alunos usando o foreach.");
        for(Double notaAluno : notasAlunos) {
            System.out.println(notaAluno);
        }

        // Limpa a lista de notas dos alunos
        System.out.println("\nLimpa a lista de notas dos alunos.");
        notasAlunos.clear();

        // Mostra se o set está vázio ou não
        System.out.println("\nMostra se o set está vázio ou não.");
        System.out.println(notasAlunos.isEmpty());
    }
}
