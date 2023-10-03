package Condicional;

import java.util.Scanner;

public class Condicionales {
    //Escribir un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no.
    public static void ejercicio1(){
                Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        if(edad>17){System.out.println("Eres mayor de edad");}
        else{System.out.println("Eres menor de edad");}
        
        
    }

    /**Escribir un programa que almacene una contraseña en una variable, 
     * pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida por el usuario coincide con la guardada 
     * en la variable sin tener en cuenta mayúsculas y minúsculas.
     * 
     */

    public static void ejercicio2(){
                Scanner sc = new Scanner(System.in);
        String usuario_db = "Admin";
        String contraseña_db = "Batman";

        System.out.println("Ingresa tu usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Ingresa tu contraseña: ");
        String contraseña = sc.nextLine();

            boolean usuario_valido = usuario_db.toUpperCase().equals(usuario.toUpperCase());
            boolean contraseña_valido = contraseña_db.toUpperCase() == contraseña.toUpperCase();
            if(usuario_valido && contraseña_valido){
                System.out.println("Acceso...");
                System.out.println("Denegado...");
            }
            sc.close();
        
    }

    /**Escribir un programa que pida al usuario dos números y 
     * muestre por pantalla su división. Si el divisor es cero el programa debe mostrar un error. */

    public static void ejercicio3(){
            Scanner sc = new Scanner(System.in);
        System.out.println("Escribe dos números enteros, para dividirlos");
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("El resultado es " + (a/b));
        if (b==0) {
            System.out.println("error");
        }
        sc.close();
    }


    /**Escribir un programa que pida al usuario un número entero y muestre por pantalla si es par o impar */

    public static void ejercicio4(){
            Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número entero, para saber si es par: ");
        int a;
        a = sc.nextInt();

        if (a%2==0){
            System.out.println("Es número par");
        }
        else{ System.out.println("Es número impar");}
    }

    /**Para pagar un determinado impuesto se debe ser mayor de 16 años y tener unos ingresos iguales o superiores a $5000 mensuales. 
     * Escribir un programa que pregunte al usuario su edad y sus ingresos mensuales y 
     * muestre por pantalla si el usuario tiene que pagar o no. */

    public static void ejercicio5(){
            Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingresa tus ingresos mensuales: ");
        int ingresos = sc.nextInt();
        if(edad>16){if (ingresos>=5000){System.out.println("Debes pagar impuestos");}}
        else{System.out.println("No debes pagar impuestos");}
    }
    
    /**Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre. 
     * El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres con un nombre posterior a la N y el grupo B por el resto. 
     * Escribir un programa que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde */
    
        public static void ejercicio6(){
            Scanner sc = new Scanner(System.in);
            String sexo = "Mujer";
        System.out.println("Ingresa tu sexo: ");
        String sexo = sc.nextLine();
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        if (sexo = Mujer){if (nombre=A, B, C, D, E, F, G, H, I, J, K, L, M){System.out.println("Perteneces al grupo A");}}
        else{System.out.println("Perteneces al grupo B");}


        }

    /**En una determinada empresa, sus empleados son evaluados al final de cada año. 
     * Los puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando, traduciéndose en mejores beneficios. 
     * Los puntos que pueden conseguir los empleados pueden ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las cifras mencionadas. 
     * A continuación se muestra una tabla con los niveles correspondientes a cada puntuación. 
     * La cantidad de dinero conseguida en cada nivel es de $2,400 multiplicada por la puntuación del nivel */


        public static void ejercicio7(){
            Scanner sc = new Scanner(System.in);
            

        }
    /**Escribir un programa para una empresa que tiene salas de juegos para todas las edades y quiere calcular de forma automática 
     * el precio que debe cobrar a sus clientes por entrar. El programa debe preguntar al usuario la edad del cliente y mostrar el precio de la entrada. 
     * Si el cliente es menor de 4 años puede entrar gratis, si tiene entre 4 y 18 años debe pagar $5 y si es mayor de 18 años, $10. */


        public static void ejercicio8(){
            Scanner sc = new Scanner(System.in);
            

        }

    /**La pizzería Planeta ofrece pizzas vegetarianas y no vegetarianas a sus clientes. 
     * Los ingredientes para cada tipo de pizza aparecen a continuación.

        Vegetarianos: Pimiento y tofu.
        No vegetarianos: Peperoni, Jamón y Salmón.
        Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no, y en función de su respuesta le muestre un menú con los ingredientes disponibles para que elija. Solo se puede eligir un ingrediente además de la mozzarella y el tomate que están en todas la pizzas. 
        Al final se debe mostrar por pantalla si la pizza elegida es vegetariana o no y todos los ingredientes que lleva. */

        public static void ejercicio9(){
            Scanner sc = new Scanner(System.in);
            

        }
}
