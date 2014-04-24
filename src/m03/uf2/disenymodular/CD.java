/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author USER
 */
public class CD {
    private Cancion[] canciones;
    private int contador;
    
    public CD() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño del vector");
        int n = teclado.nextInt();
        this.canciones = new Cancion[n];
        System.out.println("Introduce el titulo y autor de las canciones");
        for (int i = 0; i < canciones.length; i++) {
            String titulo = teclado.next();
            String autor = teclado.next();
            canciones[i] = new Cancion();
            canciones[i].ponTitulo(titulo);
            canciones[i].ponAutor(autor);
        }
        this.contador = n;
    }
    
    public int numeroCanciones() {
        return this.contador;
    }
    
    public Cancion dameCancion(int posicion) {
        return canciones[posicion-1];
    }
    
    public void grabaCancion(int posicion, Cancion nueva) {
        canciones[posicion-1] = nueva;
    }
    
    public void agrega(Cancion ultima) {
        canciones = Arrays.copyOf(canciones, canciones.length+1);
        canciones[canciones.length-1] = ultima;
        this.contador = canciones.length;
    }
    
    public void elimina(int posicion) {
        canciones[posicion-1] = new Cancion();
    }
}
