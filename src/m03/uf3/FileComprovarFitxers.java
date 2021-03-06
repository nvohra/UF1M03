/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf3;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class FileComprovarFitxers {

    public static void main(String[] args) {
        FileComprovarFitxers programa = new FileComprovarFitxers();
        programa.inici();
    }

    public void inici() {
//        File naman = new File("C:/Users/USER/Desktop/carpetas/naman");
//        File prueba = new File("C:/Users/USER/Desktop/carpetas/naman/prueba");
       // File documento = new File("C:/Users/USER/Desktop/carpetas/naman/prueba/documento.txt");
//        System.out.println(naman.getAbsolutePath() + " existeix? " + naman.exists());
//        mostrarEstat(prueba);
        //mostrarEstat(documento);
       // Date data = ultimamodificacion(documento);
       // System.out.println("longitud del archivo es: " + documento.length() + ", ultima modificacion " + data);
        File p = new File("C:/Users/USER/Desktop/carpetas/naman/prueba");
        File[] arrayp = p.listFiles();
        int cont1 = 0;
        int cont2 = 0;
        for (int i = 0; i < arrayp.length; i++) {
            File aux = arrayp[i];
            if (aux.isDirectory()) {
                cont1++;
            }
            if (aux.isFile()) {
                cont2++;
            }
            System.out.println(aux.getName());
        }
        System.out.println("La carperta: " + p.getName() + " contiene " + cont1 + 
                " carpeta/s y " + cont2 + " fichero/s");
        System.out.println("Introduce el nombre(ruta) de la carpeta o fichero que quieres que se muestre el LS");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();
        File nom = new File(nombre);
        mostrarEstat(nom);
    }

    public void mostrarEstat(File f) {
        System.out.println("la ruta absoluta es: " + f.getAbsolutePath()+ "\n"
               + "és un fitxer? " + f.isFile() + "\n"
               + "és una carpeta? " + f.isDirectory() + "\n"
               + "la ruta padre es: " + f.getParent() + "\n"
               + "el nombre es: " + f.getName() + "\n"
               + "la ultima modificacion fue en: " + ultimamodificacion(f) + "\n"
               + "el tamaño es: " + f.length());
    }
    
    public Date ultimamodificacion(File f) {
        Date fecha = new Date(f.lastModified());
        return fecha;
    }
}
