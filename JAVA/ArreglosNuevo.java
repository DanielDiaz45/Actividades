import java.util.Scanner;


public class ArreglosNuevo {


public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    System.out.println("ingrese un numero" );
    System.out.println("");
    int nuemroIngresado = leer.nextInt();
    int  valor = 0;
    int[] numeros = {10, 65, 38, 75, 15};
    String[] nombres = {"juan" , "ana", "luis", "florencia", "pedro"};
    int respuesta= 0; 
    int numero= 0;
    String nombre= "";
int i = 0;
boolean confirmacion = true;
    while (i < numeros.length && confirmacion) {
        if (nuemroIngresado==numeros[i]) {
            confirmacion=false;
            numero = numeros[i];
            nombre = nombres[i];
            }
            i++;
    }
    if (confirmacion==false){
        System.out.println("el numero está dentro del arreglo");
        System.out.println("numero: " + numero + ",nombre: " + nombre);
    }
    else {
        System.out.println("eNo hay coincidencia");
    }


}
}
