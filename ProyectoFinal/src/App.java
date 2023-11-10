import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.LicenseConfiguration;

import db.conexion.ConexionDB;
import db.repositorys.GenerosRepository;
import models.Genero;

public class App {
    public static void main(String[] args) throws Exception {
        List<Genero> generos = new ArrayList<>();
        GenerosRepository generosRepository =new GenerosRepository();
        generos = generosRepository.recuperarTodos();
        for (Genero genero: generos) {
            System.out.println("nombre: "+genero.getNombre());
        }
    }
}
