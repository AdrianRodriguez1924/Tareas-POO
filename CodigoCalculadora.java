//Main
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("\n--CALCULADORA DE IMPUESTOS--");
        System.out.println("Los impuestos son:"+ calculadora.calcularImpuestos(20000));
        System.out.println("Los impuestos son:"+ calculadora.calcularImpuestos(20000,23));
        System.out.println("Los impuestos son:"+ calculadora.calcularImpuestos(9000,42,1500));
    }
}

//Calculadora
public class Calculadora {

    public int ingresos;
    public double porcentajeImpuestos;
    public double dividendos;
    public double exencion;

    public double calcularImpuestos(int ingresos) {
        return ingresos + 0.15;
    }

    public double calcularImpuestos(double ingresos, double porcentajeImpuestos) {
        return ingresos * (porcentajeImpuestos / 100);
    }

    public double calcularImpuestos( double dividendos, double porcentajeImpuestos, double exencion) {
        double impuestos= dividendos * (porcentajeImpuestos / 100);
        if(impuestos>exencion){
            return impuestos;
        }else {
            return 0.0;
        }
    }
}
