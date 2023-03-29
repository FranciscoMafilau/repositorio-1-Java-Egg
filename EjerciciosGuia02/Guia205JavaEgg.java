package eggcursadabackend.EjerciciosGuia02;


import java.util.Scanner;


/**
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 * 
 */
public class Guia205JavaEgg {
    public static void main(String[] args) {
        
        int numero;
        int num;
       
        int suma=0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número límite:");
        numero = leer.nextInt();
        
        do{
        System.out.println("ingrese números a sumar:");
        num = leer.nextInt();
        
        suma += num;
        }while(numero >= suma);
        }
}
             
       
        
    
