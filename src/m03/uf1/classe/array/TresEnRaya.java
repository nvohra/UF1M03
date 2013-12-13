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
public class TresEnRaya {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] arrayA = new char[3][3];
        int cnt2 = 0;
        boolean merit = false;
        int cnt;
        for (cnt = 0; cnt < 9; cnt++) {
            System.out.println("Indroduiu les dos cordenades mes el valor");
            int i = s.nextInt();
            int j = s.nextInt();
            char valor = s.next().charAt(0);
            arrayA[i][j] = valor;
            if (cnt2 >= 4) {
                boolean enraya = true;
                //mirar si las filas estan en raya
                for (int k = 0; k < 3; k++) {
                    enraya = true;
                    for (int h = 0; h < 2; h++) {
                        if (enraya && arrayA[k][h + 1] != arrayA[k][h]) {
                            enraya = false;
                        }
                    }
                    if (enraya) {
                        break;
                    }
                }
                //mirar si las columnas estan en raya
                if (enraya == false) {
                    for (int n = 0; n < 3; n++) {
                        enraya = true;
                        for (int h = 0; h < 2; h++) {
                            if (enraya && arrayA[h + 1][n] != arrayA[h][n]) {
                                enraya = false;
                            }
                        }
                        if (enraya) {
                            break;
                        }
                    }
                }
                //mirar si las diagonales estan en raya
                if (enraya == false) {
                    int x = 0;
                    int y = 0;
                    enraya = true;
                    while (enraya && x < 2) {
                        if (arrayA[x+1][y+1]!= arrayA[x][y]) {
                            enraya = false;
                        }
                        x++;
                        y++;
                    }
                }
                if (enraya == false) {
                    int a = 2;
                    int b = 0;
                    enraya = true;
                    while (enraya && a >= 1) {
                        if (arrayA[a-1][b+1] != arrayA[a][b]) {
                            enraya = false;
                        }
                        a--;
                        b++;
                    }
                }
                if (enraya) {
                    merit = enraya;
                }
            }
            cnt2++;
            if (merit) {
                System.out.println("El guanyador a sigut l'ultima persona en introduir el valor");
                break;
            }
        }
        if (merit == false) {
            System.out.println("No hi ha guanyador");
        }
    }
}
