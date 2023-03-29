
import java.util.Scanner;
public class Vocal {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        char c = leer.next().charAt(0);
        
        switch (c){
            case 'a', 'A' -> System.out.println("La letra " +c+ " es VOCAL");
            case 'e', 'E' -> System.out.println("La letra " +c+ " es VOCAL"); 
            case 'i', 'I' -> System.out.println("La letra " +c+ " es VOCAL");
            case 'o', 'O' -> System.out.println("La letra " +c+ " es VOCAL");
            case 'u', 'U' -> System.out.println("La letra " +c+ " es VOCAL" );
            default -> System.out.println("La letra " +c+ " no es una VOCAL");
        }
         
           
           
}
}
