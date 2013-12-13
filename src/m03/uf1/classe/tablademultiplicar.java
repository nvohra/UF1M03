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
public class tablademultiplicar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Introduce numero para obtener su tabla de multiplicar:");
        n = s.nextInt();
        System.out.println(n + "x0=" + n*0);
        System.out.println(n + "x1=" + n*1);
        System.out.println(n + "x2=" + n*2);
        System.out.println(n + "x3=" + n*3);
        System.out.println(n + "x4=" + n*4);
        System.out.println(n + "x5=" + n*5);
        System.out.println(n + "x6=" + n*6);
        System.out.println(n + "x7=" + n*7);
        System.out.println(n + "x8=" + n*8);
        System.out.println(n + "x9=" + n*9);
        System.out.println(n + "x10=" + n*10);
    }
}
