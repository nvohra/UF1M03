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
public class Ejercicio18 {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix un nombre N:");
        int n = s.nextInt();
        System.out.println("Es mostra la serie fins la 2^N potencia");
        for (int i = 1; i <= n; i++) {
            System.out.println(Math.pow(2,i));
        }
    }
}
