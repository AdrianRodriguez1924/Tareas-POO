import java.util.ArrayList;

public class Estudiante {
    String nombre;
    String idEstudiante;
    ArrayList<Curso> cursos;

    public Estudiante(String nombre, String idEstudiante) {
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
        this.cursos = new ArrayList<>(); // Inicializamos la lista de cursos
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

   
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("ID: " + idEstudiante);
        System.out.println("Cursos inscritos:");
        for (Curso curso : cursos) {
            curso.mostrarInfoCurso();
            System.out.println();
        }
    }
}
