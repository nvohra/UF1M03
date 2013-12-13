/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.classe;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class NombresPrims {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix un nombre");
        int n = s.nextInt();
        System.out.println("El resultat son nombres prims menors que " + n);
        for (int i = 2; i < n; i++) {
            int j = 2;
            boolean es_prim = true;
            while (es_prim == true && j * j <= i) {
                if (i % j == 0) {
                    es_prim = false;
                }
                j++;
            }
            if (es_prim) {
                System.out.println(i);
            }
        }
    }
}
