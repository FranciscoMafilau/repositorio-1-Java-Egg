package eggcursadabackend.EjerciciosGuia02;


import java.util.Scanner;


/**
 *
 *Crear un programa que dado un numero determine si es par o impar.
 */
public class Guia201JavaEgg {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int num;
        System.out.println("Ingrese un número.");
         num = leer.nextInt();
        
        if (num !=0){
            if (num >0){
            if (num%2 ==0){
                System.out.println("el número " +num+ " es par");
            }else{
                System.out.println("el número " +num+ " es impar");
            }}
            
        }
        
    }
}
