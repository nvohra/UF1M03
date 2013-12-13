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
public class AnaliziOperador {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("introduex els 2 valors");
        int a = s.nextInt();
        int b = s.nextInt();
        boolean r = a > b;
        System.out.println(r);
    }
}
