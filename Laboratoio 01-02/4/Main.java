public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ana García", 3000, "Ventas");

        System.out.println("Salario de Ana: " + empleado1.getSalario());

        empleado1.setSalario(3500);
        System.out.println("Nuevo salario de Ana: " + empleado1.getSalario());

        empleado1.mostrarInformacion();
    }
}