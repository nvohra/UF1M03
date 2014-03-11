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
public class Ejercicio20 {

    public static void main(String[] args) {
        //la hormiga borracha. Nunca te metas con las hormigas
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Introduce el tamaño del tablero NxM:");
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] tablero = new int[n][m];
        System.out.println("El tablero tiene " + n * m + " casillas.");
        System.out.println("Introduce el numero de terrones de azucar:");
        int ta = s.nextInt();
        for (int k = 0; k < ta; k++) {
            int i = r.nextInt(n);
            int j = r.nextInt(m);
            if (tablero[i][j] == 0) {
                tablero[i][j] = 1;
            } else {
                while (tablero[i][j] == 1) {
                    i = r.nextInt(n);
                    j = r.nextInt(m);
                }
                tablero[i][j] = 1;
            }
        }
        System.out.println("Introduce el numero de terrones de azucar con vino:");
        int tav = s.nextInt();
        for (int k = 0; k < tav; k++) {
            int i = r.nextInt(n);
            int j = r.nextInt(m);
            if (tablero[i][j] == 0) {
                tablero[i][j] = 2;
            } else {
                while (tablero[i][j] == 1 || tablero[i][j] == 2) {
                    i = r.nextInt(n);
                    j = r.nextInt(m);
                }
                tablero[i][j] = 2;
            }
        }
        System.out.println("Introduce el numero de terrones de azucar con veneno:");
        int tae = s.nextInt();
        for (int k = 0; k < tae; k++) {
            int i = r.nextInt(n);
            int j = r.nextInt(m);
            if (tablero[i][j] == 0) {
                tablero[i][j] = 3;
            } else {
                while (tablero[i][j] == 1 || tablero[i][j] == 2 || tablero[i][j] == 3) {
                    i = r.nextInt(n);
                    j = r.nextInt(m);
                }
                tablero[i][j] = 3;
            }
        }
        //asignamos una posicion a la hormiga, la posicion tiene que estar vacia
        int x = r.nextInt(n);
        int y = r.nextInt(m);
        if (tablero[x][y] == 0) {
            tablero[x][y] = 4;
        } else {
            while (tablero[x][y] != 0) {
                x = r.nextInt(n);
                y = r.nextInt(m);
            }
            tablero[x][y] = 4;
        }
        //se declaran los numeros de pasos y sentido
        System.out.println("Introduce el numero de pasos inciales");
        int npas = s.nextInt();
        //el sentido se toma en funcion de si 0 = arriba, 1 = derecha, 2 = abajo, 3 = izquierda
        System.out.println("Introduce el sentido de la hormiga(0 = arriba, 1 = derecha, 2 = abajo, 3 = izquierda)");
        int sentido = s.nextInt();
        if (sentido == 0) {
            boolean puede = false;
            int aux = 0;
            while (puede == false) {
                int cont = 0;
                for (int i = x; i >= 0; i--) {
                    
                }
            }
        }
    }
}