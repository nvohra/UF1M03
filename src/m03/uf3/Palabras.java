/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf3;
import java.io.File;
import java.util.Scanner;
import java.lang.Integer;
import java.io.PrintStream;
/**
 *
 * @author USER
 */
public class Palabras {
    public static void main(String[] args) {
        Palabras programa = new Palabras();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de 1 a 4 para elegir una accion: " + "\n"
                + "1. Vocales que hay en un fichero." + "\n"
                + "2. Consonantes que hay en un fichero." + "\n"
                + "3. Palabras que hay en un fichero." + "\n"
                + "4. Elige una palabra para contar las veces que aparece en el texto.");
        int num = teclado.nextInt();
        switch (num) {
            case 1: programa.contarvocales();
                    break;
            case 2: programa.contarconsonantes();
                    break;
            case 3: programa.contarpalabras();
                    break;
            case 4: programa.numpalabras();
                    break;
            default: System.out.println("Opcion incorrecta.");
        }
    }
    public void contarvocales() {
        
    }
    
    public void contarconsonantes() {
        
    }
    
    public void contarpalabras() {
        
    }
    
    public void numpalabras() {
        
    }
}
