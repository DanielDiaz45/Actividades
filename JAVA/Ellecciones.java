import java.util.Scanner;


public class Ellecciones {

    public static void main(String[] args) {
            int voto1 = 0;
            int voto2 = 0;
            int voto3 = 0;
            int TotalVotos = 0;   
            double porcentaje1 = 0;
            double porcentaje2 = 0;
            double porcentaje3 = 0;
        Scanner leer = new Scanner (System.in);

    System.out.println("Ingrese los votos del partido A");
    voto1 = leer.nextInt();
    System.out.println("Ingrese los votos del partido B");
    voto2 = leer.nextInt();
    System.out.println("Ingrese los votos del partido C");
    voto3 = leer.nextInt();

    TotalVotos = voto1 + voto2 + voto3;
    porcentaje1 = (voto1 * 100) / TotalVotos;
    System.out.println("La cantidad de votos del partido A es: " + porcentaje1);
    porcentaje2 = (voto2 * 100) / TotalVotos;
    System.out.println("La cantidad de votos del partido B es: " + porcentaje2  );
    porcentaje3 = (voto3 * 100) / TotalVotos;
    System.out.println("La cantidad de votos del partido C es: " + porcentaje3 );
    System.out.println("El total de votos es: " + TotalVotos);

        if (voto1>voto2 && voto1>voto3) {
            System.out.println("el partido A gana las elecciones con el %" + porcentaje1 + "de los votos");
             
        }  else if  (voto2>voto1 && voto2>voto3) {
            System.out.println("el partido B gana las elecciones con el %" + porcentaje2 + "de los votos");

        } 
        else  {
            System.out.println("el partido C gana las elecciones con el %" + porcentaje3 + "de los votos");
            
        } 


        }
    }


