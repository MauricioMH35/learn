package com.dio.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        // Cria a instância do TreeSet, onde a Collection mantêm uma ordem de árvore binária sempre
        // quando modificada, assim faz com que essa árvore tenha nós e seus nós filhos, mas com uma
        // performance mais lenta
        System.out.println("Cria a instância do TreeSet.");
        TreeSet<String> treeCapitais = new TreeSet<>();

        // Monta a árvore de capitais, a forma com que os itens/capitais serão adicionadas para a
        // árvore de capitais não será mantida, e sim a ordem de árvore, que compõem nós
        System.out.println("\nMonta a árvore de capitais.");
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        // Exibe os itens adicionados a árvore de capitais
        System.out.println("\nExibe os itens adicionados a árvore de capitais.");
        System.out.println(treeCapitais);

        // Mostra o retorno da primeira capital do topo da árvore de capitais
        System.out.println("\nMostra o retorno da primeira capital do topo da árvore de capitais.");
        System.out.println(treeCapitais.first());

        // Mostra o retorno da última capital do final da árvore de capitais
        System.out.println("\nMostra o retorno da última capital do final da árvore de capitais.");
        System.out.println(treeCapitais.last());

        // Mostra o retorno do primeiro elemento abaixo na árvore de capitais a parametrização
        System.out.println("\nMostra o retorno do primeiro elemento abaixo na árvore de capitais a parametrização.");
        System.out.println(treeCapitais.lower("Florianópolis"));

        // Mostra o retorno do primeiro elemento acima na árvore de capitais a parametrizações
        System.out.println("\nMostra o retorno do primeiro elemento acima na árvore de capitais a parametrização");
        System.out.println(treeCapitais.higher("Florianópolis"));

        // Exibe todas as capitais
        System.out.println("\nMostra a árvore de capitais.");
        System.out.println(treeCapitais);

        // Retorna a primeira capital do topo da árvore, removendo do set
        System.out.println("\nRetorna a primeira capital do topo da árvore.");
        System.out.println(treeCapitais.pollFirst());

        // Retorna a última capital no final da árvore, removendo do set
        System.out.println("\nRetorna a última capital no final da árvore.");
        System.out.println(treeCapitais.pollLast());

        // Exibe todas as capitais da árvore
        System.out.println("\nExibe todas as capitais da árvore.");
        System.out.println(treeCapitais);

        // Navega entre os itens da árvore de capitais com o iterator
        System.out.println("\nNavega entre os itens da árvore de capitais com o iterator.");
        Iterator<String> iterator = treeCapitais.iterator();
        while(iterator.hasNext()) {
            System.out.println("iterator-> " +iterator.next());
        }

        // Navega entre os itens da árvore de capitais com o forech
        System.out.println("\nNavega entre os itens da árvore de capitais com o foreach.");
        for(String capital : treeCapitais) {
            System.out.println("foreach-> " +capital);
        }

    }
}
