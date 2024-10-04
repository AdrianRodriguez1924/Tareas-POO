package usuarios.medicos.administradores;

import usuarios.medicos.Rol;
import usuarios.medicos.Usuario;

import java.time.LocalDate;

public class Administrador extends Usuario {
    public int sueldo;
    public String RFC;
    public int aniosTrabajados;

    public Administrador(String id, String nombre, String apellido, LocalDate fechaNacimiento, String telefono, int sueldo,String RFC, int aniosTrabajados) {
        super(id, nombre, apellido, fechaNacimiento, telefono, Rol.ADMIN);
        this.sueldo = sueldo;
        this.RFC = RFC;
        this.aniosTrabajados = aniosTrabajados;
    }
    
    public int getSueldo() {
        return sueldo;
    }
    public String getRFC() {
        return RFC;
    }
    public int getAniosTrabajados() {
        return aniosTrabajados;
    }
}
