/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaz.MainUI;

/**
 *
 * @author Laptop
 */
public class EstudioEmpresa {
    
    private String nombre;
    
    //Trabajadores
    private int cantMaxTrabajador;
    private int placaBProductor;
    private int cpuProductor;
    private int ramProductor;
    private int fuenteAProductor;
    private int tarjetaGrafProductor;
    private int emsambladores;
    private Trabajador[] trabajadores;
    private int costosTotales;

    public MainUI interfaz;
    
    private Configuracion configuracion;
}
