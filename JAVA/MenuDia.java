import java.util.Scanner;

public class MenuDia {

    public static void main(String[] args) {
    
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese el dia de la semana: ");
        System.out.println("1. Lunes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sabado");
        System.out.println("7. Domingo");
        int Menu = Leer.nextInt();

        
        switch (Menu) {
            case 1:
               System.out.println("El menú de hoy es ravioles a la bolognesa");
                break;
            case 2:
                System.out.println("El menú de hoy es milanesa a caballo");
                break;
            case 3:
                System.out.println("El menú de hoy es asado banderita");
                break;
            case 4:
                System.out.println("El menú de hoy es milanesa con ensalada cesar");
                break;
            case 5:
                System.out.println("El menú de hoy es guiso de arroz");
                break;
            case 6:
                System.out.println("El menú de hoy es ñoquis con salsa rosa");
                break;
            case 7:
                System.out.println("El menú de hoy es hamburguesas con puré");
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
                break;
        
            }
            

            

    

            

}

}