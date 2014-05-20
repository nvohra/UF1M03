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
public class LSFichero {
    public static void main(String[] args) {
        LSFichero programa = new LSFichero();
        programa.inici();
    }
    
    public void inici() {
        File p = new File("C:/Users/USER/Desktop/carpetas/naman/prueba");
        File[] arrayp = p.listFiles();
        int ficheros = 0;
        int carpetas = 0;
        
        for (int i = 0; i < arrayp.length; i++) {
            File aux = arrayp[i];
            if (aux.isDirectory()) {
                ficheros++;
            }
            if (aux.isFile()) {
                carpetas++;
            }
            System.out.println(aux.getName());
        }
        System.out.println("La carperta: " + p.getName() + " contiene " + ficheros + 
                " carpeta/s y " + carpetas + " fichero/s");
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
        System.out.println("se puede ejecutar: " + f.canExecute() + "\n"
               + "se puede leer:" + f.canRead() + "\n"
               + "se puede escribir:" + f.canWrite());
    }
    
    public Date ultimamodificacion(File f) {
        Date fecha = new Date(f.lastModified());
        return fecha;
    }
}
