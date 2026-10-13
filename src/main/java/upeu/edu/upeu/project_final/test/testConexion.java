package upeu.edu.upeu.project_final.test;

import pe.edu.upeu.project_final.utils.ConexionDB;

import java.sql.Connection;

public class TestConexion {

    public static void testConexion() {
        try {
            Connection connection = ConexionDB.getConnection();
            if (connection != null && !connection.isClosed()) {
                System.out.println("Conexion sucess a Sqlite!!!");
            } else {
                System.out.println("Error de conexion");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion" +e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testConexion();
    }
}