/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
class Cerdito {
   private String nombre;
   private Casa c;
   
   //constructor
   public Cerdito(String nombre) {
       this.nombre = nombre;
   }
   
   public Casa construir(String material) {
        this.c = new Casa(material);
       
       return c;
   }
   
   public void mover(Casa c) {
       this.c = c;
   }
   
   @Override
   public String toString() {
       String salida;
       salida = "Cerdito[" + 
                this.nombre + 
                ", " + 
                this.c.toString() +
                "]";
        return salida;
    }
}
