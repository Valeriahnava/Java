package db.repositorys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.conexion.ConexionDB;
import interfaces.RepositoryInterface;
import models.Genero;

public class GenerosRepository implements RepositoryInterface<Genero> {

    @Override
    public void agregar(Genero entidad) {
        

    }

    @Override
    public void eliminar(Genero entidad) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modificar(Genero entidad) {
        // TODO Auto-generated method stub

    }

    @Override
    public Genero recuperarId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Genero> recuperarTodos() {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            String q = "SELECT = FROM generos";
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(q);
                return dameListaGeneros(resultSet);
            } catch (Exception e) {
                System.out.println("error en query recuperar Todos");
            }
        }catch (Exception e) {
            System.out.println("error en query recuperaTodos");
        }
        return null;
    }

    private List<Genero> dameListaGeneros(ResultSet resultSet) {
        List<Genero> generos = new ArrayList<>();

        try {
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                generos.add(new Genero(id, nombre));
                
            }
            return generos;
        } catch (Exception e) {
            System.out.println("Error al recuperar generos");
        }
        return generos;
    }
}