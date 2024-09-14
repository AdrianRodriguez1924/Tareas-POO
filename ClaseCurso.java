public class Curso {
    String nombreCurso;
    String codigoCurso;
    String instructor;

    // Constructor
    public Curso(String nombreCurso, String codigoCurso, String instructor) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.instructor = instructor;
    }

    // Métodos getter y setter (opcionales)
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    // Método para mostrar la información del curso
    public void mostrarInfoCurso() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Código: " + codigoCurso);
        System.out.println("Instructor: " + instructor);
    }
}
