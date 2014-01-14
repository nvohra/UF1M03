/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.classe.array;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        //calcula las notas de los alumnos
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos:");
        int n = s.nextInt();
        //aunq float guarda solo las notas, la columna 3 se añade para guardar las medias
        float[][] notas = new float[n][3];
        String[] nombre = new String[n];
        System.out.println("Introduce los porcentajes del primer parcial y el del segundo:");
        float por1 = s.nextFloat();
        float por2 = s.nextFloat();
        System.out.println("Introduce los nombres de los " + n + " alumnos mas sus respectivas notas de los 2 parciales:");
        for (int i = 0; i < n; i++) {
            float mediatotal = 0;
            nombre[i] = s.next();
            for (int j = 0; j < 2; j++) {
                notas[i][j] = s.nextInt();
                if (j == 0) {
                    mediatotal = (notas[i][j]*por1)/100;
                } else {
                 mediatotal += ((notas[i][j]*por2)/100);   
                }
            }
//            notas[i][2] = mediatotal/2;
            notas[i][2] = mediatotal;
            System.out.println(mediatotal);
        }
        //sacar los alumnos suspensos y aprobados
        String sus = "";
        String apro = "";
        float max = 0;
        for (int i = 0; i < n; i++) {
            if (notas[i][2] < 5) {
                sus += nombre[i] + ", ";
            } else {
                apro += nombre[i] + ", ";
                if (max < notas[i][2]) {
                    max = notas[i][2];
                }
            }
        }
        //sacar los alumnos con la maxima nota
        String maxnot = "";
        for (int i = 0; i < n; i++) {
            if (notas[i][2] == max) {
                maxnot += nombre[i] + ", ";
            }
        }
        System.out.println("Alumnos suspensos: " + sus);
        System.out.println("Alumnos aprobados: " + apro);
        System.out.println("Alumnos con la nota maxima = " + max + ", son: " + maxnot);
    }
}
