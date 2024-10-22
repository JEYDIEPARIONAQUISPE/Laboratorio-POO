public class Pentagono extends FiguraConLados {
    private double lado;

    public Pentagono(double lado) {
        super(5);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (lado * lado * Math.sqrt(25 + 10 * Math.sqrt(5))) / 4;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 5;
    }
