
package eggcursadabackend.EjerciciosGuia01;

import java.util.Scanner;

/**
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
public class Ejercicio004 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura actual de su ciudad: ");
        int temperatura = leer.nextInt();
        
        int f = 32 + (9*temperatura/5);
        
        System.out.println("El equivalente en grados Fahrenheit es :" + f);
        
    }
}

