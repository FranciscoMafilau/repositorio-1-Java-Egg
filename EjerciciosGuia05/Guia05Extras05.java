package eggcursadabackend.EjerciciosGuia05;

import java.util.Scanner;

/**
 * Realizar un programa que llene una matriz de tamaño NxM con valores
 * aleatorios y muestre la suma de sus elementos.
 */
public class Guia05Extras05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingresa la cantidad de filas y columnas de la matriz");
        int N = leer.nextInt();
        int M = leer.nextInt();
        int[][] matriz = new int[N][M];
        
        rellenarMatriz(matriz);
        
        mostrarMatriz(matriz);
        
        System.out.println("la suma de los elementos de la matriz es : " + sumarMatriz(matriz));
    }

    public static void rellenarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {///devuelve cantidad de filas
         for (int j = 0; j < matriz[0].length; j++) {
               fila [j]  = (int)(Math.random()*10);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            String aux = "";
            for (int elemento : fila) { ///vamos a tomar de a un elemento de la matriz
                aux +=  "[" + elemento + "]";
            }
            System.out.println(aux);
        }
    }
    
        
public static int sumarMatriz(int [][] matriz){
    int suma = 0; 
    for (int[] fila : matriz) {
         for (int elemento : fila) {
             suma += elemento;
             }
}
        return suma;
}
}
