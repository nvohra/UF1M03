/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author USER
 */
public class Dado {
    private int numero;
    
    public Dado() {
        this.numero = 0;
    }
    public int lanzar() {
        Random r = new Random();
        this.numero = r.nextInt(6);
        return this.numero + 1;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        
        return "Dado[" + (this.numero + 1) + "]";
    }
}
