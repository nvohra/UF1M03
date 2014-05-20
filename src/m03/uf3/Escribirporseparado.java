/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Integer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Escribirporseparado {

    public static final int NUM_VALORS = 10;

    public static void main(String[] args) {
        Escribirporseparado programa = new Escribirporseparado();
        programa.inici();
    }

    public void inici() {
        String direccionlectura = "C:/Users/USER/Desktop/carpetas/naman/prueba/documento2.txt";
        int[] valors = leerdatos(direccionlectura);

        String direccionescritura = "C:/Users/USER/Desktop/carpetas/naman/prueba/documento3.txt";
        escribirdatos(direccionescritura, valors);
    }

    public int[] leerdatos(String nom) {
        try {
            File lec = new File(nom);
            Scanner lectura = new Scanner(lec);
            int[] dades = new int[NUM_VALORS];
            String esnum;
            int num;
            int resul;
            int i = 0;
            while (i < NUM_VALORS) {
                esnum = lectura.next();
                if (isInteger(esnum)) {
                    num = Integer.parseInt(esnum);
                    resul = num * 2;
                    dades[i] = resul;
                    i++;
                }
            }
            lectura.close();
            return dades;
        } catch (Exception e) {
            System.out.println("Hay un error: " + e);
            return null;
        }
    }

    public void escribirdatos(String nom, int[] dades) {
        try {
            File esc = new File(nom);
            PrintStream escritura = new PrintStream(esc);
            for (int i = 0; i < dades.length; i++) {
                escritura.print(dades[i]);
                escritura.print(" ");
            }
            escritura.close();
            System.out.println("Se han escrito los " + dades.length
                    + " numeros multiplicados por 2 en el " + esc.getName());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Escribirporseparado.class.getName()).log(Level.SEVERE, null, ex);
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
