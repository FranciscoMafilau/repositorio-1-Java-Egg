
public class ClaseStrings {
    public static void main(String[] args) {
        String nombre= "navidad";
        
        //mostrar un decimal de una array
        System.out.println(nombre.charAt(5));
        
        
        //mostrar la cantidad de decimales del array
        System.out.println(nombre.length());
        
        
        //para imprimir el array usamos el for
        for(int i=0; i < nombre.length(); i++){
            System.out.println(nombre.charAt(i));
        }
            //recorre el array de un decimal a otro
            System.out.println(nombre.substring(0,5));
            
            //convertir a minusculas
            System.out.println(nombre.toLowerCase());
            
            //converti a mayusculas
            System.out.println(nombre.toUpperCase());
            
            nombre = " n a v i d a d";
            
            System.out.println(nombre.replace("a","e"));
            
            System.out.println("Hola".equals("hola"));
            
            
              String miCadena = "Hola, ¿cómo estás?";

        // Usamos el método length() para obtener la longitud de la cadena
        int longitudCadena = miCadena.length();

        // Imprimimos la longitud de la cadena en la consola
        System.out.println("La longitud de la cadena es: " + longitudCadena);
    
        
        //crear objetos
        
        StringBuilder nuevo = new StringBuilder();
        System.out.println(nuevo);
        nuevo.append("hola ");
        nuevo.append(" Mundo");
        
        System.out.println(nuevo.toString());
    }
    
        
         
        
} 
        

