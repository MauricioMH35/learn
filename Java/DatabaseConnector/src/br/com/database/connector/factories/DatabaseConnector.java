package br.com.database.connector.factories;

import br.com.database.connector.configs.DatabaseProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnector implements IDatabase {
    private static DatabaseConnector instance;
    private static Connection connection;
    private static String status;
    private static Properties prop = DatabaseProperties.get().prop("default");

    @Override
    public Connection getConnection() {
        return connection;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public Connection connect() {
        try {
            String type = prop.getProperty("database.type");
            String driver = prop.getProperty("database.driver");
            String host = prop.getProperty("database.host");
            int port = Integer.parseInt(prop.getProperty("database.port"));
            String database = prop.getProperty("database.name");
            String user = prop.getProperty("database.user");
            String pass = prop.getProperty("database.pass");
            String url = "jdbc:"+type+"://"+host+":"+port+"/"+database;

            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);

            status = "[database] conexão efetuada com sucesso!";

        } catch(ClassNotFoundException e) {
            status = "[database] não foi possivel encontrar o módulo para efetuar operações!";
            e.printStackTrace();

        } catch(SQLException e) {
            status = "[database] não foi possivel estabelecer uma conexão!";
            e.printStackTrace();

        }

        return connection;
    }

    @Override
    public boolean close() {
        try {
            if(connection != null) {
                connection.close();
                status = "[database] conexão encerrada com sucesso!";

            } else {
                status = "[database] a conexão não foi iniciada, sendo assim não o processo para encerra-la não foi" +
                        "efetuado!";
            }

        } catch(SQLException e) {
            status = "[database] não foi possivel encerrar a conexão!";
            e.printStackTrace();

        }

        if(connection == null)
            return true;
        else
            return false;
    }

    @Override
    public Connection restart() {
        close();
        connect();

        if(connection != null)
            status = "[database] a conexão foi reiniciada com sucesso!";
        else
            status = "[database] a conexão não foi reiniciada!";

        return connection;
    }

    private DatabaseConnector() {

    }

    public static synchronized DatabaseConnector get() {
        if(instance == null)
            instance = new DatabaseConnector();

        return instance;
    }
}
