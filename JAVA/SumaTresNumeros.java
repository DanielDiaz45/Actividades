import java.util.Scanner;

public class SumaTresNumeros{
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int [] posicion =  { 10, 65 , 38, 75, 15};
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int suma;
        int i =0;

    System.out.println("ingrese el primer numero");
    num1 = leer.nextInt();
    System.out.println("ingrese el segundo numero");
    num2 = leer.nextInt();
    System.out.println("ingrese el tercer numero");
    num3 = leer.nextInt();

    suma = (num1 + num2 +  num3);

 boolean Resultado = true;
    while (i<posicion.length && Resultado) {
    if (suma == posicion[i] ){
    Resultado= false;
    
    i++;
}

if (Resultado==false) {
    System.out.println("Existe coincidencia");

} else{
    System.out.println("no hay coincidencia");

    }
        
}


}

}


