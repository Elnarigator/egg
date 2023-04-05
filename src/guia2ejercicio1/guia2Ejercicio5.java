/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Rat Carlos
 */
public class guia2Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hast
        //a que la suma de los números introducidos supere el límite inicial.

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un numero limite");
        int limite = leer.nextInt();
        int suma;
        suma = 0;
        //for (int i = 0; i <= limite; i++) {
        while (suma<=limite-1){
        System.out.println("ingrese un numero para sumar");
        int n = leer.nextInt();

        suma += n;
        //while (suma <= limite) {
            System.out.print(" " + suma + " ");

        }
    }

}

