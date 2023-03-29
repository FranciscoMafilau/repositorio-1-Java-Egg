package eggcursadabackend.EjerciciosGuia05;

import java.util.Scanner;

/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son: Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15% Primer Integrador 25% Segundo
 * integrador 50% Una vez cargadas las notas, se calcula el promedio y se guarda
 * en el arreglo. Al final del programa los profesores necesitan obtener por
 * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo
 * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 *
 */
public class Guia05Extras04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] alumnos = new double[3];
        int trabajos = 4; //para hacer un for y trabajar todas las notas
        int nota;
        double notaFinal = 0;
        int contador =0;
         
        for (int i = 0; i < alumnos.length; i++) { //recorro el vector para sacar los estudiantes
             notaFinal = 0;////inicializo la nota
            for (int j = 0; j < trabajos; j++) {//recorro el vector para sacar notas
                switch (j){
                    case 0 -> {
                        System.out.println("Alumno :");
                        System.out.println("ingresar nota del primer trabajo práctico evaluativo: ");
                        nota = leer.nextInt();
                        notaFinal += nota*0.10;
                     }
                    case 1 -> {
                        System.out.println("ingresar nota del segundo trabajo práctico evaluativo: ");
                        nota = leer.nextInt();
                        notaFinal += nota*0.15;
                     }
                    case 2 -> {        
                        System.out.println("ingresar nota del primer integrador: ");
                        nota = leer.nextInt();
                        notaFinal += nota*0.25;
                     }
                   case 3 -> {
                       System.out.println("ingresar nota del segundo integrador: ");
                       nota = leer.nextInt();
                       notaFinal += nota*0.50;
                     }
                }
            }
            alumnos[i]= notaFinal; //igualo la nota con cada alumno
                                
                if (alumnos[i] <= 7) {
                System.out.println("El alumno  " + i + " reprobó con un promedio de " + alumnos[i]);
                
                contador ++;
                  } else {
                 System.out.println("El alumno  " + i + " aprobó con un promedio de " + alumnos[i]);
                }
                }System.out.println("hay " + contador + " aprobados");
                System.out.println("hay " + (3-contador)+ " desaprobados");
    }
    }
    
/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vectorPromedios = new double[3];
        llenarArregloPromedios(vectorPromedios, sc);
        calcularAprobados(vectorPromedios);
    }
    
    public static void llenarArregloPromedios(double [] vectorPromedios, Scanner sc){
        double [] vectorNotas = new double[4];
        for (int i = 0; i < vectorPromedios.length; i++) {
            llenarVectorNotas(vectorNotas, sc);
            vectorPromedios[i] = calcularPromedio(vectorNotas);
            //System.out.println("Promedio: " + vectorPromedios[i]);
        }
        
        
    }
    
    public static void llenarVectorNotas(double [] vectorNotas, Scanner sc){
        for (int i = 0; i < vectorNotas.length; i++) {
            if(i==0){
                System.out.println("Ingrese la nota del primer trabajo práctico evaluativo");
                vectorNotas[i] = sc.nextDouble();
            } else if(i==1){
                System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo");
                vectorNotas[i] = sc.nextDouble();
            } else if(i==2){
                System.out.println("Ingrese la nota del primer integrador");
                vectorNotas[i] = sc.nextDouble();
            } else {
                System.out.println("Ingrese la nota del segundo integrador");
                vectorNotas[i] = sc.nextDouble();
            }
            
        }
    }
    
    public static double calcularPromedio(double [] vectorNotas){
        return vectorNotas[0] * 0.1 + vectorNotas[1] * 0.15 + vectorNotas[2] * 0.25 + vectorNotas[3] * 0.5;
    }
    
    public static void calcularAprobados(double [] vectorPromedios){
        int contadorAprob = 0;
        for (double elemento : vectorPromedios) {
            if(elemento>=7){
                contadorAprob++;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es: " + contadorAprob);
        System.out.println("La cantidad de alumnos desaprobados es: " + (vectorPromedios.length-contadorAprob));
    }
*/

 /*
 public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        int n1,n2,n3,n4;
        double[] v1=new double[10];
        double promedio;
        for(int i=0;i<=9;i++){
            
           System.out.println("Ingrese la nota del Primer trabajo práctico evaluativo del alumno"+(i+1)+": ");
           n1=Leer.nextInt();
           System.out.println("Ingrese la nota del Segundo trabajo práctico evaluativo del alumno"+(i+1)+": ");
           n2=Leer.nextInt();
           System.out.println("Ingrese la nota del Primer Integrador del alumno"+(i+1)+": ");
           n3=Leer.nextInt();
           System.out.println("Ingrese la nota del Segundo integrador del alumno"+(i+1)+": ");
           n4=Leer.nextInt();
            promedio=nota(n1,n2,n3,n4,v1);
           v1[i]=promedio;
        }
  
               
         for(int i=0;i<=9;i++){
             if(v1[i]>=7){
                 System.out.println("El alumno numero "+(i+1)+" ha aprobado con una nota igual a "+v1[i]);
             }else{
                 System.out.println("El alumno numero "+(i+1)+" ha desaprobado con una nota igual a "+v1[i]);
             }
         }
       }
       public static double nota(int n1,int n2,int n3,int n4,double[] v1){
           double resultado=((n1*0.1)+(n2*0.15)+(n3*0.25)+(n4*0.5))/4;
           
          return resultado;
       }
}
*/   
       

            
