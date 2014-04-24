/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
public class Cancion {
    private String titulo;
    private String autor;
    
    public Cancion() {
        
    }
    
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String dameTitulo() {
        return this.titulo;
    }
    
    public String dameAutor() {
        return this.autor;
    }
    
    public void ponTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void ponAutor(String autor) {
        this.autor = autor;
    }
}
