package Classes;

import Interfaz.MainUI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase ProjectManager representa un administrador de proyectos en la planta
 * de la empresa. Extiende la clase `Thread` para permitir la ejecución
 * concurrente de tareas relacionadas con la gestión de proyectos. Se encarga de
 * gestionar el salario, la duración del proyecto y el control del estado de la
 * planta, incluyendo la pausa y reanudación de actividades.
 */
public class ProjectManager extends Thread {

    private float salario; // Salario del Project Manager.
    private boolean inactivo; // Indica si el Project Manager está inactivo.
    private int dieciseisHoras; // Horas asignadas por día para el Project Manager (16 horas).
    public int diasRestantes; // Días restantes para la entrega del proyecto.
    private float accSalario; // Acumulado del salario a lo largo del tiempo.
    private EstudioEmpresa planta; // Instancia de la planta de estudio asociada.
    private MainUI Interfaz; // Interfaz de usuario para mostrar la información.
    private int duracionDias; // Duración total del proyecto en días.
    private String nombrePlanta; // Nombre de la planta de estudio.
    private boolean pausar; // Indica si las actividades están en pausa.
    public float acummulatedTime = 0; // Tiempo acumulado en la ejecución del hilo.
    public Configuracion configuracion; // Configuración del proyecto.

    public ProjectManager(float salario, int diasRestantes, EstudioEmpresa planta, Interfaz.MainUI Interfaz, int duracionDias, String nombrePlanta, Configuracion configuracion) {
        this.salario = salario;
        this.dieciseisHoras = 16;
        this.inactivo = false;
        this.configuracion = configuracion;
        this.diasRestantes = diasRestantes;
        this.accSalario = 0;
        this.planta = planta;
        this.Interfaz = Interfaz;
        this.duracionDias = duracionDias;
        this.nombrePlanta = nombrePlanta;
        this.configuracion = configuracion;
    }

    @Override
    public void run() {

        while (true) {
            try {

                acummulatedTime = 0;

                this.diasRestantes--;
                pago();

                while (acummulatedTime < (this.duracionDias * 0.67)) {

                    if (nombrePlanta.equals("Dell")) {
                        if (inactivo) {
                            acummulatedTime += duracionDias * 0.0208;
                            inactivo = false;
                            Thread.sleep((long) (duracionDias * 0.0208));
                            Interfaz.DellEstadoManager("Viendo One Piece");

                        } else {
                            acummulatedTime += duracionDias * 0.0208;
                            inactivo = true;
                            Thread.sleep((long) (duracionDias * 0.0208));
                            Interfaz.DellEstadoManager("Revisando avances");

                        }

                    } else {
                        if (inactivo) {
                            acummulatedTime += duracionDias * 0.0208;
                            inactivo = false;
                            Thread.sleep((long) (duracionDias * 0.0208));
                            Interfaz.HPEstadoManager("Viendo One Piece");

                        } else {
                            acummulatedTime += duracionDias * 0.0208;
                            inactivo = true;
                            Thread.sleep((long) (duracionDias * 0.0208));
                            Interfaz.HPEstadoManager("Revisando avances");

                        }

                    }

                }

                if (nombrePlanta.equals("Dell")) {
                    if (this.diasRestantes >= 0) {

                        this.Interfaz.DellDiasFaltantes(Integer.toString(this.diasRestantes));
                        Interfaz.DellEstadoManager("Cambiando los días");
                    }
                } else {

                    if (this.diasRestantes >= 0) {
                        this.Interfaz.HPDiasFaltantes(Integer.toString(this.diasRestantes));
                        Interfaz.HPEstadoManager("Cambiando los días");
                    }
                }
                Thread.sleep((long) (this.duracionDias * 0.33));

            } catch (InterruptedException ex) {
                Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * Reinicia los días restantes a la cantidad especificada en la
     * configuración.
     */
    public void reiniciarDias() {
        diasRestantes = configuracion.getDiasDeEntrega();
    }

    /**
     * Obtiene el salario actual del Project Manager.
     *
     * @return Salario del Project Manager.
     */
    public float getSalario() {
        return salario;
    }

    /**
     * Establece un nuevo salario para el Project Manager.
     *
     * @param salario Nuevo salario a establecer.
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * Verifica si el Project Manager está inactivo.
     *
     * @return true si está inactivo, false en caso contrario.
     */
    public boolean isInactivo() {
        return inactivo;
    }

    /**
     * Establece el estado de inactividad del Project Manager.
     *
     * @param inactivo Nuevo estado de inactividad.
     */
    public void setInactivo(boolean inactivo) {
        this.inactivo = inactivo;
    }

    /**
     * Obtiene los días restantes para la finalización del proyecto.
     *
     * @return Días restantes.
     */
    public int getDiasRestantes() {
        return diasRestantes;
    }

    /**
     * Establece una nueva cantidad de días restantes.
     *
     * @param diasRestantes Nueva cantidad de días restantes.
     */
    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    /**
     * Obtiene el salario acumulado.
     *
     * @return Salario acumulado.
     */
    public float getAccSalario() {
        return accSalario;
    }

    /**
     * Establece un nuevo valor para el salario acumulado.
     *
     * @param accSalario Nuevo salario acumulado.
     */
    public void setAccSalario(float accSalario) {
        this.accSalario = accSalario;
    }

    /**
     * Obtiene la duración total del proyecto en días.
     *
     * @return Duración total en días.
     */
    public int getDuracionDias() {
        return duracionDias;
    }

    /**
     * Establece la duración total del proyecto en días.
     *
     * @param duracionDias Nueva duración total en días.
     */
    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    /**
     * Acumula el pago diario del Project Manager. Multiplica el salario por 24
     * (asumiendo pago por día).
     */
    public void pago() {
        this.accSalario += this.salario * 24;
    }

    /**
     * Reinicia el salario acumulado a cero.
     */
    public void ResetSalario() {
        this.accSalario = 0;
    }

    /**
     * Pone en pausa las actividades del Project Manager.
     */
    public void pausar() {
        this.pausar = true;
    }

    /**
     * Reanuda las actividades del Project Manager.
     */
    public void reanudar() {
        this.pausar = false;
    }
}
