/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
public class Polinomio {
    private int a;
    private int b;
    private int c;
    
    public Polinomio(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getA() {
        return this.a;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public int getB() {
        return this.b;
    }
    
    public void setB(int b) {
        this.b = b;
    }
    
    public int getC() {
        return this.c;
    }
    
    public void setC(int c) {
        this.c = c;
    }
    
    public Polinomio suma(Polinomio p) {
        Polinomio resultado;
        int nuevoa;
        int nuevob;
        int nuevoc;
        nuevoa = this.a + p.getA();
        nuevob = this.b + p.getB();
        nuevoc = this.c + p.getC();
        
        resultado = new Polinomio(nuevoa, nuevob, nuevoc);
        return resultado;
    }
    
    public void producto(int numero) {
        this.a = this.a * numero;
        this.b = this.b * numero;
        this.c = this.c * numero;
    }
    
    public Polinomio resta(Polinomio p) {
        Polinomio resultado;
        int nuevoa;
        int nuevob;
        int nuevoc;
        nuevoa = this.a - p.getA();
        nuevob = this.b - p.getB();
        nuevoc = this.c - p.getC();
        
        resultado = new Polinomio(nuevoa, nuevob, nuevoc);
        return resultado;
    }
    
    public int resolver(int numero) {
        return this.a* (int) Math.pow(numero, 2) + this.b*numero + this.c;
    }
    
    @Override
    public String toString() {
        String cadena;
        cadena = "Polinomio[a = " + this.a + ", b = " + this.b +  ", c = " + this.c + "]";
        return cadena;
    }
}
