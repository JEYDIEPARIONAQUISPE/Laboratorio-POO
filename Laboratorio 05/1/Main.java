public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5, 4);
        Cuadrado cuadrado = new Cuadrado(3);

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}