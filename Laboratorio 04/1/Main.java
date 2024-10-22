public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 2000);
        Gerente gerente = new Gerente("Ana", 3000);

        System.out.println("Bono del empleado: " + empleado.calcularBono());
        System.out.println("Bono del gerente: " + gerente.calcularBono());
    }
}