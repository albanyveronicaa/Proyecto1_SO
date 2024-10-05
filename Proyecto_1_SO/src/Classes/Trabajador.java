package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Trabajador extends Thread{
    
    private float produccionPorDia;
    private float salario;
    private float accSalario;
    private String tipo;
    private float contadorProduccion;
    private EstudioEmpresa planta;
    private boolean pausar = false;

    //Constructor
    public Trabajador(float produccionPorDia, float salario, float accSalario, String tipo, float contadorProduccion, EstudioEmpresa planta) {
        this.produccionPorDia = produccionPorDia;
        this.salario = salario;
        this.accSalario = 0;
        this.tipo = tipo;
        this.contadorProduccion = 0;
        this.planta = planta;
    }
    
    
    //Cambios
    public void cambiarParametros(float tasaProduccion, float salario) {
        setSalario(salario);
        setProduccionPorDia(tasaProduccion);
    }
    
    public void pausar(){
        this.pausar = true;
    }
    
    public void reanudar(){
        this.pausar = false;
    }
    
    public void pago() {
        this.accSalario += this.salario*24;
    }

    
    //Getters and Setters
    public float getProduccionPorDia() {
        return produccionPorDia;
    }

    public void setProduccionPorDia(float produccionPorDia) {
        this.produccionPorDia = produccionPorDia;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getAccSalario() {
        return accSalario;
    }

    public void setAccSalario(float accSalario) {
        this.accSalario = accSalario;
    }
    
    public void resetAccSalario(){
        accSalario = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

