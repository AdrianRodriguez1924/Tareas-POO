//Main
public class Main {
    public static void main(String[] args) {
        Reactangulo rectangulo = new Reactangulo(2.15, 3.25);

        System.out.println("La base del rectangulo es: " + rectangulo.Base() + " y su altura es: " + rectangulo.Altura());

        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
    }
}

//Rectangulo
public class Reactangulo {
    Double base;
    Double altura;

    public Reactangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double Base() {
        return base;
    }

    public void Base(Double base) {
        this.base = base;
    }

    public Double Altura() {
        return altura;
    }

    public void Altura(Double altura) {
        this.altura = altura;
    }

    public Double calcularArea() {
        Double area = (base*altura);
        return area;
    }
    public Double calcularPerimetro() {
        Double perimetro = (base+altura)*2;
        return perimetro;
    }
}
