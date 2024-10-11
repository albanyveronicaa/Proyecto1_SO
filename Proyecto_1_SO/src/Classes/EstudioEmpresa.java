package Classes;

import Interfaz.MainUI;
import java.util.concurrent.Semaphore;

/**
 * La clase EstudioEmpresa representa una empresa de manufactura que gestiona la
 * producción de diferentes componentes de hardware, los trabajadores asignados
 * a cada tarea, y los costos operativos. Esta clase también maneja la
 * interacción con una interfaz de usuario.
 *
 */
public class EstudioEmpresa {

    // Atributos de la empresa
    private String nombre; // Nombre de la planta de producción.

    // Atributos relacionados con los trabajadores
    private int cantMaxTrabajador;       // Cantidad máxima de trabajadores que la planta puede tener.
    private int placaBTrabajador;        // Número de trabajadores asignados a la producción de placas base.
    private int cpuTrabajador;           // Número de trabajadores asignados a la producción de CPUs.
    private int ramTrabajador;           // Número de trabajadores asignados a la producción de módulos de RAM.
    private int fuenteATrabajador;       // Número de trabajadores asignados a la producción de fuentes de alimentación.
    private int tarjetaGrafTrabajador;   // Número de trabajadores asignados a la producción de tarjetas gráficas.
    private int ensambladores;           // Número de trabajadores asignados al ensamblaje de productos finales.
    private Trabajador[] trabajadores;   // Arreglo que almacena todos los trabajadores de la planta.
    private int costosTotales;           // Costos totales asociados a la operación de la planta.

    private long duracionDiaMilisegundos; // Duración de un día de trabajo en milisegundos.
    public Almacen deposito;             // Almacén asociado a la planta.
    public Semaphore mutex;              // Semáforo para controlar el acceso concurrente al almacén.

    // Referencia a la interfaz de usuario principal.
    public MainUI Interfaz;

    // Configuración inicial de la planta, que define los recursos y parámetros de operación.
    private Configuracion configuracion;

    /**
     * Constructor de la clase EstudioEmpresa.
     *
     * @param nombre Nombre de la planta de producción.
     * @param Interfaz Referencia a la interfaz de usuario principal.
     * @param configuracion Configuración inicial de la planta.
     */
    public EstudioEmpresa(String nombre, Interfaz.MainUI Interfaz, Configuracion configuracion) {

        this.configuracion = configuracion;
        this.nombre = nombre;
        this.duracionDiaMilisegundos = configuracion.getDuracionDias();

        this.deposito = new Almacen(nombre, 25, 20, 55, 35, 10, Interfaz);
        this.mutex = new Semaphore(1);
        this.Interfaz = Interfaz;

        // Inicializa el almacén con cantidades específicas según el nombre de la planta.
        if (getNombre().equals("Dell")) {
            this.cantMaxTrabajador = 21;

        } else {
            this.cantMaxTrabajador = 16;

        }

        this.trabajadores = new Trabajador[cantMaxTrabajador];

        // Inicializa los trabajadores según la configuración y el nombre de la planta.
        if (this.nombre.equals("Dell")) {
            this.placaBTrabajador = configuracion.getInicialPlacaBase();
            this.cpuTrabajador = configuracion.getInicialCPU();
            this.ramTrabajador = configuracion.getInicialRAM();
            this.fuenteATrabajador = configuracion.getInicialFuenteA();
            this.tarjetaGrafTrabajador = configuracion.getInicialTarjetaGraf();
            this.ensambladores = configuracion.getInicialEnsambladores();
        } else {
            this.placaBTrabajador = configuracion.getInicialPlacaBaseHP();
            this.cpuTrabajador = configuracion.getInicialCPUHP();
            this.ramTrabajador = configuracion.getInicialRAMHP();
            this.fuenteATrabajador = configuracion.getInicialFuenteAHP();
            this.tarjetaGrafTrabajador = configuracion.getInicialTarjetaGrafHP();
            this.ensambladores = configuracion.getInicialEnsambladoresHP();
        }

        inicializarTrabajadores();

    }

