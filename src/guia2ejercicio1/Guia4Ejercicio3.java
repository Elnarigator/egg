package guia2ejercicio1;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Guia4Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
         */

        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int vector[] = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(5);
            System.out.println("Vector: " + Arrays.toString(vector));
        }
        System.out.println("Ingrese el numero a buscar en el vector");
        int numero = leer.nextInt();
        int indice = -1;
        for (int i = 0; i < n; i++) {
            if (vector[i] == numero) {
                indice = i;
                break;

                if (indice == -1) {
                    System.out.println("El número no se encuentra en el vector");
                } else {
                    System.out.println("El número se encuentra en el índice " + indice);

                }
            }

        }
    }
}
