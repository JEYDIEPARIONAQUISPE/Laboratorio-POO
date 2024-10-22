public class EmpleadoTiempoCompleto extends Empleado {
    private double tarifaPorHora;
    private double bonoHorasExtras;
    private int horasTrabajadas;
    private int limiteHorasExtras;

    public EmpleadoTiempoCompleto(String nombre, double salario, double tarifaPorHora, double bonoHorasExtras, int limiteHorasExtras) {
        super(nombre, salario);
        this.tarifaPorHora = tarifaPorHora;
        this.bonoHorasExtras = bonoHorasExtras;
        this.limiteHorasExtras = limiteHorasExtras;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = horasTrabajadas * tarifaPorHora;
        if (horasTrabajadas > limiteHorasExtras) {
            int horasExtras = horasTrabajadas - limiteHorasExtras;
            salarioBase += horasExtras * bonoHorasExtras;
        }
        return salarioBase;
    }
}
