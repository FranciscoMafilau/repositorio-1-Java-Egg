
package eggcursadabackend.EjerciciosGuia01;

import java.util.Scanner;

/**
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
 
 */
public class Ejercicio003 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        System.out.println("la frase en mayúsculas es: " +frase.toUpperCase());
        
        System.out.println("la frase en minusculas es: " + frase.toLowerCase());
    }
}

