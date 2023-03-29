package eggcursadabackend.EjerciciosGuia03y04;

import java.util.Scanner;

/**
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
* restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática 
* y deben devolver sus resultados para imprimirlos en el main. 
 */
public class Ejercicio301JavaEgg {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números;");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String opcion;
    
        while (true){
        System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Que operación desea realizar:");
            opcion = leer.next();
       
            
         switch (opcion){
                case "1" : 
                    System.out.println(sumar(num1, num2));
                    break;
                case "2" : 
                    System.out.println(restar(num1, num2));
                  break;
                case "3" :
                    System.out.println(multip(num1, num2));
                    break;
                case "4" :
                    System.out.println(dividir(num1, num2));
                    break;
                default:
                    System.out.println("ingrese una opción valida");
                    
         }
          }
    }

     

public static int sumar (int num1, int num2){
int suma;
    suma = num2 +num1;
        return suma;
}

public static int restar(int num1, int num2){
int resta;
    resta = num1 - num2;
        return resta;
}

public static int multip (int num1, int num2){
    int multiplica;
    multiplica = num1 * num2;
        return multiplica;
}

public static int dividir(int num1, int num2){
    int div;
    div = num1 / num2;
        return div;
}
}
         
     
    
    
      

 
