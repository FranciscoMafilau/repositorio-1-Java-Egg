
package eggcursadabackend.EjerciciosGuia03y04;

import java.util.Scanner;



    /**
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
public class Ejercicio03Guia11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: (debe terminar en .)");
        String cadena =  leer.nextLine();
        String cambio = letraxSigno(cadena);
 
        System.out.println("tu frase dirá: " + cambio);
    
    }
    
    public static String  letraxSigno(String cadena) {
       
        int longitud = cadena.length();
        String caracter;
        String nuevaCadena= "";
        
        for (int i = 0; i <=( longitud-1);  i++) {
           caracter = cadena.substring(i, i+1);
        
           
         switch (caracter){
            case "a" : 
            case "A":
                nuevaCadena = nuevaCadena.concat("@");
            break;
            case "e": 
            case "E": 
                nuevaCadena = nuevaCadena.concat("#");
            break;
            case "i": 
            case "I": 
                nuevaCadena = nuevaCadena.concat("$");
            break;
            case "o": 
            case "O": 
                nuevaCadena = nuevaCadena.concat("%");
            break;
            case "u":
            case "U": 
                nuevaCadena = nuevaCadena.concat("*");
            break;
            default:
                nuevaCadena=nuevaCadena.concat(caracter);
         }
    
        }
        return nuevaCadena;
    }
    }

