/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.classe.array;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author USER
 */
public class Barquitos {
    public static int dimension = 10;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random aleatorio = new Random();
        int[][] tabla = new int[dimension][dimension];
        int n;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                n = aleatorio.nextInt(100);
                if (n < 40) {
                    tabla[i][j] = 1;
                } else {
                    tabla[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
        int cnt = 0;
        for (int i = 0; i < dimension; i++) {
            System.out.println("Introdueix una posicio del [0][0] al [9][9].");
            int x = s.nextInt();
            int y = s.nextInt();
            if (tabla[x][y] == 1) {
                cnt++;
                System.out.println("Tocado");
            } else {
                System.out.println("Agua");
            }
        }
        System.out.println("Has tocado " + cnt + " veces.");
    }
}
