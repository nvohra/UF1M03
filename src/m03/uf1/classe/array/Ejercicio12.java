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
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //copiar valores del vector v a w en orden inverso
        int[] v = new int[5];
        int[] w = new int[5];
        int j = 4;
        for (int i = 0; i < 5; i++) {
            v[i] = s.nextInt();
            w[j] = v[i];
            j--;
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(w[i] + " ");   
        }
        System.out.println();
    }
}
