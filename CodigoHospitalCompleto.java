package hospital;

import consultas.Consulta;
import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class Hospital {
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public ArrayList<Medico> listaMedicos = new ArrayList<>();
    public ArrayList<Consulta> listaConsultas = new ArrayList<>();
    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();
    private ValidadorHospital validador = new ValidadorHospital();

    public void registrarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico) {
        this.listaMedicos.add(medico);
    }

    public void registrarConsulta(Consulta consulta) {
        if (!validador.validarDisponibilidadEnFechaConsulta(consulta.getFechaHora(), consulta.getConsultorio().getNumConsultorio(), this.listaConsultas)) {
            System.out.println("Ya existe una consulta registrada para esa fecha");
            return;
        }
        if (!validador.validarDisponibilidadMedico(consulta.getFechaHora(), consulta.getMedico().getId(), this.listaConsultas)) {
            System.out.println("El médico no tiene disponibilidad para esa fecha");
            return;

        }

        this.listaConsultas.add(consulta);
    }

    public void registrarConsultorio(Consultorio consultorio) {
        this.listaConsultorios.add(consultorio);
    }

    public void mostrarPacientes() {
        System.out.println("\n** Pacientes del Hosopital **");
        for (Paciente paciente : this.listaPacientes) {
            System.out.println(paciente.mostrarDatos());
        }
    }

    public void mostrarMedicos() {
        System.out.println("\n** Medicos del Hosopital **");
        for (Medico medicos : this.listaMedicos) {
            System.out.println(medicos.mostrarDatosMedico());
        }
    }

    public void mostrarConsultorio() {
        System.out.println("\n** Consultorios del Hospital **");
        for (Consultorio consultorios : this.listaConsultorios) {
            System.out.println(consultorios.mostrarDatosConsultorio());
        }
    }

    public void mostrarConsulta() {
        System.out.println("\n** Consultas del Hospital **");
        for (Consulta consulta : this.listaConsultas) {
            System.out.println(consulta.mostrarDatosConsulta());
        }
    }

    public String generarIdPaciente() {
        Random random = new Random();
        LocalDate fecha = LocalDate.now();
        int anioActual = fecha.getYear();
        int mesActual = fecha.getMonthValue();
        int longitudPacienteMasUno = this.listaPacientes.size()+1;
        int numeroAleatorio = random.nextInt();

        String idPaciente = String.format("P%d%d%d%d", anioActual, mesActual, longitudPacienteMasUno, numeroAleatorio);
        return idPaciente;
    }

    public Paciente obtenerPacientePorId(String idPaciente){
        return listaPacientes.stream().filter(p -> p.getId().equals(idPaciente)).findFirst().orElse(null);

    }

    //Mostrar paciente por ID
    public void mostrarPacientePorID(String idPaciente) {
        Paciente paciente = obtenerPacientePorId(idPaciente);

        if (paciente != null) {
            System.out.println(paciente.mostrarDatos());
        } else {
            System.out.println("No se encontro el paciente");
        }
    }

    public String generarIdMedico() {
        Random random = new Random();
        LocalDate fecha = LocalDate.now();
        int anioActual = fecha.getYear();
        int mesActual = fecha.getMonthValue();
        int longitudMedicoMasUno = this.listaMedicos.size()+1;
        int numeroAleatorio = random.nextInt();

        String idMedico = String.format("P%d%d%d%d", anioActual, mesActual, longitudMedicoMasUno, numeroAleatorio);
        return idMedico;
    }

//Mostrar Medico por su ID
    public void mostrarMedicoPorID(String idMedico) {
        Optional<Medico> medicoEncontrado = this.listaMedicos.stream().filter(medico -> medico.getId().equals(idMedico)).findFirst();

        if (medicoEncontrado.isPresent()) {
            System.out.println(medicoEncontrado.get().mostrarDatosMedico());
        } else {
            System.out.println("No se encontro el paciente");
        }
    }

    public String generarIdConsultorio() {
        Random random = new Random();
        LocalDate fecha = LocalDate.now();
        int anioActual = fecha.getYear();
        int mesActual = fecha.getMonthValue();
        int longitudConsultorioMasUno = this.listaConsultorios.size()+1;
        int numeroAleatorio = random.nextInt();

        String idMedico = String.format("P%d%d%d%d", anioActual, mesActual, longitudConsultorioMasUno, numeroAleatorio);
        return idMedico;
    }

//Mostrar Consultorio por ID
    public void mostrarConsultorioPorID(String idConsultorio) {
        Optional<Consultorio> consultorioEncontrado = this.listaConsultorios.stream().filter(consultorio -> consultorio.getId().equals(idConsultorio)).findFirst();

        if (consultorioEncontrado.isPresent()) {
            System.out.println(consultorioEncontrado.get().mostrarDatosConsultorio());
        } else {
            System.out.println("No se encontro el paciente");
        }
    }

    public String generarIdConsulta() {
        Random random = new Random();
        LocalDate fecha = LocalDate.now();
        int anioActual = fecha.getYear();
        int mesActual = fecha.getMonthValue();
        int longitudConsultasMasUno = this.listaConsultas.size()+1;
        int numeroAleatorio = random.nextInt();

        String idMedico = String.format("P%d%d%d%d", fecha, anioActual, mesActual, longitudConsultasMasUno, numeroAleatorio);
        return idMedico;
    }

    public void mostrarConsultaPorID(String idConsulta) {
        Optional<Consulta> consultaEncontrada = this.listaConsultas.stream().filter(consulta -> consulta.getId().equals(idConsulta)).findFirst();

        if (consultaEncontrada.isPresent()) {
            System.out.println(consultaEncontrada.get().mostrarDatosConsulta());
        } else {
            System.out.println("No se encontro la consulta");
        }
    }

    public Consultorio mostrarIdConsultorio(String idConsultorio) {
        for (Consultorio consultorio : listaConsultorios) {
            if (consultorio.getId().equals(idConsultorio)) {
                return consultorio;
            }
        }
        return null;
    }

    public Medico mostrarIdMedico(String idMedico) {
        for (Medico medico : listaMedicos) {
            if (medico.getId().equals(idMedico)) {
                return medico;
            }
        }
        return null;
    }

    public Paciente mostrarIdPaciente(String idPaciente) {
        for (Paciente paciente : listaPacientes) {
            if (paciente.getId().equals(idPaciente)) {
                return paciente;
            }
        }
        return null;
    }
}


