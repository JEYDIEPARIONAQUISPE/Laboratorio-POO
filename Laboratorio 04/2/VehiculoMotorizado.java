public class VehiculoMotorizado extends Vehiculo {
    protected String tipoMotor;
    protected int cilindrada;

    public VehiculoMotorizado(String marca, String modelo, int año, String tipoMotor, int cilindrada) {
        super(marca, modelo, año);
        this.tipoMotor = tipoMotor;
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de motor: " + tipoMotor);
        System.out.println("Cilindrada: " + cilindrada);
    }
}