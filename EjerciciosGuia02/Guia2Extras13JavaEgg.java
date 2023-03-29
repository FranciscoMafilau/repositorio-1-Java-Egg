
package eggcursadabackend.EjerciciosGuia02;

import java.util.Scanner;



/**
i
 */
public class Guia2Extras13JavaEgg {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un número para la altura");
        int altura = leer.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1));
            }
            System.out.println();
        }
    }
}
    

