package org.example.blog;

import org.example.blog.database.database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {
    public static database db = new database("localhost", "root", "dasd", "blog", 3306)

    public static void main(String[] args) {

        SpringApplication.run(BlogApplication.class, args);
        if(!db.isConnected()) {
            db.connect();
        }

    }

}
