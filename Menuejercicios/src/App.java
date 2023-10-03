import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Escribir un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no.

        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        if (edad>17) {
            System.out.println("Eres mayor de edad");  
        } else (edad<17) { 
            System.out.println("Eres mayor de edad");   
        }sc.close();
    }   
}
