public class Triangulo extends FiguraConLados {
    private double lado;

    public Triangulo(double lado) {
        super(3);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 3;
    }
}