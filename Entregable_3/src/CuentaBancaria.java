public class CuentaBancaria {
    public static void main(String[] args) throws Exception {
        double saldo = 1000.75;
        double cantidadARetirar = 250;
        double saldoActualizado = saldo-cantidadARetirar;
        double cantidadParaCadaAmigo = saldoActualizado/3;
        boolean puedeComprarTicket = cantidadParaCadaAmigo >= 250;

        System.out.println("La cantidad para cada amigo es: "+ cantidadParaCadaAmigo);
        System.out.println("¿Pueden comprar un ticket para el concierto? " + puedeComprarTicket);
    }
}