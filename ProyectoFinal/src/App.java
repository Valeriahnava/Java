import screen.VentanaEmpleado;
import screen.VentanaLogin;

public class App {
    public static void main(String[] args) throws Exception {
        // List<Genero> generos = new ArrayList<>();
        // GenerosRepository generosRepository =new GenerosRepository();
        // generos = generosRepository.recuperarTodos();
        // for (Genero genero: generos) {
        //     System.out.println("nombre: "+genero.getNombre());
        // }

        //VentanaLogin vl = new VentanaLogin("Login");
        //vl.setVisible(true);
        VentanaEmpleado ve = new VentanaEmpleado("Empleado");
        ve.setVisible(true);
    }
}
