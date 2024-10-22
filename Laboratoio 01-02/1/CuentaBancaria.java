public class CuentaBancaria {
    private String titular;
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, int numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado correctamente. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado correctamente. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente o cantidad de retiro inválida.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}