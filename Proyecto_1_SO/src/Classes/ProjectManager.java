/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaz.MainUI;


public class ProjectManager extends Thread {
    
    private float salario;
    private boolean inactivo;
    private int dieciseisHoras;
    public int diasRestantes;
    private float accSalario;
    private EstudioEmpresa planta;
    private MainUI Interfaz;
    private int duracionDias;
    private String nombrePlanta;
    private boolean pausar;
    public float acummulatedTime = 0;
    public Configuracion configurar;

    public ProjectManager(float salario, boolean inactivo, int dieciseisHoras, int diasRestantes, float accSalario, EstudioEmpresa planta, MainUI Interfaz, int duracionDias, String nombrePlanta, boolean pausar, Configuracion configurar) {
        this.salario = salario;
        this.inactivo = false;
        this.dieciseisHoras = 16;
        
        this.diasRestantes = diasRestantes;
        this.accSalario = 0;
        this.planta = planta;
        this.Interfaz = Interfaz;
        this.duracionDias = duracionDias;
        this.nombrePlanta = nombrePlanta;
        this.pausar = pausar;
        this.configurar = configurar;
    }
    
    public void reiniciarDias(){
  
        diasRestantes = configurar.getDiasDeEntrega();
       
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isInactivo() {
        return inactivo;
    }

    public void setInactivo(boolean inactivo) {
        this.inactivo = inactivo;
    }

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    public float getAccSalario() {
        return accSalario;
    }

    public void setAccSalario(float accSalario) {
        this.accSalario = accSalario;
    }

    
    
    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

   

    public void pago() {
        this.accSalario += this.salario*24;
    }
    
    public void ResetSalario(){
        this.accSalario = 0;
    }
    
    public void pausar(){ 
        this.pausar = true;
    }
    
    public void reanudar(){
        this.pausar = false;
    }
}
