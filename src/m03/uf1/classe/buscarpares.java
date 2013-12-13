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
public class buscarpares {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix 2 nombres");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        String salida = "";
        for (int cnt = n1; cnt <= n2; cnt++) {
            if ((cnt % 2 == 0) & (cnt != n2)) {
                salida = salida + cnt + ",";
//              System.out.println("Els nombres par del interval son: " + cnt);
            } else if (cnt % 2 == 0) {
                salida = salida + cnt;
            }
        }
        System.out.println("[" + salida + "]");
    }
}
