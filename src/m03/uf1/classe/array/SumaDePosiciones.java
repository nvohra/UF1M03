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
public class SumaDePosiciones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][] tablero = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = s.nextInt();
            }
        }
        int suma = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                suma += tablero[i][j];
            }
        }
        System.out.println("La suma total de la matriu es: " + suma);
    }
}
