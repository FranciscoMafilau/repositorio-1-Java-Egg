
import java.util.Scanner;


/**
 *rea lizar la multiplicccación de un vector por una matriz
 * 
 * vector 1x2 * matriz 2x3 = producto 1x3
 * v(3,5) * m (2,4,6) = |3x2 + 5x9, 3x4 + 5x8, 3x6 + 5x7|=
 *            (9,8,7)
 */
public class ProductoVectorMatriz {
    public static void main(String[] args) {
        
        //declara un arreglo de una dimensión
        int[] vector;
        //crea en memoria(construir/dimensionar) en el valor por defecto (cero para los enteros)
        vector = new int[2];
        
        int[] producto = new int[3];
        //declaración  creación de una matriz
        // tipo[][] nombreMatriz = new tipo [filas] [columnas]
         
        //declaración e inicialización con valores predeterminadados
        int [][] matriz = {{4,8,6}, {2,1,7}};
        
        //declaración y creación de arreglos genéricos
        //tipo[][] nombreArreglo =new tipo(cardinalidad9 (caridnalidad)...
        System.out.println("Ingrese los valores del vector de tamaño " +vector.length+ ":");
        Scanner leer =new Scanner(System.in);
        
        //int 0=, porque los subindices de los arreglos se inician en cero
        for (int i=0; i< vector.length; i++){
            System.out.print("v["+i+"}=");
            //acceder al valor del vector
            vector[i] = leer.nextInt();
           }
        
        //multiplica vector por matriz
        int sum;
        //para cada columna de la matriz
        for (int j=0; j< matriz[0].length; j++){
        sum=0;
        //recorro el vector y multiplico
        for (int i=0; i < vector.length ; i++){
            sum+= vector[i] * matriz[i][j];
        }
        producto[j]= sum;
    }
   //mostrar vector
    String  aux= "";
        System.out.println("* Vector: ");
        //bucle for mejorado (enhaced)
        //for tipo elemento : arreglo)
        for (int elemento: vector){
            aux = aux + "  " + elemento;
        }
        System.out.print(aux);
        
        //mostrar matriz
        System.out.println("\n* Matriz:");
        //para cada fila de la matriz
        for (int[] fila : matriz){
            aux="";
            //para cada elemento de la fila
            for (int elemento: fila){
                aux += " " + elemento;
            }
            System.out.println(aux);
            
        }//mostrar resultado
            aux= "";
            System.out.println("\n Vector x Matriz:");
            for (int elemento : producto){
                aux += " " + elemento;
                
            }
            System.out.print(aux + "\n");
        }
    }

