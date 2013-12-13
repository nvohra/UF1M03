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
public class SerieDeNumeros {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int cnt = 0;
        int suma = 0;
        for (int i = 0; i < 20; i++) {
            if (i%2==0) {
                cnt++;
                suma+=i;
            }
        }
        int resultat = suma/cnt;
        System.out.println(resultat);
    }
}
