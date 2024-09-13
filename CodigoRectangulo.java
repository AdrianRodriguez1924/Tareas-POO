public class Main {
    public static void main(String[] args) {
        Reactangulo rectangulo = new Reactangulo(2.15, 3.25);

        System.out.println("La base del rectangulo es: " + rectangulo.Base() + " y su altura es: " + rectangulo.Altura());

        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
    }
}