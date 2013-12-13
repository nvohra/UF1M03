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
public class IncrementoDePoblacion {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        double A = 25000000;
        double B = 19900000;
        int fecha = 1994;
        while (A > B) {
            A = A * 1.02;
            B = B * 1.03;
            fecha++;
        }
        System.out.println("El any en que B sepera a A es: " + fecha);
    }
}
