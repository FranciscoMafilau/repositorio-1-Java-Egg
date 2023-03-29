package eggcursadabackend.EjerciciosGuia02;


import java.util.Scanner;


/**
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
public class Guia2Extras04JavaEgg {
    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número entre 1 y 10");
        int num = leer.nextInt();

        switch (num) {
            case 1 -> System.out.println("I");
            case 2 -> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
            case 6 -> System.out.println("VI");
            case 7 -> System.out.println("VII");
            case 8 -> System.out.println("VIII");
            case 9 -> System.out.println("IX");
            case 10 -> System.out.println("X");            
        }
    }
}