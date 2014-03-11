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
public class RA2_arrays_ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matris: ");
        int n = s.nextInt();
        int m = s.nextInt();
        System.out.println("Introduce los valores de la matriz: ");
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = s.nextInt();
            }
        }
        int auxn = m;
        int auxm = n;
        int[][] mattras = new int[auxn][auxm];
        for (int i = 0; i < auxn; i++) {
            for (int j = 0; j < auxm; j++) {
                mattras[i][j] = mat[j][i];
            }
        }
        System.out.println("La matriz trasposada es: ");
        for (int i = 0; i < auxn; i++) {
            for (int j = 0; j < auxm; j++) {
                System.out.print(mattras[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
