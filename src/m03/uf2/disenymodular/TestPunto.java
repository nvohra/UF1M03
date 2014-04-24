/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
public class TestPunto {
    public static void main(String[] args) {
        Punto p1 = new Punto(1, 1);
        Punto p2 = new Punto(1, 1);
        Punto p3 = new Punto();
                
        p3.sumar(p1, p2);
        System.out.println(p3);
        
        double d = p1.distancia(p2);
        System.out.println("Distancia entre " + p1 + " y " + p2 + " es igual a " + d);
        
        boolean sonigual = p1.iguales(p2);
        if (sonigual) {
            System.out.println("El " + p1 + " y " + p2 + "son iguales");
        }
        else {
            System.out.println("El " + p1 + " y " + p2 + " son diferentes");
        }
        
        System.out.println("El " + p1 + " se encuentra en el cuadrante numero " + p1.cuadrante());
    }
}
