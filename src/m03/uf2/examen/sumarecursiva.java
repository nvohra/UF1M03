/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.examen;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class sumarecursiva {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduce un numero que sera las veces que quieres sumar");
        int n = sumarecursiva.teclado.nextInt();
        System.out.println("El resultado es: " + sumarecursiva.recursiva(n));
    }
    
    public static int recursiva(int n) {
         if(n == 0)
            return 0;
         else {
            System.out.println("Introduce el valor a sumar");
            int i = sumarecursiva.teclado.nextInt();
            return i + recursiva(n-1);
         }
      }
}
