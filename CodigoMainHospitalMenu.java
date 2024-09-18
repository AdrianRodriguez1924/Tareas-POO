import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 8) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Mostrar lista de consultas");
            System.out.println("2. Revisar fechas de consulta");
            System.out.println("3. Mostrar lista de medicos");
            System.out.println("4. Registrar paciente");
            System.out.println("5. Registrar medico");
            System.out.println("6. Registrar consulta");
            System.out.println("7. Registrar consultorio");
            System.out.println("8. Salir");

            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}