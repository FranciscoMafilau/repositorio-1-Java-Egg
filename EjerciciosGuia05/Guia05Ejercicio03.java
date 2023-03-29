package guía05;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Guia05Ejercicio03 {

    public static void main(String[] args) {

        int[] vector = new int[5];
        int unDigito = 0;
        int dosDígitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 99999 + 1);

            System.out.println("[" + vector[i] + "]");
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] <= 9) {
                unDigito++;
            }
            if (vector[i] > 9 && vector[i] <99) {
                dosDígitos++;
            }
            if (vector[i] > 99 && vector[i] <999) {
                tresDigitos++;
            }
            if (vector[i] > 999 && vector[i] <9999) {
                cuatroDigitos++;
            }
            if (vector[i] > 9999 && vector[i] <99999) {
                cincoDigitos++;
            }
        }
            System.out.println("hay " + unDigito + " números de un dígito, y " + dosDígitos + " números de dos dígitos " 
                    + tresDigitos + " numeros de tres digitos " + cuatroDigitos + " numeros de cuatro digitos " + cincoDigitos
                    + " numeros de cinco digitos");
        }
    }

/*
int length = String.valueOf(number).length();
*/