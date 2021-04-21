package com.dio.lists;

import java.util.List;
import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>(); // Cria um vector

        esportes.add("Futebol"); // Adiciona item ao vector
        esportes.add("Basquetebol"); // Adiciona item ao vector
        esportes.add("Tênis de Mesa"); // Adiciona item ao vector
        esportes.add("Handebol"); // Adiciona item ao vector

        esportes.set(2, "Ping Pong"); // Atera o item da posição 2

        esportes.remove(2); // Remove item da posição 2

        esportes.remove("Handebol"); // Remove item Handebol

        System.out.println(esportes.get(0)); // Retorna o primeiro item do vector

        for(String esporte : esportes) { // Navega entre os itens do vetor usando um foreach
            System.out.println(esporte); // Mostra item
        }
    }
}
