/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
class Calculadora2 {
    private int resultado = 0;
    
    public Calculadora2() {
        
    }
    
    public int getResultado() {
       return this.resultado;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    void sumar(int op1, int op2) {
        this.resultado = op1 + op2;
    }

    void restar(int op1, int op2) {
        this.resultado = op1 - op2;
    }

    void multiplicar(int op1, int op2) {
        this.resultado = op1*op2;
    }

    void dividir(int op1, int op2) {
        this.resultado = op1/op2;
    }

    @Override
    public String toString() {
        return "Calculadora{resultado=" + this.resultado + "}";
    } 
}
