/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.disenymodular;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Mat {
    private Scanner teclado = new Scanner(System.in);
    private int[][] mat;
    private int dim;
    
    public Mat(int dim) {
        this.dim = dim;
        this.mat = new int[dim][dim];
    }
    
    public int getElemento(int i, int j) {
        return this.mat[i][j];
    }
    
    public void setElemento(int i, int j, int valor) {
        this.mat[i][j] = valor;
    }
    
    public int longitud() {
        return this.dim;
    }
    
    public Mat sumamat(Mat m2) {
        Mat result = new Mat(this.longitud());
        for (int i = 0; i < this.longitud(); i++) {
            for (int j = 0; j < this.longitud(); j++) {
                int valor = this.getElemento(i, j) + m2.getElemento(i, j);
                result.setElemento(i, j, valor);
            }
        }
        return result;
    }
    
    public Mat restamat(Mat m2) {
        Mat result = new Mat(this.longitud());
        for (int i = 0; i < this.longitud(); i++) {
            for (int j = 0; j < this.longitud(); j++) {
                int valor = this.getElemento(i, j) - m2.getElemento(i, j);
                result.setElemento(i, j, valor);
            }
        }
        return result;
    }
    
    public void multescalar(int n) {
        for (int i = 0; i < this.longitud(); i++) {
            for (int j = 0; j < this.longitud(); j++) {
                int valor = this.getElemento(i, j) * n;
                this.setElemento(i, j, valor);
            }
        }
    }
    
    @Override
    public String toString() {
        String cadena;
        cadena = "Matriz: " + "\n";
        for (int i = 0; i < this.longitud(); i++) {
            for (int j = 0; j < this.longitud(); j++) {
                cadena += this.getElemento(i, j) + " ";
            }
            cadena += "\n";
        }
        return cadena;
    }
}
