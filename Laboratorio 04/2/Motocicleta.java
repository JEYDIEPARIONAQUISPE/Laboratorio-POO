public final class Motocicleta extends VehiculoMotorizado {
    protected int potencia;

    public Motocicleta(String marca, String modelo, int año, String tipoMotor, int cilindrada, int potencia) {
        super(marca, modelo, año, tipoMotor, cilindrada);
        this.potencia = potencia;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Potencia: " + potencia);
    }
}