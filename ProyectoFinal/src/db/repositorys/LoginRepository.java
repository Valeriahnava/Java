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
import models.Login;

public class LoginRepository implements RepositoryInterface<Login> {

    @Override
    public Login recuperarId(Long id) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM login WHERE id = ? ";
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

    private Login dameEntidadResultSet(ResultSet resultSet){
        Long id = 0L;
        String nombre= "";
        try {
            while (resultSet.next()) {
                id = resultSet.getLong("id");
                nombre = resultSet.getString("nombre");
            }
            return new Login(id, nombre, nombre, nombre, nombre);
        } catch (Exception e) {
            System.out.println("error al recuperar resulSet");
        }
        return null;
    }

    @Override
    public List<Login> recuperarTodos() {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM login";
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

    private List<Login> dameListaGeneros(ResultSet resultSet) {
        List<Login> login = new ArrayList<Login>();

        try (resultSet) {
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                login.add(new Login(null, nombre, nombre, nombre, nombre));
                
            }
            return login;
        } catch (Exception e) {
            System.out.println("Error al recuperar generos");
        }
        return login;
    }

    @Override
    public void agregar(Login entidad) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "INSERT INTO login VALUES (NULL,?)";
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
    public void modificar(Login entidad) {
        try (Connection conexion = ConexionDB.obtenerConexion()){
            String q = "UPDATE login SET nombre = ? WHERE id = ?";
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

    @Override
    public void eliminar(Login entidad) {
        try(Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "DELETE FROM login WHERE id = ?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q);){
                preparedStatement.setString(1,""+entidad.getId());
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                System.out.println("Error al crear el Statement o ResulSet");
            }
        } catch (Exception e) {
            System.out.println("Error de consulta");
        };
    }
    
}
