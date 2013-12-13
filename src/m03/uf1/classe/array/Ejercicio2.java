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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vector = new int[15];
        for (int i = 0; i < 15; i++) {
            vector[i]=s.nextInt();
        }
        System.out.println("Introdueix un nombre");
        int n = s.nextInt();
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        System.out.println("Suma dels primers N elements del vector = " + suma);
    }
}
