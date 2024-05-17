import java.util.Scanner;

public class Propinas {

    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra:");
        double monto = entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de propina:");
        double porcentaje = entrada.nextDouble();
        double total = monto + (monto * porcentaje / 100);
        System.out.println("El total a pagar es: " + total);
        entrada.close();
    }
}
