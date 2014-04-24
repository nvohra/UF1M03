/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
public class TestCD {
    public static void main(String arg[]) {
        Cancion c = new Cancion("buscandoelamor3", "naman");
        CD a = new CD();
        System.out.println(a.numeroCanciones());
        System.out.println(a.dameCancion(1).dameTitulo() + " " + a.dameCancion(1).dameAutor());
        a.grabaCancion(1, c);
        System.out.println(a.dameCancion(1).dameTitulo() + " " + a.dameCancion(1).dameAutor());
        a.elimina(1);
        System.out.println(a.dameCancion(1).dameTitulo() + " " + a.dameCancion(1).dameAutor());
    }
}
