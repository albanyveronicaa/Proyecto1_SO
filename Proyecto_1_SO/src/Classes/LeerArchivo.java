/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class LeerArchivo {
    
    //Agrega información al archivo de texto que está dentro del proyecto
    public void agregarTexto(String texto) {
        try {
            File archivo = new File("prueba\\configuracion.txt");
            PrintWriter pw = new PrintWriter(new FileWriter(archivo, true));
            pw.append(texto);
            pw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }
    }


    //Sobreescribe el archivo de texto que está dentro del proyecto
    public void imprimirTexto(String texto) {
        try {
            File archivo = new File("prueba\\configuracion.txt");
            PrintWriter pw = new PrintWriter("prueba\\configuracion.txt");
            pw.print(texto);
            JOptionPane.showMessageDialog(null, "¡La configuración ha sido cambiada!");
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }
    }
    
    
     /**
     * Lee un archivo de texto línea por línea y lo convierte en un string
     * @param path (Dirección donde se encuentra el archivo de texto a leer)
     * @return String que contiene la información del archivo de texto
     */
    public String leerTexto() {
        String linea;
        String texto = "";
        File archivo = new File("prueba\\configuracion.txt");
        LeerArchivo archivos = new LeerArchivo();
        
        try {
            
           if (!archivo.exists()) {
                archivo.createNewFile(); 
                
            } else {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                
                while ((linea = br.readLine()) != null) {
                    if (!linea.isEmpty()) {
                       if (linea.contains("General") || linea.contains("Dell") || linea.contains("HP")) {
                            texto += "~" + "\n";
                       
                        } else {
                            texto += linea + "\n";
                       }
                    }
                } 
                br.close();
                return texto; 
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e);
        }
        return null;
    }
    
    
}
