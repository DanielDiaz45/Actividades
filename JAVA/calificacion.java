import java.util.Scanner;

public class calificacion {

    public static void main(String[] args) {


        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el numero de esudiantes: ");
        int estudiantes = leer.nextInt();

        if (estudiantes <3) {
            System.out.println("El número mínimo de estudiantes es 3.");
            return;
        }
        for (int i = 1; i<=estudiantes; i++) {
            System.out.println("Ingrese la calificación del estudiante " + i + ": ");
            int calificacion = leer.nextInt();
            if (calificacion <0 || calificacion >10) {
                System.out.println("La calificación debe estar entre 0 y 100.");
                return;
            }
        
            if (calificacion >= 6) {
                System.out.println("El estudiante " + i + " aprobó.");
            } else {
                System.out.println("El estudiante " + i + " reprobó.");
            }
        }
    }
}