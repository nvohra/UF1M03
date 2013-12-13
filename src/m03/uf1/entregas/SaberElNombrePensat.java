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
public class SaberElNombrePensat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("think a number");
        System.out.println("now + 1");
        System.out.println("now multiply 3");
        System.out.println("now + 1");
        System.out.println("now the number you obtain + the number you think");
        System.out.println("now right the number you obtain");
        int n = s.nextInt();
        int aux = (n-4)/4;
        System.out.println("The number you think is: " + aux);
    }
}