    /**
     * Inicializa los trabajadores y arranca los hilos correspondientes. También
     * crea instancias de ProjectManager y Director.
     */
    public void inicializarTrabajadores() {

        int arrayIndex = 0;

        if (this.nombre.equals("Dell")) {
            ProjectManager DellManager = new ProjectManager(40, configuracion.getDiasDeEntrega(), this, this.Interfaz, configuracion.getDuracionDias(), this.nombre, this.configuracion);
            DellManager.start();

            Director director = new Director(60, configuracion.getDuracionDias(), this, this.Interfaz, DellManager, this.deposito, this.nombre);

            director.start();

        } else {
            ProjectManager HPManager = new ProjectManager(40, configuracion.getDiasDeEntrega(), this, this.Interfaz, configuracion.getDuracionDias(), this.nombre, this.configuracion);
            HPManager.start();

            Director director = new Director(60, configuracion.getDuracionDias(), this, this.Interfaz, HPManager, this.deposito, this.nombre);

            director.start();

        }

        // Inicializa y arranca los trabajadores de cada área según la cantidad asignada.
        // Trabajadores de Placa Base
        for (int i = 0; i < getPlacaTrabajadores(); i++) {
            if (getNombre().equals("Dell")) {
                Trabajador trabajador = new Trabajador(0.25f, 20, getDuracionDiaMilisegundos(), "Placa Base", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            } else {
                Trabajador trabajador = new Trabajador(0.33f, 20, getDuracionDiaMilisegundos(), "Placa Base", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            }
        }

        // Trabajadores de CPU
        for (int i = 0; i < getCpuTrabajadores(); i++) {
            if (getNombre().equals("Dell")) {
                Trabajador trabajador = new Trabajador(0.25f, 26, getDuracionDiaMilisegundos(), "CPU", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            } else {
                Trabajador trabajador = new Trabajador(0.33f, 26, getDuracionDiaMilisegundos(), "CPU", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            }

        }

        // Trabajadores de RAM
        for (int i = 0; i < getRamTrabajadores(); i++) {

            if (getNombre().equals("Dell")) {
                Trabajador trabajador = new Trabajador(1f, 40, getDuracionDiaMilisegundos(), "RAM", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            } else {
                Trabajador trabajador = new Trabajador(2f, 40, getDuracionDiaMilisegundos(), "RAM", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            }

        }

        // Trabajadores de Fuente de Alimentación
        for (int i = 0; i < getFuenteTrabajadores(); i++) {
            if (getNombre().equals("Dell")) {
                Trabajador trabajador = new Trabajador(5f, 16, getDuracionDiaMilisegundos(), "Fuente de Alimentación", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            } else {
                Trabajador trabajador = new Trabajador(3f, 16, getDuracionDiaMilisegundos(), "Fuente de Alimentación", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            }

        }

        // Trabajadores de Tarjeta Gráfica
        for (int i = 0; i < getTarjetaTrabajadores(); i++) {
            if (getNombre().equals("Dell")) {
                Trabajador trabajador = new Trabajador(0.5f, 34, getDuracionDiaMilisegundos(), "Tarjeta Gráfica", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            } else {
                Trabajador trabajador = new Trabajador(0.33f, 34, getDuracionDiaMilisegundos(), "Tarjeta Gráfica", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            }
        }

        // Trabajadores Ensambladores
        for (int i = 0; i < getEnsambladores(); i++) {
            if (getNombre().equals("Dell")) {
                Trabajador trabajador = new Trabajador(0.5f, 25, getDuracionDiaMilisegundos(), "Ensamblador", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            } else {
                Trabajador trabajador = new Trabajador(0.5f, 25, getDuracionDiaMilisegundos(), "Ensamblador", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            }
        }

        // Inicializa los trabajadores "en espera" si hay espacio disponible.
        if ((arrayIndex + 1) < cantMaxTrabajador) {

            for (int i = arrayIndex; i < cantMaxTrabajador; i++) {
                Trabajador trabajador = new Trabajador(0, 0, getDuracionDiaMilisegundos(), "Esperando", this);
                trabajador.start();
                trabajadores[arrayIndex] = trabajador;
                arrayIndex++;
            }
        }

    }

    /**
     * Suma el total de trabajadores asignados a todas las áreas.
     *
     * @return La suma total de trabajadores.
     */
    public int sumaTrabajadores() {
        int suma = getPlacaTrabajadores() + getCpuTrabajadores() + getRamTrabajadores() + getFuenteTrabajadores() + getTarjetaTrabajadores() + getEnsambladores();

        return suma;
    }

    // Métodos para incrementar y reducir trabajadores en cada área.
    public void incrementaTrabajadoresPlacaB() {
        setPlacaTrabajadores(getPlacaTrabajadores() + 1);
    }

    public void reduceTrabajadoresPlacaB() {
        setPlacaTrabajadores(getPlacaTrabajadores() - 1);
    }

    public void incrementaTrabajadoresCpu() {
        setCpuTrabajadores(getCpuTrabajadores() + 1);
    }

    public void reduceTrabajadoresCPU() {
        setCpuTrabajadores(getCpuTrabajadores() - 1);
    }

    public void incrementaTrabajadoresRam() {
        setRamTrabajadores(getRamTrabajadores() + 1);
    }

    public void reduceTrabajadoresRam() {
        setRamTrabajadores(getRamTrabajadores() - 1);
    }

    public void incrementaTrabajadoresFuente() {
        setFuenteTrabajadores(getFuenteTrabajadores() + 1);
    }

    public void reduceTrabajadoresFuente() {
        setFuenteTrabajadores(getFuenteTrabajadores() - 1);
    }

    public void incrementaTrabajadoresTarjeta() {
        setTarjetaTrabajadores(getTarjetaTrabajadores() + 1);
    }

    public void reduceTrabajadoresTarjeta() {
        setTarjetaTrabajadores(getTarjetaTrabajadores() - 1);
    }

    public void incrementaEnsambladores() {
        setEnsambladores(getEnsambladores() + 1);
    }

    public void reduceEnsambladores() {
        setEnsambladores(getEnsambladores() - 1);
    }

    /**
     * Modifica el tipo de trabajo de los trabajadores que cumplen con un
     * criterio específico.
     *
     * @param check Tipo de trabajador a buscar.
     * @param change Nuevo tipo de trabajador a asignar.
     */
    public void modificarTrabajadores(String check, String change) {
        for (int i = 0; i < getTrabajadores().length; i++) {

            if (getTrabajadores()[i].getTipo().equals(check)) {
                getTrabajadores()[i].setTipo(change);
            }
        }
    }

    /**
     * Reanuda la actividad de todos los trabajadores.
     */
    public void reanudarTrabajador() {

        for (int i = 0; i < trabajadores.length; i++) {
            Trabajador trabajador = trabajadores[i];
            trabajador.reanudar();
        }

    }

    /**
     * Detiene la actividad de todos los trabajadores.
     */
    public void detenerTrabajador() {

        for (int i = 0; i < trabajadores.length; i++) {
            Trabajador trabajador = trabajadores[i];
            trabajador.stop();
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getcantMaxTrabajador() {
        return cantMaxTrabajador;
    }

    public void setcantMaxTrabajador(int cantMaxTrabajador) {
        this.cantMaxTrabajador = cantMaxTrabajador;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }

    public long getDuracionDiaMilisegundos() {
        return duracionDiaMilisegundos;
    }

    public void setDuracionDiaMilisegundos(long duracionDiaMilisegundos) {
        this.duracionDiaMilisegundos = duracionDiaMilisegundos;
    }

    public int getPlacaTrabajadores() {
        return placaBTrabajador;
    }

    public void setPlacaTrabajadores(int placaTrabajadores) {
        this.placaBTrabajador = placaTrabajadores;
    }

    public int getCpuTrabajadores() {
        return cpuTrabajador;
    }

    public void setCpuTrabajadores(int cpuTrabajadores) {
        this.cpuTrabajador = cpuTrabajadores;
    }

    public int getRamTrabajadores() {
        return ramTrabajador;
    }

    public void setRamTrabajadores(int ramTrabajadores) {
        this.ramTrabajador = ramTrabajadores;
    }

    public int getFuenteTrabajadores() {
        return fuenteATrabajador;
    }

    public void setFuenteTrabajadores(int fuenteTrabajadores) {
        this.fuenteATrabajador = fuenteTrabajadores;
    }

    public int getTarjetaTrabajadores() {
        return tarjetaGrafTrabajador;
    }

    public void setTarjetaTrabajadores(int tarjetaTrabajadores) {
        this.tarjetaGrafTrabajador = tarjetaTrabajadores;
    }

    public int getEnsambladores() {
        return ensambladores;
    }

    public void setEnsambladores(int ensambladores) {
        this.ensambladores = ensambladores;
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    public int getTotalCostos() {
        return costosTotales;
    }

    public void setTotalCostos(int totalCostos) {
        this.costosTotales = totalCostos;
    }

    /**
     * Calcula los costos totales acumulados de los salarios de los
     * trabajadores.
     */
    public void calculadoraCostos() {

        for (int i = 0; i < trabajadores.length; i++) {

            if (!(trabajadores[i].getTipo().equals("Esperando"))) {

                this.costosTotales += trabajadores[i].getAccSalario();

            }
        }
    }
}
