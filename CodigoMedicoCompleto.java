package medicos;

import java.time.LocalDate;

public class Medico {

    public String id;
    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;
    private String telefono;
    private String rfc;

    public Medico(String id, String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String rfc) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.rfc = rfc;
    }

    public String mostrarDatosMedico() {
        String datos = String.format("Id. %d  |  Nombre: %s  |  Apellidos: %s  |  Fecha de Nacimiento: %s  |  Telefono: %s  | RFC: %s", id, nombre, apellido, fechaNacimiento, telefono, rfc);
        return datos;
    }

    public static void add(Medico medico) {
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

    public String getTelefono() {
        return telefono;
    }

    public String getRfc() {
        return rfc;
    }
}
