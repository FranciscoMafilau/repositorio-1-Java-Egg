package eggcursadabackend.EjerciciosGuia05;

import guía05.Guia05Ejercicio06;
import java.util.Scanner;



/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada. Nota: Para resolver el ejercicio deberá
 * investigar cómo se utilizan las siguientes funciones de Java substring(),
 * Length() y Math.random().
 */
public class Guia05Extras06 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String [][] matriz = new String[20][20];
        inicializarMatriz(matriz);
        ingresarPalabras(matriz, sc);
        mostrarMatriz(matriz);
    }
    
    public static void  ingresarPalabras(String [][] matriz,Scanner sc){
        String palabra;
        int fila;
        int[] posiciones = new int[5];
        boolean bandera = true;
        for (int i = 0; i < posiciones.length; i++) {
            posiciones[i] = 20;
        }
        for (int i = 0; i < 5; i++) {
            do {                
                System.out.println("Ingrese una palabra entre 3 y 5 caracteres");
                palabra = sc.nextLine();
            } while (palabra.length() < 3 || palabra.length() > 5);
            do {     
                fila = (int)(Math.random()*20);
                for (int j = 0; j < posiciones.length; j++) {
                    if(posiciones[j] == fila){
                        bandera = false;
                    }
                }
            } while (!bandera);
            for (int j = 0; j < palabra.length(); j++) {
                matriz[fila][j] = palabra.substring(j, j+1); 
            }
        }
    }
    
    public static void inicializarMatriz(String[][] matriz){
        for (String[] fila : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                fila[j] = String.valueOf((int)(Math.random()*10));
            }
        }
    }
    
    public static void mostrarMatriz(String [][] matriz){
        for (String[] fila : matriz) {
            String aux = "";
            for (String elemento : fila) {
                aux += "[" + elemento + "]";
            }
            System.out.println(aux);
        }
    }
}
 

  /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] palabras = new String[5];
        int[] aleatorio = new int[5];
        char[][] sopa = new char[20][20];
        Random rand = new Random(); // fila aleatoria donde se ubicarán las palabras
        int columnasUsadas = 0;

        // Leer las palabras
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Ingrese la palabra " + (i + 1) + " (entre 3 y 5 caracteres): ");
                palabras[i] = sc.nextLine();
                aleatorio[i] = rand.nextInt(20);
            } while (palabras[i].length() < 3 || palabras[i].length() > 5);
        }

        // Colocar las palabras en la sopa
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            
            for (int j = 0; j < palabra.length(); j++) {
                if (rand.nextInt(20) < sopa.length && columnasUsadas + j < sopa[rand.nextInt(20)].length) {
                    sopa[aleatorio[i]][columnasUsadas + j] = palabra.charAt(j);
                }
            }
            columnasUsadas += palabra.length() + 1; // sumar la longitud de la palabra más un espacio en blanco
        }

        // Rellenar los espacios vacíos con números aleatorios
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) (Math.random() * 10 + '0'); // número aleatorio entre 0 y 9
                }
            }
        }

        // Imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] palabras = new String[20][20];
        String palabra2;
        String alphabet;
        int longitudPalabra = 5;
        String[] palabraVector = new String[5];
        int cantidadPalabras = 0;
        char c;
        alphabet = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        Random r = new Random();
        int columnaRandom;
        for (int i = 0; i < palabras.length; i++) {
            columnaRandom = (int) (Math.random() * 10) * 2;
            for (int j = 0; j < palabras.length; j++) {
                if (j == columnaRandom && cantidadPalabras < 5 && j < 15) {
                    do {
                        System.out.println("Ingresa la palabra " + (cantidadPalabras + 1) + " entre 3 y 5 caracteres");
                        palabra2 = sc.next().toUpperCase();
                        for (int k = 0; k < longitudPalabra; k++) {
                            if (k <= palabra2.length() - 1) {
                                palabraVector[k] = palabra2.substring(k, k + 1);
                            } else {
                                c = alphabet.charAt(r.nextInt(alphabet.length()));
                                palabraVector[k] = String.valueOf(c);
                            }
                        }
                    } while ((palabra2.length() > 5) || (palabra2.length() < 3));
                    for (int k = 0; k < palabraVector.length; k++) {
                        if (k == 0) {
                            j -= 1;
                        }
                        j++;
                        palabras[i][j] = palabraVector[k];
                    }
                    cantidadPalabras++;
                } else {
                    c = alphabet.charAt(r.nextInt(alphabet.length()));
                    palabras[i][j] = String.valueOf(c);
                }
            }
        }
        for (String[] palabra : palabras) {
            for (int j = 0; j < palabras.length; j++) {
                System.out.print(palabra[j] + " ");
            }
            System.out.println();
        }
}
}
*/
/*
  public static void main(String[] args) {
        String mat[][] = new String[20][20];
        String palabrasIngresadas[]= new String[5];
        palabrasIngresadas=ingresaPalabras();
        
        //mostrarPalabrasIngresadas(palabrasIngresadas);
        //Falta algoritmo elige posiciones al azar sin repetidos
        int[] posicionesPalabras = new int[5];
        posicionesPalabras=obtenerPosicionesFilas();
        //mostrarPosicion(posicionesPalabras);
        mat= crearMatriz();
        mostrarMatriz(mat);
        colocarPalabras(posicionesPalabras,mat,palabrasIngresadas);
        mostrarMatriz(mat);
        
    }
    
    public static String[] ingresaPalabras(){
        String palabrasIngresadas[]= new String[5];
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese la palabra a ingresar en la sopa");
                palabra = sc.next();
            } while (!bienEscrita(palabra));
            palabrasIngresadas[i]=palabra;

        }
        return palabrasIngresadas;
        
    }
    
    public static boolean bienEscrita(String palabra){
        return palabra.length()>=3 && palabra.length()<=5;
    }
    
    
    public static String[][]   crearMatriz(){
    String mat[][] = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                mat[i][j]="1";
            }
        }
    return mat;
    }
    
     public static void mostrarPosicion(int[] vector){
        for (int i = 0; i < 5; i++) {
            
            System.out.println(vector[i]);
        }
    }
     
     public static void mostrarPalabrasIngresadas(String[] vector){
        for (int i = 0; i < 5; i++) {
            
            System.out.println(vector[i]);
        }
    }
     
     
    
    public static void mostrarMatriz(String[][] matriz){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print ("[" +matriz[i][j] +"] ");
            }
            System.out.println("");
        }
    }
    public static int[] obtenerPosicionesFilas(){
     int[] posicionesPalabras = new int[5];
     int candidato= (int) (Math.random()*20+1);
     posicionesPalabras[0]=candidato;
        for (int i = 1; i <= 4; i++) {
            do {
                candidato = (int) (Math.random()*20+1);
            } while (estaAnteriorMente(posicionesPalabras,i,candidato));
            posicionesPalabras[i]=candidato;
        }
    
     return posicionesPalabras;
     
    }
    
    public static boolean estaAnteriorMente(int[] posiciones, int posicionActual,int nroBuscado){
        boolean encontrado=false;
        for (int i = 0; i < posicionActual ; i++) {
             if (posiciones[i]==nroBuscado) {
                encontrado=true;
            }
        }
        return encontrado;
    }
    
    public static void colocarPalabras(int[] posicionesPalabras,String mat[][],String[] palabrasIngresadas){
        for (int p = 0; p < 5; p++) { //posicion fila de las palabras
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (posicionesPalabras[p] == i) {
                        for (int k = 0; k < palabrasIngresadas[p].length(); k++) {
                            mat[i][k] = String.valueOf(palabrasIngresadas[p].charAt(k));
                        }
                    }

                }
            }
        }

            
        }
    
       
        
    }
*/