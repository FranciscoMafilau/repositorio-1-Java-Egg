package eggcursadabackend.EjerciciosGuia02;

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio
 * del programa y los números serán introducidos por el usuario. Realice dos
 * versiones del programa, una usando el bucle “while” y otra con el bucle “do -
 * while”.
 */
public class Guia2Extras07JavaEgg {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad de numeros");///para determinar el número de lecturas
        int n = leer.nextInt();

        int max = 0;
        int min = 0;
        int cont = 0;
        double promedio = 0;
        int num;
        do {
            System.out.println("Ingrese un número"); ////los números a ejecutar
            num = leer.nextInt();
            if (cont == 0) {
                max = num;      ///asigno el valor num al max y al min
                min = num;
            }
            if (num > max) {
                max = num;      ////num se convierte en el número máximo
            } else if (num < min) {
                min = num;      ///num se convierte en el número mínimo
            }
            promedio += num;        ////para sacar el promedio
            cont ++;                        /// el contador 
        } while (cont < n); ///la condición para que corte el bucle
        promedio /= cont;
        System.out.println("El número más grande es: " + max + " , el número más chico es: " + min + " .  El promedio de los números es: " + promedio);
        
    }
}
