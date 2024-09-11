public class Coche {
    public String marca;
    public String modelo;
    public int año;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;

    }

    public String mostrarInformacion(){
        return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAño: " + this.año;

    }
    public int calcularEdadCoche(){
        int edad;
        edad = 2024-this.año;
        return edad;
    }
}
