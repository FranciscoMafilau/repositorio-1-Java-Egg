package guía05;


import guía05.Guia05Ejercicio01;
import java.util.Scanner;


/**
 *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * 
 */
public class Guia05Ejercicio02 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese tamaño del vector: ");
        int n = leer.nextInt();
        System.out.println("Ingrese un número a buscar: ");
        int x = leer.nextInt();
        
         
        int vector[]=Guia05Ejercicio01.RellenarVector100randon(n);
        //for (int i = 0; i <n; i++) {
        //vector[i]= (int)(Math.random()*100+0);
             
          
        System.out.println("********************************************");
    
        Guia05Ejercicio01.ImprimirVector(vector);
    
        int acumulador=0;
                for (int i=0; i < n ; i++){
                    if (vector[i] ==x) {
               
                        System.out.println("esta ubicado en la posición: " + i);
                    acumulador++;
            }
                }
                if (acumulador>0){
                System.out.println("se ha  enocntrado el número " +x+ " se ha encontrado:  " +acumulador+ " veces." );
            }else{
                System.out.println("no se ha encontrado el número " +x);
                }
          }
    
}
    
    

                
    


/*

     System.out.println("Ingrese el tamaño del vector N");
     int tamanioVector = sc.nextInt();
     int[] vector = new int[tamanioVector];
     
        for (int i = 0; i < tamanioVector; i++) {
            vector[i]= (int)(Math.random()*100+0);
        }
        System.out.println("Ingrese el nro a buscar");
        int buscado = sc.nextInt();
        int contador = 0;
        for (int i = 0; i < tamanioVector; i++) {
            if (vector[i] ==buscado) {
                System.out.println("el numero "+ buscado + " está en la posicion " + (i+1));
                contador = contador+1;
            }
            
        }
        
        if (contador >0) {
            System.out.println("el numero " + buscado + "está repetido" + contador + "veces" );
        }else{
            System.out.println("El numero "+ buscado +" no ha sido encontrado :(");
        }
        
        
        for (int i = 0; i < tamanioVector; i++) {
            System.out.println("["+ vector[i]+"]");
        }
*/
    