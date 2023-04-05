//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
//La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
package guia2ejercicio1;

import java.util.Scanner;

public class Guia3Ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        System.out.println("Elija una opcion");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El resultado es " + suma(num1, num2));
                break;
            case 2:
                System.out.println("El resultado es " + resta(num1, num2));
                break;
            case 3:
                System.out.println("El resultado es " + multi(num1, num2));
                break;
            case 4:
                System.out.println("El resultado es " + divi(num1, num2));
        }
    }

    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static int multi(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;

    }

    public static int divi(int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;

    }

    public static int resta(int num1, int num2) {

        {
            int resultado = num1 - num2;
            return resultado;
        }

    }
}
