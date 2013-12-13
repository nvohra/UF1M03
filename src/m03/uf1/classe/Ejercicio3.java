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
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max;
        int min;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= c) {
            max = b;
        } else {
            max = c;
        }
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("El maximo es " + max + " y el minimo es " + min);
    }
}
