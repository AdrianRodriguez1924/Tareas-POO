package consultas;

import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

public class Consulta {

    public int idConsulta;
    public String fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;

    public int getIdConsulta() {
        return idConsulta;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public Consulta(int idConsulta, String fechaHora, Paciente paciente, Medico medico, Consultorio consultorio) {
        this.idConsulta = idConsulta;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;


    }
}
