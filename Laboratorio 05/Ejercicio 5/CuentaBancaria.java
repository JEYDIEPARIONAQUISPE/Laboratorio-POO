public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        } else {
            saldo -= cantidad;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}