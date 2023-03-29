package guía05;


import java.util.Scanner;

/**
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Guia05Ejercicio05 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int [] [] matriz = new int[3] [3];
      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    System.out.print(" [ " +matriz[i] [j] +" ] ");
                    matriz[i][j] = entrada.nextInt();             
            }
         }
        
        System.out.println("\n matriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [ " +matriz[i][j] +" ] ");
            }
            System.out.println(" ");
        }
        
     
          for (int i = 0; i < 3; i++) {
               for (int j = 0; j < i; j++) { //ponemos "i" para sacarla de la diagonal principal
                   int aux = matriz [i][j]; //creo una auxiliar para trabajar la transposición
                   matriz [i][j] = matriz [j][i];
                   matriz [j][i] = aux;
               }
           }
           
                 System.out.println("\n la matríz traspuesta es: ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(" [ "+matriz [i][j]+ " ] ");
                        }
                        System.out.println(" ");
                    }
                    
                      boolean respuesta = esAntiSimetrica(matriz);
                      System.out.println(respuesta);
    }
    
                    
                 public static boolean esAntiSimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        if (filas != columnas) {
            return false; // Si no es cuadrada, no es anti simétrica
        }
        int[][] traspuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j]; // Obtenemos la traspuesta de la matriz
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -traspuesta[i][j]) {
                    return false; // Si la matriz no es igual al negativo de su traspuesta, no es anti simétrica
                }
            }
        }
        return true;
                        }
}
