/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.entregas;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ParellOSenar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdusca un numero");
        int n = s.nextInt();
        if (n%2 == 0) System.out.println("El nombre es parell");
        else System.out.println("El nombre es senar");
    }
    
}
