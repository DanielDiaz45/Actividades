import java.util.ArrayList;
import java.util.Scanner;

class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(int id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad;
    }
}

public class inventario {
    private static ArrayList<Producto> inventario = new ArrayList<>();
    private static int siguienteId = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificarProducto();
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("---- Menú de Inventario ----");
        System.out.println("1. Agregar producto");
        System.out.println("2. Modificar producto");
        System.out.println("3. Mostrar productos");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad del producto: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        Producto nuevoProducto = new Producto(siguienteId++, nombre, precio, cantidad);
        inventario.add(nuevoProducto);
        System.out.println("Producto agregado con éxito.");
    }

    private static void modificarProducto() {
        System.out.print("Ingrese el ID del producto a modificar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            System.out.print("Ingrese el nuevo nombre del producto: ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Ingrese el nuevo precio del producto: ");
            double nuevoPrecio = scanner.nextDouble();
            System.out.print("Ingrese la nueva cantidad del producto: ");
            int nuevaCantidad = scanner.nextInt();
            scanner.nextLine();

            producto.setNombre(nuevoNombre);
            producto.setPrecio(nuevoPrecio);
            producto.setCantidad(nuevaCantidad);
            System.out.println("Producto modificado con éxito.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static Producto buscarProductoPorId(int id) {
        for (Producto producto : inventario) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }

    private static void mostrarProductos() {
        if (inventario.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            System.out.println("---- Lista de Productos ----");
            for (Producto producto : inventario) {
                System.out.println(producto);
            }
        }
    }
}
