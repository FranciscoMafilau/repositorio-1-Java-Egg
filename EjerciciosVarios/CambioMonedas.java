
package eggcursadabackend.EjerciciosVarios;

import java.util.Scanner;


public class CambioMonedas {
    public static void main(String[] args) {
        
    while (true){
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 - Pesos Argentinos a Dolares\n");
            System.out.println("2 - Pesos Chilenos a Dolares\n");
            System.out.println("3 - Salir");
            
            System.out.println("ingrese una opción:");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);
            
            switch(opcion){
                case '1':
                    convertir(162, "pesos argentinos");
                    break;
                case '2':
                    convertir(1.68, "pesos chilenos");
                    break;
                case '3': System.out.println("cerrando progama");
                break;
                default:
                    System.out.println("opción incorrecta");
                    break;
                    
            }
    }
    }
            
            
         
    static void convertir(double valorDolar, String pais){    ////función
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad pesos: ");
        double cantidadMoneda = leer.nextDouble();
        
        double dolares = cantidadMoneda / valorDolar;
        
        dolares = (double) Math.round(dolares*100d)/100;
        System.out.println("---------------------------------");
        System.out.println("tienes U$S:" +dolares+ "dólares");
        System.out.println("---------------------------------");
    }
}

