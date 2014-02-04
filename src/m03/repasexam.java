/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author USER
 */
public class repasexam {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        /*Construye una expresión booleana para el siguiente enunciado:
        Un sistema dispone de una alarma que en función de los valores recibidos por 3 sensores 
        se activará. La alarma se activa en los siguentes casos:
        S1 = 0; S2 = 1; S3 = 0
        S1 = 1; S2 = 1; S3 = 0
        S1 = 0; S2 = 1; S3 = 1
        S1 = 1; S2 = 1; S3 = 1*/

//        boolean alarmaactiva = false;
//        int s1;
//        int s2;
//        int s3;
//        s1 = s.nextInt();
//        s2 = s.nextInt();
//        s3 = s.nextInt();
//        if (s1 == 0 && s2 == 1 && s3 == 0 || s1 == 1 && s2 == 1 && s3 == 0 || s1 == 0 && s2 == 1 && s3 == 1
//                || s1 == 1 && s2 == 1 && s3 == 1) {
//            alarmaactiva = true;
//        }
//        if (alarmaactiva == true) {
//                System.out.println("La alarma se ha activado");
//        } else {
//                System.out.println("La alarma no se ha activado");
//            }
        
        
        //Pide al usuario que introduzca 3 valores e imprime por pantalla el máximo y el mínimo
//        int mayor = -999999;
//        int menor = 999999;
//        for (int i = 0; i < 3; i++) {
//            int n = s.nextInt();
//            if (n < menor) {
//                menor = n;
//            }
//            if (n > mayor) {
//                mayor = n;
//            }
//        }
//        System.out.println("El numero mayor es: " + mayor + ", el numero menor es: " + menor + ".");
        
        
        //Ordena de menor a mayor 3 valores introducidos por teclado. 
//        int[] vector = new int[3];
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] = s.nextInt();
//        }
//        Arrays.sort(vector);
//        for (int i = 0; i < vector.length; i++) {
//            System.out.println(vector[i]);
//        }
        
        
        //Imprimir un listado con los números del 1 al 100 cada uno con su respectivo cuadrado
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i + " " + i*i);
//        }
        
        
        //Imprimir los 100 primeros números de Fibonacci.
//        float i = 0;
//        float j = 1;
//        System.out.println(i);
//        System.out.println(j);
//        float suma;
//        for (int k = 1; k <= 98; k++) {
//            suma = i+j;
//            System.out.println(suma);
//            i = j;
//            j = suma;
//        }
        
        
        /*Leer en un array las alturas de N personas e imprimir por pantalla:
        a) la media de las estaturas
        b) las alturas maxima y mınima
        c) determine cuantos son mas altos y cuantos mas bajos que la media. Utilizando el valor 
        de la media anterior.*/
//        System.out.println("Introduce el numero de personas");
//        int n = s.nextInt();
//        int[] alturas = new int[n];
//        int suma = 0;
//        int mayor = -999999;
//        int menor = 999999;
//        System.out.println("Introduce las alturas de las personas");
//        for (int i = 0; i < alturas.length; i++) {
//            alturas[i] = s.nextInt();
//            suma += alturas[i];
//            if (alturas[i] < menor) {
//                menor = alturas[i];
//            }
//            if (alturas[i] > mayor) {
//                mayor = alturas[i];
//            }
//        }
//        int media;
//        media = suma/n;
//        System.out.println("La media es: " + media);
//        System.out.println("La maxima altura es: " + mayor + ", y la minima es: " + menor);
//        int contmas = 0;
//        int contmenos = 0;
//        for (int i = 0; i < alturas.length; i++) {
//            if (alturas[i] >= media) {
//                contmas++;
//            }
//            else {
//                contmenos++;
//            }
//        }
//        System.out.println("Personas mas altos que la media: " + contmas + ", personas mas bajas que la media: " + contmenos);
        
        
        //decir si una matris cuadrada es simetrica o no
//        System.out.println("Introduce el tamño del array");
//        int n = s.nextInt();
//        int[][] array = new int[n][n];
//        boolean simetric = true;
//        System.out.println("Introduce los valores del array");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                array[i][j] = s.nextInt();
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i][j] != array[j][i]) {
//                    simetric = false;
//                }
//            }
//        }
//        if (simetric == false) {
//            System.out.println("El array no es simetrico");
//        }
//        else {
//            System.out.println("El array es simetrico");
//        }
    }
}