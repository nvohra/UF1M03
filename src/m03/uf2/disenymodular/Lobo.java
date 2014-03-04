/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
class Lobo {
    private String nombre;
    private Casa c;
    private boolean subiendo;
    private boolean muerto;
    
    //constructor
    public Lobo(String nombre) {
        this.nombre = nombre;
        this.subiendo = false;
        this.muerto = false;
        this.c = null;
    }
    
    public void mover(Casa c) {
        this.c = c;
    }
    
    public void soplar() {
        if (!this.c.fabricada("ladrillo")) {
            c.derrumbar();
        }
    }
    
    public void subirChimenea() {
        this.subiendo = true;
    }
    
    public void morir() {
        this.muerto = true;
    }
    
    @Override
   public String toString() {
        String casa = "Ninguna";
        
        if(this.c != null) {
            casa = this.c.toString();
        }
        return "Lobo[" + 
                this.nombre + 
                ", " + 
                casa +
                ", " +
                this.subiendo +
                ", " +
                this.muerto +
                "]";
    }
}
