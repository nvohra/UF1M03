/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
class Casa {
    private String material;
    private boolean derrumbada;
    
    Casa(String material) {
        this.material = material;
        this.derrumbada = false;
    }
    
    public boolean fabricada(String material) {
        return this.material == material;
    }
    
    public void derrumbar() {
        this.derrumbada = true;
    }
    
    @Override
   public String toString() {
        return "Casa[" + 
                this.material + 
                ", " + 
                this.derrumbada +
                "]";
    }
}
