public class Estudiante extends Persona {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }

    public void saludar(String otraPersona) {
        System.out.println("¡Hola " + otraPersona + "! Soy " + nombre);
    }
}