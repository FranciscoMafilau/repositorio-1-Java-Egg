package eggcursadabackend.EjerciciosGuia02;

import java.util.Scanner;

/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
 * cantidad de números pares y la cantidad de números impares. Al igual que en
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break
 */
public class Guia2Extras08JavaEgg {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 0;
        int contPares = 0;
        int contImpares = 0;

        do {
            System.out.println("Ingrese números: ");
            num = leer.nextInt();

            if (num > 0) {
                cont++;
                if (num % 2 == 0) {
                    contPares++;
                }else{
                            contImpares++;
                        }
           
            }if (num % 5 == 0){
                    
                            break;

                        }
        } while (true);
        System.out.println("Hay : " + cont + " números ingresados.-");
        System.out.println(" Hay : " + contPares + " números pares ingresados.-");
        System.out.println("Hay: " + contImpares + " números impares ingresados.-");
    }
}
