package eggcursadabackend.EjerciciosGuia03y04;

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un número por teclado y con una función se
 * lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false. Un número primo es aquel que solo
 * puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo.
 *
 */
public class Ejercicio304JavaEgg {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número: \n");
        int numero = leer.nextInt();
        
        if(esPrimo(numero)){
            System.out.println("===================");
            System.out.println("es número primo");
            System.out.println("====================");
        }else{
            System.out.println("================");
            System.out.println("no es número primo");
            System.out.println("===================");
        }
    }
    public static boolean esPrimo(int numero){
        int contador = 0;
        
        int[] numeros = new int[numero];
        for(int i=0; i< numeros.length; i++){
            numeros[i] = i+1;
        }
        for (int i : numeros){
            if(i==1 || i == numero){
                continue;
            }
            if(numero % i ==0){
                contador ++;
            }
        }
        return contador == 0;
    }
}
    
/*
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
        } while (!(numero > 0));

        if (primo(numero) == true) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " NO es primo");
        }
    }

    public static boolean primo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
            if (cont > 2) {
                return false;
            }
        }
        return true;
    }

}
*/