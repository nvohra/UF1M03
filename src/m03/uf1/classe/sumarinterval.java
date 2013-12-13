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
public class sumarinterval {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("introdueix 2 nombres");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int sumainterval = 0;
//        for (int i = n1; i <= n2; i++) {
//            sumainterval += i;
//        }
        
        //otras maneras de hacerlo
        while (n1 <= n2) {
            sumainterval += n1;
            n1++;
        }
       
        System.out.println("La suma del intervalo es = " + sumainterval);
    }
}
