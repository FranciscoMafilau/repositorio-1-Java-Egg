
import java.util.Scanner;


public class SumatoriaConSalto {
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        
        do{
            System.out.println("Ingrese un número entero positivo");
            num= leer.nextInt();
            if(num>1000){
                System.out.println("este programa tardará, estás de acuerdo (s/n)");
                String confirma = leer.next();
                if (confirma.equals("s")) {
                    break;
                }
            }
        }while (num <=0 || num > 1000);
         
            
            
            int j, suma;
            
            for (int i=1 ; i <=num ; i++){
                if( i%2 !=0)
                    continue;
                
                suma =0;
                j = 0;
                while(j<=i){
                    suma +=j;
                    j++;  
                }
                System.out.println("la suma de los " +i+ " número naturales es. " +suma);
            }
        }
    }
            