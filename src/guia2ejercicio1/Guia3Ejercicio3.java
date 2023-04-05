//Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
//estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
//que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
package guia2ejercicio1;
import java.util.Scanner;
public class Guia3Ejercicio3 {

    public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
        System.out.print("Ingrese la cantidad de euros a convertir: ");
        double cantidadEuros = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese la moneda a la que desea convertir (dólares, yenes o libras): ");
        String moneda = scanner.nextLine();

        convertirMoneda(cantidadEuros, moneda);
    }

    private static void convertirMoneda(double cantidadEuros, String moneda) {
        double tasaCambio = 0.0;
        String simboloMoneda = "";
        switch (moneda.toLowerCase()) {
            case "dólares":
                tasaCambio = 1.18;
                simboloMoneda = "$";
                break;
            case "yenes":
                tasaCambio = 130.94;
                simboloMoneda = "¥";
                break;
            case "libras":
                tasaCambio = 0.85;
                simboloMoneda = "£";
                break;
            default:
                System.out.println("La moneda ingresada no es válida.");
                return;
        }

        double cantidadConvertida = cantidadEuros * tasaCambio;
        System.out.printf("%.2f euros equivalen a %s%.2f %s.%n",
                cantidadEuros, simboloMoneda, cantidadConvertida, moneda);
    }
}
