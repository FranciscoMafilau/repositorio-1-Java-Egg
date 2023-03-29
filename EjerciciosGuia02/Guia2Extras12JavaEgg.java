
package eggcursadabackend.EjerciciosGuia02;

/**
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9,
* con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E

 */
public class Guia2Extras12JavaEgg {
    public static void main(String[] args) {
        /*
             String numero;
       Scanner Leer = new Scanner(System.in); 
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if(i==3){
                        System.out.println("E-"+j+"-"+k); 
                    }else{
                        if(j==3){
                            System.out.println(i+"-"+"E-"+k);
                        }else{
                            if(k==3){
                                System.out.println(i+"-"+j+"-E");
                            }else{
                                 System.out.println(i+"-"+j+"-"+k);
                            }
                        }
                    }
                }
                
            }
    
              
        }
       
       
       
    }
    
}
        */
        
        
        /* for (int i = 0; i <= 999; i++) {
            String numero = String.valueOf(i);
            if (numero.contains("3")) {
                numero = numero.replace("3", "E");
            }
            System.out.println(formato(numero));
        }
    }
    
    public static String formato(String numero) {
        String[] digitos = {"0", "0", "0"};
        int j = digitos.length - 1;
        for (int i = numero.length() - 1; i >= 0; i--) {
            digitos[j] = String.valueOf(numero.charAt(i));
            j--;
        }
        return String.join("-", digitos);
    }
             */
    }
}
