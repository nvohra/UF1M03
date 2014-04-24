/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
public class Racional {
    private int numerador;
    private int denominador;
    
    //constructor
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public int getNumerador() {
        return this.numerador;
    }
    
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    
    public int getDenominador() {
        return this.denominador;
    }
    
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public static Racional producto(Racional r1, Racional r2) {
        Racional resultado;
        int nuevonumerador;
        int nuevodenominador;
        
        nuevonumerador = r1.getNumerador() * r2.getNumerador();
        nuevodenominador = r1.getDenominador() * r2.getDenominador();
        
        resultado = new Racional(nuevonumerador, nuevodenominador);
        return resultado;
    }
    
    public static Racional division(Racional r1, Racional r2) {
        Racional resultado;
        int nuevonumerador;
        int nuevodenominador;
        nuevonumerador = r1.getNumerador() * r2.getDenominador();
        nuevodenominador = r1.getDenominador() * r2.getNumerador();
        
        resultado = new Racional(nuevonumerador, nuevodenominador);
        return resultado;
    }
    
    @Override
    public String toString() {
        String cadena;
        cadena = "Racional[numerador = " + this.numerador + ", denominador = " + this.denominador + "]";
        return cadena;
    }
}
