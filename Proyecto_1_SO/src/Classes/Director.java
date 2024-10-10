package Classes;

import Interfaz.MainUI;
import static Interfaz.MainUI.Configuracion;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase Director extiende la clase Thread y representa la dirección de una
 * planta, gestionando su funcionamiento, pagos de salarios y la interacción con
 * la interfaz de usuario.
 */
public class Director extends Thread {

    // Atributos
    private float salario; // Salario diario del director.
    private float ganancialote; //Ganancia del lote de computadoras enviadas
    private float accSalario; // Salario acumulado del director.
    private EstudioEmpresa planta; // Referencia a la planta de la empresa.
    private MainUI interfaz; // Referencia a la interfaz principal de la aplicación.
    private ProjectManager manager; // Referencia al gerente de proyectos.
    private Almacen deposito;
    private int duracionDias; // Duración total de los días de simulación.
    private boolean pausar = false; // Indica si el proceso del director está pausado.
    private int dias = 0; // Contador de días transcurridos.
    private String nombrePlanta; // Nombre de la planta que el director supervisa.
    public float tiempoAcumulado = 0; // Tiempo total acumulado de trabajo del director.
    private int salarioDescontado = 0; // Salario que ha sido descontado.
    private boolean capturado = false; // Indica si el director está capturado (en alguna situación específica).
    private int falta = 0;
    private int costo = 0; // Costo asociado a la operación de la planta.
    private int ganancia = 0; // Ganancia obtenida de la planta.
    private int utilidad = 0; // Utilidad neta calculada como ganancia menos costos.

    /**
     * Constructor para crear una instancia del Director.
     *
     * @param salario Salario del Diretor por día.
     * @param duracionDias Duración de un día de trabajo en milisegundos.
     * @param planta Instancia de la planta donde trabaja el Diretor.
     * @param interfaz Interfaz principal de la aplicación.
     * @param manager Gerente del proyecto
     * @param deposito Deposito/Almacen donde se encuentran las computadoras
     * @param nombrePlanta Nombre de la planta que el director supervisa.
     */
    public Director(float salario, int duracionDias, EstudioEmpresa planta, Interfaz.MainUI interfaz, ProjectManager manager, Almacen deposito, String nombrePlanta) {
        this.salario = salario;
        this.duracionDias = duracionDias;
        this.accSalario = 0;
        this.manager = manager;
        this.interfaz = interfaz;
        this.deposito = deposito;
        this.planta = planta;
        this.nombrePlanta = nombrePlanta;
    }

