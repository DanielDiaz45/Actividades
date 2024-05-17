import java.util.Scanner;

public class AreaTriangulo {

public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);


    System.out.println("ingrese la base");
    double ladoA = entrada.nextDouble();
    System.out.println("ingrese la altura");
    double ladoB = entrada.nextDouble();
    
    double area = (ladoA * ladoB) / 2.0;
    System.out.println("su area es: " + area);



}

}