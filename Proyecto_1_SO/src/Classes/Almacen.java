
package Classes;
import Interfaz.MainUI;

public class Almacen {
    public int placaCantidad;
    public int cpuCantidad;
    public int ramCantidad;
    public int fuenteCantidad;
    public int tarjetaCantidad;
    public int estandar;
    public int conTarjeta;
    
    public long totalGanancias;
     
    public int maxPlacaCantidad;
    public int maxCpuCantidad;
    public int maxRamCantidad;
    public int maxFuenteCantidad;
    public int maxTarjetaCantidad;
    public String nombrePlanta;
    public int contador = 0;
    public int costoTotal = 0;


    private MainUI Interfaz;
    
    public Almacen(String nombrePlanta,int maxPlacaCantidad, int maxCpuCantidad, int maxRamCantidad, int maxFuenteCantidad,  int maxTarjetaCantidad, MainUI Interfaz){

        this.maxPlacaCantidad = maxPlacaCantidad;
        this.maxCpuCantidad = maxCpuCantidad;
        this.maxRamCantidad = maxRamCantidad;
        this.maxFuenteCantidad = maxFuenteCantidad;
        this.maxTarjetaCantidad = maxTarjetaCantidad;
        this.nombrePlanta = nombrePlanta;

        this.totalGanancias = 0;

        this.Interfaz = Interfaz;

        
        this.placaCantidad = 0;
        this.cpuCantidad = 0;
        this.ramCantidad = 0;
        this.fuenteCantidad = 0;
        this.tarjetaCantidad = 0;
        this.estandar = 0;
        this.conTarjeta = 0;
 
    }
    
    
    
    public void actualizarAlmacen(String tipoTrabajador, int elementoFinalizado, int salario) {

    }
    

    
    
    
    
    
    
    
    
    
    
    
    public long getTotalGanancias() {
        return totalGanancias;
    }
    
    public int returnCosto() {
    
        return costoTotal;
    }


    public void setTotalGanancias(long totalGanancias) {
        this.totalGanancias = totalGanancias;
    } 
    
    
    public void resetComputadora() {
    
    this.conTarjeta = 0;
    this.estandar = 0;
        
    }
}