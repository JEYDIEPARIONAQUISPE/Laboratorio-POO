public final class Coche extends VehiculoMotorizado {
    protected int numeroPuertas;

    public Coche(String marca, String modelo, int año, String tipoMotor, int cilindrada, int numeroPuertas) {
        super(marca, modelo, año, tipoMotor, cilindrada);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}