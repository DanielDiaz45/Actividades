

import java.util.Scanner;

public class CalculadoraDescuento {

    


    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);


        System.out.println("Ingrese el precio del producto: ");
        double precio = leer.nextInt();
        System.out.println("Ingrese su categoria de cliente: A , B , C");
        int categoria = leer.nextInt();
        switch (categoria){
            case 1:
            double total = precio - (precio * 10 / 100);
            System.out.println("su descuento es del 10%, el monto a pagasr es: $" + total);
            break;
            case 2:
            double total2 = precio - (precio * 15 / 100);
            System.out.println("su descuento es del 15%, el monto a pagar es: $" + total2);
            break;
            case 3:
            double total3 = precio - (precio * 20 / 100);
            System.out.println("su descuento es del 20%, el monto a pagar es: $" + total3);
            break;


        }
    

        





    }
}

