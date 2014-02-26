/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
public class los3cerditos {
    public static void main(String[] args) {
        Cerdito c1 = new Cerdito("samll");
        Cerdito c2 = new Cerdito("medium");
        Cerdito c3 = new Cerdito("big");
        
        Lobo lobo = new Lobo("forious");
        
        Casa h1 = c1.construir("paja");
        Casa h2 = c2.construir("madera");
        Casa h3 = c3.construir("ladrillo");
        
        lobo.mover(h1);
        lobo.soplar();
        
        c1.mover(h2);
        
        lobo.mover(h2);
        lobo.soplar();
        
        c1.mover(h3);
        c2.mover(h3);
        
        lobo.mover(h3);
        lobo.soplar();
        
        lobo.subirchimenea();
        lobo.muere();
    }
}
