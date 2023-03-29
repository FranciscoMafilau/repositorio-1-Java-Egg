package eggcursadabackend.EjerciciosGuia05;

import java.util.Scanner;

/**
 * Realizar un programa que complete un vector con los N primeros números de la
 * sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión
 * de los siguientes números: 1, 1, 2, 3, 5, 8, 13, 21, 34, ... Donde cada uno
 * de los números se calcula sumando los dos anteriores a él. Por ejemplo: La
 * sucesión del número 2 se calcula sumando (1+1) Análogamente, la sucesión del
 * número 3 es (1+2), Y la del 5 es (2+3), Y así sucesivamente… La sucesión de
 * Fibonacci se puede formalizar de acuerdo a la siguiente fórmula: Fibonaccin =
 * Fibonaccin-1 + Fibonaccin-2 para todo n>1 Fibonaccin = 1 para todo n<=1 Por
 * lo tanto, si queremos calcular el término “n” debemos escribir una función
 * que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar
 * a ese valor. Para conocer más acerca de la serie de Fibonacci consultar el
 * siguiente link: https://quantdare.com/numeros-de-fibonacci/
 */
public class Guia05Extras07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cuantos terminos desea mostrar de la sucesión de Fibonacci");
        // Leer la cantidad de veces que se quiere sumar la sucesión de Fibonacci
        int cantidad = sc.nextInt();

        // Crear un array de tamaño fibonacci para almacenar los números de la sucesión de Fibonacci
        int[] calcFibonacci = new int[cantidad];
        
        llenarVector(calcFibonacci);
       mostrarSerie (calcFibonacci);
       
        }
   
    
    public static void llenarVector (int [] vector){
        for (int i = 0; i < vector.length; i++) {
            if(i ==0 || i==1){
                vector [i] = i;
            }else{
                vector[i] = vector [i-1] + vector [i-2];   ///1,1,2,3,5,8,13,21
            }
        }
    }
    
    public static void mostrarSerie(int [] vector){
                String aux = "";
            for (int i = 0; i < vector.length; i++) {
            if(i == vector.length - 1){
                aux += vector[i];
            } else {
                aux += vector[i] + ", ";
            }
            }      System.out.println(aux);
    }
    }

            
     
    
    
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de serie de Fibonacci");
        int serie = sc.nextInt();
        for (int i = 0; i < serie; i++) {
            System.out.println(fibonacciRecursivo(i));
        }
    }

    public static int fibonacciRecursivo(int n) {
        //CASO BASE, si es cero devuelve un cero
        if (n <= 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }
}
*/