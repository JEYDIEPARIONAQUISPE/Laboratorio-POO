public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2023, "Gasolina", 1600, 4);
        Motocicleta moto = new Motocicleta("Honda", "CBR600RR", 2022, "4 Tiempos", 599, 120);

        System.out.println("Información del coche:");
        coche.mostrarInformacion();

        System.out.println("\nInformación de la motocicleta:");
        moto.mostrarInformacion();
    }
}