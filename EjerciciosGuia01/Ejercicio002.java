
package eggcursadabackend.EjerciciosGuia01;

import java.util.Scanner;

/**
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 
 */
public class Ejercicio002 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        
        System.out.println("Bienvenido  " + nombre + " que tengas buen día");
        
    }
}

