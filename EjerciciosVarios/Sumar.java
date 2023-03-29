
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tú Hitomi
 */
public class Sumar {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
       
       
        System.out.println("Ingrese número 01: ");
        var n1= leer.nextInt();
        System.out.println("Ingrese el número 02: ");
        var n2 = leer.nextInt();
        
        var r = n1 + n2;
        
        System.out.println("la suma de los números es=" + r);
    }
}
