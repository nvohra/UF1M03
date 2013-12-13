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
public class ListaParDeNA2 {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix un nombre par");
        int n = s.nextInt();
        for (int i = n; i >= 2; i -= 2) {
            System.out.println(i);
        }
    }
}
