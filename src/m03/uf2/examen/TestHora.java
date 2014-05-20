/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.examen;

/**
 *
 * @author USER
 */
public class TestHora {
    public static void main(String[] args) {
        Hora p = new Hora(1, 24, 30);
        p.valida(1, 24, 30);
        Hora u = new Hora();
        u.llegir();
        p.mostrar();
        int segundos = p.aSegundos();
        System.out.println(segundos);
        p.deSegundos(5070);
        p.mostrar();
        int result = p.segundosDesde(u);
        System.out.println(result);
        p.seguent();
        p.mostrar();
        p.anterior();
        p.mostrar();
        p.igualQue(u);
        p.menorQue(u);
        p.mayorQue(u);
    }
}
