

import java.util.Scanner;


public class PrimerProyecto {

    public static void main(String[] args) {
        
Scanner olga = new Scanner (System.in);

        System.out.println("ingrese el primer numero");
        int a = olga.nextInt();
        System.out.println("ingrese el segundo numero");
        int b = olga.nextInt();
        System.out.println("ingrese el tercer numero");        
        int c = olga.nextInt();
        
        double promedio = (a+b+c)/3.0;
        System.out.println("su promedio es: " + promedio);

        olga.close();
                }
} 


