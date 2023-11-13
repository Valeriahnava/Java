package db.repositorys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.conexion.ConexionDB;
import interfaces.RepositoryInterface;
import models.Empleado;
import models.Genero;

public class EmpleadoRepository implements RepositoryInterface<Empleado>{

    @Override
    public void agregar(Empleado entidad) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "INSERT INTO empleados VALUES (NULL,?)";
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
    public void eliminar(Empleado entidad) {
        try(Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "DELETE FROM empleados WHERE id = ?";
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
    public void modificar(Empleado entidad) {
        try (Connection conexion = ConexionDB.obtenerConexion()){
            String q = "UPDATE empleados SET nombre = ? WHERE id = ?";
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
    public Empleado recuperarId(Long id) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM empleados WHERE id = ? ";
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
    private Empleado dameEntidadResultSet(ResultSet resultSet){
        Long id = 0L;
        String nombre= "";
        try {
            while (resultSet.next()) {
                id = resultSet.getLong("id");
                nombre = resultSet.getString("nombre");
            }
            return new Empleado(id, nombre, nombre, nombre, nombre, null, null);
        } catch (Exception e) {
            System.out.println("error al recuperar empleado");
        }
        return null;
    }
    @Override
    public List<Empleado> recuperarTodos() {
        try (Connection connection = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM empleados";
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(q);
                return dameListaEmpleados(resultSet);
            } catch (Exception e) {
                System.out.println("error en query recuperar Todos");
            }
        }catch (Exception e) {
            System.out.println("error en query recuperaTodos");
        }
        return null;
    }

    private List<Empleado> dameListaEmpleados(ResultSet resultSet) {
        List<Empleado> empleados = new ArrayList<Empleado>();

        try (resultSet){
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                empleados.add(new Empleado(null, nombre, nombre, nombre, nombre, null, null));
                
            }
            return empleados;
        } catch (Exception e) {
            System.out.println("Error al recuperar empleado");
        }
        return empleados;
    }
    
}
