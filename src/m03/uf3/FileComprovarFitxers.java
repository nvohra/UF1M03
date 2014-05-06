/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf3;
import java.io.File;
import java.util.Date;
/**
 *
 * @author USER
 */
public class FileComprovarFitxers {

    public static void main(String[] args) {
        FileComprovarFitxers programa = new FileComprovarFitxers();
        programa.inici();
        System.out.println(System.getProperty("user.dir"));
    }

    public void inici() {
//        File naman = new File("C:/Users/USER/Desktop/carpetas/naman");
//        File prueba = new File("C:/Users/USER/Desktop/carpetas/naman/prueba");
        File documento = new File("C:/Users/USER/Desktop/carpetas/naman/documento.txt");
//        System.out.println(naman.getAbsolutePath() + " existeix? " + naman.exists());
//        mostrarEstat(prueba);
        mostrarEstat(documento);
        Date data = new Date(documento.lastModified());
        System.out.println("longitud del archivo es: " + documento.length() + " " + data);
    }

    public void mostrarEstat(File f) {
        System.out.println(f.getAbsolutePath() + " és un fitxer? " + f.isFile());
        System.out.println(f.getAbsolutePath() + " és una carpeta? " + f.isDirectory());
        System.out.println("la ruta padre es: " + f.getParent());
    }
}
