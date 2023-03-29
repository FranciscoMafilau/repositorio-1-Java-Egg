package eggcursadabackend.EjerciciosGuia02;


import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class Guia2Extras06EGG {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese número de personas a medir: ");
        double cantidad = leer.nextDouble();
        double altura;
        double promedioEstaturasTotal = 0;
        double  personasBajas = 0;
        double promedioPersonasBajas = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la altura(en centimetros): ");
            altura = leer.nextDouble();
            promedioEstaturasTotal += altura;
            if (altura <= 1.60) {
                personasBajas++;
                promedioPersonasBajas += altura;
            }
        }
                System.out.println("El promedio de personas por debajo de 160 cms. es = " + promedioPersonasBajas / personasBajas);
                System.out.println("El promedio total de estaturas es = " + promedioEstaturasTotal / cantidad);
    }
}
