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
public class RA2_arrays_ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vector = new int[10];
        System.out.println("Introduce 10 valores: ");
        for (int i = 0; i < 10; i++) {
            vector[i] = s.nextInt();
        }
        System.out.println("Introduce 1 valor: ");
        int valor = s.nextInt();
        boolean trobat = false;
        int j = 0;
        while ( j < 10) {
            if (valor == vector[j]) {
                trobat = true;
                break;
            }
            j++;
        }
        if (trobat == true) {
            System.out.println("La posicion del valor " + valor + " es: " + j);
        }
        else {
            System.out.println("-1");
        }
    }
}
