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
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] liminf = {0, 1000000, 2500001, 3800001, 6000000};
        int[] limsup = {1000000, 2500000, 3800000, 6000000, 10000000};
        double[] pct = {0.05, 0.12, 0.15, 0.22, 0.30};
        System.out.println("Introduce el salario mensual:");
        double salmensual = s.nextInt();
        System.out.println("Introduce el numero de pagas:");
        int numpagas = s.nextInt();
        double calsal = salmensual * numpagas;
        int i = 0;
        while (i < 5) {
            if (calsal >= liminf[i] && calsal <= limsup[i]) {
                break;
            }
            i++;
        }
        System.out.println("El impuesto a pagar es de: " + pct[i]*calsal + "€");
    }
}