    public void run() {

        while (true) {
            try {

                pago();

                if (this.manager.diasRestantes < 0) {

                    manager.reiniciarDias();

                    if (nombrePlanta.equals("Dell")) {

                        this.interfaz.DellDiasFaltantes(Integer.toString(this.manager.diasRestantes));
                        this.interfaz.DellGanancias("$" + Long.toString(deposito.getTotalGanancias()));

                        this.planta.calculadoraCostos();
                        costo = this.planta.getTotalCostos();
                        ganancia = (int) this.deposito.getTotalGanancias();
                        costo = (int) (costo + this.manager.getAccSalario());
                        costo = (int) (costo + this.accSalario);
                        this.deposito.totalGanancias = 0;
                        costo = costo - salarioDescontado;
                        this.salarioDescontado = 0;
                        this.falta = 0;

                        utilidad = ganancia - costo;

                        this.manager.ResetSalario();
                        this.accSalario = 0;

                        this.deposito.resetComputadora();
                        this.interfaz.DellListasTarjetas("0");
                        this.interfaz.DellListasEstandar("0");
                        this.interfaz.HPListasEstandar("0");
                        this.interfaz.HPListasTarjetas("0");

                        this.interfaz.DellCostos("$" + Integer.toString(costo));
                        this.interfaz.DellGananciaTotal("$" + Integer.toString(utilidad));
                        this.interfaz.DellFallasManager(Integer.toString(this.falta));
                        this.interfaz.DellDescontadoManager("$" + Integer.toString(this.salarioDescontado));

                        this.interfaz.DellEstadoDirector("Reiniciando lote");

                        Thread.sleep(duracionDias);

                    } else {

                        this.interfaz.HPDiasFaltantes(Integer.toString(this.manager.diasRestantes));
                        this.interfaz.HPGanancias("$" + Long.toString(deposito.getTotalGanancias()));
                        this.interfaz.HPEstadoDirector("Reiniciando lote");

                        this.planta.calculadoraCostos();
                        costo = this.planta.getTotalCostos();
                        costo = (int) (costo + this.manager.getAccSalario());
                        costo = (int) (costo + this.accSalario);
                        costo = costo - salarioDescontado;
                        this.salarioDescontado = 0;
                        this.falta = 0;

                        this.manager.ResetSalario();
                        this.accSalario = 0;

                        ganancia = (int) this.deposito.getTotalGanancias();
                        this.deposito.totalGanancias = 0;

                        utilidad = ganancia - costo;

                        this.deposito.resetComputadora();
                        this.interfaz.DellListasTarjetas("0");
                        this.interfaz.DellListasEstandar("0");
                        this.interfaz.HPListasEstandar("0");
                        this.interfaz.HPListasTarjetas("0");

                        this.interfaz.HPCostos("$" + Integer.toString(costo));
                        this.interfaz.HPGananciaTotal("$" + Integer.toString(utilidad));
                        this.interfaz.HPallasManager(Integer.toString(this.falta));
                        this.interfaz.HPDescontadoManager("$" + Integer.toString(this.salarioDescontado));

                    }

                    /* 
                Project manager
                     */
                } else {

                    Random random = new Random();

                    tiempoAcumulado = 0;

                    int horaAleatoria = random.nextInt(24);
                    int hora = 0;
                    capturado = false;

                    while (tiempoAcumulado < (this.duracionDias)) {

                        hora++;

                        if (nombrePlanta.equals("Dell")) {

                            tiempoAcumulado += this.duracionDias * 0.0416;

                            Thread.sleep((long) (this.duracionDias * 0.0416));

                            if (hora == horaAleatoria) {

                                if (capturado == false) {

                                    this.interfaz.DellEstadoDirector("Observando al Project Manager");

                                    Thread.sleep((long) (this.duracionDias * 0.01736));
                                    tiempoAcumulado += this.duracionDias * 0.01736;

                                    if (this.manager.isInactivo() == false) {

                                        this.salarioDescontado = this.salarioDescontado + 100;
                                        this.falta++;

                                        this.interfaz.DellFallasManager(Integer.toString(this.falta));
                                        this.interfaz.DellDescontadoManager("$" + Integer.toString(this.salarioDescontado));
                                        capturado = true;

                                    }

                                    this.interfaz.DellEstadoDirector("Trabajando");

                                }
                            }
                        } else {

                            tiempoAcumulado += this.duracionDias * 0.0416;

                            Thread.sleep((long) (this.duracionDias * 0.0416));

                            if (hora == horaAleatoria) {

                                if (capturado == false) {

                                    this.interfaz.HPEstadoDirector("Mirando al Project manager");

                                    Thread.sleep((long) (this.duracionDias * 0.0196));
                                    tiempoAcumulado += this.duracionDias * 0.0196;

                                    if (this.manager.isInactivo() == false) {

                                        this.salarioDescontado = this.salarioDescontado + 100;
                                        this.falta++;

                                        this.interfaz.HPallasManager(Integer.toString(this.falta));
                                        this.interfaz.HPDescontadoManager("$" + Integer.toString(this.salarioDescontado));
                                        capturado = true;

                                    }

                                    this.interfaz.HPEstadoDirector("Trabajando");

                                }
                            }
                        }

                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void pausar() {
        this.pausar = true;
    }

    public void reanudar() {
        this.pausar = false;
    }

    public void pago() {
        this.accSalario += this.salario * 24;
    }
}
