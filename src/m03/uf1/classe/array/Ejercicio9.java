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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //muestra las 5 sumas impares
        int[] vector = new int[10];
        for (int i = 0; i < 10; i++) {
            vector[i] = s.nextInt();
        }
        for (int i = 1; i < 9; i++) {
            int suma = 0;
            if (i%2 != 0) {
            suma += vector[i]+vector[i+1];
            System.out.println(suma);
            }
        }
        System.out.println(vector[9]+vector[0]);
    }
}
