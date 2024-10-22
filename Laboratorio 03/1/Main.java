public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 25, "ana.garcia@example.com");

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Correo electrónico: " + persona1.getCorreoElectronico());

        persona1.setNombre("Ana María");
        persona1.setEdad(26);
        persona1.setCorreoElectronico("ana.maria@example.com");

        System.out.println("\nInformación actualizada:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Correo electrónico: " + persona1.getCorreoElectronico());
    }
}