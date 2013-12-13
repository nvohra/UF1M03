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
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valor = s.nextInt();
        String dia;
        switch (valor) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;

            default:
                dia = "Dia incorrecto";
                break;

        }
        System.out.println(dia);
    }
}
