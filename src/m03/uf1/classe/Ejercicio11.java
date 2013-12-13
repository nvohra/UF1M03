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
public class Ejercicio11 {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Suma de los n primeros pares");
        int n = s.nextInt();
        int suma = 0;
        //mediante el while
//        int i = 0;
//        while (i <= (n * 2)) {
//            if (i % 2 == 0) {
//                suma += i;
//            }
//            i++;
//        }
        //mediante el do...while
//        int i = 0;
//        do {
//            if (i % 2 == 0) {
//                suma += i;
//            }
//            i++;
//        } while (i <= (n * 2));
        //mediante el for
        for (int i = 0; i <= n * 2; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println(suma);
    }
}
