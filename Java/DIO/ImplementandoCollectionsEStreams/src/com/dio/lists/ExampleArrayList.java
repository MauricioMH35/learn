package com.dio.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleArrayList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>(); // Criando uma lista

        System.out.println("operação para adicionar os itens dentro de uma lista.");
        System.out.println(nomes); // Mostra itens da lista antes da operação
        nomes.add("Carlos"); // Adiciona um item a lista
        nomes.add("Pedro"); // Adiciona um item a lista
        nomes.add("Juliana"); // Adiciona um item a lista
        nomes.add("Anderson"); // Adiciona um item a lista
        nomes.add("Maria"); // Adiciona um item a lista
        nomes.add("João"); // Adiciona um item a lista
        System.out.println(nomes); // Mostra itens da lista depois da operação

        System.out.println("\noperação para inserir item em uma posição já existente dentro de uma lista.");
        System.out.println(nomes); // Mostra os itens da lista antes da operação
        nomes.set(2, "Larissa"); // Consegue inserir um item em uma lista usando uma posição
        System.out.println(nomes); // Mostra os itens da lista depois da operação

        System.out.println("\nOperação para ordenar em ordem alfabetica.");
        System.out.println(nomes); // Mostra os itens da lista antes da operação
        Collections.sort(nomes); // Consegue fazer ordenação (ordem alfabetica)
        System.out.println(nomes); // Mostra os itens da lista depois da operação

        System.out.println("\noperação para inserir item em uma posição já existente dentro de uma lista.");
        System.out.println(nomes); // Mostra os itens da lista antes da operação
        nomes.set(2, "Wesley"); // Consegue inserir um item em uma lista usando um objeto
        System.out.println(nomes); // Mostra os itens da lista depois da operação

        System.out.println("\noperação para remover item de uma lista usndo seu indice.");
        System.out.println(nomes); // Mostra os itens da lista antes da operação
        nomes.remove(4); // Remove item usando seu indice
        System.out.println(nomes); // Mostra os itens da lista depois da operação

        System.out.println("\noperação para saber a posição de um item na lista usando objeto.");
        System.out.println(nomes); // Mostra os itens da lista
        int posicaoItem = nomes.indexOf("Carlos"); // Captura a posição do item na lista
        System.out.println(posicaoItem); // Mostra a posição do item na lista

        System.out.println("\noperação para saber a posição de um item na lista que não existe.");
        System.out.println(nomes); // Mostra itens da lista
        int posicaoItemNaoExiste = nomes.indexOf("Camila"); // Captura a posição do item que não existe na lista
        System.out.println(posicaoItemNaoExiste); // Mostra a posição de item da lista que não existe

        System.out.println("\noperação para remover item da uma lista usando o objeto.");
        System.out.println(nomes); // Mostra os items da lista antes da operação
        nomes.remove("Wesley"); // Remove item usando o objeto
        System.out.println(nomes); // Mostra itens da lista depois da operação

        System.out.println("\noperação para capturar objeto usando seu indice.");
        System.out.println(nomes); // Mostra os itens da lista e suas respectivas posições
        String nome = nomes.get(1); // Captura item da lista passando seu indice
        System.out.println(nome); // Mostra o item capturado pela posição do item na lista

        System.out.println("\noperação para capturar tamanho/quantidade de itens dentro de uma lista.");
        System.out.println(nomes); // Mostra os itens da lista
        int tamanho = nomes.size(); // Captura a quantidade itens da lista
        System.out.println(tamanho); // Mostra o tamanho/quantidade de itens da lista

        System.out.println("\noperação para verificar se determinado item existe na lista.");
        System.out.println(nomes); // Mostra os itens da lista
        boolean itemAnderson = nomes.contains("Anderson"); // Verificação com retorno booleano se contém item na lista
        boolean itemFernando = nomes.contains("Fernando"); // Verificação com retorno booleano se contém item na lista
        System.out.println(itemAnderson); // Mostra se o item existe na lista
        System.out.println(itemFernando); // Mostra se o item existe na lista

        System.out.println("\noperação para verificar se a lista está vázia.");
        System.out.println(nomes); // Mostra itens da lista
        boolean estaVazia = nomes.isEmpty(); // Verifica se a lista esta vazia com retorno booleano
        System.out.println(estaVazia); // Mostra se a lista esta vazia

        System.out.println("\noperação para navegar dentro de uma lista usando o foreach.");
        System.out.println(nomes); // Mostra os itens da lista
        for(String nomeDoItem : nomes) { // Usando o looping foreach para navegar na lista
            System.out.println("foreach -> " +nomeDoItem); // Mostra o item da lista
        }

        System.out.println("\noperação para navegar dentro de uma lista usando o iterator.");
        System.out.println(nomes); // Mostra os itens da lista
        Iterator<String> iterator = nomes.iterator(); // Um objeto iterator de Strings
        while(iterator.hasNext()) { // Caso haja elemento na lista o hasNext retorna true
            System.out.println("iterator -> " +iterator.next()); // Mostra o retorno do iterator
        } // Caso não haja mais itens na lista o hasNext retorna false

        System.out.println("\noperação limpar a lista.");
        System.out.println(nomes); // Mostra itens da lista antes da operação
        nomes.clear(); // Limpa os itens da lista
        System.out.println(nomes); // Mostra itens da lista depois da operação
    }
}
