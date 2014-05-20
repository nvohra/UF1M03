/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf3;

import java.io.File;
import java.util.Scanner;
import java.io.PrintStream;
import java.lang.Integer;

/**
 *
 * @author USER
 */
public class Escribir {

    public static final int NUM_VALORS = 10;

    public static void main(String[] args) {
        Escribir programa = new Escribir();
        programa.inici();
    }

    public void inici() {
        try {
            File lec = new File("C:/Users/USER/Desktop/carpetas/naman/prueba/documento2.txt");
            Scanner lectura = new Scanner(lec);

            File esc = new File("C:/Users/USER/Desktop/carpetas/naman/prueba/documento3.txt");
            PrintStream escritura = new PrintStream(esc);

            String esnum;
            int num;
            int resul;
            int i = 0;
            while (i < NUM_VALORS) {
                esnum = lectura.next();
                if (isInteger(esnum)) {
                    num = Integer.parseInt(esnum);
                    resul = num * 3;
                    escritura.print(resul);
                    escritura.print(" ");
                    i++;
                }
            }
            lectura.close();
            escritura.close();
            System.out.println("Se han escrito los " + NUM_VALORS + 
                    " numeros multiplicados por 3 en el " + esc.getName());
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
