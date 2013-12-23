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
public class Ejercicio7 {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valor = s.nextInt();
        String dia;
        if (valor == 1) {
            dia = "Lunes";
        } else if (valor == 2) {
            dia = "Martes";
        } else if (valor == 3) {
            dia = "Miercoles";
        } else if (valor == 4) {
            dia = "Jueves";
        } else if (valor == 5) {
            dia = "Viernes";
        } else if (valor == 6) {
            dia = "Sabado";
        } else if (valor == 7) {
            dia = "Domingo";
        } else {
            dia = "Dia incorrecto";
        }
        System.out.println(dia);
    }
}
