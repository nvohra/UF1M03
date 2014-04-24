/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
public class TestCuadrado {
    public static void main(String[] arg) {
        Cuadrado c = new Cuadrado(5.2, "metros");
        
        c.perimetro();
        c.area();
        double d = c.diagonal();
        
        System.out.println(c);
        System.out.println("La mida de la diagonal del " + c + " es de " 
                + String.format("%.2f", d) + " " + c.getMedida() + " cuadrados.");
    }
}
