public class Pedido {
    public static void main(String[] args) throws Exception {
        double costoArticulo = 30.99;
        boolean listoEnviar = false;

        if (costoArticulo>24.00){
            System.out.println("¡El valor del artículo es alto!");
        }

        if (listoEnviar){
            System.out.println("Enviado");
        }else{
            System.out.println("No listo");
        }
    }
}
