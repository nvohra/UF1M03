/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
public class Test {
    public static void main(String[] args) {
        Carta c1 = new Carta(4, "trebol");
        Carta c2 = new Carta(10, "diamantes");
        System.out.println(c1);
        
        Racional r1 = new Racional(5, 3);
        Racional r2 = new Racional(2, 5);
        Racional r3 = Racional.producto(r1, r2);
        System.out.println("El producto de " + r1 + " y " + r2 + " es igual " + r3);
        Racional r4 = Racional.division(r1, r2);
        System.out.println("La division de " + r1 + " y " + r2 + " es igual " + r4);
    }
}
