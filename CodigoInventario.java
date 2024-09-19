import java.util.ArrayList;

public class Inventario {
    public ArrayList<Producto> listaProductos = new ArrayList<>();
    public ArrayList<Categoria> listaCategorias = new ArrayList<>();

    public void registrarProducto(Producto producto) {
        this.listaProductos.add(producto);
    }
    public void registrarCategoria(Categoria categoria) {
        this.listaCategorias.add(categoria);
    }

    public void eliminarProducto(int idProductoEliminar) {
        int longitudOriginal = this.listaProductos.size(); // 3

        this.listaProductos.removeIf((producto) -> producto.getId() == idProductoEliminar);

        if (longitudOriginal != this.listaProductos.size()) {
            System.out.println("Se eliminó el prodcuto con el ID: " + idProductoEliminar);
        } else {
            System.out.println("No existe un producto con el ID: " + idProductoEliminar);
        }
    }

    public void mostrarProductos() {
        System.out.println("\n*** PRODUCTOS EN EL SISTEMA ***");

        if (this.listaProductos.isEmpty()) {
            System.out.println("\nNo existen productos en el sistema");
            return;
        }

        int iterador = 1;
        for (Producto producto : this.listaProductos) {
            System.out.println("\nEste es el producto: " + iterador);
            System.out.println(producto.mostrarProducto());
            iterador++;
        }
    }

    public void Categorias() {
        System.out.println("\n*** CATEGORÍAS EN EL SISTEMA ***");

        if (this.listaCategorias.isEmpty()) {
            System.out.println("\nNo existen categorías en el sistema");
            return;
        }

        int iterador = 1;
        for (Categoria categoria : this.listaCategorias) {
            System.out.println("\nCategoría: " + iterador);
            categoria.imprimirCategoria();
            iterador++;
        }
    }

    public void CategoriasConProductos() {
        System.out.println("\n*** CATEGORÍAS EN EL SISTEMA ***");

        if (this.listaCategorias.isEmpty()) {
            System.out.println("\nNo existen categorías en el sistema");
            return;
        }

        for (Categoria categoria : this.listaCategorias) {
            categoria.imprimirCategoriaConProductos();
        }
    }

    public boolean validarExistenciaDeCategorias(){
        return !this.listaCategorias.isEmpty();
    }
}
