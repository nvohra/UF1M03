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
    private Cerdito c1;
    private Cerdito c2;
    private Cerdito c3;
    
    private Lobo lobo;
    
    private Casa h1;
    private Casa h2;
    private Casa h3;
    public static void main(String[] args) {
        los3cerditos cuento = new los3cerditos();
        
        cuento.empezar();
    }
    public void empezar() {
        this.c1 = new Cerdito("small");
        this.c2 = new Cerdito("medium");
        this.c3 = new Cerdito("big");
        
        this.lobo = new Lobo("forious");
        
        this.h1 = c1.construir("paja");
        this.h2 = c2.construir("madera");
        this.h3 = c3.construir("ladrillo");
        
        System.out.println(this.toString());
        
        this.lobo.mover(this.h1);
        this.lobo.soplar();
        
        this.c1.mover(this.h2);
        
        System.out.println(this.toString());

        this.lobo.mover(this.h2);
        this.lobo.soplar();
        
        System.out.println(this.toString());

        this.c1.mover(this.h3);
        this.c2.mover(this.h3);
        
        System.out.println(this.toString());

        this.lobo.mover(this.h3);
        this.lobo.soplar();
        
        System.out.println(this.toString());

        this.lobo.subirChimenea();
        this.lobo.morir();
        
        System.out.println(this.toString());

    }
    
    @Override
    public String toString() {
        String salida;
        salida = "Los3Cerditos[" + 
                this.c1.toString() + 
                ", " + 
                this.c2.toString() +
                ", " +
                this.c3.toString() +
                ", " +
                this.lobo.toString() +
                ", " +
                this.h1.toString() +
                ", " +
                this.h2.toString() + 
                ", " + 
                this.h3.toString() +
                "]";
        return salida;
    }
}
