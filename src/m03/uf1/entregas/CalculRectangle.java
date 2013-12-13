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
public class CalculRectangle {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int costatGran = 7;
        int costatPetit = 2;
        int perimetre = costatGran*2 + costatPetit*2;
        int area = costatGran*costatPetit;
        System.out.println("Perimetre: " + perimetre);
        System.out.println("Area: " + area);
     }
}
