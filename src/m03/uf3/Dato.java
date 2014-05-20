/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf3;

import java.io.File;
import java.util.Scanner;
import java.lang.Integer;
/**
 *
 * @author USER
 */
public class Dato {
    
    public static void main(String[] args) {
        Dato programa = new Dato();
        programa.inici();
    }

    public void inici() {
        int n = 10;
        try {
            File lec = new File("C:/Users/USER/Desktop/carpetas/naman/prueba/documento2.txt");
            Scanner teclado = new Scanner(lec);
            String esnum;
            int num;
            int sum = 0;
            int i = 0;
            while (i < n) {
                esnum = teclado.next();
                if (isInteger(esnum)) {
                    num = Integer.parseInt(esnum);
                    sum += num;
                    i++;
                }
            }
            teclado.close();
            System.out.println("La suma de los 10 primeros numeros del fichero: " + lec.getName() 
                    + " es: " + sum);
        } catch (Exception e) {
            System.out.println("Hay un error: " + e);
        }
    }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
