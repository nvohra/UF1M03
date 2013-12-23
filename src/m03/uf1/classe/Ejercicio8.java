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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nota = s.nextInt();
        String acta;
        switch (nota) {
            case 5:
                acta = "A";
                break;
            case 6:
                acta = "A";
                break;
            case 7:
                acta = "N";
                break;
            case 8:
                acta = "N";
                break;
            case 9:
                acta = "E";
                break;
            case 10:
                acta = "M";
                break;
            default:
                acta = "S";
                break;
        }
        System.out.println(acta);
    }
}
