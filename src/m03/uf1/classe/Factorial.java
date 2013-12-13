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
public class Factorial {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix un nombre");
        int n = s.nextInt();
        int factorial = n;
        //version ejercicio 5.
//        for (int i = 1; i <= n; i++) {
//            factorial = i;
//            for (int j = 1; (i - j) > 0; j++) {
//                factorial *= (i - j);
//            }
//            System.out.println("El factorial de " + i + " es " + factorial);
//        }
        //version ejercicio 6.
//        for (int j = 1; (n - j) > 0; j++) {
//            factorial *= (n - j);
//        }
//        System.out.println("El factorial de " + n + " es " + factorial);
        //version ejercicio 7.
        int cnt = 1;
        while (cnt <= 10) {
            for (int j = 1; (n - j) > 0; j++) {
                factorial *= (n - j);
            }
            cnt++;
            System.out.println("El factorial de " + n + " es " + factorial);
            n = s.nextInt();
            factorial = n;
        }
    }
}
