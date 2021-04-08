package br.com.database.connector.factories;

import java.sql.Connection;

public interface IDatabase {
    Connection getConnection();
    String getStatus();
    Connection connect();
    boolean close();
    Connection restart();
}
