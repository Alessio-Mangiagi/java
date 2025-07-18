package com.java.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaJdbc {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            // Connessione al database PostgreSQL
            conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "123456"
            );
            System.out.println("Connesso!");
        } catch (SQLException e) {
            System.out.println("Connessione fallita! Errore: " + e.getMessage());
            e.printStackTrace();
        } /*finally {
            // Chiudi la connessione in modo sicuro
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Connessione chiusa.");
                } catch (SQLException e) {
                    System.out.println("Errore durante la chiusura della connessione: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }*/
    }
}