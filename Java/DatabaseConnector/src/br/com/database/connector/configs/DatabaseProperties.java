package br.com.database.connector.configs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DatabaseProperties {
    private static DatabaseProperties instance;
    private static Properties properties;
    private static String defPath = "./src/br/com/database/connector/configs/database.properties";

    public static Properties prop(String path) {
        if(path == "" || path == null || path == "default")
            path = defPath;

        try {
            properties = new Properties();
            FileInputStream file = new FileInputStream(path);
            properties.load(file);

        } catch(IOException e) {
            e.printStackTrace();

        }

        return properties;
    }

    private DatabaseProperties() {

    }

    public static DatabaseProperties get() {
        if(instance == null)
            instance = new DatabaseProperties();

        return instance;
    }
}
