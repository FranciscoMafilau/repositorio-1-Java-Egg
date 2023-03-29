package eggcursadabackend.EjerciciosGuia02;


import java.util.Scanner;


/**
 * Una obra social tiene tres clases de socios:
 * o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
 * todos los tipos de tratamientos.
 * o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
 * los mismos tratamientos que los socios del tipo A.
 * o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
 * tratamientos.
 * o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
 * real que represente el costo del tratamiento (previo al descuento) y determine el
 * importe en efectivo a pagar por dicho socio
 */
public class Guia2Extras05JavaEgg {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String A, B, C;
        
        System.out.println("*********************************");
        System.out.println("***SERVICIO ON LINE*****************");
        System.out.println("***OBRA SOCIAL CURITA************");
        System.out.println("**************************************");
        System.out.println("Ingrese la categoria del socio: ");
        String categoria = leer.next().toUpperCase();
        System.out.println("Ingrese el monto del tratamiento: ");
        int costo = leer.nextInt();
        
        switch(categoria){
            case "A" -> System.out.println("el socio deberá abonar con un descuento del 50%, siendo el monto a abonar de: $ = " + costo/2);
            case "B" -> System.out.println("el socio deberá abonar con un descuento del 35%, siendo el monto a abonar de: $ = "+ (costo * 0.65));
            case "C" -> System.out.println("el socio deberá abonar la totalidad de la cuota social, siendo el monto a abonar de: $ = " +costo);
            default -> System.out.println("No ha ingresado una categoría existente.");
         }
    }
}