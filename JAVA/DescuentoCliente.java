import java.util.Scanner;

public class DescuentoCliente {

    public static void main(String[] args) {
     
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el precio del producto
        System.out.println("Ingrese el precio del producto:");
        double precioProducto = leer.nextDouble();
        
        // Solicitar al usuario que ingrese el tipo de cliente (1 para a, 2 para b, 3 para c)
        System.out.println("Ingrese el tipo de cliente (1 para a, 2 para b, 3 para c):");
        int tipoCliente = leer.nextInt();
        
        // Validar el tipo de cliente y calcular el descuento
        double descuento = 0;
        switch (tipoCliente) {
            case 1:
                descuento = 10;
                break;
            case 2:
                descuento = 15;
                break;
            case 3:
                descuento = 20;
                break;
            default:
                System.out.println("Tipo de cliente no válido.");
                // Salir del programa si el tipo de cliente no es válido
                System.exit(0);
        }
        
        // Calcular el precio con descuento
        double precioConDescuento = precioProducto - (precioProducto * descuento / 100);
        
        // Mostrar el precio con descuento en pantalla
        System.out.println("El precio con descuento para el cliente tipo " + tipoCliente + " es: " + precioConDescuento);
        
        // Cerrar el objeto Scanner
        leer.close();
}
}