public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(1000);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(500, 200);

        try {
            cuentaBancaria.retirar(1500); // Lanza SaldoInsuficienteException
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cuentaCorriente.retirar(800); // Retiro normal
        } catch (SaldoInsuficienteException | LimiteSobregiroExcedidoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            cuentaCorriente.retirar(900); // Lanza LimiteSobregiroExcedidoException
        } catch (SaldoInsuficienteException | LimiteSobregiroExcedidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}