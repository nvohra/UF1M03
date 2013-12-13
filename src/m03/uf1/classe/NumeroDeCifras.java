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
public class NumeroDeCifras {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix un nombre");
        int n = s.nextInt();
        int cnt = 0;
        while (n != 0) {
            n = n/10;
            cnt++;
        }
        System.out.println("El nombre de cifres del nombre donat es: " + cnt);
    }
}
