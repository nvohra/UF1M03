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
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //calcular la suma de v+w y guardarla en x
        int[] v = new int[5];
        int[] w = new int[5];
        int[] x = new int[5];
        for (int i = 0; i < 5; i++) {
            v[i] = s.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            w[i] = s.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            x[i] = v[i]+w[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}
