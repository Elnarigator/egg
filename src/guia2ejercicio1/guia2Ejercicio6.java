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
public class guia2Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla 
el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el 
usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
         */
        Scanner leer = new Scanner(System.in);
       boolean resp = false;
        while (!resp) { 
        System.out.println("Ingrese un numero");
        int n1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int n2 = leer.nextInt();
        System.out.println("Ahora ingrese que operacion quiere realizar");
        //boolean resp = false;
        //while (!resp) {
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        int opcion = leer.nextInt();

        
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numero es " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("La division entre los numeros es " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir?");
                    String respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("s")){
                        resp=true;
                    }
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    }
            }
        }
        
    }
