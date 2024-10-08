
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 * La clase LeerArchivo proporciona métodos para manipular un archivo de texto.
 * Permite agregar contenido, sobrescribirlo y leerlo línea por línea. 
 * Está diseñada para manejar configuraciones almacenadas en un archivo de texto.
 */
public class LeerArchivo {
    
    /**
     * Agrega información al archivo de texto ubicado en la ruta especificada.
     * El contenido se añade al final del archivo, sin eliminar la información existente.
     * 
     * @param texto El contenido que se desea agregar al archivo.
     */
    public void agregarTexto(String texto) {
        try {
            File archivo = new File("prueba\\configuracion.txt");
            PrintWriter pw = new PrintWriter(new FileWriter(archivo, true)); // 'true' para agregar sin sobrescribir.
            pw.append(texto); // Agrega el texto al final del archivo.
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }
    }

    /**
     * Sobreescribe el contenido del archivo de texto ubicado en la ruta especificada.
     * El contenido existente se eliminará y se reemplazará por el nuevo texto proporcionado.
     * 
     * @param texto El contenido que se desea escribir en el archivo.
     */
    public void imprimirTexto(String texto) {
        try {
            File archivo = new File("prueba\\configuracion.txt");
            PrintWriter pw = new PrintWriter("prueba\\configuracion.txt");
            pw.print(texto); // Escribe el nuevo contenido en el archivo.
            JOptionPane.showMessageDialog(null, "¡La configuración ha sido cambiada!");
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e);
        }
    }
    
    /**
     * Lee un archivo de texto línea por línea y devuelve su contenido como un String.
     * Si el archivo no existe, lo crea y retorna una cadena vacía. 
     * Al leer, marca secciones de texto como "General", "Dell" o "HP" con el símbolo "~".
     * 
     * @return String que contiene el contenido del archivo de texto. Devuelve 'null' si hay un error.
     */
    public String leerTexto() {
        String linea; // Almacena cada línea leída del archivo.
        String texto = ""; // Almacena el contenido completo del archivo.
        File archivo = new File("prueba\\configuracion.txt");
        
        try {
            // Si el archivo no existe, se crea uno nuevo.
            if (!archivo.exists()) {
                archivo.createNewFile(); 
            } else {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                
                // Lee el archivo línea por línea.
                while ((linea = br.readLine()) != null) {
                    if (!linea.isEmpty()) {
                        // Si la línea contiene "General", "Dell" o "HP", añade un separador "~".
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
    
    public void leerConfiguracion(String txt, Configuracion configuracion) {
        
        String[] configtxt = txt.split("~");
        String[] general = configtxt[1].split("\n");
        
        //Configuración General
        configuracion.setDuracionDias(Integer.parseInt(general[2]));
        configuracion.setDiasDeEntrega(Integer.parseInt(general[4]));
 
        //Configuración Dell
        String[] dellConfigs = configtxt[2].split("\n");
        
        configuracion.setInicialPlacaBase(Integer.parseInt(dellConfigs[2]));
        configuracion.setInicialCPU(Integer.parseInt(dellConfigs[4]));
        configuracion.setInicialRAM(Integer.parseInt(dellConfigs[6]));
        configuracion.setInicialFuenteA(Integer.parseInt(dellConfigs[8]));
        configuracion.setInicialTarjetaGraf(Integer.parseInt(dellConfigs[10]));
        configuracion.setInicialEnsambladores(Integer.parseInt(dellConfigs[12]));
        
        //Configuración HP
        
        String[] HPConfigs = configtxt[3].split("\n");
        
        configuracion.setInicialPlacaBaseHP(Integer.parseInt(HPConfigs[2]));
        configuracion.setInicialCPUHP(Integer.parseInt(HPConfigs[4]));
        configuracion.setInicialRAMHP(Integer.parseInt(HPConfigs[6]));
        configuracion.setInicialFuenteAHP(Integer.parseInt(HPConfigs[8]));
        configuracion.setInicialTarjetaGrafHP(Integer.parseInt(HPConfigs[10]));
        configuracion.setInicialEnsambladoresHP(Integer.parseInt(HPConfigs[12]));
    }
}
