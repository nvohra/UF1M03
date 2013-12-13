/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.classe;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio16 {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una serie de numeros positivos, y un numero negativo para acabar la serie");
        int n = s.nextInt();
        int minimo = 99999;
        int maximo = 0;
        int i = 0;
        int suma = 0;
        while (n >= 0) {
            i++;
            suma += n;
            if (minimo >= n) {
                minimo = n;
            } else if (maximo <= n) {
                maximo = n;
            }
            n = s.nextInt();
        }
        int media = suma / i;
        System.out.println("minimo = " + minimo + ", " + "maximo = " + maximo + ", " + "media = " + media);
    }
}
