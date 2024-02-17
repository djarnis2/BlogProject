package org.example.blog.database;

import org.example.blog.BlogApplication;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLGetter {
    private PreparedStatement statement;

    public void createTable() {
        try {
            statement = BlogApplication.db.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS blog (id int NOT NULL AUTO_INCREMENT, title text, content text, PRIMARY KEY (id))");
            statement.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
