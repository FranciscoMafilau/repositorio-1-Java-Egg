package eggcursadabackend.EjerciciosGuia02;


import java.util.Scanner;


/**
* Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio
 * del programa y los números serán introducidos por el usuario. Realice dos
 * versiones del programa, una usando el bucle “while” y otra con el bucle “do -
 * while”.
 */


public class Guia2Extras07BJavaEgg {
    public static void main(String[] args) {
        
    
Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que se solicitarán");
        int n = leer.nextInt();

        int min = 0;
        int max = 0;
        int cont = 0;
        double promedio = 0;
        int num =0;
        while (cont < n) {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if (cont == 0) {
                max = num;
                min = num;
            }
            if (num > max) {
                max = num;
            } else if ( num < min) {
                min = num;
            }
            promedio += num;
            cont++;
        }
        promedio /= cont;
        System.out.println("El número más grande es: " + max+ " , el número más chico es: " + min + " . El promedio de los números es: " + promedio);
        
    }
	}
