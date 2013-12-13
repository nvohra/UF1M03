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
public class trueofalse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op1;
        int op2;
        int resultat;
        op1 = s.nextInt();
        op2 = s.nextInt();
        resultat = s.nextInt();
        System.out.println((op1*op2) == resultat);
    }
}
