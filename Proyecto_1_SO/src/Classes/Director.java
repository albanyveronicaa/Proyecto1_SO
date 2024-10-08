package Classes;

import Interfaz.MainUI;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase Director extiende la clase Thread y representa la dirección de una planta,
 * gestionando su funcionamiento, pagos de salarios y la interacción con la interfaz de usuario.
 */
public class Director extends Thread {
    
    // Atributos
    private float salario; // Salario diario del director.
    private float ganancialote;
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
    private int costo = 0; // Costo asociado a la operación de la planta.
    private int ganancia = 0; // Ganancia obtenida de la planta.
    private int utilidad = 0; // Utilidad neta calculada como ganancia menos costos.

    public Director(float salario, int duracionDias, EstudioEmpresa planta, Interfaz.MainUI interfaz,ProjectManager manager, Almacen deposito, String nombrePlanta) {
        this.salario = salario;
        this.duracionDias = duracionDias;
        this.accSalario = 0;
        this.manager = manager;
        this.interfaz = interfaz;
        this.deposito = deposito;
        this.planta = planta;
        this.nombrePlanta = nombrePlanta;
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

