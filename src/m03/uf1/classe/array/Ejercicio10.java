/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.classe.array;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //sacar las sumas parciales
        int[] vector = new int[5];
        for (int i = 0; i < 5; i++) {
            vector[i] = s.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            int suma = 0;
            for (int j = 0; j < i+2; j++) {
                suma += vector[j];
            }
            System.out.println(suma);
        }
    }
}
