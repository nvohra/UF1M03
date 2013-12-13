/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.classe.array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] origen = new int[11];
        for (int i = 0; i < 11; i++) {
            origen[i]= s.nextInt();
        }
        int [] destino = new int[0];
        for (int i = 0; i < 11; i++) {
            if (origen[i] > 25 && origen[i]%2 == 0) {
                destino = Arrays.copyOf(destino, destino.length+1);
                destino[destino.length-1] = origen[i];
            }
        }
        for (int i = 0; i < origen.length; i++) {
            System.out.print(origen[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < destino.length; i++) {
            System.out.print(destino[i] + " ");
        }
        System.out.println();
    }
}
