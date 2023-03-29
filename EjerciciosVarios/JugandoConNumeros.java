
package eggcursadabackend.EjerciciosVarios;

import java.util.Scanner;


public class JugandoConNumeros {
    
          public static void main(String[] args) {
         jugar(5);
          }
          
          
    static void jugar (int vidas){  //función
        int numeroRandom = (int)(Math.random()*101); //crea número random
        int numeroElegido = -1;
        Scanner leer = new Scanner(System.in);
        
        
        while (numeroElegido != numeroRandom){
            System.out.println("ingrese un numero entre 1 y 100:");
            numeroElegido = leer.nextInt();
            
            if (numeroRandom < numeroElegido) {
                System.out.println("ingrese un número más pequeño:");
                vidas--;
            }else if (numeroRandom > numeroElegido){
                System.out.println("ingrese un numero más grande:");
                vidas--;
            }
            if (vidas==0){
                System.out.println("**********************");
                System.out.println("GAME OVER");
                System.out.println("**********************");
            }
            System.out.println("**********************");
            System.out.println("te quedan "  +vidas+ " vidas");
            System.out.println("**********************");
        }
        if(numeroElegido == numeroRandom){
            System.out.println("**********************");
            System.out.println("YOU WIN"); 
            System.out.println("**********************");
        }
    }
    
}
    

