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
public class Ejercicio17 {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una serie de numeros positivos y negativos, y un 0 para acabar la serie");
        int n = s.nextInt();
        int neg = 0;
        int pos = 0;
        while (n != 0) {
            if (n > 0) {
                pos++;
            } else {
                neg++;
            }
            n = s.nextInt();
        }
        System.out.println("Hay " + neg + " numero/s negativo/s, Hay " + pos + " numero/s positivo/s.");
    }
}
