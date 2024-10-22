public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante("Juan");

        persona.saludar();
        estudiante.saludar();
        estudiante.saludar("Ana");
    }
}