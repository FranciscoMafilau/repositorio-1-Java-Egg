package eggcursadabackend.EjerciciosGuia02;


import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la
 * función equals() de la clase String.
 */
public class Guia2Extras03JavaEgg {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");
        char primerLetra = leer.next().charAt(0);

        String letra = String.valueOf(primerLetra);
        boolean vocal = "a".equals(letra) || "e".equals(letra )
                || "i".equals(letra) || "o".equals(letra) || "u".equals(letra);

        if (vocal) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra NO es vocal");
        }

        //Vocales(letra);
    }

    public static char Vocales(char letra) {
        switch (letra) {
            case 'a', 'A' ->
                System.out.println("La letra " + letra + " es VOCAL");
            case 'e', 'E' ->
                System.out.println("La letra " + letra + " es VOCAL");
            case 'i', 'I' ->
                System.out.println("La letra " + letra + " es VOCAL");
            case 'o', 'O' ->
                System.out.println("La letra " + letra + " es VOCAL");
            case 'u', 'U' ->
                System.out.println("La letra " + letra + " es VOCAL");
            default ->
                System.out.println("La letra " + letra + " no es una VOCAL");
        }
        return 0;
    }
}
