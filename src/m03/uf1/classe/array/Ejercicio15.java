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
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //rellenar x con valores alternados de v y w
        int[] v = new int[5];
        int[] w = new int[5];
        int[] x = new int[10];
         for (int i = 0; i < 5; i++) {
            v[i] = s.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            w[i] = s.nextInt();
        }
        int inv = 0;
        int inw = 0;
        for (int inx = 0; inx < 10; inx++) {
            if (inx%2 == 0) {
                x[inx] = v[inv];
                inv++;
            } else {
                x[inx] = w[inw];
                inw++;
            }
        }
       for (int i = 0; i < 10; i++) {
           System.out.print(x[i] + " ");
       }
       System.out.println();
    }
}
