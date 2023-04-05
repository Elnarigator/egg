//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e
//indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
package guia2ejercicio1;

import java.util.Scanner;

public class Guia3Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String operar = nombre;
    }

    public static String nombre(String nombre1) {
        Scanner leer = new Scanner(System.in);
        boolean seguirpidiendo = true;
        while (seguirpidiendo) {
            System.out.println("Ingrese el nombre");
            String nom = leer.next();
            System.out.println("Ingrese la edad");
            int edad = Integer.parseInt(leer.nextLine());
            System.out.println("Quiere ingresar mas datos? , escriba No para finalizar");
            String opcion = leer.next();

            if (opcion.equalsIgnoreCase("No")) {
                seguirpidiendo = false;
            }
        }
    }
}
