import consultorios.Consultorio;
import hospital.Hospital;
import medicos.Medico;
import pacientes.Paciente;

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
            System.out.println("3. Registrar consulta");
            System.out.println("4. Registrar consultorio");
            System.out.println("5. Mostrar pacientes");
            System.out.println("6. Mostrar medicos");
            System.out.println("7. Mostrar consultorios");
            System.out.println("8. Mostrar consultas");
            System.out.println("9. Salir");

            System.out.print("Selecciona una opción: ");
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

                    System.out.println("Ingresa la fecha de nacimiento: ");
                    String fechaNacimiento = scanner.nextLine();

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
                    int idMedico = Integer.parseInt(hospital.generarIdMedico());
                    System.out.println("--Seleccionaste la opcion de registrar medico--");
                    System.out.println("Ingresa el nombre del medico: ");
                    String nombreMedico = scanner.nextLine();

                    System.out.println("Ingresa el apellido: ");
                    String apellidoMedico = scanner.nextLine();

                    System.out.println("Ingresa la fecha de nacimiento: ");
                    String fechaNacimientoMedico = scanner.nextLine();

                    System.out.println("Ingresa el num de telefono: ");
                    String telMedico = scanner.nextLine();

                    System.out.println("Ingresa el RFC del medico: ");
                    String rfcMedico = scanner.nextLine();

                    Medico medico = new Medico(idMedico, nombreMedico, apellidoMedico, fechaNacimientoMedico, telMedico, rfcMedico);
                    hospital.registrarMedico(medico);
                    System.out.println("Medico registrado exitosamente");
                    break;
                case 3:
                    int idConsultorio = Integer.parseInt(hospital.generarIdConsultorio());
                    System.out.println("--Seleccionaste la opcion de registrar medico--");
                    System.out.println("Ingresa el piso del consultorio: ");
                    int piso = scanner.nextInt();

                    System.out.println("Ingresa el numero del consultorio");
                    int numConsultorio = scanner.nextInt();

                    Consultorio consultorio = new Consultorio(idConsultorio, piso, numConsultorio);
                    hospital.registrarConsultorio(consultorio);
                    System.out.println("Medico registrado exitosamente");
                    break;
                case 4:

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

                    break;
                case 9:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
