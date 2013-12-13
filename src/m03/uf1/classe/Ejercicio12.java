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
public class Ejercicio12 {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Calcula la suma de 1 + 2 + 3 + 4 + ... + n");
        int n = s.nextInt();
        int suma = 0;
        //mediante el while
//        int i = 1;
//        while (i <= n) {
//
//            suma += i;
//
//            i++;
//        }
        //mediante el do...while
//        int i = 1;
//        do {
//
//            suma += i;
//
//            i++;
//        } while (i <= n);
        //mediante el for
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println(suma);
//
    }
}
