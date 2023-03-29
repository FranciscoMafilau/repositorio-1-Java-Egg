
package eggcursadabackend.EjerciciosGuia03y04;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 */
public class Ejercicio302JavaEgg {
    public static void main(String[] args) {
        String no = null;
       
        String opcion = no;
        do{
          
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre y su edad: ");
        String nombre = leer.nextLine();
        int edad = leer.nextInt();
     
        String Mayoría = Mayoría(nombre, edad);
        
            System.out.println("desea ingresar otros datos?(si/no)");
            opcion = leer.next();
        }while (!opcion.equalsIgnoreCase("no"));
    }
    
    
    public static String Mayoría (String nombre, int edad){
        String respuesta = null;
        if (edad < 18){
            System.out.println(nombre+ " es menor de edad");
             }else{
            System.out.println(nombre + " es mayor de edad");
    }
        return respuesta;
    }
}
/*
  public static void main(String[] args) {
        ingresar();
    }

    public static void ingresar() {
        Scanner leer = new Scanner(System.in);
        String fin;
        do {
            System.out.print("Ingrese un nombre: ");
            String NOM = nombre(leer);
            System.out.print("Ingrese una edad: ");
            int EDAD = edad(leer);
            mostrar(NOM, EDAD);
            System.out.println("Desea continuar? Si/No");
            fin = leer.next();
        } while (!(fin.equals("No")));
    }

    public static void mostrar(String nomb, int ed) {
        if (ed >= 18) {
            System.out.println(nomb + " tiene " + ed + " años y es mayor de edad");
        } else {
            System.out.println(nomb + " tiene " + ed + " años y NO es mayor de edad");
        }
    }

    public static String nombre(Scanner l) {
        String nomb = l.next();
        return nomb;
    }

    public static int edad(Scanner l) {
        int ed = l.nextInt();
        return ed;
    }

}
*/