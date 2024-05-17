

import java.util.Scanner;

public class actividadConVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la temperatura en grados Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        
        // Convertir la temperatura de Celsius a Fahrenheit utilizando la fórmula
        double temperaturaFahrenheit = (9.0 / 5.0) * temperaturaCelsius + 32;
        
        // Mostrar la temperatura convertida en grados Fahrenheit
        System.out.println("La temperatura en grados Fahrenheit es: " + temperaturaFahrenheit);
        
        scanner.close();
    }
}
