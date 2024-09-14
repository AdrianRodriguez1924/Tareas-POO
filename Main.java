public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Matemáticas", "MAT101", "Dr. Ramírez");
        Curso curso2 = new Curso("Física", "FIS202", "Dra. Gómez");
        Curso curso3 = new Curso("Programación", "PRO303", "Ing. Pérez");

        Estudiante estudiante1 = new Estudiante("Juan Pérez", "STU001");
        Estudiante estudiante2 = new Estudiante("María López", "STU002");

        estudiante1.agregarCurso(curso1);
        estudiante1.agregarCurso(curso3);

        estudiante2.agregarCurso(curso2);
        estudiante2.agregarCurso(curso3);

        System.out.println("Información de los estudiantes:");
        estudiante1.mostrarInformacion();
        System.out.println("-----------------------------");
        estudiante2.mostrarInformacion();
    }
}