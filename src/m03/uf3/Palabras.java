/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf3;

import java.io.File;
import java.util.Scanner;
import java.lang.Integer;
import java.io.PrintStream;

/**
 *
 * @author USER
 */
public class Palabras {

    public static final String marcafi = "FI";
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Palabras programa = new Palabras();
        
        File lec = new File("C:/Users/USER/Desktop/carpetas/naman/prueba/documento4.txt");
        System.out.println("Introduce un numero de 1 a 4 para elegir una accion: " + "\n"
                + "1. Vocales que hay en un fichero." + "\n"
                + "2. Consonantes que hay en un fichero." + "\n"
                + "3. Palabras que hay en un fichero." + "\n"
                + "4. Elige una palabra para contar las veces que aparece en el texto." + "\n"
                + "5. Elige una palabra para remplazarla por otra que tu elijas.");
        int num = teclado.nextInt();
        switch (num) {
            case 1:
                programa.contarvocales(lec);
                break;
            case 2:
                programa.contarconsonantes(lec);
                break;
            case 3:
                programa.contarpalabras(lec);
                break;
            case 4:
                programa.numvecespalabra(lec);
                break;
            case 5:
                programa.remplazapalabra(lec);
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
    }

    public void contarvocales(File lec) {
        try {
            Scanner lectura = new Scanner(lec);
            boolean leer = true;
            String palabra;
            int numvocal = 0;
            while (leer) {
                palabra = lectura.next();
                if (marcafi.equals(palabra)) {
                    leer = false;
                } else {
                    for (int i = 0; i < palabra.length(); i++) {
                        if (String.valueOf(palabra.toLowerCase().charAt(i)).matches("[aeiou]") == true) {
                            numvocal++;
                        }
                    }
                }
            }
            lectura.close();
            System.out.println("En este fichero hay " + numvocal + " vocales.");
        } catch (Exception e) {
            System.out.println("Hay un error: " + e);
        }
    }

    public void contarconsonantes(File lec) {
        try {
            Scanner lectura = new Scanner(lec);
            boolean leer = true;
            String palabra;
            int numcon = 0;
            while (leer) {
                palabra = lectura.next();
                if (marcafi.equals(palabra)) {
                    leer = false;
                } else {
                    for (int i = 0; i < palabra.length(); i++) {
                        if (String.valueOf(palabra.toLowerCase().charAt(i)).matches("[aeiou]") == false) {
                            numcon++;
                        }
                    }
                }
            }
            lectura.close();
            System.out.println("En este fichero hay " + numcon + " consonantes.");
        } catch (Exception e) {
            System.out.println("Hay un error: " + e);
        }
    }

    public void contarpalabras(File lec) {
        try {
            Scanner lectura = new Scanner(lec);
            boolean leer = true;
            String palabra;
            int numpal = 0;
            while (leer) {
                palabra = lectura.next();
                if (marcafi.equals(palabra)) {
                    leer = false;
                } else {
                    numpal++;
                }
            }
            lectura.close();
            System.out.println("En este fichero hay " + numpal + " palabras.");
        } catch (Exception e) {
            System.out.println("Hay un error: " + e);
        }
    }

    public void numvecespalabra(File lec) {
        try {
            System.out.println("Introduce la palabra a contar:");
            String pal = teclado.next();
            Scanner lectura = new Scanner(lec);
            boolean leer = true;
            String palabra;
            int numvecespal = 0;
            while (leer) {
                palabra = lectura.next();
                if (marcafi.equals(palabra)) {
                    leer = false;
                } else {
                    if (pal.equals(palabra)) {
                        numvecespal++;
                    }
                }
            }
            lectura.close();
            System.out.println("En este fichero la palabra " + pal + " aparece " + numvecespal + " veces.");
        } catch (Exception e) {
            System.out.println("Hay un error: " + e);
        }
    }
    
    public void remplazapalabra(File lec) {
        try {
            System.out.println("Introduce la palabra a remplazar:");
            String pal = teclado.next();
            System.out.println("Introduce la nueva palabra");
            String nuevapal = teclado.next();
            Scanner lectura = new Scanner(lec);
            boolean leer = true;
            String palabra;
            int numvecespal = 0;
            String texto = "";
            while (leer) {
                palabra = lectura.next();
                if (marcafi.equals(palabra)) {
                    leer = false;
                } else {
                    if (pal.equals(palabra)) {
                        texto = texto + " " + nuevapal;
                    }
                    else {
                        texto = texto + " " + palabra;
                    }
                }
            }
            PrintStream escritura = new PrintStream(lec);
            escritura.print(texto);
            escritura.close();
            lectura.close();
            System.out.println("Se a sustituido la palabra " + pal + " por " + nuevapal + ".");
        } catch (Exception e) {
            System.out.println("Hay un error: " + e);
        }
    }
}
