public class Main {
    public static void main(String[] args) {
    Coche coche1 = new Coche("Hyundai", "Grand i10", 2017);
    Coche coche2 = new Coche("Dodge", "Attitude", 2024);
    Coche coche3 = new Coche("Audi", "A4", 2000);

        System.out.println("Coche 1");
        System.out.println(coche1.mostrarInformacion());
        System.out.print("La edad del coche es: ");
        System.out.println(coche1.calcularEdadCoche());

        System.out.println("\nCoche 2");
        System.out.println(coche2.mostrarInformacion());
        System.out.print("La edad del coche es: ");
        System.out.println(coche2.calcularEdadCoche());

        System.out.println("\nCoche 3");
        System.out.println(coche3.mostrarInformacion());
        System.out.print("La edad del coche es: ");
        System.out.println(coche3.calcularEdadCoche());
    }

}