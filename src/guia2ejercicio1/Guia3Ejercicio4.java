//Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos 
//indique si es o no un número primo, debe devolver true si es primo, sino false.
package guia2ejercicio1;

import java.util.Scanner;

public class Guia3Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = leer.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}


