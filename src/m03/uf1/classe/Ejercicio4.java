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
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i'
                || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
            System.out.println("Es Vocal");
        } else if ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z') {
            System.out.println("Es consonant");
        } else {
            System.out.println("Error");
        }

    }
}
