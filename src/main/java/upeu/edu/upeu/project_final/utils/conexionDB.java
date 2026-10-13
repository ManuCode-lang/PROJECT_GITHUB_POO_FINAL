package upeu.edu.upeu.project_final.utils;

import java.sql.*;
public class conexionDB {

    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("org.sqlite.JDBC");
                String url = "jdbc:sqlite:C:/sqlite/db/reserva.db";
                connection = DriverManager.getConnection(url);
                connection.setAutoCommit(true);
                try (Statement stmt = connection.createStatement()) {
                    stmt.execute("PRAGMA foreign_keys = ON");
                }
                System.out.println("conexion succes");
            }
            return connection;
        }catch (Exception e){
            throw new RuntimeException("Error al conectar BD"+e.getMessage());

        }

    }


}