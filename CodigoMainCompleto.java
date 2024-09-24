import consultas.Consulta;
import consultorios.Consultorio;
import hospital.Hospital;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Hospital hospital = new Hospital();

        while (opcion != 9) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar medico");
            System.out.println("3. Registrar consultorio");
            System.out.println("4. Registrar consulta");
            System.out.println("5. Mostrar pacientes");
            System.out.println("6. Mostrar medicos");
            System.out.println("7. Mostrar consultorios");
            System.out.println("8. Mostrar consultas");
            System.out.println("9. Mostrar paciente por ID");
            System.out.println("10. Mostrar medicos por ID");
            System.out.println("11. Mostrar consultorios por ID");
            System.out.println("12. Mostrar consultas por ID");
            System.out.println("13. Salir");

            System.out.print("\nSelecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {

                case 1:
                    String id = hospital.generarIdPaciente();
                    System.out.println("--Seleccionaste la opcion de registrar pacientes--");
                    System.out.println("Ingresa el nombre del paciente: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingresa el apellido: ");
                    String apellido = scanner.nextLine();

                    System.out.println("Ingresa el año de nacimiento del paciente");
                    int anio = scanner.nextInt();

                    System.out.println("Ingresa el mes de nacimiento del paciente");
                    int mes = scanner.nextInt();

                    System.out.println("Ingresa el dia de nacimiento del paciente");
                    int dia = scanner.nextInt();
                    LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

                    scanner.nextLine();

                    System.out.println("Ingresa el tipo de sangre: ");
                    String tipoSangre = scanner.nextLine();

                    System.out.println("Ingresa el sexo: ");
                    String sexo2 = scanner.nextLine();
                    char sexo = sexo2.charAt(0);

                    System.out.println("Ingresa el num de telefono: ");
                    String tel = scanner.nextLine();

                    Paciente paciente = new Paciente(id, nombre, apellido, fechaNacimiento, tipoSangre, sexo, tel);
                    hospital.registrarPaciente(paciente);
                    System.out.println("Paciente registrado exitosamente");
                    break;
                case 2:
                    scanner.nextLine();
                    String idMedico = hospital.generarIdMedico();
                    System.out.println("--Seleccionaste la opcion de registrar medico--");
                    System.out.println("Ingresa el nombre del medico: ");
                    String nombreMedico = scanner.nextLine();

                    System.out.println("Ingresa el apellido: ");
                    String apellidoMedico = scanner.nextLine();

                    System.out.println("Ingresa el año de nacimiento del medico");
                    int anioMed = scanner.nextInt();

                    System.out.println("Ingresa el mes de nacimiento del medico");
                    int mesMed = scanner.nextInt();

                    System.out.println("Ingresa el dia de nacimiento del medico");
                    int diaMed = scanner.nextInt();
                    LocalDate fechaNacimientoMedico = LocalDate.of(anioMed, mesMed, diaMed);

                    scanner.nextLine();

                    System.out.println("Ingresa el num de telefono: ");
                    String telMedico = scanner.nextLine();

                    System.out.println("Ingresa el RFC del medico: ");
                    String rfcMedico = scanner.nextLine();

                    Medico medico = new Medico(idMedico, nombreMedico, apellidoMedico, fechaNacimientoMedico, telMedico, rfcMedico);
                    hospital.registrarMedico(medico);
                    System.out.println("Medico registrado exitosamente");
                    break;
                case 3:
                    scanner.nextLine();
                    String idConsultorio = hospital.generarIdConsultorio();
                    System.out.println("--Seleccionaste la opcion de registrar consultorio--");
                    System.out.println("Ingresa el piso del consultorio: ");
                    int piso = scanner.nextInt();

                    System.out.println("Ingresa el numero del consultorio");
                    int numConsultorio = scanner.nextInt();

                    Consultorio consultorio = new Consultorio(idConsultorio, piso, numConsultorio);
                    hospital.registrarConsultorio(consultorio);
                    System.out.println("Consultorio registrado exitosamente");
                    break;
                case 4:
                    String idConsulta = hospital.generarIdConsulta();
                    System.out.println("--Seleccionaste la opcion de registrar consulta--");

                    System.out.println("Ingresa el dia de la consulta deseada: ");
                    int diaConsulta = scanner.nextInt();

                    System.out.println("Ingresa el mes de la consulta deseada: ");
                    int mesConsulta = scanner.nextInt();

                    System.out.println("Ingresa el año de la consulta deseada: ");
                    int anioConsulta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingresa la hora de la consulta: ");
                    int horaConsulta = scanner.nextInt();

                    System.out.println("Ingresa los minutos de la consulta: ");
                    int minutoConsulta = scanner.nextInt();

                    LocalDateTime fechaConsulta = LocalDateTime.of(anioConsulta, mesConsulta, diaConsulta, horaConsulta, minutoConsulta);

                    scanner.nextLine();
                    System.out.println("Ingresa el ID del paciente: ");
                    String buscarPaciente = scanner.nextLine();
                    Paciente paciente1 = hospital.mostrarIdPaciente(buscarPaciente);

                    System.out.println("Ingresa el ID del médico: ");
                    String idMed = scanner.nextLine();
                    Medico medico1 = hospital.mostrarIdMedico(idMed);

                    System.out.println("Ingresa el ID del consultorio: ");
                    String idCon = scanner.nextLine();
                    Consultorio consultorio1 = hospital.mostrarIdConsultorio(idCon);

                    if (paciente1 != null && medico1 != null && consultorio1 != null) {

                        Consulta consulta = new Consulta(idConsulta, fechaConsulta, paciente1, medico1, consultorio1);
                        hospital.registrarConsulta(consulta);
                        System.out.println("Consulta registrada con éxito.");

                    } else {
                        System.out.println("Error: No se encontró el paciente, médico o consultorio con los IDs proporcionados.");
                    }
                    break;
                case 5:
                    hospital.mostrarPacientes();
                    break;
                case 6:
                    hospital.mostrarMedicos();
                    break;
                case 7:
                    hospital.mostrarConsultorio();
                    break;
                case 8:
                    hospital.mostrarConsulta();
                    break;
                case 9:
                    System.out.println("Elegiste la opcion de buscar paciente por su ID");
                    System.out.print("Ingresa el ID del Paciente: ");
                    String buscarIdPaciente = scanner.nextLine();
                    hospital.mostrarPacientePorID(buscarIdPaciente);
                    break;
                case 10:
                    System.out.println("Elegiste la opcion de buscar medico por su ID");
                    System.out.print("Ingresa el ID del Medico: ");
                    String buscarIdMedico = scanner.nextLine();
                    hospital.mostrarMedicoPorID(buscarIdMedico);
                    break;
                case 11:
                    System.out.println("Elegiste la opcion de buscar consultorio por su ID");
                    System.out.print("Ingresa el ID del Consultorio: ");
                    String buscarIdConsultorio = scanner.nextLine();
                    hospital.mostrarConsultorioPorID(buscarIdConsultorio);
                    break;
                case 12:
                    System.out.println("Elegiste la opcion de buscar consulta por su ID");
                    System.out.print("Ingresa el ID de la Consulta: ");
                    String buscarIdConsulta = scanner.nextLine();
                    hospital.mostrarConsultaPorID(buscarIdConsulta);
                    break;
                case 13:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}
