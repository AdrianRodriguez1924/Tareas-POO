package pacientes;

import java.time.LocalDate;

public class Paciente {

    public String id;
    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;
    public String tipoSangre;
    public char sexo;
    private String telefono;

    public Paciente(String id, String nombre, String apellido, LocalDate fechaNacimiento, String tipoSnagre, char sexo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSnagre;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public String mostrarDatos() {
        String datos = String.format("Id. %s  |  Nombre: %s  |  Apellidos: %s  |  Fecha de Nacimiento: %s  |  Tipo de Sangre: %s  |  Sexo: %s  |  Telefono: %s", id, nombre, apellido, fechaNacimiento, tipoSangre, sexo, telefono);
        return datos;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public char getSexo() {
        return sexo;
    }

    public String getTelefono() {
        return telefono;
    }
}
