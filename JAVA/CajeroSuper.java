import java.util.Scanner;

public class CajeroSuper {

    
    public static void main(String[] args) {

    Scanner leer = new Scanner (System.in);
    int MontoTotal = 0;
    int contador = 4;
    while (contador>1) {
        
        System.out.println("Ingrese el monto de su compra:");
        int Monto = leer.nextInt();
        MontoTotal = MontoTotal + Monto; 
        contador--;

    }
    System.out.println("El total de su compra es:" + MontoTotal);

    }   
}