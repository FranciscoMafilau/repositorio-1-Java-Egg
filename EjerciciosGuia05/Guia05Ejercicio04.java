package guía05;


import java.util.Scanner;



/**
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
public class Guia05Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int [] [] matriz = new int[4] [4];
      
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                       matriz[i][j]= (int)(Math.random()*9+1);
                    System.out.print(" [ " +matriz[i] [j] +" ] ");
                    
            }
               }
        
        System.out.println("\n matriz original");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" [ " +matriz[i][j] +" ] ");
            }
            System.out.println(" ");
        }
        
           for (int i = 0; i < 4; i++) {
               for (int j = 0; j < i; j++) { //ponemos "i" para sacarla de la diagonal principal
                   int aux = matriz [i][j]; //creo una auxiliar para trabajar la transposición
                   matriz [i][j] = matriz [j][i];
                   matriz [j][i] = aux;
               }
           }
           
                 System.out.println("\n la matríz traspuesta es: ");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print(" [ "+matriz [i][j]+ " ] ");
                        }
                        System.out.println(" ");
                    }
           }
                    
                    
                }
    
