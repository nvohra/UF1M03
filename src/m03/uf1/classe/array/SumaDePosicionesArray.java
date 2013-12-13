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
public class SumaDePosicionesArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arrayA = new int[5];
        int suma = 0;
        System.out.println("Introdueix un nombre, per definir el tamany del array");
        int n = s.nextInt();
        System.out.println("Introdueix els valors");
        for (int i = 0; i < n; i++) {
            arrayA[i] = s.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            suma += arrayA[i];
        }
        System.out.println("La suma dels valors es: " + suma);
    }
}
