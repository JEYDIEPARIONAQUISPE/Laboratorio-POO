public class EmpleadoPorComision extends Empleado {
    private double porcentajeComision;
    private double bonoMetaVentas;
    private double ventasTotales;
    private double metaVentas;

    public EmpleadoPorComision(String nombre, double salario, double porcentajeComision, double bonoMetaVentas, double metaVentas) {
        super(nombre, salario);
        this.porcentajeComision = porcentajeComision;
        this.bonoMetaVentas = bonoMetaVentas;
        this.metaVentas = metaVentas;
    }

    public void setVentasTotales(double ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = ventasTotales * porcentajeComision;
        if (ventasTotales >= metaVentas) {
            salarioBase += bonoMetaVentas;
        }
        return salarioBase;
    }
}