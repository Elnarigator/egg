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
public class Guia2Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
        //Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de elementos");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
