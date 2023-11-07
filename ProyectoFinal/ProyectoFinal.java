import java.sql.Connection;

import db.conexion.ConexionDB;

public class ProyectoFinal {
    public static void main(String[] args) throws Exception {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }}
