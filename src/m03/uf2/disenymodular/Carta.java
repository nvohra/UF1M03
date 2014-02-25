/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
public class Carta {
    private String palo;
    private int numero;
    
    //constructor
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    public String toString() {
        String cadena;
        cadena = "[numero = " + this.numero + ", palo = " + this.palo + "]";
        return cadena;
    }
}
