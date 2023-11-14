
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

            Scanner sc = new Scanner(System.in);
            int dia;
            System.out.println("Imtroduce números del 1-7");
            dia = Interger.parseInt(sc.nextline());
            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                default:
                    System.out.println("Domingo");
                    break;
            }
    }
}
