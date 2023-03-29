
package guía05;

import java.util.Scanner;

/**
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo
* y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
    String [] Equipo = new String [6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese el nombre nro " + (i+1) + " de su equipo:");
            Scanner leer = new Scanner(System.in);
            String nombre; nombre = leer.nextLine();
            Equipo[i] = nombre;
        }
        
   
        for(String cadena :Equipo) {
      System.out.print("["+ cadena +"]");
    }
    }
}
        /*
        
            for (int i = 0; i < 6; i++) {
                System.out.print("[" + Equipo[i]+ "]");
        }
            
            }
            }
       */
  