/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
public class Jugador {
    private String nombre;
    private String estado;
    private int partidasganadas;
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public int LanzarDado(Dado d) {
        return d.lanzar();
    }
    
    public void Estado(String estado) {
        this.estado = estado;
    }

    public int getPartidasganadas() {
        return this.partidasganadas;
    }
    
    public void RondaGanada(int cont) {
        this.partidasganadas = cont;
    }
    
    @Override
    public String toString() {
        
        return "El jugador " + this.nombre + " es el " + this.estado;
    }
}
