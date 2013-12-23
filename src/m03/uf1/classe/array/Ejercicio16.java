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
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //rellenar i con posisiones par de v, y p con posisiones impar de v
        int[] i = new int[5];
        int[] p = new int[5];
        int[] v = new int[10];
        for (int j = 0; j < 10; j++) {
            v[j] = s.nextInt();
        }
        int ini = 0;
        int inp = 0;
        for (int inv = 0; inv < 10; inv++) {
            if (inv % 2 == 0) {
                i[ini] = v[inv];
                ini++;
            } else {
                p[inp] = v[inv];
                inp++;
            }
        }
        for (int j = 0; j < 5; j++) {
            System.out.print(i[j] + " ");
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.print(p[j] + " ");
        }
        System.out.println();
    }
}
