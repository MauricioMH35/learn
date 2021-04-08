package br.com.database.connector;

import br.com.database.connector.factories.Database;
import br.com.database.connector.factories.DatabaseConnector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conexão com banco de dados!");

        Database db = new Database(DatabaseConnector.get());

        System.out.println("Tentativa de conexão com o banco de dados...");
        db.connect();
        System.out.println(db.status());

        System.out.println("Tentativa de reiniciar o banco de dados...");
        db.restart();
        System.out.println(db.status());

        System.out.println("Tentativa de encerrar o banco de dados!");
        db.close();
        System.out.println(db.status());
    }
}
