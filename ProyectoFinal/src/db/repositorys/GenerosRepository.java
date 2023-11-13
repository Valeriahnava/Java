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
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "INSERT INTO genero VALUES (NULL,?)";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q);){
                preparedStatement.setString(1,entidad.getNombre());
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                System.out.println("Error al crear el Statement o ResulSet");
            }
        } catch (Exception e) {
            System.out.println( "Error de consulta");
        }

    }

    @Override
    public void eliminar(Genero entidad) {
        try(Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "DELETE FROM genero WHERE id = ?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q);){
                preparedStatement.setString(1,""+entidad.getId());
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                System.out.println("Error al crear el Statement o ResulSet");
            }
        } catch (Exception e) {
            System.out.println("Error de consulta");
        }

    }

    @Override
    public void modificar(Genero entidad) {
        try (Connection conexion = ConexionDB.obtenerConexion()){
            String q = "UPDATE genero SET nombre = ? WHERE id = ?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q);) {
                preparedStatement.setString(1, entidad.getNombre());
                preparedStatement.setString(2,""+entidad.getId());
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                System.out.println("Error al crear el Statement o ResulSet");
            }
        } catch (Exception e) {
            System.out.println("Error de consulta");
        }

    }
    private Genero dameEntidadResultSet(ResultSet resultSet){
        Long id = 0L;
        String nombre= "";
        try {
            while (resultSet.next()) {
                id = resultSet.getLong("id");
                nombre = resultSet.getString("nombre");
            }
            return new Genero(id, nombre);
        } catch (Exception e) {
            System.out.println("error al recuperar generos");
        }
        return null;
    }

    @Override
    public Genero recuperarId(Long id) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM genero WHERE id = ? ";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q);){
                preparedStatement.setLong(1,id);
                return dameEntidadResultSet(preparedStatement.executeQuery());
            } catch (Exception e) {
                System.out.println("Error al crear el Statement o ResulSet");
            }
        } catch (Exception e) {
            System.out.println("Error en la consulta");
        }
        return null;
    }

    

    @Override
    public List<Genero> recuperarTodos() {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM genero";
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
        List<Genero> genero = new ArrayList<Genero>();

        try (resultSet) {
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                genero.add(new Genero(id, nombre));
                
            }
            return genero;
        } catch (Exception e) {
            System.out.println("Error al recuperar generos");
        }
        return genero;
    }
}