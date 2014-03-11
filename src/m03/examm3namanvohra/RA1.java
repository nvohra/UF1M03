/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.examm3namanvohra;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class RA1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //ejercicio 2:
        System.out.println("Introduce los valores de los 3 sensores: ");
        boolean alarmaactiva = false;
        int s1;
        int s2;
        int s3;
        s1 = s.nextInt();
        s2 = s.nextInt();
        s3 = s.nextInt();
        if ((s1 == 0 || s1 == 1) && s2 == 1 && s3 == 1) {
            alarmaactiva = true;
        } 
        if (s1 == 1 && s3 == 0) {
            alarmaactiva = true;
        }
        if (s1 == 0 && s2 == 1) {
            alarmaactiva = true;
        }
        if (alarmaactiva == true) {
                System.out.println("La alarma se ha activado");
        } else {
                System.out.println("La alarma no se ha activado");
            }
    }    
}
