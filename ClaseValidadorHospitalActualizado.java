package hospital;

import consultas.Consulta;

import java.util.ArrayList;

public class ValidadorHospital {
    public boolean validarDisponibilidadEnFechaConsulta(String fechaDeseada, int numeroConsultorio, ArrayList<Consulta> listaConsultas) {
        for (Consulta consulta : listaConsultas) {
            if (consulta.getFechaHora().equals(fechaDeseada) && numeroConsultorio == consulta.getConsultorio().getNumConsultorio()){
                return false;
            }
        }
        return true;
    }
    public boolean validarDisponibilidadMedico(String fechaDeseada, int idMedico, ArrayList<Consulta> listaConsultas) {
        for (Consulta consulta : listaConsultas) {
            if (consulta.getFechaHora().equals(fechaDeseada) && consulta.getMedico().getId() == idMedico) {
                return false;
            }
        }
        return true;

    }
}
