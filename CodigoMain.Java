import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Mostrar Categorias");
            System.out.println("5. Registrar Categorias");
            System.out.println("6. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if(!inventario.validarExistenciaDeCategorias()){
                        System.out.println("\nNo existen categorias en el sistema");
                        break;
                    }
                    System.out.println("\nSeleccionaste la opción para registrar un producto");

                    System.out.println("Ingresa el nombre del producto");
                    String nombre = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el precio del producto");
                    double precio = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.println("Ingresa la descripción del producto");
                    String descripcion = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el id de la categoría en la cual registraras el producto");
                    int idcategoria = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println("Ingresa el stock del producto");
                    int stock = scanner.nextInt();

                    System.out.println(nombre);

                    Producto producto = new Producto(nombre, precio, descripcion, idcategoria, stock);
                    inventario.registrarProducto(producto);

                    System.out.println("\nProducto registrado correctamente");
                    break;
                case 2:
                    System.out.println("\nSeleccionaste la opción para eliminar un producto");

                    System.out.println("Ingresa el ID del producto: ");
                    int id = scanner.nextInt();

                    inventario.eliminarProducto(id);
                    break;
                case 3:
                    inventario.mostrarProductos();
                    break;
                case 4:
                    System.out.println("\nSeleccionaste la opcion para registrar una categoria");
                    System.out.println("Ingresa el nombre de la categoria: ");
                    String nombreCategoria = scanner.nextLine();
                    Categoria categoria = new Categoria(nombreCategoria);
                    inventario.registrarCategoria(categoria);
                    System.out.println("\nCategoria registrado correctamente");
                    break;
                case 5:
                    inventario.Categorias();
                    break;
                case 6:
                    inventario.CategoriasConProductos();
                case 7:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}