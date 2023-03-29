package eggcursadabackend.EjerciciosGuia02;


import java.util.Scanner;


/**
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class Guia2Extras01JavaEgg {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tiempo de la caminata: (en minutos)");
        int tiempo = leer.nextInt();
        int horas = tiempo/60;
        int dias = horas/24;
        
        System.out.println("Su tiempo equivale: "+ dias + " días  " + (horas-(dias*24)) +" horas");
      
    }
}
