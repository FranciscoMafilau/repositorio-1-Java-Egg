package eggcursadabackend.EjerciciosGuia02;

import java.util.Scanner;

/**
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se
 * debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
 * programa deberá calcular y mostrar el resultado de la suma de los números
 * leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
 * de la sentencia break.
 */
public class Guia109JavaEGG {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int suma = 0;
        int num;
        do {
            System.out.println("Ingrese números positivos: ");
            num = leer.nextInt();
            
            if (num > 0 && num <=20) {////al ser mayor a 0 no contabiliza el nro negativo
                cont++;
                suma += num;// suma = num + num;
            }
            if(num ==0){
                    System.out.println("se capturó el cero");
                    break;
            }
        }
        while (cont == 20);
             System.out.println ("la suma de los números ingresados es: " +suma + " se ingresaron: " + cont+ " números");
        }
}