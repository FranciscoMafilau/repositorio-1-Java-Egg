package eggcursadabackend.EjerciciosGuia02;


import java.util.Scanner;

/**
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.

*/

public class Guia202JavaEgg {
    public static void main(String[] args) {
        
        String frase;
        String frase1= "eureka";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        
        if (frase.equals(frase1)){
            System.out.println("correcto");
            
        } else {
            System.out.println("incorrecto");
        }
    }
}
