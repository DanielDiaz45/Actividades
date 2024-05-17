import java.util.Scanner;

public class NotaParcial {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    System.out.println("Ingrese la nota del primer parcial: ");  
    int nota = leer.nextInt();

    if (nota>=8)
    {
        System.out.println("Promociona!!");
    }
    else if (nota >4 & nota<=7) {
        System.out.println("Usted aprobo!!");
    }
    else if (nota <4) {
        System.out.println("Usted recursa");
    }



    }

}