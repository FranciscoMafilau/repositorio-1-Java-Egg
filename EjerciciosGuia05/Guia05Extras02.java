
package guía05;

import java.util.Arrays;
import java.util.Scanner;



public class Guia05Extras02 {

    /**
     * Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
    
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[2];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese valores para vector");
            vector[i] = leer.nextInt();
        }
        int[] vector2 = new int[2];
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Ingrese valores para vector");
            vector2[i] = leer.nextInt();
        }
        if (Arrays.equals(vector, vector2)) 
            System.out.println("los vectores son iguales"); 
        else
            System.out.println("los vectores no son iguales"); 
    }
 }

