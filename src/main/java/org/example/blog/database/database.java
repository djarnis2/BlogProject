package org.example.blog.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    private Connection connection;
    private String host;
    private String username;
    private String password;
    private String database;
    private int port;

    public database(String host, String username, String password, String database, int port){
        this.host = host;
        this.username = username;
        this.password = password;
        this.database = database;
        this.port = port;
    }


    public boolean isConnected() {
        return (this.connection != null);
    }

    public void connect() {
        if (!isConnected()) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false", username, password);
                System.out.println("Connected to database");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void disconnect() {
        if (isConnected()) {
            try {
                connection.close();
                System.out.println("Disconnected from database");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
