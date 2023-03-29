package guía05;


import java.util.Arrays;


/**
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
public class Guia05Ejercicio07 {
    public static void main(String[] args) {
        int [][] matrizM = new int [10] [10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    matrizM [i][j] =(int)(Math.random()*99+1);
                    System.out.print(" [ " +matrizM [i][j]+ " ] " );
                }
                System.out.println(" ");
        }
            System.out.println("*****************************");
    int [][] matrizP = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = (int)(Math.random()*99+1);
                System.out.print(" [ " +matrizP [i][j]+ " ] ");
            }
            System.out.println(" "); 
        }
        if (Arrays.deepEquals(matrizM, matrizP)){
             System.out.println("Son matrices iguales");
        }else{
            System.out.println("Son matrices diferentes");
          }
    }
}
    
           
