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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] diagonal = new int[5][5];
        int i = 0;
        for (int j = 0; j < 5; j++) {
            diagonal[i][j] = 1;
            i++;
        }
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(diagonal[x][y] + " ");
            }
            System.out.println();
        }
    }
}
