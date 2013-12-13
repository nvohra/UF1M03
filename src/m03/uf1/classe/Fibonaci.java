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
public class Fibonaci {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("100 primers nombres de Fibonacci");
        String salida = "";
        long i = 0;
        long j = 1;
        long suma = 0;
        System.out.println(i);
        System.out.println(j);
        for(int cnt=0; cnt<=97; cnt++) {
                suma = i+j;
                i = j;
                j = suma;
                System.out.println(suma);
            }
        }
    }
