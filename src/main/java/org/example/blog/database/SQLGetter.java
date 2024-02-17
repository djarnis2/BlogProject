package org.example.blog.database;

import org.example.blog.BlogApplication;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLGetter {
    private PreparedStatement statement;
    private String createBlog1 = "INSERT INTO blog (title, content) values ('My first blog', 'In this my first blog im not going to write much')";
    private String createTableSQL1 = "CREATE TABLE IF NOT EXISTS blog (id SERIAL PRIMARY KEY, title varchar(255), content text)";

    public void createTable() {
        try {
            statement = BlogApplication.db.getConnection().prepareStatement(createTableSQL1);
            statement.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    public void createBlog() {
        try {
            statement =  BlogApplication.db.getConnection().prepareStatement(createBlog1);
            statement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
