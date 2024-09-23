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


    public void mostrarIdPaciente(String idPaciente) {
        Optional<Paciente> pacienteEncontrado = this.listaPacientes.stream().filter(paciente -> paciente.getId().equals(idPaciente)).findFirst();

        if (pacienteEncontrado.isPresent()) {
            System.out.println(pacienteEncontrado.get().mostrarDatos());
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


    public void mostrarIdMedico(int idMedico) {
        Optional<Medico> medicoEncontrado = this.listaMedicos.stream().filter(medico -> medico.getId() == (idMedico)).findFirst();

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


    public void mostrarIdConsultorio(int idConsultorio) {
        Optional<Consultorio> consultorioEncontrado = this.listaConsultorios.stream().filter(consultorio -> consultorio.getId() == (idConsultorio)).findFirst();

        if (consultorioEncontrado.isPresent()) {
            System.out.println(consultorioEncontrado.get().mostrarDatosConsultorio());
        } else {
            System.out.println("No se encontro el paciente");
        }
    }
}


