
package eggcursadabackend.EjerciciosGuia01;

import java.util.Scanner;

/**
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
* el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
public class Ejercicio005 {
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num1 = leer.nextInt();
        
        System.out.println("El doble del número es: " +num1*2);
        System.out.println("El triple de número es: " + num1*3);
        System.out.println("Su raíz cuadrada es: " + Math.sqrt(num1));
    }
}

