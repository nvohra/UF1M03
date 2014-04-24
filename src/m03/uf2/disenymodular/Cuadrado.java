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
class Cuadrado {
    private double lado;
    private String medida;
    private double perimetro;
    private double area;
    
    public Cuadrado(double lado, String medida) {
        this.lado = lado;
        this.medida = medida;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String getMedida() {
        return medida;
    }
    
    public void perimetro() {
        this.perimetro = 4*this.lado;
    }
    
    public void area() {
        this.area = Math.pow(this.lado, 2);
    }
    
    public double diagonal() {
        return this.lado*Math.sqrt(2);
    }

    @Override
    public String toString() {
        return "Cuadrado[perimetro=" + String.format("%.2f", this.perimetro) 
                + " " + getMedida() + ", " + "area=" + String.format("%.2f", this.area) 
                + " " + getMedida() + "]";
    }
    
}
