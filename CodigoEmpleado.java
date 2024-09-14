//Main
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        System.out.println("\n ** SALARIO DE EMPLEADO ** ");
        System.out.println("El salario del empleado es: " + empleado.calcularSalario(3800.0));
        System.out.println("El salario del empleado es: " + empleado.calcularSalario(3800.0, 920.42));
        System.out.println("El salario del empleado es: " + empleado.calcularSalario(3800.0, 730.3, 3));
    }
}

//Empleado
public class Empleado {
    public double sueldoBase;
    public double bonificacion;
    public int horasExtra;

    public double calcularSalario(double sueldoBase){
        return sueldoBase;
    }
    public double calcularSalario(double sueldoBase, double bonificacion){
        return sueldoBase + bonificacion;
    }
    public double calcularSalario(double sueldoBase, double bonificacion, int horasExtra){
        horasExtra = horasExtra*20;
        return sueldoBase + bonificacion + horasExtra;
    }
}
