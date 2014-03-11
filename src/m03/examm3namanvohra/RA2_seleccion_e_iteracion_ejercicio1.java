/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.examm3namanvohra;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class RA2_seleccion_e_iteracion_ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix un valor: ");
        int n = s.nextInt();
        int menor = n;
        System.out.println("introdueix 9 valors: ");
        for (int i = 0; i < 9; i++) {
            n = s.nextInt();
            if (n < menor) {
                menor = n;
            }
        }
        System.out.println("El numero mas pequeño es: " + menor);
    }
}
