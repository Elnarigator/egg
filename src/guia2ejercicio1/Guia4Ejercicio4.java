package guia2ejercicio1;

import java.util.Scanner;
import java.util.Random;

public class Guia4Ejercicio4 {
//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();

        int vector[] = new int[n];
        for (int i = 0; i < 5; i++) {
            vector[i] = (int) (Math.random() * 20);
        }
        int cant1Digitos = 0;
        int cant2Digitos = 0;
        int cant3Digitos = 0;
        int cant4Digitos = 0;
        int cant5Digitos = 0;
        for (int i = 0; i < n; i++) {
            int numero = vector[i];
            int cantidadDigitos = 0;

            while (numero != 0) {
                cantidadDigitos++;
                numero /= 10;
            }

            if (cantidadDigitos == 1) {
                cant1Digitos++;
            } else if (cantidadDigitos == 2) {
                cant2Digitos++;
            } else if (cantidadDigitos == 3) {
                cant3Digitos++;
            } else if (cantidadDigitos == 4) {
                cant4Digitos++;
            } else if (cantidadDigitos == 5) {
                cant5Digitos++;
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de números con 1 dígito: " + cant1Digitos);
        System.out.println("Cantidad de números con 2 dígitos: " + cant2Digitos);
        System.out.println("Cantidad de números con 3 dígitos: " + cant3Digitos);
        System.out.println("Cantidad de números con 4 dígitos: " + cant4Digitos);
        System.out.println("Cantidad de números con 5 dígitos: " + cant5Digitos);
    }
}

