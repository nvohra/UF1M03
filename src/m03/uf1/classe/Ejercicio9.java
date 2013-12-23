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
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //saber los dias de un mes y un año concreto
        System.out.print("Introdueix mes: ");
        int mes = s.nextInt();
        System.out.print("Introdueix any: ");
        int any = s.nextInt();
        int dias = 0;
        if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0) {
            switch (mes) {
                case 1:
                    dias = 31;
                    break;
                case 2:
                    dias = 29;
                    break;
                case 3:
                    dias = 31;
                    break;
                case 4:
                    dias = 30;
                    break;
                case 5:
                    dias = 31;
                    break;
                case 6:
                    dias = 30;
                    break;
                case 7:
                    dias = 31;
                    break;
                case 8:
                    dias = 31;
                    break;
                case 9:
                    dias = 30;
                    break;
                case 10:
                    dias = 31;
                    break;
                case 11:
                    dias = 30;
                    break;
                case 12:
                    dias = 31;
                    break;
            }
        } else {
            switch (mes) {
                case 1:
                    dias = 31;
                    break;
                case 2:
                    dias = 28;
                    break;
                case 3:
                    dias = 31;
                    break;
                case 4:
                    dias = 30;
                    break;
                case 5:
                    dias = 31;
                    break;
                case 6:
                    dias = 30;
                    break;
                case 7:
                    dias = 31;
                    break;
                case 8:
                    dias = 31;
                    break;
                case 9:
                    dias = 30;
                    break;
                case 10:
                    dias = 31;
                    break;
                case 11:
                    dias = 30;
                    break;
                case 12:
                    dias = 31;
                    break;
            }
        }
        System.out.println(dias);
    }
}
