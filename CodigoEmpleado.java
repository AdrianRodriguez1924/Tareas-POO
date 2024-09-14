public class Empleado {
    public double sueldoBase;
    public double bonificacion;
    public int horasExtra;

    public Empleado() {
    }

    public double calcularSalario(double sueldoBase) {
        return sueldoBase;
    }

    public double calcularSalario(double sueldoBase, double bonificacion) {
        return sueldoBase + bonificacion;
    }

    public double calcularSalario(double sueldoBase, double bonificacion, int horasExtra) {
        horasExtra *= 20;
        return sueldoBase + bonificacion + (double)horasExtra;
    }
}
