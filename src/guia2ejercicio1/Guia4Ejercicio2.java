package guia2ejercicio1;

import java.util.Scanner;

public class Guia4Ejercicio2 {

    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    int[] numeros = new int[100];

    // Llenar el vector con los 100 primeros números enteros
    for (int i = 0; i < 100; i ++) {
            numeros[i] = i + 1;
    }
     for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
     }
}
}