
package guia2ejercicio1;

import java.util.Scanner;

public class Guia4Ejercicio1 {

    public static void main(String[] args) {
   Scanner leer = new Scanner (System.in);
        String equipo[] = new String [10];
        
        for (int f = 0 ;  f< 10; f++){
            System.out.println("Ingresa los nombres de los compañeros de clase");
            String nombres= leer.next();
        }
        for (int f = 0 ;  f< 10; f++){
            System.out.println("Los nombres de mis compañeros son: "+f);
        }
        
    }
    
    
}
