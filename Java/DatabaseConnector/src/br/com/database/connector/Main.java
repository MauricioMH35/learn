package br.com.database.connector;

import br.com.database.connector.factories.Database;
import br.com.database.connector.factories.DatabaseConnector;

public class Main {
    public static void main(String[] args) {
        Database db = new Database(DatabaseConnector.get());

        System.out.println("Conexão com o banco de dados");

        System.out.println("Tentativa de iniciar a conexão...");
        db.connect();
        System.out.println(db.status());

        System.out.println("Tentativa de reiniciar a conexão...");
        db.restart();
        System.out.println(db.status());

        System.out.println("Tentativa de encerrar a conexão...");
        db.close();
        System.out.println(db.status());
    }
}
