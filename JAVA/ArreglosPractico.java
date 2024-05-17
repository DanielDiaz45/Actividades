public class ArreglosPractico {

    public static void main(String[] args) {

int record=0;
int [] numeros = new int [5];
        numeros[0] = 22;
        numeros[1] = 76;
        numeros[2] = 49;
        numeros[3] = 56;
        numeros[4] = 100;

       

    record = numeros [0];
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] > record) {
            record = numeros[i];
        }
    }
    System.out.println("el numero mayor es: " + record); 



}
}
