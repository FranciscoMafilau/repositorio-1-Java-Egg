package eggcursadabackend.EjerciciosGuia02;

import java.util.Scanner;

/**
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y
10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
public class Guia108JavaEGG {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingrese una nota: ");
            nota = leer.nextInt();
        
        while (nota < 0 ||  nota >10){
            System.out.println("se ingreso un nota fueral de rango 1 al 10");
               nota = leer.nextInt();
            
        }
    }
}
