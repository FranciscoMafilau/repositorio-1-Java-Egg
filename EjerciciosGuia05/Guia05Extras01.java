
package eggcursadabackend.EjerciciosGuia05;

import java.util.Scanner;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
*/
public class Guia05Extras01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int sumaVector = 0;
         int[] vector = new int[5];
             for (int i = 0; i < vector.length; i++) {
         System.out.println("Ingrese valores para vector");
            vector[i] = leer.nextInt();
            sumaVector += vector[i];
    }
           
                System.out.println(sumaVector);
            } 
    }

    
