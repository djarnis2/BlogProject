package org.example.blog;

import org.example.blog.database.SQLGetter;
import org.example.blog.database.database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {
    public static database db = new database("sql11.freesqldatabase.com", "sql11684801", "lD5Ndr2Gxa", "sql11684801", 3306);

    public static void main(String[] args) {

        SpringApplication.run(BlogApplication.class, args);
        if(!db.isConnected()) {
            db.connect();
            SQLGetter sqlGetter = new SQLGetter();
            sqlGetter.createTable();
            sqlGetter.createBlog();
        }

    }

}
