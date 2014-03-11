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
public class RA2_arrays_ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma = 0;
        int maxsuma = 0;
        int maxi = 0;
        int maxj = 0;
        System.out.println("Introduce el tamaño de la matriz: ");
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Introduece los valores de la matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    suma = mat[i+1][j] + mat[i+1][j+1] + mat[i][j+1];
                }
                if (maxsuma < suma) {
                    maxsuma = suma;
                    maxi = i;
                    maxj = j;
                }
                if (i == 0 && j == m-1) {
                    suma = mat[i][j-1] + mat[i+1][j-1] + mat[i+1][j];
                }
                if (maxsuma < suma) {
                    maxsuma = suma;
                    maxi = i;
                    maxj = j;
                }
                if (i == 0 && (0 < j && j <= m-2)) {
                    suma = mat[i][j-1] + mat[i+1][j-1] + mat[i+1][j] + mat[i+1][j+1] + mat[i][j+1];
                }
                if (maxsuma < suma) {
                    maxsuma = suma;
                    maxi = i;
                    maxj = j;
                }
                if (i == n-1 && j == 0) {
                    suma = mat[i-1][j] + mat[i-1][j+1] + mat[i][j+1];
                }
                if (maxsuma < suma) {
                    maxsuma = suma;
                    maxi = i;
                    maxj = j;
                }
                if (i == n-1 && (0 < j && j <= m-2)) {
                    suma = mat[i][j-1] + mat[i-1][j-1] + mat[i-1][j] + mat[i-1][j+1] + mat[i][j+1];
                }
                if (maxsuma < suma) {
                    maxsuma = suma;
                    maxi = i;
                    maxj = j;
                }
                if (i == n-1 && j == m-1) {
                    suma = mat[i-1][j] + mat[i-1][j-1] + mat[i][j-1];
                }
                if (maxsuma < suma) {
                    maxsuma = suma;
                    maxi = i;
                    maxj = j;
                }
                if ((i > 0 && i <= n-2) && j == 0) {
                    suma = mat[i-1][j] + mat[i-1][j+1] + mat[i][j+1] + mat[i+1][j+1] + mat[i+1][j];
                }
                if (maxsuma < suma) {
                    maxsuma = suma;
                    maxi = i;
                    maxj = j;
                }
                if ((i > 0 && i <= n-2) && j == m-1) {
                    suma = mat[i-1][j] + mat[i-1][j-1] + mat[i][j-1] + mat[i+1][j-1] + mat[i+1][j];
                }
                if (maxsuma < suma) {
                    maxsuma = suma;
                    maxi = i;
                    maxj = j;
                }
                if ((i > 0 && i <= n-2) && (0 < j && j <= m-2)) {
                    suma = mat[i-1][j-1] + mat[i][j-1] + mat[i+1][j-1] + mat[i+1][j] + mat[i+1][j+1] +
                            mat[i][j+1] + mat[i-1][j+1] + mat[i-1][j];
                }
                if (maxsuma < suma) {
                    maxsuma = suma;
                    maxi = i;
                    maxj = j;
                }
            }
        }
        System.out.println("El indice de la maxima suma= " + maxsuma + " es: " + maxi + " " + maxj);
    }
}
