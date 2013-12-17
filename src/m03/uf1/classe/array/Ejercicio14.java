/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.classe.array;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //rellenar vector hasta el final o hasta que se introdusca un valor negativo
        int[] vector = new int[10];
        int k = 0;
        for (int i = 0; i < 10; i++) {
            int n = s.nextInt();
            if (n < 0) {
                break;
            }
            vector[i] = n;
            k = i;
        }
        for(int j = 0; j <= k; j++) {
            System.out.print(vector[j] + " ");
        }
        System.out.println();
    }
}
