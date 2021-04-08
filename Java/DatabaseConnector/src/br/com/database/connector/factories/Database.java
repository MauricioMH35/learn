package br.com.database.connector.factories;

import java.sql.Connection;

public class Database {
    private IDatabase database;

    public Database(IDatabase database) {
        this.database = database;
    }

    public Connection getConnection() {
        return database.getConnection();
    }

    public String status() {
        return database.getStatus();
    }

    public Connection connect() {
        return database.connect();
    }

    public boolean close() {
        return database.close();
    }

    public Connection restart() {
        return database.restart();
    }
}
