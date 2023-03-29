package guía05;

import java.util.Scanner;


/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
 * muestre por pantalla en orden descendente.
 */

public class Guia05Ejercicio01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       // int  vector[];   ///inicializamos el vector
        //System.out.println("ingrese un tamaño para el vector:");
        //int num = leer.nextInt();
       
        int[] vector = RellenarVector100();  ///asignamos el relleno al vector
       
         System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
        
         ImprimirVector(vector);
        
        
        System.out.println("*********************************************");
        
        imprimirVectorInverso(vector);
        
    }

    
/**
 * va a imprimir el vector de mayor a menor
 * @param lista 
 */    
  public static void imprimirVectorInverso(int[]lista){
      for (int i=99; i>-1; i--){
          System.out.println(lista[i]);
      }
  }

  
  
  public static void ImprimirVector(int[]lista){
      for (int i=0; i<lista.length; i++){
          System.out.println(" [ "+lista[i] + " ]");
      }
  }
  
  
/** 
 rellena un vector con 100 digitos
     * @param a
     * @return 
 */

public static int[] RellenarVector100randon(int a){
           int vector[]= new int[a];
            for (int i = 0; i < a; i++) {
            vector[i]= (int)(Math.random()*100+0);
    }
        return vector;
}



public static int[] RellenarVectorrandom(int a){
    int vector[] = new int [a];
    for (int i=0; i<a; i++){
   vector[i]= (int)(Math.random()*10+0);
    }
         return vector;
}

public static int[] RellenarVector100(){
           int vector[]= new int[100];
            for (int i = 0; i <100; i++) {
            vector[i] = i;
    }
        return vector;
}
}