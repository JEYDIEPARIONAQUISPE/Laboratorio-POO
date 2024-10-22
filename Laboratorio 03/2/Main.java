public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(123456789, 1000, "Juan Pérez");

        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}