public class Cuadrado extends FiguraConLados {
    private double lado;

    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
}