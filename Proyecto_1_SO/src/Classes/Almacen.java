
package Classes;
import Interfaz.MainUI;

/**
 * La clase Almacen representa el almacén de una planta de fabricación de computadoras. 
 * Se encarga de gestionar el inventario de componentes como placas base, CPUs, RAM, fuentes de alimentación y tarjetas gráficas, 
 * así como de contabilizar la producción de computadoras estándar y con tarjetas gráficas adicionales.
 */
public class Almacen {
    // Variables relacionadas con el inventario de componentes
    public int placaCantidad;  // Cantidad de placas base en el almacén.
    public int cpuCantidad;    // Cantidad de CPUs en el almacén.
    public int ramCantidad;    // Cantidad de módulos de RAM en el almacén.
    public int fuenteCantidad; // Cantidad de fuentes de alimentación en el almacén.
    public int tarjetaCantidad; // Cantidad de tarjetas gráficas en el almacén.
    public int estandar;       // Cantidad de computadoras estándar ensambladas.
    public int conTarjeta;     // Cantidad de computadoras ensambladas con tarjetas gráficas.

    public long totalGanancias; // Total de ganancias generadas por la venta de computadoras.

    // Máximos de inventario para cada componente
    public int maxPlacaCantidad; // Capacidad máxima de almacenamiento de placas base.
    public int maxCpuCantidad;   // Capacidad máxima de almacenamiento de CPUs.
    public int maxRamCantidad;   // Capacidad máxima de almacenamiento de RAM.
    public int maxFuenteCantidad; // Capacidad máxima de almacenamiento de fuentes de alimentación.
    public int maxTarjetaCantidad; // Capacidad máxima de almacenamiento de tarjetas gráficas.
    
    public String nombrePlanta;  // Nombre de la planta (por ejemplo, "Dell" o "HP").
    public int contador = 0;     // Contador de ensamblajes realizados para seguir la producción.
    public int costoTotal = 0;   // Costo total acumulado de la producción (incluyendo salarios).

    private MainUI Interfaz;  // Referencia a la interfaz gráfica para actualizar la visualización de datos.

