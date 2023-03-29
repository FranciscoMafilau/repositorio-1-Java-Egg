/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tú Hitomi
 */
import java.util.Scanner;

public class PrecioVenta {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese valor de Venta: ");
        double vv = leer.nextDouble();
        
        double iva= vv * 0.21;
        double pv = vv + iva;
        
        System.out.println("Valor de venta :" +vv);
        System.out.println("iva. " + iva);
        System.out.println("precio de venta: " + pv);
        
    }
}
