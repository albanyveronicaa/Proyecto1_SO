package Classes;

/**
 * La clase Configuracion define la configuración inicial de un sistema de
 * producción de computadoras, incluyendo tanto características generales como
 * especificaciones iniciales para modelos Dell y HP.
 *
 */
public class Configuracion {

    // General
    /**
     * Duración total de la simulación en días.
     */
    private int duracionDias;

    /**
     * Días de entrega de los componentes.
     */
    private int diasDeEntrega;

    // Dell
    /**
     * Número inicial de placas base disponibles para Dell.
     */
    private int inicialPlacaBase;

    /**
     * Número inicial de CPUs disponibles para Dell.
     */
    private int inicialCPU;

    /**
     * Número inicial de módulos de RAM disponibles para Dell.
     */
    private int inicialRAM;

    /**
     * Número inicial de fuentes de alimentación disponibles para Dell.
     */
    private int inicialFuenteA;

    /**
     * Número inicial de tarjetas gráficas disponibles para Dell.
     */
    private int inicialTarjetaGraf;

    /**
     * Número inicial de ensambladores para Dell.
     */
    private int inicialEnsambladores;

    // HP
    /**
     * Número inicial de placas base disponibles para HP.
     */
    private int inicialPlacaBaseHP;

    /**
     * Número inicial de CPUs disponibles para HP.
     */
    private int inicialCPUHP;

    /**
     * Número inicial de módulos de RAM disponibles para HP.
     */
    private int inicialRAMHP;

    /**
     * Número inicial de fuentes de alimentación disponibles para HP.
     */
    private int inicialFuenteAHP;

    /**
     * Número inicial de tarjetas gráficas disponibles para HP.
     */
    private int inicialTarjetaGrafHP;

    /**
     * Número inicial de ensambladores para HP.
     */
    private int inicialEnsambladoresHP;

    /**
     * Constructor por defecto de la clase Configuracion. Inicializa los valores
     * generales y específicos para Dell y HP.
     */
    public Configuracion() {
        // General
        this.duracionDias = 1000;
        this.diasDeEntrega = 30;

        // Dell
        this.inicialPlacaBase = 1;
        this.inicialCPU = 1;
        this.inicialRAM = 1;
        this.inicialFuenteA = 1;
        this.inicialEnsambladores = 1;

        // HP
        this.inicialPlacaBaseHP = 1;
        this.inicialCPUHP = 1;
        this.inicialRAMHP = 1;
        this.inicialFuenteAHP = 1;
        this.inicialEnsambladoresHP = 1;
    }

    // Getters and Setters
    /**
     * Obtiene la duración total de la simulación en días.
     *
     * @return Duración en días.
     */
    public int getDuracionDias() {
        return duracionDias;
    }

    /**
     * Establece la duración total de la simulación en días.
     *
     * @param duracionDias Duración en días.
     */
    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    /**
     * Obtiene los días de entrega de los componentes.
     *
     * @return Días de entrega.
     */
    public int getDiasDeEntrega() {
        return diasDeEntrega;
    }

    /**
     * Establece los días de entrega de los componentes.
     *
     * @param diasDeEntrega Días de entrega.
     */
    public void setDiasDeEntrega(int diasDeEntrega) {
        this.diasDeEntrega = diasDeEntrega;
    }

    /**
     * Obtiene el número inicial de placas base disponibles para Dell.
     *
     * @return Número inicial de placas base.
     */
    public int getInicialPlacaBase() {
        return inicialPlacaBase;
    }

    /**
     * Establece el número inicial de placas base disponibles para Dell.
     *
     * @param inicialPlacaBase Número inicial de placas base.
     */
    public void setInicialPlacaBase(int inicialPlacaBase) {
        this.inicialPlacaBase = inicialPlacaBase;
    }

    /**
     * Obtiene el número inicial de CPUs disponibles para Dell.
     *
     * @return Número inicial de CPUs.
     */
    public int getInicialCPU() {
        return inicialCPU;
    }

    /**
     * Establece el número inicial de CPUs disponibles para Dell.
     *
     * @param inicialCPU Número inicial de CPUs.
     */
    public void setInicialCPU(int inicialCPU) {
        this.inicialCPU = inicialCPU;
    }

    /**
     * Obtiene el número inicial de módulos de RAM disponibles para Dell.
     *
     * @return Número inicial de módulos de RAM.
     */
    public int getInicialRAM() {
        return inicialRAM;
    }

    /**
     * Establece el número inicial de módulos de RAM disponibles para Dell.
     *
     * @param inicialRAM Número inicial de módulos de RAM.
     */
    public void setInicialRAM(int inicialRAM) {
        this.inicialRAM = inicialRAM;
    }

