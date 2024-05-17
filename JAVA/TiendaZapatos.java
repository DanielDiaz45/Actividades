import java.util.Scanner;

public class TiendaZapatos {

    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
        System.out.println("Cuantos pares va a comprar");
        int pares = leer.nextInt();

    int ValorZapato = 80;
    int descuento = 0;
    if (pares <10)
    {
        descuento=0;
        System.out.println("Su descuento es del 0%:");
    }
    else if (pares >=10 && pares<=20) {
        descuento=10;
        System.out.println("Su descuento es del %"+descuento);
    }
    else if (pares > 20 && pares <30) {
        descuento=20;
        System.out.println("Su descuento es del %"+descuento);
    }
    else if ( pares >30) {
        descuento = 40;
        System.out.println("Su descuento es del %"+descuento);
    }
     
    int MontoTotal = ValorZapato * pares ;
    int TotalDescuento = MontoTotal - (MontoTotal * descuento / 100);
    System.out.println("el monto a pagasr es: $" + TotalDescuento);
    }

}






