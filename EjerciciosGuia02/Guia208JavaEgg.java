package eggcursadabackend.EjerciciosGuia02;


import java.util.Scanner;


/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * *
    *     *
    *     *
    * * * *
 * 
 */


/*

0,0 /  0,1 /  0,2  /  0,3
1,0 / 1,1  /  1,2 /   1,3
2,0 / 2,1  /  2,2  /  2,3
3,0 / 3,1  /  3,2  /  3,3


*/

public class Guia208JavaEgg {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int cantidad;
        do {
            System.out.print("Ingrese cantidad para rellenar> \n");
            cantidad = leer.nextInt();

        } while (cantidad < 1);//ponemos una condición 
        
        for (int i = 1; i <= cantidad; i++) {// leo toda la fila
            for (int j = 1; j <= cantidad; j++) {//leo toda la columna
                if (j == cantidad) { //busco donde i y j van a compartir un número
                    System.out.println("*"); ///llena todo el techo
                } else if (i == 1 || i == cantidad) {
                    System.out.print("*");///llena los lados

                } else if (j > 1 && j < cantidad) {
                    System.out.print(" ");

                 } else if (j == 1) {
                    System.out.print("*");///llena base
                 }
        }
        System.out.println(" ");
        }
    }
}


   
/*
   Scanner leer=new Scanner(System.in);
         for(int i=0;i<4;i++){
             System.out.print("*");
         }
         System.out.println(""); 
         for(int i=0;i<4;i++){
             if (i==0 || i==3){
                 System.out.print("*");
             }else{
                 System.out.print(" ");
             }
         }
         System.out.println("");
         for(int i=0;i<4;i++){
             if (i==0 || i==3){
                 System.out.print("*");
             }else{
                 System.out.print(" ");
             }
         }
         System.out.println("");
         for(int i=0;i<4;i++){
             System.out.print("*");
         }
         
    }
    
}
*/