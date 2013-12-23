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
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //rellenar v y calcular su media, rellenar may con valores de v si son mayores q la media y men en caso contrario
        int[] may = new int[5];
        int[] men = new int[5];
        int[] v = new int[5];
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            v[i] = s.nextInt();
            suma += v[i];
        }
        int media = suma/v.length;
        int inmay = 0;
        int inmen = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= media) {
                may[inmay] = v[i];
                inmay++;
            } else {
                men[inmen] = v[i];
                inmen++;
            }
        }
        String salida1 = "Vector may: ";
        String salida2 = "Vector men: ";
        for (int i = 0; i < inmay; i++) {
            salida1 += may[i] + " ";
        }
        System.out.println(salida1);
        for (int i = 0; i < inmen; i++) {
            salida2 += men[i] + " ";
        }
        System.out.println(salida2);
    }
}
