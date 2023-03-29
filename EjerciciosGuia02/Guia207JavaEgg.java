package eggcursadabackend.EjerciciosGuia02;


import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 * 
 */

public class Guia207JavaEgg {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        Boolean repetir = false;
        String primeraLetra = "x";
        String ultimaLetra = "o";
        String correcta = "&&&&&";
         int contador = 0;
         int otroContador = 0;
        
         
         do{
             System.out.println("Ingrese una cadena:");
             cadena = leer.nextLine();
             if (cadena.length() <= 6){
               if (cadena.substring(0, 1).equals(primeraLetra)&&cadena.substring(4, 5).equals(ultimaLetra)){
                    System.out.println("la cadena es correcta " +cadena);
                    otroContador ++;  
             }else{
                    System.out.println("ingrese otra cadena:");
                        contador ++;
         }if (cadena.equals(correcta)){
             repetir = true;
         }
         }
         }while (repetir == false);
        
            System.out.println("se han realizado " + otroContador + " lecturas correctas");
             System.out.println("se han realizado " + contador + " lecturas incorrectas");
             leer.close();
    }}