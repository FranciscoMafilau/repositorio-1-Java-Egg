package eggcursadabackend.EjerciciosGuia02;


import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú: MENU 1. Sumar 2. Restar 3.
 * Multiplicar 4. Dividir 5. Salir Elija opción:
 *El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
public class Guia206JavaEgg {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num;
        int num1;
        System.out.println("Ingrese dos números enteros:");
        num = leer.nextInt();
        num1 = leer.nextInt();
        String opcion;
        
        
        do {
            System.out.println("===================");
            System.out.println("MENU:");
            System.out.println("====================");
            System.out.println("1. Sumar");
            System.out.println("2. Restar:");
            System.out.println("3. Mutiplicar:");
            System.out.println("4. Dividir:");
            System.out.println("5. SALIR");
            System.out.println("=========================");
            System.out.println("ingrese una opción:");
            System.out.println("=========================");
            opcion = leer.next();

            switch (opcion) {
               
              case "1" :
                System.out.println(num + num1);
                break;
                case "2" :
                System.out.println(num - num1);
                break;
                case "3" :
                System.out.println(num * num1);
                break;
                case "4":
                System.out.println(num / num1);
                break;
                case "5":
                System.out.println("está seguro que desea salir del programa? (s/n)");
                opcion = leer.next();
                break;
                
                default:
                System.out.println("no ingresó números validos");
              
        }
        }while(!"S".equalsIgnoreCase(opcion));
                       System.out.println("saliendo del programa");
    }
}

 
