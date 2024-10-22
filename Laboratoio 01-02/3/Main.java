public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Suma: " + calculadora.suma(5, 3));
        System.out.println("Resta: " + calculadora.resta(10, 4));
        System.out.println("Multiplicación: " + calculadora.multiplicacion(2, 7));
        System.out.println("División: " + calculadora.division(15, 3));
        System.out.println("División por cero: " + calculadora.division(10, 0));
    }
}