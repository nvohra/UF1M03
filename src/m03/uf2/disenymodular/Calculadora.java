/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;

/**
 *
 * @author USER
 */
class Calculadora {
    private int op1;
    private int op2;
    private int resultado = 0;
    
    public Calculadora(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }
    
    public int getOp1() {
       return this.op1;
    }
    public void setOp1(int op1) {
        this.op1 = op1;
    }
    public int getOp2() {
       return this.op2;
    }
    public void setOp2(int op2) {
        this.op2 = op2;
    }
    public int getResultado() {
       return this.resultado;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    void sumar() {
        this.resultado = this.op1 + this.op2;
    }

    void restar() {
        this.resultado = this.op1 - this.op2;
    }

    void multiplicar() {
        this.resultado = this.op1*this.op2;
    }

    void dividir() {
        this.resultado = this.op1/this.op2;
    }

    @Override
    public String toString() {
        return "Calculadora{op1=" + this.op1 + ", op2=" + this.op2 + ", resultado=" + this.resultado + "}";
    } 
}
