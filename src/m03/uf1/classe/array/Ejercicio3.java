/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.classe.array;

import java.util.Random;

/**
 *
 * @author USER
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Random s = new Random();
        int[] tabla = new int[20];
        for (int i = 0; i < 20; i++) {
            int n = s.nextInt(100);
            tabla[i]= n;
        }
        boolean trobat = false;
        for (int i = 0; i < 20; i++) {
            if (tabla[i] > 30) {
                trobat = true;
                System.out.println("Poscicion: " + i + ", valor: " + tabla[i]);
            }
        }
        if (trobat == false) {
            System.out.println("NO HAY NUMEROS MAYORES QUE 30");
        }
    }
}
