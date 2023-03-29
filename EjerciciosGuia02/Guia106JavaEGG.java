
package eggcursadabackend.EjerciciosGuia02;

import java.util.Scanner;

/**
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */
public class Guia106JavaEGG {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if(num1 >25){
            System.out.println(num1+ " es mayor a 25");
        }else if(num2 >25){
            System.out.println(num2+ " es mayor a 25");
        }else{
            System.out.println("ambos números son menores a 25");
        }
    }
}
