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
public class Ejercicio2 {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a >= b) {
            System.out.println("Es divisible");
        } else {
            System.out.println("No es divisible");
        }
    }
}
