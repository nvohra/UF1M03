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
public class TransformacionAritmeticas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double m = 23;
        double n = 12;
        double resultat;
        resultat = m + n;
        resultat = (((resultat - 10) * m) / n) + 20;
        System.out.println(resultat);
    }
}
