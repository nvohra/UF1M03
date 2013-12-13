/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.entregas;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AvaluacioDeExpresio {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("introduce 4 enteros");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        boolean primero = (2-a*b+c) < ((2-a)*b+c);
        boolean segundo = (a*b-c*a-d) > (a/3-b);
        boolean tercer = (a/(33-b)) == (d*23-1+b);
        System.out.println(primero + ", " + segundo + ", " + tercer);
    }
}
