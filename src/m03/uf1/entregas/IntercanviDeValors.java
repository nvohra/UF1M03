/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.entregas;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class IntercanviDeValors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("introduio els 2 valors");
        int numA = s.nextInt();
        int numB = s.nextInt();
        System.out.println("Abans\n-----");
        System.out.println(numA + " ," + numB);
        int aux = numA;
        numA = numB;
        numB = aux;
        System.out.println("\nDesprés\n------");
        System.out.println(numA + " ," + numB);
    }
}
