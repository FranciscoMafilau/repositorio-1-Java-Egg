/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tú Hitomi
 */
public class Funciones {
    public static void main(String[] args){
        sumar(15, 25);
       
        saludar("Francisco", 49);
        cuentaRegresiva(10);
        
        System.out.println(factorial(5));
        
        System.out.println(sumar(4,8,5,6,9,7));
    }
    static int sumar(int... numeros){
        int suma = 0;
        for(int num : numeros){
            suma += num;
        }
        return suma;
    }
    public static void saludar(String nombre, int edad){
        System.out.println("hola:\n"+nombre+ "\n tu edad es:\n"+edad);
    }
    
    static void cuentaRegresiva(int numero){
        numero--;
        if(numero>0){
            System.out.println(numero);
            cuentaRegresiva(numero);
        }else{
            System.out.println("llegó hasta 0");
        }
            }
    static int factorial (int numero){
        if(numero > 1){
            numero = numero * factorial(numero -1 );
        }
        return numero;
        }
    
    
    }

   