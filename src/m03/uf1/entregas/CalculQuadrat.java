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
public class CalculQuadrat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int costat;
        System.out.println("Introdueix costat:");
        costat = s.nextInt();
        System.out.println("El perimetre de costat es:");
        System.out.println(costat*4);
        System.out.println("El area de costat es:");
        System.out.println(costat*costat);
        
        
    }
}
