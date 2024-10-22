public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoTiempoCompleto("Juan", 1000, 15, 20, 40);
        empleados[0].setHorasTrabajadas(50);

        empleados[1] = new EmpleadoPorComision("Ana", 500, 0.1, 500, 10000);
        empleados[1].setVentasTotales(12000);

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.nombre);
            System.out.println("Salario: " + empleado.calcularSalario());
            System.out.println("---------------------");
        }
    }
}