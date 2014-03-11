/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.examm3namanvohra;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class RA2_seleccion_e_iteracion_ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        int j = 1;
        int k = 2;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        int suma;
        for (int h = 1; h <= 27; h++) {
            suma = i+j+k;
            System.out.println(suma);
            i = j;
            j = k;
            k = suma;
        }
    }
}
