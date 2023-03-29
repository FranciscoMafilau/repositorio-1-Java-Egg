package eggcursadabackend.EjerciciosGuia03y04;

import java.util.Scanner;

/**
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
 * usuario, validando que el primer número múltiplo del segundo e imprima si el
 * primer número es múltiplo del segundo, sino informe que no lo son.
 */
public class Ejercicio03Guia12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
         EsMultiplo(num1, num2);
        
    }
    public static void EsMultiplo(int num1, int num2){
      
        if ((num1 % num2) ==0){
            System.out.println("el primer número es multiplo del segundo");
        }else{
            System.out.println("el primer número no es multiplo del segundo");
        }
    }
}
    