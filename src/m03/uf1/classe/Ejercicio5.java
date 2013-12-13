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
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nota = s.nextInt();
        if (nota < 5) {
            System.out.println('S');
        } else if (nota < 6.5) {
            System.out.println('A');
        } else if (nota < 8.5) {
            System.out.println('N');
        } else if (nota < 9.75) {
            System.out.println('E');
        } else {
            System.out.println('M');
        }
    }
}
