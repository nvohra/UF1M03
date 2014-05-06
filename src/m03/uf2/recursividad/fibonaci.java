/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.recursividad;

/**
 *
 * @author USER
 */
public class fibonaci {
    public static void main(String[] args) {
        //devuelve la suma de los n primeros numeros de la succecion de fibonaci
        System.out.println(fibonaci.recursivo(5));
    }
    
    public static int recursivo(int n) {
        if (n == 0 || n == 1) return 1;
        else return fibonaci.recursivo(n-1) + fibonaci.recursivo(n-2);
    }
    
}
