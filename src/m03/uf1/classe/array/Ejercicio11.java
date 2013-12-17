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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //calcular el indice del valor menor
        int[] vector = new int[10];
        for (int i = 0; i < 10; i++) {
            vector[i] = s.nextInt();
        }
        int j = 1;
        int k = 0;
        int menor = 0;
        while (j < 10) {
            if (vector[k] < vector[j]) {
                menor = k;
            } else {
                menor = j;
                k = j;
            }
            j++;
        }
        System.out.println("Indice del valor menor del vector: " + menor);
    }
}
