package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Configuracion {
    
    //General
    private int duracionDias;
    private int diasDeEntrega;
    
    //Dell
    private int inicialPlacaBase;
    private int inicialCPU;
    private int inicialRAM;
    private int inicialFuenteA;
    private int inicialTarjetaGraf;
    
    //HP
    private int inicialPlacaBaseHP;
    private int inicialCPUHP;
    private int inicialRAMHP;
    private int inicialFuenteAHP;
    private int inicialTarjetaGrafHP;
    
    
    //Constructor
    public Configuracion(){
        
        //General
        this.duracionDias = 1000;
        this.diasDeEntrega= 30;
    
        //Dell
        this.inicialPlacaBase = 1;
        this.inicialCPU=5;
        this.inicialRAM=6;
        this.inicialFuenteA=5;
        
        //HP
        this.inicialPlacaBaseHP=1;
        this.inicialCPUHP=1;
        this.inicialRAMHP=2;
        this.inicialFuenteAHP=4;
    
    }

    
    //Getters and Setters
    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public int getDiasDeEntrega() {
        return diasDeEntrega;
    }

    public void setDiasDeEntrega(int diasDeEntrega) {
        this.diasDeEntrega = diasDeEntrega;
    }

    public int getInicialPlacaBase() {
        return inicialPlacaBase;
    }

    public void setInicialPlacaBase(int inicialPlacaBase) {
        this.inicialPlacaBase = inicialPlacaBase;
    }

    public int getInicialCPU() {
        return inicialCPU;
    }

    public void setInicialCPU(int inicialCPU) {
        this.inicialCPU = inicialCPU;
    }

    public int getInicialRAM() {
        return inicialRAM;
    }

    public void setInicialRAM(int inicialRAM) {
        this.inicialRAM = inicialRAM;
    }

    public int getInicialFuenteA() {
        return inicialFuenteA;
    }

    public void setInicialFuenteA(int inicialFuenteA) {
        this.inicialFuenteA = inicialFuenteA;
    }

    public int getInicialTarjetaGraf() {
        return inicialTarjetaGraf;
    }

    public void setInicialTarjetaGraf(int inicialTarjetaGraf) {
        this.inicialTarjetaGraf = inicialTarjetaGraf;
    }

    public int getInicialPlacaBaseHP() {
        return inicialPlacaBaseHP;
    }

    public void setInicialPlacaBaseHP(int inicialPlacaBaseHP) {
        this.inicialPlacaBaseHP = inicialPlacaBaseHP;
    }

    public int getInicialCPUHP() {
        return inicialCPUHP;
    }

    public void setInicialCPUHP(int inicialCPUHP) {
        this.inicialCPUHP = inicialCPUHP;
    }

    public int getInicialRAMHP() {
        return inicialRAMHP;
    }

    public void setInicialRAMHP(int inicialRAMHP) {
        this.inicialRAMHP = inicialRAMHP;
    }

    public int getInicialFuenteAHP() {
        return inicialFuenteAHP;
    }

    public void setInicialFuenteAHP(int inicialFuenteAHP) {
        this.inicialFuenteAHP = inicialFuenteAHP;
    }

    public int getInicialTarjetaGrafHP() {
        return inicialTarjetaGrafHP;
    }

    public void setInicialTarjetaGrafHP(int inicialTarjetaGrafHP) {
        this.inicialTarjetaGrafHP = inicialTarjetaGrafHP;
    }
}


