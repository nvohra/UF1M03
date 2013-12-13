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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i]=s.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            int cuadrado;
            cuadrado = numeros[i]*numeros[i];
            int cubo;
            cubo = cuadrado*numeros[i];
            System.out.println(numeros[i] + " " + cuadrado + " " + cubo);
        }
    }
}
