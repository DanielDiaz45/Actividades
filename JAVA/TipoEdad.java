import java.util.Scanner;

public class TipoEdad {

    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);

        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();
        if (edad <= 18) {
            System.out.println("Usted es menor de edad");
        }
        else if (edad >=18) {
            System.out.println("Usted es mayor de edad");
        }
        else if (edad >=65)
        System.out.println("Usted es adulto mayor");
            
    }

}


    