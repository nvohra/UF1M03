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
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < 10; i++) {
            int sumfila = 0;
            int sumcolumna = 0;
            for (int j = 0; j < 10; j++) {
                sumfila += matriz[i][j];
                sumcolumna += matriz[j][i];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumfila);
            System.out.println("Suma de la columna " + (i + 1) + ": " + sumcolumna);
        }
    }
}
