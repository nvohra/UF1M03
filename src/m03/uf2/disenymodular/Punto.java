/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;
import java.lang.Math;
/**
 *
 * @author USER
 */
class Punto {
    private double x;
    private double y;
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void sumar(Punto p1, Punto p2) {
        
        this.x  = p1.getX() + p2.getX();
        this.y = p1.getY() + p2.getY();
        
    }
    
    public double distancia(Punto p) {
        double aux = Math.pow(p.getX()-this.x, 2) + Math.pow(p.getY()-this.y, 2);
        return Math.sqrt(aux);
    }
    
    public boolean iguales(Punto p) {
        return this.x == p.getX() && this.y == p.getY();
    }
    
    public int cuadrante() {
        int numcuadrante;
        if (this.x >= 0 && this.y > 0) {
            numcuadrante = 1;
        }
        else if (this.x >= 0 && this.y < 0) {
            return numcuadrante = 2;
        }
        else if (this.x <= 0 && this.y < 0) {
            return numcuadrante = 3;
        }
        else {
            return numcuadrante = 4;
        }
        return numcuadrante;
    }

    @Override
    public String toString() {
        return "Punto[x=" + this.x + ", y=" + this.y + ']';
    }
    
}
