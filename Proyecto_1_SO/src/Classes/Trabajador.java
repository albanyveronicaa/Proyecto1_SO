package Classes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase Trabajador representa un empleado de la planta de la empresa, 
 * encargado de generar producción diaria y acumular salarios. 
 * Extiende la clase Thread para permitir la ejecución concurrente de las tareas del trabajador.
 */
public class Trabajador extends Thread {
    
    private float produccionPorDia;  // Producción diaria del trabajador.
    private float salario;           // Salario del trabajador por jornada completa.
    private float accSalario;        // Salario acumulado del trabajador.
    private long duracionDiaMilisegundos; // Duración de un día de trabajo en milisegundos.
    private String tipo;             // Tipo de trabajador (p. ej., "Placa Base").
    private float contadorProduccion; // Contador de producción que lleva la cuenta del progreso en producción.
    private EstudioEmpresa planta;   // Instancia de la planta de estudio asociada al trabajador.
    private boolean pausar = false;  // Indica si las actividades del trabajador están en pausa.

    /**
     * Constructor para crear una instancia de un trabajador.
     *
     * @param produccionPorDia Producción diaria del trabajador.
     * @param salario Salario del trabajador por día.
     * @param duracionDiaMilisegundos Duración de un día de trabajo en milisegundos.
     * @param tipo Tipo de trabajador (p. ej., "Placa Base").
     * @param planta Instancia de la planta donde trabaja el trabajador.
     */
    public Trabajador(float produccionPorDia, float salario, long duracionDiaMilisegundos, String tipo, EstudioEmpresa planta) {
        this.produccionPorDia = produccionPorDia;
        this.salario = salario;
        this.accSalario = 0;
        this.duracionDiaMilisegundos = duracionDiaMilisegundos;
        this.tipo = tipo;
        this.contadorProduccion = 0;
        this.planta = planta;
    }
    
    /**
     * Método que define el comportamiento del trabajador cuando se ejecuta en un hilo.
     * El trabajador acumula salarios y produce cada cierto tiempo (simulado por la duración del día).
     */
    @Override
    public void run() {
        try {
            sleep(1000); // Pausa inicial de 1 segundo.
        } catch (InterruptedException ex) {
            Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Bucle infinito de trabajo diario
        while(true) {
            try {
                pago(); // Acumula el pago del trabajador.
                produccionPorDia(); // Genera producción y actualiza los almacenes de la planta.
                sleep(this.duracionDiaMilisegundos); // Pausa entre cada "día" de trabajo.
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Método para pausar las actividades del trabajador.
     */
    public void pausar() {
        this.pausar = true;
    }
    
    /**
     * Método para reanudar las actividades del trabajador.
     */
    public void reanudar() {
        this.pausar = false;
    }
    
    /**
     * Acumula el pago diario del trabajador. Asume un salario por hora y lo multiplica por 24.
     */
    public void pago() {
        this.accSalario += this.salario * 24; // Acumula salario para una jornada completa de 24 horas.
    }

    /**
     * Incrementa la producción diaria del trabajador. Si la producción es suficiente (>= 1),
     * se actualiza el almacén de la planta y se reinicia el contador de producción.
     */
    public void produccionPorDia() {
        this.contadorProduccion += this.produccionPorDia;

        if (this.contadorProduccion >= 1 && planta.mutex.availablePermits() > 0) {
            try {
                planta.mutex.acquire(); // Adquiere un permiso para actualizar el almacén.
                planta.deposito.actualizarAlmacen(this.tipo, (int) this.contadorProduccion, (int) this.salario * 24);
                planta.mutex.release(); // Libera el permiso.
            } catch (InterruptedException ex) {
                Logger.getLogger(Trabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.contadorProduccion = 0; // Reinicia el contador de producción.
        }
    }

    /**
     * Cambia los parámetros de producción y salario del trabajador.
     *
     * @param tasaProduccion Nueva tasa de producción diaria.
     * @param salario Nuevo salario a establecer.
     */
    public void cambiarParametros(float tasaProduccion, float salario) {
        setSalario(salario);
        setProduccionPorDia(tasaProduccion);
    }
    
    // Getters y Setters

    /**
     * Obtiene la producción diaria del trabajador.
     * 
     * @return Producción diaria del trabajador.
     */
    public float getProduccionPorDia() {
        return produccionPorDia;
    }

    /**
     * Establece una nueva tasa de producción diaria para el trabajador.
     * 
     * @param produccionPorDia Nueva producción diaria a establecer.
     */
    public void setProduccionPorDia(float produccionPorDia) {
        this.produccionPorDia = produccionPorDia;
    }

    /**
     * Obtiene el salario del trabajador.
     * 
     * @return Salario del trabajador.
     */
    public float getSalario() {
        return salario;
    }

    /**
     * Establece un nuevo salario para el trabajador.
     * 
     * @param salario Nuevo salario a establecer.
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * Obtiene el salario acumulado del trabajador.
     * 
     * @return Salario acumulado del trabajador.
     */
    public float getAccSalario() {
        return accSalario;
    }

    /**
     * Establece un nuevo valor para el salario acumulado del trabajador.
     * 
     * @param accSalario Nuevo salario acumulado.
     */
    public void setAccSalario(float accSalario) {
        this.accSalario = accSalario;
    }
    
    /**
     * Reinicia el salario acumulado a cero.
     */
    public void resetAccSalario() {
        accSalario = 0;
    }

    /**
     * Obtiene el tipo de trabajador.
     * 
     * @return Tipo de trabajador.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece un nuevo tipo de trabajador.
     * 
     * @param tipo Nuevo tipo de trabajador a establecer.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
