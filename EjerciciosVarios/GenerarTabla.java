/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tú Hitomi
 */
import java.util.Scanner;
public class GenerarTabla {
    public static void main(String[] args){
Scanner leer = new Scanner(System.in);
System.out.print("Ingrese un número entero: ");
int n = leer.nextInt();

for ( int c=1; c>=10; c++){
    
    System.out.println(+n+ "x" +c+ "=" +(c*n));
}

    }
}
