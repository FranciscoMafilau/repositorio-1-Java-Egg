/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tú Hitomi
 */
import java.util.Scanner;
public class DiasDeLaSemana {
    static public void main (String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número de la semana: ");
        int dia = leer.nextInt();
        
        String nombreDia =null;//creamos una variable
        switch(dia){
            case 1 -> nombreDia = "Domingo";
            case 2 -> nombreDia = "Lunes";
            case 3 -> nombreDia = "Martes";
            case 4 -> nombreDia = "Miércoles";
            case 5 -> nombreDia = "Jueves";
            case 6 -> nombreDia = "Viernes";
            case 7 -> nombreDia = "Sábado";
            default -> System.out.println("El número es incorrecto");
           }
    System.out.println("El día es: "+nombreDia);
}
}