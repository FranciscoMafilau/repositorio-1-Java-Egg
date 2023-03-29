package eggcursadabackend.EjerciciosGuia05;

import java.util.Scanner;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 */
public class Guia05Extras03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una dimensión para el vector: ");
        int dimensión = leer.nextInt();
         
        int [] vector = new int[dimensión];
        
        rellenarVector(vector);
        
        imprimirVector(vector);
        
    }
    
    public static void rellenarVector(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*10);
            
        }
    }
    
    public static void imprimirVector(int[]vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(" [ "+ vector[i]+ " ] " );
            
            /*
              public static void imprimirVector(int[] vector) {
        for (int j : vector) {
            System.out.print("[" + j + "]");
            */
        }
    }
}

