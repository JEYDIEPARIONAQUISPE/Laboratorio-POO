public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5);
        Cuadrado cuadrado = new Cuadrado(4);
        Pentagono pentagono = new Pentagono(3);

        System.out.println("Triángulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());

        System.out.println("\nCuadrado:");
        System.out.println("Área: " + cuadrado.calcularArea());
        System.out.println("Perímetro: " + cuadrado.calcularPerimetro());

        System.out.println("\nPentágono:");
        System.out.println("Área: " + pentagono.calcularArea());
        System.out.println("Perímetro: " + pentagono.calcularPerimetro());
    }
}