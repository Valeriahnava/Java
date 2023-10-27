import java.util.Stack;

public class Pilas {
    public static void main(String[] args) throws Exception {


        Stack<String> camisas = new Stack<String>();

        camisas.push("camisa roja");
        camisas.push("camisa azul");
        camisas.push("camisa rosa");
        camisas.push("camisa gris");
        camisas.push("camisa blanca");
        camisas.push("camisa negra");
        
        while (!camisas.empty()) {
            System.out.println("la camisa que se está sacando es: " + camisas.pop());
        }

        

    }
}
