package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Interfaz.MainUI;


public class Director extends Thread{
    
    private float salario;
    private float accSalario;
    private EstudioEmpresa planta;
    private MainUI interfaz;
    private ProjectManager manager;
    private int duracionDias;
    private boolean pausar = false;
    private int dias = 0;
    private String nombrePlanta;
    public float tiempoAcumulado = 0;
    private int salarioDescontado = 0;
    private boolean capturado = false;
    private int costo = 0;
    private int ganancia = 0;
    private int utilidad = 0;

    
    //Constructor
    public Director(float salario, float accSalario, EstudioEmpresa planta, MainUI interfaz, ProjectManager manager, int duracionDias, String nombrePlanta) {
        this.salario = salario;
        this.accSalario = 0;
        this.planta = planta;
        this.interfaz = interfaz;
        this.manager = manager;
        this.duracionDias = duracionDias;
        this.nombrePlanta = nombrePlanta;
    }
    
    
    //Cambios
    public void pausar(){ 
        this.pausar = true;
    }
    
    public void reanudar(){
        this.pausar = false;
    }
 
    public void pago() {
        this.accSalario += this.salario*24;
    }
    
}
