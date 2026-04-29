package org.example;


import java.sql.Connection;
import java.sql.DriverManager;

    public class DBconnections {
        public static Connection getConnection() throws Exception {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Lgistics",
                    "root",
                    "Kartvy@6126"
            );
        }
    }