    /**
     * Constructor para crear una instancia del almacén de una planta.
     * Inicializa las cantidades de componentes y establece los máximos de inventario.
     *
     * @param nombrePlanta Nombre de la planta (por ejemplo, "Dell" o "HP").
     * @param maxPlacaCantidad Máxima cantidad de placas base que puede almacenar el almacén.
     * @param maxCpuCantidad Máxima cantidad de CPUs que puede almacenar el almacén.
     * @param maxRamCantidad Máxima cantidad de RAM que puede almacenar el almacén.
     * @param maxFuenteCantidad Máxima cantidad de fuentes de alimentación que puede almacenar el almacén.
     * @param maxTarjetaCantidad Máxima cantidad de tarjetas gráficas que puede almacenar el almacén.
     * @param Interfaz Referencia a la interfaz gráfica.
     */
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
    
    
    /**
     * Actualiza el inventario del almacén en función del tipo de trabajador y su producción.
     * Dependiendo del tipo de trabajador (ej. "Ensamblador", "Placa Base", etc.), se ajustan las cantidades de componentes
     * y se actualizan las ganancias, costos y producción de computadoras.
     *
     * @param tipoTrabajador Tipo de trabajador que realiza la tarea (ej. "Ensamblador", "Placa Base").
     * @param elementoFinalizado Número de elementos terminados por el trabajador.
     * @param salario Salario del trabajador, que se suma al costo total de producción.
     */
    public void actualizarAlmacen(String tipoTrabajador, int elementoFinalizado, int salario) {

        switch (tipoTrabajador) {
            
            case "Ensamblador":
                
                if(nombrePlanta.equals("Dell")){
                    if(contador == 3) {
                        if ((this.placaCantidad >= 1) && (this.cpuCantidad >= 5) && (this.ramCantidad >= 6) && (this.fuenteCantidad >= 5) && (this.tarjetaCantidad >= 1)) {
                                contador = 0;
                                this.conTarjeta++;
                                totalGanancias += 120000;
                                costoTotal = costoTotal + salario;
                                
                                
                                this.Interfaz.DellListasTarjetas(Integer.toString(this.conTarjeta));
                                this.placaCantidad = this.placaCantidad - 1;
                                this.cpuCantidad = this.cpuCantidad - 5;
                                this.ramCantidad = this.ramCantidad - 6;
                                this.fuenteCantidad = this.fuenteCantidad - 5;
                                this.tarjetaCantidad = this.tarjetaCantidad - 1;
                             
                        }else {
                                System.out.println("");
                         }
                    }else {
                        if((this.placaCantidad >= 1) && (this.cpuCantidad >= 5) && (this.ramCantidad >= 6) && (this.fuenteCantidad >= 5)) {
                                contador++;
                                this.estandar++;
                                totalGanancias += 80000;
                                costoTotal = costoTotal + salario;
                                
                                
                                this.Interfaz.DellListasEstandar(Integer.toString(this.estandar));
                                this.placaCantidad = this.placaCantidad - 1;
                                this.cpuCantidad = this.cpuCantidad - 5;
                                this.ramCantidad = this.ramCantidad - 6;
                                this.fuenteCantidad = this.fuenteCantidad - 5;
                                
                                
                                
                        }else {
                           System.out.println("");
                         }
                        
                    }
                }else{
                    
                    if(contador == 2) {
                        if ((this.placaCantidad >= 1) && (this.cpuCantidad >= 1) && (this.ramCantidad >= 2) && (this.fuenteCantidad >= 4) && (this.tarjetaCantidad >= 3)) {
                                contador = 0;
                                this.conTarjeta++;
                                totalGanancias += 140000;
                                costoTotal = costoTotal + salario;
                           
                                
                                this.Interfaz.HPListasTarjetas(Integer.toString(this.conTarjeta));
                                this.placaCantidad = this.placaCantidad - 1;
                                this.cpuCantidad = this.cpuCantidad - 1;
                                this.ramCantidad = this.ramCantidad - 2;
                                this.fuenteCantidad = this.fuenteCantidad - 4;
                                this.tarjetaCantidad = this.tarjetaCantidad - 3;
                        }else {
                                System.out.println("");
                         }
                    }else {
                        if((this.placaCantidad >= 1) && (this.cpuCantidad >= 1) && (this.ramCantidad >= 2) && (this.fuenteCantidad >= 4)) {
                                contador++;
                                this.estandar++;
                                totalGanancias += 90000;
                                costoTotal = costoTotal + salario;
                              
                                
                                this.Interfaz.HPListasEstandar(Integer.toString(this.estandar));
                                this.placaCantidad = this.placaCantidad - 1;
                                this.cpuCantidad = this.cpuCantidad - 1;
                                this.ramCantidad = this.ramCantidad - 2;
                                this.fuenteCantidad = this.fuenteCantidad - 4;
                                 
                                
                        }else {
                           System.out.println("");
                         }
                        
                    }
                }
                
               
                
                
                break;
            
            case "Placa Base":
                
                if (this.placaCantidad < this.maxPlacaCantidad) {
                    this.placaCantidad += elementoFinalizado;
                    
                    if(this.placaCantidad >= this.maxPlacaCantidad ){
                        this.placaCantidad = this.maxPlacaCantidad;
                    }
                    
                    if (this.nombrePlanta.equals("Dell")) {
                        Interfaz.DellPlacaBase(Integer.toString(this.placaCantidad));
                        costoTotal = costoTotal + salario;
                    } else {
                        Interfaz.HPPlacaBase(Integer.toString(this.placaCantidad));
                        costoTotal = costoTotal + salario;
                    }
                    
                }
                break;
                
            case "CPU":
                
                if (this.cpuCantidad < this.maxCpuCantidad) {
                    this.cpuCantidad += elementoFinalizado;
                    
                    if(this.cpuCantidad >= this.maxCpuCantidad ){
                        this.cpuCantidad = this.maxCpuCantidad;
                    }
                    
                    if (this.nombrePlanta.equals("Dell")) {
                        Interfaz.DellCPU(Integer.toString(this.cpuCantidad));
                        costoTotal = costoTotal + salario;
                    } else {
                        Interfaz.HPCPU(Integer.toString(this.cpuCantidad));
                        costoTotal = costoTotal + salario;
                    }   
                }
                
 
                break;
                
            case "RAM":
                
                if (this.ramCantidad < this.maxRamCantidad) {
                    this.ramCantidad += elementoFinalizado;
                    
                    if(this.ramCantidad >= this.maxRamCantidad ){
                        this.ramCantidad = this.maxRamCantidad;
                    }
                    
                    if (this.nombrePlanta.equals("Dell")) {
                        Interfaz.DellRAM(Integer.toString(this.ramCantidad));
                        costoTotal = costoTotal + salario;
                    } else {
                        Interfaz.HPRAM(Integer.toString(this.ramCantidad));
                        costoTotal = costoTotal + salario;

                    }
                }
                
                break;
                
            case "Fuente de Alimentación":
                
                if (this.fuenteCantidad < this.maxFuenteCantidad) {
                    this.fuenteCantidad += elementoFinalizado;
                    
                    if(this.fuenteCantidad >= this.maxFuenteCantidad){
                        this.fuenteCantidad = this.maxFuenteCantidad;
                    }
                    
                    if (this.nombrePlanta.equals("Dell")) {
                        Interfaz.DellFuenteA(Integer.toString(this.fuenteCantidad));
                        costoTotal = costoTotal + salario;

                    } else {
                        Interfaz.HPFuenteA(Integer.toString(this.fuenteCantidad));
                        costoTotal = costoTotal + salario;
                    }
                    
                }
                
                break;
                
            case "Tarjeta Gráfica":
                if (this.tarjetaCantidad < this.maxTarjetaCantidad) {
                    this.tarjetaCantidad += elementoFinalizado;
                    
                    if(this.tarjetaCantidad >= this.maxTarjetaCantidad){
                        this.tarjetaCantidad = this.maxTarjetaCantidad;
                    }
                   
                    
                    if (this.nombrePlanta.equals("Lamborghini")) {
                        Interfaz.DellTarjetaGraf(Integer.toString(this.tarjetaCantidad));  
                        costoTotal = costoTotal + salario;
                    } else {
                        Interfaz.HPTarjetaGraf(Integer.toString(this.tarjetaCantidad));  
                        costoTotal = costoTotal + salario;
                    }
                    

                }
                
            default:
                break;
        }
    }   
     
    /**
     * Devuelve el total de ganancias acumuladas.
     *
     * @return Total de ganancias.
     */  
    public long getTotalGanancias() {
        return totalGanancias;
    }
  
    /**
     * Devuelve el costo total acumulado de producción.
     *
     * @return Costo total.
     */
    public int returnCosto() {
    
        return costoTotal;
    }

    /**
     * Establece el total de ganancias acumuladas en el almacén.
     *
     * @param totalGanancias El nuevo valor para el total de ganancias.
     */
    public void setTotalGanancias(long totalGanancias) {
        this.totalGanancias = totalGanancias;
    } 
    
    /**
     * Reinicia el conteo de productos estándar y productos con tarjeta gráfica.
     */
    public void resetComputadora() {
    
    this.conTarjeta = 0;
    this.estandar = 0;
        
    }
}