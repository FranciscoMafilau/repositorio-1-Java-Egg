package guía05;


import java.util.Scanner;


/**
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */



public class Guia05Ejercicio06 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese números a la matriz: ");
        int [][]matriz = new int[3][3];
          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 matriz[i][j] =  leer.nextInt();
                 System.out.println("["+matriz[i][j] +"]");
            }
            }System.out.println(" ");

           
            esMagico(matriz);
            
    }

   public static void mostrarMatriz (int [][] matriz){
        
                for (int i = 0; i < 3; i++) {
                     for (int j = 0; j < 3; j++) {
                System.out.print(" [ " +matriz[i][j] +" ] ");
            }
            System.out.println(" ");
                }
    }
   
   
   public static void esMagico (int [][] matriz){
        int sumaFila = 0;
        int sumaColumna = 0;
        int contador = 0;
        for (int i = 0; i < 3; i++) {///para obtener datos de las filas
            for (int j = 0; j < 3; j++) {////para las columnas
                sumaFila += matriz [i][j];////cada dato se almacena y se suma con el dato de la fila
                sumaColumna += matriz [j][i];//////de las columnas
               
            }
            if (esIgual(sumaFila, sumaColumna)){///esta condición se complemta con el metodo esIgual
                contador++;
                if (contador ==3) {///esto es para entrar en la condición
                        System.out.println("es mágico");
                        mostrarMatriz(matriz);
                            }else{
                        sumaFila = 0;
                        sumaColumna  =0;
                                    }
             }else{
                        System.out.println("no es mágico");
                        mostrarMatriz(matriz);
                        return;
                        }
   }
   }



   
   private static boolean esIgual(int sumaFila, int sumaColumna){
    return sumaFila == sumaColumna;
}
}

/*
public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        // Llenar la matriz
        System.out.println("Ingresa los valores para llenar la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        
        // Imprimir la matriz
        System.out.println("El cuadrado ingresado es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
        
        // Verificar si es un cuadrado mágico
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
                if (i == j) {
                    sumaDiagonal1 += matriz[i][j];
                }
                if (i == 2 - j) {
                    sumaDiagonal2 += matriz[i][j];
                }
            }
            if (sumaFila != sumaColumna) {
                System.out.println("No es un cuadrado magico.");
                return;
            }
        }
        if (sumaDiagonal1 != sumaDiagonal2) {
            System.out.println("No es un cuadrado magico.");
            return;
        }
        System.out.println("Es un cuadrado mágico.");
    }

}
*/