    /**
     * Obtiene el número inicial de fuentes de alimentación disponibles para
     * Dell.
     *
     * @return Número inicial de fuentes de alimentación.
     */
    public int getInicialFuenteA() {
        return inicialFuenteA;
    }

    /**
     * Establece el número inicial de fuentes de alimentación disponibles para
     * Dell.
     *
     * @param inicialFuenteA Número inicial de fuentes de alimentación.
     */
    public void setInicialFuenteA(int inicialFuenteA) {
        this.inicialFuenteA = inicialFuenteA;
    }

    /**
     * Obtiene el número inicial de tarjetas gráficas disponibles para Dell.
     *
     * @return Número inicial de tarjetas gráficas.
     */
    public int getInicialTarjetaGraf() {
        return inicialTarjetaGraf;
    }

    /**
     * Establece el número inicial de tarjetas gráficas disponibles para Dell.
     *
     * @param inicialTarjetaGraf Número inicial de tarjetas gráficas.
     */
    public void setInicialTarjetaGraf(int inicialTarjetaGraf) {
        this.inicialTarjetaGraf = inicialTarjetaGraf;
    }

    /**
     * Obtiene el número inicial de ensambladores disponibles para Dell.
     *
     * @return Número inicial de ensambladores.
     */
    public int getInicialEnsambladores() {
        return inicialEnsambladores;
    }

    /**
     * Establece el número inicial de ensambladores disponibles para Dell.
     *
     * @param inicialEnsambladores Número inicial de ensambladores.
     */
    public void setInicialEnsambladores(int inicialEnsambladores) {
        this.inicialEnsambladores = inicialEnsambladores;
    }

    /**
     * Obtiene el número inicial de placas base disponibles para HP.
     *
     * @return Número inicial de placas base.
     */
    public int getInicialPlacaBaseHP() {
        return inicialPlacaBaseHP;
    }

    /**
     * Establece el número inicial de placas base disponibles para HP.
     *
     * @param inicialPlacaBaseHP Número inicial de placas base.
     */
    public void setInicialPlacaBaseHP(int inicialPlacaBaseHP) {
        this.inicialPlacaBaseHP = inicialPlacaBaseHP;
    }

    /**
     * Obtiene el número inicial de CPUs disponibles para HP.
     *
     * @return Número inicial de CPUs.
     */
    public int getInicialCPUHP() {
        return inicialCPUHP;
    }

    /**
     * Establece el número inicial de CPUs disponibles para HP.
     *
     * @param inicialCPUHP Número inicial de CPUs.
     */
    public void setInicialCPUHP(int inicialCPUHP) {
        this.inicialCPUHP = inicialCPUHP;
    }

    /**
     * Obtiene el número inicial de módulos de RAM disponibles para HP.
     *
     * @return Número inicial de módulos de RAM.
     */
    public int getInicialRAMHP() {
        return inicialRAMHP;
    }

    /**
     * Establece el número inicial de módulos de RAM disponibles para HP.
     *
     * @param inicialRAMHP Número inicial de módulos de RAM.
     */
    public void setInicialRAMHP(int inicialRAMHP) {
        this.inicialRAMHP = inicialRAMHP;
    }

    /**
     * Obtiene el número inicial de fuentes de alimentación disponibles para HP.
     *
     * @return Número inicial de fuentes de alimentación.
     */
    public int getInicialFuenteAHP() {
        return inicialFuenteAHP;
    }

    /**
     * Establece el número inicial de fuentes de alimentación disponibles para
     * HP.
     *
     * @param inicialFuenteAHP Número inicial de fuentes de alimentación.
     */
    public void setInicialFuenteAHP(int inicialFuenteAHP) {
        this.inicialFuenteAHP = inicialFuenteAHP;
    }

    /**
     * Obtiene el número inicial de tarjetas gráficas disponibles para HP.
     *
     * @return Número inicial de tarjetas gráficas.
     */
    public int getInicialTarjetaGrafHP() {
        return inicialTarjetaGrafHP;
    }

    /**
     * Establece el número inicial de tarjetas gráficas disponibles para HP.
     *
     * @param inicialTarjetaGrafHP Número inicial de tarjetas gráficas.
     */
    public void setInicialTarjetaGrafHP(int inicialTarjetaGrafHP) {
        this.inicialTarjetaGrafHP = inicialTarjetaGrafHP;
    }

    /**
     * Obtiene el número inicial de ensambladores disponibles para HP.
     *
     * @return Número inicial de ensambladores.
     */
    public int getInicialEnsambladoresHP() {
        return inicialEnsambladoresHP;
    }

    /**
     * Establece el número inicial de ensambladores disponibles para HP.
     *
     * @param inicialEnsambladoresHP Número inicial de ensambladores.
     */
    public void setInicialEnsambladoresHP(int inicialEnsambladoresHP) {
        this.inicialEnsambladoresHP = inicialEnsambladoresHP;
    }
}
