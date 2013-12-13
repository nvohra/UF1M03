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
public class Ejercicio19 {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix un nombre N > 0:");
        int n = s.nextInt();
        int aux = n;
        int i = 0;
        while (n >= 2) {
            n /= 2;
            i++;
        }
        System.out.println("El nombre " + aux + " es " + i + " vegades divisible per 2.");
    }
}
