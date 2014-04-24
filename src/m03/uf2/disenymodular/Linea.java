/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
public class Linea {
    private Punto _puntoA;
    private Punto _puntoB;
    
    public Linea() {
        this._puntoA.setX(0);
        this._puntoA.setY(0);
        
        this._puntoB.setX(0);
        this._puntoB.setY(0);
    }
    
    public Linea(Punto A, Punto B) {
        this._puntoA = A;
        this._puntoB = B;
    }
    
    public void mueveDerecha(double x3) {
        double x1 = this._puntoA.getX();
        this._puntoA.setX(x1+x3);
        double x2 = this._puntoB.getX();
        this._puntoB.setX(x2+x3);
    }
    
    public void mueveIzquierda(double x3) {
        double x1 = this._puntoA.getX();
        this._puntoA.setX(x1-x3);
        double x2 = this._puntoB.getX();
        this._puntoB.setX(x2-x3);
    }
    
    public void mueveArriba(double y3) {
        double y1 = this._puntoA.getY();
        this._puntoA.setX(y1+y3);
        double y2 = this._puntoB.getY();
        this._puntoB.setX(y2+y3);
    }
    
    public void mueveAbajo(double y3) {
        double y1 = this._puntoA.getY();
        this._puntoA.setX(y1-y3);
        double y2 = this._puntoB.getY();
        this._puntoB.setX(y2-y3);
    }

    @Override
    public String toString() {
        return "Linea{" + "PuntoA=" + _puntoA + ", _puntoB=" + _puntoB + '}';
    }
}
