/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf2.examen;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Hora {
    private int H;
    private int M;
    private int S;
    
    public Hora() {
        this.H = 0;
        this.M = 0;
        this.S = 0;
    }
    
    public Hora(int h, int m, int s) {
        this.H = h;
        this.M = m;
        this.S = s;
    }
    
    public void llegir() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introdueix les hores, els minuts i els segons");
        this.H = teclado.nextInt();
        this.M = teclado.nextInt();
        this.S = teclado.nextInt();
    }
    
    public void valida(int h, int m, int s) {
        if (h < 24 && m < 60 && s < 60) {
            System.out.println("La hora es valida"); 
        }
    }

    public int getH() {
        return H;
    }

    public void setH(int H) {
        this.H = H;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }

    public int getS() {
        return S;
    }

    public void setS(int S) {
        this.S = S;
    }
    
    public void mostrar() {
        String cadena;
        if (this.H < 10) {
            cadena = "0" + this.H + ":";
        }
        else cadena = this.H + ":";
        
        if (this.M < 10) {
            cadena += "0" + this.M + ":";
        }
        else cadena += this.M + ":";
        
        if (this.S < 10) {
            cadena += "0" + this.S;
        }
        else cadena += this.S;
        System.out.println(cadena);
    }
    
    public int aSegundos() {
        return this.H*3600 + this.M*60 + this.S;
    }
    
    public void deSegundos(int s) {
        this.H = s/3600;
        this.M = (s-(this.H*3600))/60; 
        this.S = s-((this.H*3600)+(this.M*60));
    }
    
    public int segundosDesde(Hora n) {
        int resul = (n.getH() - this.H)*3600;
        resul += (n.getM() - this.M)*60;
        resul += (n.getS() - this.S);
        return resul;
    }
    public void seguent() {
        if (this.S == 59) {
            this.S = 0;
            this.M += 1;
            this.H += 1;
            if (this.M == 60) {
                this.M = 0;
                this.H += 1;
            }
            else this.M += 1;
        
             if (this.H == 24) {
                this.H = 0;
            }
            else this.H += 1;
        }
        else this.S += 1;
        
    }
    
    public void anterior() {
        if (this.S == 0) {
            this.S = 59;
            this.M -= 1;
            this.H -= 1;
            if (this.M == -1) {
                this.M = 59;
                this.H -= 1;
            }
            else if (this.M != 0) this.M -= 1;
        
            if (this.H == -1) {
                this.H = 23;
            }
            else if (this.H != 0) this.H -= 1;
        }
        else this.S -= 1;
    }
    
    public void igualQue(Hora n) {
        if (this.H == n.getH() && this.M == n.getM() && this.S == n.getS()) {
            System.out.println("Es la misma hora");
        }
        else System.out.println("No es la misma hora");
    }
    
    public void menorQue(Hora n) {
        if (this.H < n.getH()) {
            System.out.println("La hora es anterior a la proporcionada");
        }
        else if (this.M < n.getM()) {
            System.out.println("La hora es anterior a la proporcionada");
        }
        else if (this.S < n.getS()) {
            System.out.println("La hora es anterior a la proporcionada");
        }
        else System.out.println("La hora no es anterior a la proporcionada o es la misma");
    }
    
    public void mayorQue(Hora n) {
        if (this.H > n.getH()) {
            System.out.println("La hora es posterior a la proporcionada");
        }
        else if (this.M > n.getM()) {
            System.out.println("La hora es posterior a la proporcionada");
        }
        else if (this.S > n.getS()) {
            System.out.println("La hora es posterior a la proporcionada");
        }
        else System.out.println("La hora no es posterior a la proporcionada o es la misma");
    }
}
