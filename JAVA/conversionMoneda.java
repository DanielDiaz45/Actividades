import java.util.Scanner;

public class conversionMoneda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor, seleccione la moneda origen:");
        System.out.println("1. Dólares");
        System.out.println("2. Euros");
        System.out.println("3. Peso Argentino");
        int monedaOrigen = leer.nextInt();

        System.out.println("Ingrese la cantidad a convertir");
        double cantidad = leer.nextDouble();
        double resultado = 0;

        switch (monedaOrigen) {
            case 1:
                System.out.println("Seleccione la moneda a convertir:");
                System.out.println("1. Euros");
                System.out.println("2. Peso Argentino");
                int monedaDestino = leer.nextInt();
                switch (monedaDestino) {
                    case 1:
                        resultado = cantidad * 0.93;
                        break;
                    case 2:
                        resultado = cantidad * 1040;
                        break;
                    default:
                        System.out.println("Moneda de destino no válida.");
                        return;
                }
                break;
            case 2:
                System.out.println("Seleccione la moneda a convertir:");
                System.out.println("1. Dólares");
                System.out.println("2. Peso Argentino");
                monedaDestino = leer.nextInt();
                switch (monedaDestino) {
                    case 1:
                        resultado = cantidad * 1.07;
                        break;
                    case 2:
                        resultado = cantidad * 1117;
                        break;
                    default:
                        System.out.println("Moneda de destino no válida.");
                        return;
                }
                break;
            case 3:
                System.out.println("Seleccione la moneda de destino:");
                System.out.println("1. Dólares");
                System.out.println("2. Euros");
                monedaDestino = leer.nextInt();
                switch (monedaDestino) {
                    case 1:
                        resultado = cantidad * 0.00096;
                        break;
                    case 2:
                        resultado = cantidad * 0.00089; // 1 peso argentino = 0.00089 euros
                        break;
                    default:
                        System.out.println("Moneda de destino no válida.");
                        return;
                }
                break;
            default:
                System.out.println("Opción de moneda de origen no válida.");
                return;
        }

        System.out.println("Usted recibira: $" + resultado);
        }
}