import java.util.Random;

public class Producto {
    public int id;
    public String nombre;
    public Double precio;
    public String descripcion;
    public int idcategoria;
    public int stock;
    public Random random = new Random();

    public Producto(String nombre, Double precio, String descripcion, int idcategoria, int stock) {
        this.id = this.random.nextInt(10001);
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.idcategoria = idcategoria;
        this.stock = stock;
    }
    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCategoria() {
        return idcategoria;
    }

    public int getStock() {
        return stock;
    }

    public String mostrarProducto() {
        return String.format("Id: %d, nombre: %s, precio: %.2f, descripción: %s, categoría: %d, stock: %d",
                id,
                nombre,
                precio,
                descripcion,
                idcategoria,
                stock
        );
    }
}
