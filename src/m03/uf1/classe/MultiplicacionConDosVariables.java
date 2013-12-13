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
public class MultiplicacionConDosVariables {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double operando1;
        int operando2;
        int operando3;
        System.out.println("Introduce los 3 operandos que quieras sumar:");
        operando1 = s.nextDouble();
        operando2 = s.nextInt();
        operando3 = s.nextInt();
        double resultat = operando1+operando2+operando3;
        System.out.println(resultat);
        
    }
}
