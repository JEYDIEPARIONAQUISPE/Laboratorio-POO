public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 123456789, 1000);

        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    }
}