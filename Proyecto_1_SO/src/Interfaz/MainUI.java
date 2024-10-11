package Interfaz;

import Classes.Configuracion;
import Classes.EstudioEmpresa;
import Classes.LeerArchivo;
import javax.swing.JOptionPane;

public class MainUI extends javax.swing.JFrame {

    public static EstudioEmpresa PlantaDell;
    public static EstudioEmpresa PlantaHP;
    public static Configuracion Configuracion;
    public int contadorDell = 0;
    public int contadorHP = 0;

    public static boolean corriendoDell;
    public static boolean corriendoHP;

    //-----------------Interfaz de Dell-----------------
    public void DellPlacaBase(String text) {
        placaElementoDell.setText(text);
    }

    public void DellCPU(String text) {
        cpuElementoDell.setText(text);
    }

    public void DellRAM(String text) {
        ramElementoDell.setText(text);
    }

    public void DellFuenteA(String text) {
        fuenteElementoDell.setText(text);
    }

    public void DellTarjetaGraf(String text) {
        tarjetaElementoDell.setText(text);
    }

    public void DellListasEstandar(String text) {
        estandarDell.setText(text);
    }

    public void DellListasTarjetas(String text) {
        conTarjetaDell.setText(text);
    }

    public void DellCantidadTrabajadores(String inicialPlacaBase, String inicialCPU, String inicialRAM, String inicialFuenteA, String inicialTarjetaGraf, String inicialEnsambladores) {

        placaTrabajadoresDell.setText(inicialPlacaBase);
        cpuTrabajadoresDell.setText(inicialCPU);
        ramTrabajadoresDell.setText(inicialRAM);
        fuenteTrabajadoresDell.setText(inicialFuenteA);
        tarjetaTrabajadoresDell.setText(inicialTarjetaGraf);
        ensambladorTrabajadoresDell.setText(inicialEnsambladores);
    }

    public void DellDiasFaltantes(String text) {
        diasFaltantesDell.setText(text);
    }

    public void DellEstadoManager(String text) {
        estadoManagerDell.setText(text);
    }

    public void DellDescontadoManager(String text) {
        descontadoManagerDell.setText(text);
    }

    public void DellFallasManager(String text) {
        fallasManagerDell.setText(text);
    }

    public void DellEstadoDirector(String text) {
        estadoDirectorDell.setText(text);
    }

    public void DellGanancias(String totalGanancias) {
        gananciasDell.setText(totalGanancias);
    }

    public void DellCostos(String text) {
        costosDell.setText(text);
    }

    public void DellCostosOtro(String totalCostos) {
        costosDell.setText(totalCostos);
    }

    public void DellUtilidad(String Text) {
        gananciaTotalDell.setText(Text);
    }

    //-----------------Interfaz HP-----------------
    public void HPPlacaBase(String text) {
        placaElementoHP.setText(text);
    }

    public void HPCPU(String text) {
        cpuElementoHP.setText(text);
    }

    public void HPRAM(String text) {
        ramElementoHP.setText(text);
    }

    public void HPFuenteA(String text) {
        fuenteElementoHP.setText(text);
    }

    public void HPTarjetaGraf(String text) {
        tarjetaElementoHP.setText(text);
    }

    public void HPListasEstandar(String text) {
        estandarHP.setText(text);
    }

    public void HPListasTarjetas(String text) {
        conTarjetaHP.setText(text);
    }

    public void HPCantidadTrabajadores(String inicialPlacaBaseHP, String inicialCPUHP, String inicialRAMHP, String inicialFuenteAHP, String inicialTarjetaGrafHP, String inicialEnsambladoresHP) {

        placaTrabajadoresHP.setText(inicialPlacaBaseHP);
        cpuTrabajadoresHP.setText(inicialCPUHP);
        ramTrabajadoresHP.setText(inicialRAMHP);
        fuenteTrabajadoresHP.setText(inicialFuenteAHP);
        tarjetaTrabajadoresHP.setText(inicialTarjetaGrafHP);
        ensambladorTrabajadoresHP.setText(inicialEnsambladoresHP);
    }

    public void HPDiasFaltantes(String text) {
        diasFaltantesHP.setText(text);
    }

    public void HPEstadoManager(String text) {
        estadoManagerHP.setText(text);
    }

    public void HPDescontadoManager(String text) {
        descontadoManagerHP.setText(text);
    }

    public void HPallasManager(String text) {
        fallasManagerHP.setText(text);
    }

    public void HPEstadoDirector(String text) {
        estadoDirectorHP.setText(text);
    }

    public void HPGanancias(String totalGanancias) {
        gananciasHP.setText(totalGanancias);
    }

    public void HPCostos(String text) {
        costosHP.setText(text);
    }

    public void HPCostosOtro(String totalCostos) {
        costosHP.setText(totalCostos);
    }

    public void HPUtilidad(String Text) {
        gananciaTotalHP.setText(Text);
    }

    public MainUI() {
        initComponents();

        setVisible(true);
        setLocationRelativeTo(null);

        Configuracion = new Configuracion();

        try {
            LeerArchivo nfile = new LeerArchivo();
            String txt = nfile.leerTexto();
            nfile.leerConfiguracion(txt, Configuracion);
            JOptionPane.showMessageDialog(null, "¡Configuración cargada!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }

        corriendoDell = false;
        corriendoHP = false;

        deshabilitarBotonDell();
        deshabilitarBotonHP();

    }

    public void deshabilitarBotonDell() {
        if (corriendoDell) {
            placaBasePlusDell.setEnabled(true);
            cpuPlusDell.setEnabled(true);
            ramPlusDell.setEnabled(true);
            fuentePlusDell.setEnabled(true);
            tarjetaPlusDell.setEnabled(true);
            ensambladorPlusDell.setEnabled(true);

            placaBaseMinDell.setEnabled(true);
            cpuMinDell.setEnabled(true);
            ramMinDell.setEnabled(true);
            fuenteMinDell.setEnabled(true);
            tarjetaMinDell.setEnabled(true);
            ensambladorMinDell.setEnabled(true);
        } else {
            placaBasePlusDell.setEnabled(false);
            cpuPlusDell.setEnabled(false);
            ramPlusDell.setEnabled(false);
            fuentePlusDell.setEnabled(false);
            tarjetaPlusDell.setEnabled(false);
            ensambladorPlusDell.setEnabled(false);

            placaBaseMinDell.setEnabled(false);
            cpuMinDell.setEnabled(false);
            ramMinDell.setEnabled(false);
            fuenteMinDell.setEnabled(false);
            tarjetaMinDell.setEnabled(false);
            ensambladorMinDell.setEnabled(false);
        }

    }

    public void deshabilitarBotonHP() {
        if (corriendoHP) {
            placaBasePlusHP.setEnabled(true);
            cpuPlusHP.setEnabled(true);
            ramPlusHP.setEnabled(true);
            fuentePlusHP.setEnabled(true);
            tarjetaPlusHP.setEnabled(true);
            ensambladorPlusHP.setEnabled(true);

            placaBaseMinHP.setEnabled(true);
            cpuMinHP.setEnabled(true);
            ramMinHP.setEnabled(true);
            fuenteMinHP.setEnabled(true);
            tarjetaMinHP.setEnabled(true);
            ensambladorMinHP.setEnabled(true);
        } else {
            placaBasePlusHP.setEnabled(false);
            cpuPlusHP.setEnabled(false);
            ramPlusHP.setEnabled(false);
            fuentePlusHP.setEnabled(false);
            tarjetaPlusHP.setEnabled(false);
            ensambladorPlusHP.setEnabled(false);

            placaBaseMinHP.setEnabled(false);
            cpuMinHP.setEnabled(false);
            ramMinHP.setEnabled(false);
            fuenteMinHP.setEnabled(false);
            tarjetaMinHP.setEnabled(false);
            ensambladorMinHP.setEnabled(false);
        }
    }

    public void deshabilitarComienzo(String nombrePlanta) {
        switch (nombrePlanta) {

            case "Dell":
                comenzarDell.setEnabled(false);
                break;

            case "HP":
                comenzarHP.setEnabled(false);
        }
    }

    public void aumentarTrabajadores(EstudioEmpresa planta, String tipoTrabajador) {

        switch (tipoTrabajador) {

            case "Placa Base":

                for (int i = 0; i < planta.getTrabajadores().length; i++) {

                    if (planta.getTrabajadores()[i].getTipo().equals("Esperando")) {

                        planta.getTrabajadores()[i].setTipo("Placa Base");

                        if (planta.getNombre().equals("Dell")) {
                            planta.getTrabajadores()[i].cambiarParametros(0.25f, 20);
                            break;

                        } else {
                            planta.getTrabajadores()[i].cambiarParametros(0.33f, 20);
                            break;
                        }
                    }
                }
                break;

            case "CPU":

                for (int i = 0; i < planta.getTrabajadores().length; i++) {

                    if (planta.getTrabajadores()[i].getTipo().equals("Esperando")) {

                        planta.getTrabajadores()[i].setTipo("CPU");

                        if (planta.getNombre().equals("Dell")) {
                            planta.getTrabajadores()[i].cambiarParametros(0.25f, 26);
                            break;

                        } else {
                            planta.getTrabajadores()[i].cambiarParametros(0.33f, 26);
                            break;
                        }
                    }
                }
                break;

            case "RAM":

                for (int i = 0; i < planta.getTrabajadores().length; i++) {

                    if (planta.getTrabajadores()[i].getTipo().equals("Esperando")) {

                        planta.getTrabajadores()[i].setTipo("RAM");

                        if (planta.getNombre().equals("Dell")) {
                            planta.getTrabajadores()[i].cambiarParametros(1f, 40);
                            break;

                        } else {
                            planta.getTrabajadores()[i].cambiarParametros(2f, 40);
                            break;
                        }
                    }
                }
                break;

            case "Fuente de Alimentación":

                for (int i = 0; i < planta.getTrabajadores().length; i++) {

                    if (planta.getTrabajadores()[i].getTipo().equals("Esperando")) {

                        planta.getTrabajadores()[i].setTipo("Fuente de Alimentación");

                        if (planta.getNombre().equals("Dell")) {
                            planta.getTrabajadores()[i].cambiarParametros(5f, 16);
                            break;

                        } else {
                            planta.getTrabajadores()[i].cambiarParametros(5f, 16);
                            break;
                        }
                    }
                }
                break;

            case "Tarjeta Gráfica":

                for (int i = 0; i < planta.getTrabajadores().length; i++) {

                    if (planta.getTrabajadores()[i].getTipo().equals("Esperando")) {

                        planta.getTrabajadores()[i].setTipo("Tarjeta Gráfica");

                        if (planta.getNombre().equals("Dell")) {
                            planta.getTrabajadores()[i].cambiarParametros(0.5f, 34);
                            break;

                        } else {
                            planta.getTrabajadores()[i].cambiarParametros(0.33f, 34);
                            break;
                        }
                    }
                }
                break;

            case "Ensamblador":

                for (int i = 0; i < planta.getTrabajadores().length; i++) {

                    if (planta.getTrabajadores()[i].getTipo().equals("Esperando")) {

                        planta.getTrabajadores()[i].setTipo("Ensamblador");

                        if (planta.getNombre().equals("Dell")) {
                            planta.getTrabajadores()[i].cambiarParametros(0.5f, 25);
                            break;

                        } else {
                            planta.getTrabajadores()[i].cambiarParametros(0.5f, 25);
                            break;
                        }
                    }
                }
                break;
        }

    }

    public void reducirTrabajadores(EstudioEmpresa planta, String tipoTrabajador) {

        switch (tipoTrabajador) {

            case "Placa Base":

                for (int i = 0; i < planta.getTrabajadores().length; i++) {

                    if (planta.getTrabajadores()[i].getTipo().equals("Esperando")) {

                        planta.getTrabajadores()[i].setTipo("Placa Base");

                        if (planta.getNombre().equals("Dell")) {
                            planta.getTrabajadores()[i].cambiarParametros(0, 0);
                            break;

                        } else {
                            planta.getTrabajadores()[i].cambiarParametros(0, 0);
                            break;
                        }
                    }
                }
                break;

            case "CPU":

                for (int i = 0; i < planta.getTrabajadores().length; i++) {

                    if (planta.getTrabajadores()[i].getTipo().equals("Esperando")) {

                        planta.getTrabajadores()[i].setTipo("CPU");

                        if (planta.getNombre().equals("Dell")) {
                            planta.getTrabajadores()[i].cambiarParametros(0, 0);
                            break;

                        } else {
                            planta.getTrabajadores()[i].cambiarParametros(0, 0);
                            break;
                        }
                    }
                }
                break;

            case "RAM":

                for (int i = 0; i < planta.getTrabajadores().length; i++) {

                    if (planta.getTrabajadores()[i].getTipo().equals("Esperando")) {

                        planta.getTrabajadores()[i].setTipo("RAM");

                        if (planta.getNombre().equals("Dell")) {
                            planta.getTrabajadores()[i].cambiarParametros(0, 0);
                            break;

                        } else {
                            planta.getTrabajadores()[i].cambiarParametros(0, 0);
                            break;
                        }
                    }
                }
                break;

            case "Fuente de Alimentación":

                for (int i = 0; i < planta.getTrabajadores().length; i++) {

                    if (planta.getTrabajadores()[i].getTipo().equals("Esperando")) {

                        planta.getTrabajadores()[i].setTipo("Fuente de Alimentación");

                        if (planta.getNombre().equals("Dell")) {
                            planta.getTrabajadores()[i].cambiarParametros(0, 0);
                            break;

                        } else {
                            planta.getTrabajadores()[i].cambiarParametros(0, 0);
                            break;
                        }
                    }
                }
                break;

            case "Tarjeta Gráfica":

                for (int i = 0; i < planta.getTrabajadores().length; i++) {

                    if (planta.getTrabajadores()[i].getTipo().equals("Esperando")) {

                        planta.getTrabajadores()[i].setTipo("Tarjeta Gráfica");

                        if (planta.getNombre().equals("Dell")) {
                            planta.getTrabajadores()[i].cambiarParametros(0, 0);
                            break;

                        } else {
                            planta.getTrabajadores()[i].cambiarParametros(0, 0);
                            break;
                        }
                    }
                }
                break;

            case "Ensamblador":

                for (int i = 0; i < planta.getTrabajadores().length; i++) {

                    if (planta.getTrabajadores()[i].getTipo().equals("Esperando")) {

                        planta.getTrabajadores()[i].setTipo("Ensamblador");

                        if (planta.getNombre().equals("Dell")) {
                            planta.getTrabajadores()[i].cambiarParametros(0, 0);
                            break;

                        } else {
                            planta.getTrabajadores()[i].cambiarParametros(0, 0);
                            break;
                        }
                    }
                }
                break;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        ConfigTab = new javax.swing.JPanel();
        DELL_label = new javax.swing.JLabel();
        Config_label = new javax.swing.JLabel();
        tarjetaG_label = new javax.swing.JLabel();
        HP_label = new javax.swing.JLabel();
        General_label = new javax.swing.JLabel();
        trab_label = new javax.swing.JLabel();
        cpu_label = new javax.swing.JLabel();
        ram_label = new javax.swing.JLabel();
        fuentea_label = new javax.swing.JLabel();
        tarjetaGraficaHP = new javax.swing.JSpinner();
        placaBaseHP = new javax.swing.JSpinner();
        ramHP = new javax.swing.JSpinner();
        fuenteHP = new javax.swing.JSpinner();
        TarjetaG_label1 = new javax.swing.JLabel();
        placa_label1 = new javax.swing.JLabel();
        cpu_label1 = new javax.swing.JLabel();
        ram_label1 = new javax.swing.JLabel();
        fuenteA_label1 = new javax.swing.JLabel();
        tarjetaGraficaDell = new javax.swing.JSpinner();
        placaBaseDell = new javax.swing.JSpinner();
        cpuDell = new javax.swing.JSpinner();
        ramDell = new javax.swing.JSpinner();
        fuenteDell = new javax.swing.JSpinner();
        establecerConfiguracion = new javax.swing.JButton();
        dayDuration_label = new javax.swing.JLabel();
        chasis_label3 = new javax.swing.JLabel();
        trab_label4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        duracionDiaInput = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        diasEntregaInput = new javax.swing.JTextPane();
        dayDuration_label1 = new javax.swing.JLabel();
        ensambladorHP = new javax.swing.JSpinner();
        assemblers_label2 = new javax.swing.JLabel();
        ensambladorDell = new javax.swing.JSpinner();
        placa_label6 = new javax.swing.JLabel();
        assemblers_label1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        prod_label5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        prod_label8 = new javax.swing.JLabel();
        cpuHP = new javax.swing.JSpinner();
        DellTab = new javax.swing.JPanel();
        comenzarDell = new javax.swing.JButton();
        M_label = new javax.swing.JLabel();
        wm_label = new javax.swing.JLabel();
        wm_label1 = new javax.swing.JLabel();
        wm_label4 = new javax.swing.JLabel();
        assembled_labelM1 = new javax.swing.JLabel();
        wm_label10 = new javax.swing.JLabel();
        chas26 = new javax.swing.JLabel();
        placaElementoDell = new javax.swing.JLabel();
        maxPlacaBaseDell = new javax.swing.JLabel();
        chas27 = new javax.swing.JLabel();
        cpuElementoDell = new javax.swing.JLabel();
        maxCpuDell = new javax.swing.JLabel();
        chas28 = new javax.swing.JLabel();
        ramElementoDell = new javax.swing.JLabel();
        maxRamDell = new javax.swing.JLabel();
        chas29 = new javax.swing.JLabel();
        fuenteElementoDell = new javax.swing.JLabel();
        maxFuenteDell = new javax.swing.JLabel();
        chas30 = new javax.swing.JLabel();
        tarjetaElementoDell = new javax.swing.JLabel();
        maxTarjetaDell = new javax.swing.JLabel();
        assembled_labelM7 = new javax.swing.JLabel();
        gananciasDell = new javax.swing.JLabel();
        assembled_labelM8 = new javax.swing.JLabel();
        costosDell = new javax.swing.JLabel();
        DayLeftLamborghini3 = new javax.swing.JLabel();
        diasFaltantesDell = new javax.swing.JLabel();
        gananciaTotalDell = new javax.swing.JLabel();
        utility_label2 = new javax.swing.JFormattedTextField();
        directorStatus_label2 = new javax.swing.JLabel();
        estadoDirectorDell = new javax.swing.JLabel();
        managerStatus_label6 = new javax.swing.JLabel();
        estadoManagerDell = new javax.swing.JLabel();
        managerStatus_label7 = new javax.swing.JLabel();
        fallasManagerDell = new javax.swing.JLabel();
        managerStatus_label8 = new javax.swing.JLabel();
        descontadoManagerDell = new javax.swing.JLabel();
        chas31 = new javax.swing.JLabel();
        estandarDell = new javax.swing.JLabel();
        chas32 = new javax.swing.JLabel();
        conTarjetaDell = new javax.swing.JLabel();
        chas33 = new javax.swing.JLabel();
        chas34 = new javax.swing.JLabel();
        chas35 = new javax.swing.JLabel();
        chas36 = new javax.swing.JLabel();
        chas37 = new javax.swing.JLabel();
        chas38 = new javax.swing.JLabel();
        placaBaseMinDell = new javax.swing.JButton();
        placaBasePlusDell = new javax.swing.JButton();
        placaTrabajadoresDell = new javax.swing.JLabel();
        cpuTrabajadoresDell = new javax.swing.JLabel();
        cpuPlusDell = new javax.swing.JButton();
        cpuMinDell = new javax.swing.JButton();
        ramMinDell = new javax.swing.JButton();
        ramPlusDell = new javax.swing.JButton();
        ramTrabajadoresDell = new javax.swing.JLabel();
        fuenteTrabajadoresDell = new javax.swing.JLabel();
        fuentePlusDell = new javax.swing.JButton();
        fuenteMinDell = new javax.swing.JButton();
        tarjetaTrabajadoresDell = new javax.swing.JLabel();
        tarjetaPlusDell = new javax.swing.JButton();
        tarjetaMinDell = new javax.swing.JButton();
        ensambladorTrabajadoresDell = new javax.swing.JLabel();
        ensambladorPlusDell = new javax.swing.JButton();
        ensambladorMinDell = new javax.swing.JButton();
        HPTab = new javax.swing.JPanel();
        comenzarHP = new javax.swing.JButton();
        L_label = new javax.swing.JLabel();
        cpuTrabajadoresHP = new javax.swing.JLabel();
        wm_label3 = new javax.swing.JLabel();
        chas13 = new javax.swing.JLabel();
        chas14 = new javax.swing.JLabel();
        fuenteTrabajadoresHP = new javax.swing.JLabel();
        chas15 = new javax.swing.JLabel();
        tarjetaTrabajadoresHP = new javax.swing.JLabel();
        placaTrabajadoresHP = new javax.swing.JLabel();
        chas16 = new javax.swing.JLabel();
        ensambladorTrabajadoresHP = new javax.swing.JLabel();
        wm_label5 = new javax.swing.JLabel();
        chas17 = new javax.swing.JLabel();
        chas18 = new javax.swing.JLabel();
        managerStatus_label1 = new javax.swing.JLabel();
        descontadoManagerHP = new javax.swing.JLabel();
        ramTrabajadoresHP = new javax.swing.JLabel();
        estadoDirectorHP = new javax.swing.JLabel();
        directorStatus_label1 = new javax.swing.JLabel();
        managerStatus_label4 = new javax.swing.JLabel();
        fallasManagerHP = new javax.swing.JLabel();
        managerStatus_label5 = new javax.swing.JLabel();
        estadoManagerHP = new javax.swing.JLabel();
        wm_label7 = new javax.swing.JLabel();
        DayLeftLamborghini1 = new javax.swing.JLabel();
        chas19 = new javax.swing.JLabel();
        chas20 = new javax.swing.JLabel();
        conTarjetaHP = new javax.swing.JLabel();
        estandarHP = new javax.swing.JLabel();
        assembled_labelM4 = new javax.swing.JLabel();
        diasFaltantesHP = new javax.swing.JLabel();
        chas21 = new javax.swing.JLabel();
        ramElementoHP = new javax.swing.JLabel();
        chas22 = new javax.swing.JLabel();
        chas23 = new javax.swing.JLabel();
        chas24 = new javax.swing.JLabel();
        cpuElementoHP = new javax.swing.JLabel();
        fuenteElementoHP = new javax.swing.JLabel();
        maxTarjetaHP = new javax.swing.JLabel();
        placaElementoHP = new javax.swing.JLabel();
        maxPlacaBaseHP = new javax.swing.JLabel();
        maxCpuHP = new javax.swing.JLabel();
        maxRamHP = new javax.swing.JLabel();
        maxFuenteHP = new javax.swing.JLabel();
        wm_label9 = new javax.swing.JLabel();
        chas25 = new javax.swing.JLabel();
        tarjetaElementoHP = new javax.swing.JLabel();
        gananciasHP = new javax.swing.JLabel();
        assembled_labelM5 = new javax.swing.JLabel();
        assembled_labelM6 = new javax.swing.JLabel();
        costosHP = new javax.swing.JLabel();
        gananciaTotalHP = new javax.swing.JLabel();
        placaBasePlusHP = new javax.swing.JButton();
        cpuPlusHP = new javax.swing.JButton();
        ramPlusHP = new javax.swing.JButton();
        placaBaseMinHP = new javax.swing.JButton();
        cpuMinHP = new javax.swing.JButton();
        ramMinHP = new javax.swing.JButton();
        fuentePlusHP = new javax.swing.JButton();
        fuenteMinHP = new javax.swing.JButton();
        tarjetaMinHP = new javax.swing.JButton();
        tarjetaPlusHP = new javax.swing.JButton();
        ensambladorMinHP = new javax.swing.JButton();
        ensambladorPlusHP = new javax.swing.JButton();
        utility_label = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N

        ConfigTab.setBackground(new java.awt.Color(23, 103, 176));
        ConfigTab.setForeground(new java.awt.Color(255, 255, 255));
        ConfigTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DELL_label.setBackground(new java.awt.Color(102, 102, 102));
        DELL_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        DELL_label.setForeground(new java.awt.Color(255, 255, 255));
        DELL_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DELL_label.setText("DELL");
        ConfigTab.add(DELL_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 180, 60));

        Config_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        Config_label.setForeground(new java.awt.Color(255, 255, 255));
        Config_label.setText("CONFIGURACIÓN");
        ConfigTab.add(Config_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 330, 60));

        tarjetaG_label.setBackground(new java.awt.Color(102, 102, 102));
        tarjetaG_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        tarjetaG_label.setForeground(new java.awt.Color(255, 255, 255));
        tarjetaG_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tarjetaG_label.setText("Tarjetas gráficas");
        ConfigTab.add(tarjetaG_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 120, 30));

        HP_label.setBackground(new java.awt.Color(102, 102, 102));
        HP_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        HP_label.setForeground(new java.awt.Color(255, 255, 255));
        HP_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HP_label.setText("HP");
        ConfigTab.add(HP_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 210, 60));

        General_label.setBackground(new java.awt.Color(102, 102, 102));
        General_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        General_label.setForeground(new java.awt.Color(255, 255, 255));
        General_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        General_label.setText("GENERAL");
        ConfigTab.add(General_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 140, 40));

        trab_label.setBackground(new java.awt.Color(102, 102, 102));
        trab_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        trab_label.setForeground(new java.awt.Color(255, 255, 255));
        trab_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trab_label.setText("MÁXIMO 21 TRABAJADORES");
        ConfigTab.add(trab_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 190, 30));

        cpu_label.setBackground(new java.awt.Color(102, 102, 102));
        cpu_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        cpu_label.setForeground(new java.awt.Color(255, 255, 255));
        cpu_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpu_label.setText("CPUs");
        ConfigTab.add(cpu_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 60, 30));

        ram_label.setBackground(new java.awt.Color(102, 102, 102));
        ram_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        ram_label.setForeground(new java.awt.Color(255, 255, 255));
        ram_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ram_label.setText("Memoria RAM");
        ConfigTab.add(ram_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 110, 30));

        fuentea_label.setBackground(new java.awt.Color(102, 102, 102));
        fuentea_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        fuentea_label.setForeground(new java.awt.Color(255, 255, 255));
        fuentea_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fuentea_label.setText("Fuente de alimentación");
        ConfigTab.add(fuentea_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 160, 30));

        tarjetaGraficaHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        tarjetaGraficaHP.setModel(new javax.swing.SpinnerNumberModel(1, 1, 11, 1));
        ConfigTab.add(tarjetaGraficaHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, 30));

        placaBaseHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        placaBaseHP.setModel(new javax.swing.SpinnerNumberModel(1, 1, 11, 1));
        ConfigTab.add(placaBaseHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, 30));

        ramHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        ramHP.setModel(new javax.swing.SpinnerNumberModel(1, 1, 11, 1));
        ConfigTab.add(ramHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, 30));

        fuenteHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        fuenteHP.setModel(new javax.swing.SpinnerNumberModel(1, 1, 11, 1));
        ConfigTab.add(fuenteHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, 30));

        TarjetaG_label1.setBackground(new java.awt.Color(102, 102, 102));
        TarjetaG_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TarjetaG_label1.setForeground(new java.awt.Color(255, 255, 255));
        TarjetaG_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TarjetaG_label1.setText("Tarjetas gráficas");
        ConfigTab.add(TarjetaG_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 120, 30));

        placa_label1.setBackground(new java.awt.Color(102, 102, 102));
        placa_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        placa_label1.setForeground(new java.awt.Color(255, 255, 255));
        placa_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placa_label1.setText("Placa base");
        ConfigTab.add(placa_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 90, 30));

        cpu_label1.setBackground(new java.awt.Color(102, 102, 102));
        cpu_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        cpu_label1.setForeground(new java.awt.Color(255, 255, 255));
        cpu_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpu_label1.setText("CPUs");
        ConfigTab.add(cpu_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 60, 30));

        ram_label1.setBackground(new java.awt.Color(102, 102, 102));
        ram_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        ram_label1.setForeground(new java.awt.Color(255, 255, 255));
        ram_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ram_label1.setText("Memoria RAM");
        ConfigTab.add(ram_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 110, 30));

        fuenteA_label1.setBackground(new java.awt.Color(102, 102, 102));
        fuenteA_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        fuenteA_label1.setForeground(new java.awt.Color(255, 255, 255));
        fuenteA_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fuenteA_label1.setText("Fuente de alimentación");
        ConfigTab.add(fuenteA_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 160, 30));

        tarjetaGraficaDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        tarjetaGraficaDell.setModel(new javax.swing.SpinnerNumberModel(1, 1, 16, 1));
        ConfigTab.add(tarjetaGraficaDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, -1, 30));

        placaBaseDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        placaBaseDell.setModel(new javax.swing.SpinnerNumberModel(1, 1, 16, 1));
        ConfigTab.add(placaBaseDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, -1, 30));

        cpuDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        cpuDell.setModel(new javax.swing.SpinnerNumberModel(1, 1, 16, 1));
        ConfigTab.add(cpuDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, -1, 30));

        ramDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        ramDell.setModel(new javax.swing.SpinnerNumberModel(1, 1, 16, 1));
        ConfigTab.add(ramDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, 30));

        fuenteDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        fuenteDell.setModel(new javax.swing.SpinnerNumberModel(1, 1, 16, 1));
        ConfigTab.add(fuenteDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, -1, 30));

        establecerConfiguracion.setBackground(new java.awt.Color(0, 51, 255));
        establecerConfiguracion.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        establecerConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        establecerConfiguracion.setText("ESTABLECER CONFIGURACIÓN");
        establecerConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                establecerConfiguracionActionPerformed(evt);
            }
        });
        ConfigTab.add(establecerConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 220, 40));

        dayDuration_label.setBackground(new java.awt.Color(102, 102, 102));
        dayDuration_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        dayDuration_label.setForeground(new java.awt.Color(255, 255, 255));
        dayDuration_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayDuration_label.setText("Duración del día (Segundos)");
        ConfigTab.add(dayDuration_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 190, 30));

        chasis_label3.setBackground(new java.awt.Color(102, 102, 102));
        chasis_label3.setFont(new java.awt.Font("Microsoft YaHei", 1, 10)); // NOI18N
        chasis_label3.setForeground(new java.awt.Color(227, 227, 227));
        chasis_label3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chasis_label3.setText("Haz clic en el botón para establecer la configuración");
        ConfigTab.add(chasis_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 280, 30));

        trab_label4.setBackground(new java.awt.Color(255, 255, 255));
        trab_label4.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        trab_label4.setForeground(new java.awt.Color(255, 255, 255));
        trab_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trab_label4.setText("MÁXIMO 16 TRABAJADORES");
        ConfigTab.add(trab_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 180, 30));

        duracionDiaInput.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        duracionDiaInput.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(duracionDiaInput);

        ConfigTab.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 120, -1));

        diasEntregaInput.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        diasEntregaInput.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(diasEntregaInput);

        ConfigTab.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 120, -1));

        dayDuration_label1.setBackground(new java.awt.Color(102, 102, 102));
        dayDuration_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        dayDuration_label1.setForeground(new java.awt.Color(255, 255, 255));
        dayDuration_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayDuration_label1.setText("Días para entregar");
        ConfigTab.add(dayDuration_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 140, 30));

        ensambladorHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        ensambladorHP.setModel(new javax.swing.SpinnerNumberModel(1, 1, 11, 1));
        ConfigTab.add(ensambladorHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, 30));

        assemblers_label2.setBackground(new java.awt.Color(102, 102, 102));
        assemblers_label2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        assemblers_label2.setForeground(new java.awt.Color(255, 255, 255));
        assemblers_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assemblers_label2.setText("Ensamblador");
        ConfigTab.add(assemblers_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 100, 30));

        ensambladorDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        ensambladorDell.setModel(new javax.swing.SpinnerNumberModel(1, 1, 16, 1));
        ConfigTab.add(ensambladorDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, -1, 30));

        placa_label6.setBackground(new java.awt.Color(102, 102, 102));
        placa_label6.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        placa_label6.setForeground(new java.awt.Color(255, 255, 255));
        placa_label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placa_label6.setText("Placa base");
        ConfigTab.add(placa_label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 90, 30));

        assemblers_label1.setBackground(new java.awt.Color(102, 102, 102));
        assemblers_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        assemblers_label1.setForeground(new java.awt.Color(255, 255, 255));
        assemblers_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assemblers_label1.setText("Ensamblador");
        ConfigTab.add(assemblers_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 80, 30));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        prod_label5.setBackground(new java.awt.Color(102, 102, 102));
        prod_label5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        prod_label5.setForeground(new java.awt.Color(255, 255, 255));
        prod_label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prod_label5.setText("PRODUCTORES DE:");
        jPanel1.add(prod_label5);

        ConfigTab.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 150, 30));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        prod_label8.setBackground(new java.awt.Color(102, 102, 102));
        prod_label8.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        prod_label8.setForeground(new java.awt.Color(255, 255, 255));
        prod_label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prod_label8.setText("PRODUCTORES DE:");
        jPanel2.add(prod_label8);

        ConfigTab.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 150, 30));

        cpuHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        cpuHP.setModel(new javax.swing.SpinnerNumberModel(1, 1, 11, 1));
        ConfigTab.add(cpuHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 30));

        jTabbedPane1.addTab("Configuración", ConfigTab);

        DellTab.setBackground(new java.awt.Color(110, 110, 213));
        DellTab.setForeground(new java.awt.Color(255, 255, 255));
        DellTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comenzarDell.setBackground(new java.awt.Color(255, 204, 255));
        comenzarDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        comenzarDell.setForeground(new java.awt.Color(51, 51, 51));
        comenzarDell.setText("Comenzar");
        comenzarDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarDellActionPerformed(evt);
            }
        });
        DellTab.add(comenzarDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, 40));

        M_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 48)); // NOI18N
        M_label.setForeground(new java.awt.Color(255, 204, 255));
        M_label.setText("DELL");
        DellTab.add(M_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 270, 60));

        wm_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label.setForeground(new java.awt.Color(255, 204, 255));
        wm_label.setText("DIRECTOR");
        DellTab.add(wm_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 140, 40));

        wm_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label1.setForeground(new java.awt.Color(255, 204, 255));
        wm_label1.setText("TRABAJADORES");
        DellTab.add(wm_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 240, 40));

        wm_label4.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label4.setForeground(new java.awt.Color(255, 204, 255));
        wm_label4.setText("PROJECT MANAGER");
        DellTab.add(wm_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 260, 40));

        assembled_labelM1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM1.setForeground(new java.awt.Color(255, 204, 255));
        assembled_labelM1.setText("COMPUTADORAS LISTAS");
        DellTab.add(assembled_labelM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 320, 40));

        wm_label10.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        wm_label10.setForeground(new java.awt.Color(255, 204, 255));
        wm_label10.setText("Elementos de las computadoras");
        DellTab.add(wm_label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, 40));

        chas26.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas26.setForeground(new java.awt.Color(255, 255, 255));
        chas26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas26.setText("Placa base:");
        DellTab.add(chas26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 120, 40));

        placaElementoDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        placaElementoDell.setForeground(new java.awt.Color(255, 255, 255));
        placaElementoDell.setText("0");
        DellTab.add(placaElementoDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 40, 40));

        maxPlacaBaseDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxPlacaBaseDell.setForeground(new java.awt.Color(255, 255, 255));
        maxPlacaBaseDell.setText("/ 25");
        DellTab.add(maxPlacaBaseDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 40, 40));

        chas27.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas27.setForeground(new java.awt.Color(255, 255, 255));
        chas27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas27.setText("CPUs:");
        DellTab.add(chas27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        cpuElementoDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        cpuElementoDell.setForeground(new java.awt.Color(255, 255, 255));
        cpuElementoDell.setText("0");
        DellTab.add(cpuElementoDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 40, 40));

        maxCpuDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxCpuDell.setForeground(new java.awt.Color(255, 255, 255));
        maxCpuDell.setText("/ 20");
        DellTab.add(maxCpuDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 40, 40));

        chas28.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas28.setForeground(new java.awt.Color(255, 255, 255));
        chas28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas28.setText("Memoria RAM:");
        DellTab.add(chas28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 140, 40));

        ramElementoDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ramElementoDell.setForeground(new java.awt.Color(255, 255, 255));
        ramElementoDell.setText("0");
        DellTab.add(ramElementoDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 40, 40));

        maxRamDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxRamDell.setForeground(new java.awt.Color(255, 255, 255));
        maxRamDell.setText("/ 55");
        DellTab.add(maxRamDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 40, 40));

        chas29.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas29.setForeground(new java.awt.Color(255, 255, 255));
        chas29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas29.setText("Fuente de alimentación:");
        DellTab.add(chas29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 190, 40));

        fuenteElementoDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        fuenteElementoDell.setForeground(new java.awt.Color(255, 255, 255));
        fuenteElementoDell.setText("0");
        DellTab.add(fuenteElementoDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 40, 40));

        maxFuenteDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxFuenteDell.setForeground(new java.awt.Color(255, 255, 255));
        maxFuenteDell.setText("/ 35");
        DellTab.add(maxFuenteDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 40, 40));

        chas30.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas30.setForeground(new java.awt.Color(255, 255, 255));
        chas30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas30.setText("Tarjetas gráficas:");
        DellTab.add(chas30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 140, 40));

        tarjetaElementoDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        tarjetaElementoDell.setForeground(new java.awt.Color(255, 255, 255));
        tarjetaElementoDell.setText("0");
        DellTab.add(tarjetaElementoDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 40, 40));

        maxTarjetaDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxTarjetaDell.setForeground(new java.awt.Color(255, 255, 255));
        maxTarjetaDell.setText("/ 10");
        DellTab.add(maxTarjetaDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 40, 40));

        assembled_labelM7.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM7.setForeground(new java.awt.Color(255, 204, 255));
        assembled_labelM7.setText("GANANCIAS: ");
        DellTab.add(assembled_labelM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 170, 40));

        gananciasDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        gananciasDell.setForeground(new java.awt.Color(255, 255, 255));
        gananciasDell.setText("0");
        DellTab.add(gananciasDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 210, 40));

        assembled_labelM8.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM8.setForeground(new java.awt.Color(255, 204, 255));
        assembled_labelM8.setText("COSTOS:");
        DellTab.add(assembled_labelM8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 110, 40));

        costosDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        costosDell.setForeground(new java.awt.Color(255, 255, 255));
        costosDell.setText("0");
        DellTab.add(costosDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 220, 40));

        DayLeftLamborghini3.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        DayLeftLamborghini3.setForeground(new java.awt.Color(255, 204, 255));
        DayLeftLamborghini3.setText("DÍAS FALTANTES:");
        DellTab.add(DayLeftLamborghini3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 180, 40));

        diasFaltantesDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        diasFaltantesDell.setForeground(new java.awt.Color(255, 255, 255));
        diasFaltantesDell.setText("0");
        DellTab.add(diasFaltantesDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 80, 40));

        gananciaTotalDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        gananciaTotalDell.setForeground(new java.awt.Color(255, 255, 255));
        gananciaTotalDell.setText("0");
        DellTab.add(gananciaTotalDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 220, 50));

        utility_label2.setEditable(false);
        utility_label2.setBackground(new java.awt.Color(255, 204, 255));
        utility_label2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        utility_label2.setText("GANANCIA TOTAL:");
        utility_label2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        utility_label2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utility_label2ActionPerformed(evt);
            }
        });
        DellTab.add(utility_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 210, 50));

        directorStatus_label2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        directorStatus_label2.setForeground(new java.awt.Color(255, 255, 255));
        directorStatus_label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        directorStatus_label2.setText("Estado:");
        DellTab.add(directorStatus_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 110, 40));

        estadoDirectorDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        estadoDirectorDell.setForeground(new java.awt.Color(255, 255, 255));
        estadoDirectorDell.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        estadoDirectorDell.setText("Trabajando");
        DellTab.add(estadoDirectorDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 160, 40));

        managerStatus_label6.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label6.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label6.setText("Estado:");
        DellTab.add(managerStatus_label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 70, 40));

        estadoManagerDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        estadoManagerDell.setForeground(new java.awt.Color(255, 255, 255));
        estadoManagerDell.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        estadoManagerDell.setText("Nada");
        DellTab.add(estadoManagerDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 250, 40));

        managerStatus_label7.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label7.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label7.setText("Fallas:");
        DellTab.add(managerStatus_label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 70, 40));

        fallasManagerDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        fallasManagerDell.setForeground(new java.awt.Color(255, 255, 255));
        fallasManagerDell.setText("0");
        DellTab.add(fallasManagerDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 40, 40));

        managerStatus_label8.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label8.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label8.setText("Descontado:");
        DellTab.add(managerStatus_label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 120, 40));

        descontadoManagerDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        descontadoManagerDell.setForeground(new java.awt.Color(255, 255, 255));
        descontadoManagerDell.setText("0");
        DellTab.add(descontadoManagerDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 70, 40));

        chas31.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas31.setForeground(new java.awt.Color(255, 255, 255));
        chas31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas31.setText("Estándar:");
        DellTab.add(chas31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 100, 40));

        estandarDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        estandarDell.setForeground(new java.awt.Color(255, 255, 255));
        estandarDell.setText("0");
        DellTab.add(estandarDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 40, 40));

        chas32.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas32.setForeground(new java.awt.Color(255, 255, 255));
        chas32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas32.setText("Con tarjeta gráfica:");
        DellTab.add(chas32, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 180, 40));

        conTarjetaDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        conTarjetaDell.setForeground(new java.awt.Color(255, 255, 255));
        conTarjetaDell.setText("0");
        DellTab.add(conTarjetaDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 40, 40));

        chas33.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas33.setForeground(new java.awt.Color(255, 255, 255));
        chas33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas33.setText("Placa base:");
        DellTab.add(chas33, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 120, 40));

        chas34.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas34.setForeground(new java.awt.Color(255, 255, 255));
        chas34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas34.setText("CPUs:");
        DellTab.add(chas34, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 70, 40));

        chas35.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas35.setForeground(new java.awt.Color(255, 255, 255));
        chas35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas35.setText("Memoria RAM:");
        DellTab.add(chas35, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 120, 40));

        chas36.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas36.setForeground(new java.awt.Color(255, 255, 255));
        chas36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas36.setText("Fuente de alimentación:");
        DellTab.add(chas36, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 180, 40));

        chas37.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas37.setForeground(new java.awt.Color(255, 255, 255));
        chas37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas37.setText("Tarjetas gráficas:");
        DellTab.add(chas37, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 150, 40));

        chas38.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas38.setForeground(new java.awt.Color(255, 255, 255));
        chas38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas38.setText("Ensambladores:");
        DellTab.add(chas38, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 120, 40));

        placaBaseMinDell.setBackground(new java.awt.Color(255, 204, 255));
        placaBaseMinDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        placaBaseMinDell.setForeground(new java.awt.Color(51, 51, 51));
        placaBaseMinDell.setText("-");
        placaBaseMinDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaBaseMinDellActionPerformed(evt);
            }
        });
        DellTab.add(placaBaseMinDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 50, 20));

        placaBasePlusDell.setBackground(new java.awt.Color(255, 204, 255));
        placaBasePlusDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        placaBasePlusDell.setForeground(new java.awt.Color(51, 51, 51));
        placaBasePlusDell.setText("+");
        placaBasePlusDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaBasePlusDellActionPerformed(evt);
            }
        });
        DellTab.add(placaBasePlusDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 50, 20));

        placaTrabajadoresDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        placaTrabajadoresDell.setForeground(new java.awt.Color(255, 255, 255));
        placaTrabajadoresDell.setText("0");
        DellTab.add(placaTrabajadoresDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 40, 40));

        cpuTrabajadoresDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        cpuTrabajadoresDell.setForeground(new java.awt.Color(255, 255, 255));
        cpuTrabajadoresDell.setText("0");
        DellTab.add(cpuTrabajadoresDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 40, 40));

        cpuPlusDell.setBackground(new java.awt.Color(255, 204, 255));
        cpuPlusDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        cpuPlusDell.setForeground(new java.awt.Color(51, 51, 51));
        cpuPlusDell.setText("+");
        cpuPlusDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuPlusDellActionPerformed(evt);
            }
        });
        DellTab.add(cpuPlusDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 50, 20));

        cpuMinDell.setBackground(new java.awt.Color(255, 204, 255));
        cpuMinDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        cpuMinDell.setForeground(new java.awt.Color(51, 51, 51));
        cpuMinDell.setText("-");
        cpuMinDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuMinDellActionPerformed(evt);
            }
        });
        DellTab.add(cpuMinDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 50, 20));

        ramMinDell.setBackground(new java.awt.Color(255, 204, 255));
        ramMinDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ramMinDell.setForeground(new java.awt.Color(51, 51, 51));
        ramMinDell.setText("-");
        ramMinDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramMinDellActionPerformed(evt);
            }
        });
        DellTab.add(ramMinDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 50, 20));

        ramPlusDell.setBackground(new java.awt.Color(255, 204, 255));
        ramPlusDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ramPlusDell.setForeground(new java.awt.Color(51, 51, 51));
        ramPlusDell.setText("+");
        ramPlusDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramPlusDellActionPerformed(evt);
            }
        });
        DellTab.add(ramPlusDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 50, 20));

        ramTrabajadoresDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ramTrabajadoresDell.setForeground(new java.awt.Color(255, 255, 255));
        ramTrabajadoresDell.setText("0");
        DellTab.add(ramTrabajadoresDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 40, 40));

        fuenteTrabajadoresDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        fuenteTrabajadoresDell.setForeground(new java.awt.Color(255, 255, 255));
        fuenteTrabajadoresDell.setText("0");
        DellTab.add(fuenteTrabajadoresDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 40, 40));

        fuentePlusDell.setBackground(new java.awt.Color(255, 204, 255));
        fuentePlusDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        fuentePlusDell.setForeground(new java.awt.Color(51, 51, 51));
        fuentePlusDell.setText("+");
        fuentePlusDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuentePlusDellActionPerformed(evt);
            }
        });
        DellTab.add(fuentePlusDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 50, 20));

        fuenteMinDell.setBackground(new java.awt.Color(255, 204, 255));
        fuenteMinDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        fuenteMinDell.setForeground(new java.awt.Color(51, 51, 51));
        fuenteMinDell.setText("-");
        fuenteMinDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuenteMinDellActionPerformed(evt);
            }
        });
        DellTab.add(fuenteMinDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 50, 20));

        tarjetaTrabajadoresDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        tarjetaTrabajadoresDell.setForeground(new java.awt.Color(255, 255, 255));
        tarjetaTrabajadoresDell.setText("0");
        DellTab.add(tarjetaTrabajadoresDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 40, 40));

        tarjetaPlusDell.setBackground(new java.awt.Color(255, 204, 255));
        tarjetaPlusDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        tarjetaPlusDell.setForeground(new java.awt.Color(51, 51, 51));
        tarjetaPlusDell.setText("+");
        tarjetaPlusDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaPlusDellActionPerformed(evt);
            }
        });
        DellTab.add(tarjetaPlusDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 50, 20));

        tarjetaMinDell.setBackground(new java.awt.Color(255, 204, 255));
        tarjetaMinDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        tarjetaMinDell.setForeground(new java.awt.Color(51, 51, 51));
        tarjetaMinDell.setText("-");
        tarjetaMinDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaMinDellActionPerformed(evt);
            }
        });
        DellTab.add(tarjetaMinDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 50, 20));

        ensambladorTrabajadoresDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ensambladorTrabajadoresDell.setForeground(new java.awt.Color(255, 255, 255));
        ensambladorTrabajadoresDell.setText("0");
        DellTab.add(ensambladorTrabajadoresDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 40, 40));

        ensambladorPlusDell.setBackground(new java.awt.Color(255, 204, 255));
        ensambladorPlusDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ensambladorPlusDell.setForeground(new java.awt.Color(51, 51, 51));
        ensambladorPlusDell.setText("+");
        ensambladorPlusDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ensambladorPlusDellActionPerformed(evt);
            }
        });
        DellTab.add(ensambladorPlusDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 50, 20));

        ensambladorMinDell.setBackground(new java.awt.Color(255, 204, 255));
        ensambladorMinDell.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ensambladorMinDell.setForeground(new java.awt.Color(51, 51, 51));
        ensambladorMinDell.setText("-");
        ensambladorMinDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ensambladorMinDellActionPerformed(evt);
            }
        });
        DellTab.add(ensambladorMinDell, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 50, 20));

        jTabbedPane1.addTab("DELL", DellTab);

        HPTab.setBackground(new java.awt.Color(76, 156, 57));
        HPTab.setForeground(new java.awt.Color(204, 204, 255));
        HPTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comenzarHP.setBackground(new java.awt.Color(213, 170, 39));
        comenzarHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        comenzarHP.setForeground(new java.awt.Color(255, 255, 255));
        comenzarHP.setText("Comenzar");
        comenzarHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarHPActionPerformed(evt);
            }
        });
        HPTab.add(comenzarHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 130, 40));

        L_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 48)); // NOI18N
        L_label.setForeground(new java.awt.Color(246, 200, 30));
        L_label.setText("HP");
        HPTab.add(L_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 60));

        cpuTrabajadoresHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        cpuTrabajadoresHP.setForeground(new java.awt.Color(255, 255, 255));
        cpuTrabajadoresHP.setText("0");
        HPTab.add(cpuTrabajadoresHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 40, 40));

        wm_label3.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label3.setForeground(new java.awt.Color(255, 255, 255));
        wm_label3.setText("DIRECTOR");
        HPTab.add(wm_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 140, 40));

        chas13.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas13.setForeground(new java.awt.Color(255, 255, 255));
        chas13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas13.setText("Memoria RAM:");
        HPTab.add(chas13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 120, 40));

        chas14.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas14.setForeground(new java.awt.Color(255, 255, 255));
        chas14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas14.setText("Fuente de alimentación:");
        HPTab.add(chas14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 180, 40));

        fuenteTrabajadoresHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        fuenteTrabajadoresHP.setForeground(new java.awt.Color(255, 255, 255));
        fuenteTrabajadoresHP.setText("0");
        HPTab.add(fuenteTrabajadoresHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 40, 40));

        chas15.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas15.setForeground(new java.awt.Color(255, 255, 255));
        chas15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas15.setText("Tarjetas gráficas:");
        HPTab.add(chas15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 150, 40));

        tarjetaTrabajadoresHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        tarjetaTrabajadoresHP.setForeground(new java.awt.Color(255, 255, 255));
        tarjetaTrabajadoresHP.setText("0");
        HPTab.add(tarjetaTrabajadoresHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 40, 40));

        placaTrabajadoresHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        placaTrabajadoresHP.setForeground(new java.awt.Color(255, 255, 255));
        placaTrabajadoresHP.setText("0");
        HPTab.add(placaTrabajadoresHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 40, 40));

        chas16.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas16.setForeground(new java.awt.Color(255, 255, 255));
        chas16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas16.setText("Ensambladores:");
        HPTab.add(chas16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 120, 40));

        ensambladorTrabajadoresHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ensambladorTrabajadoresHP.setForeground(new java.awt.Color(255, 255, 255));
        ensambladorTrabajadoresHP.setText("0");
        HPTab.add(ensambladorTrabajadoresHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 40, 40));

        wm_label5.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label5.setForeground(new java.awt.Color(255, 255, 255));
        wm_label5.setText("TRABAJADORES");
        HPTab.add(wm_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 250, 40));

        chas17.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas17.setForeground(new java.awt.Color(255, 255, 255));
        chas17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas17.setText("Placa base:");
        HPTab.add(chas17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 120, 40));

        chas18.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas18.setForeground(new java.awt.Color(255, 255, 255));
        chas18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas18.setText("CPUs:");
        HPTab.add(chas18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 70, 40));

        managerStatus_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label1.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label1.setText("Descontado:");
        HPTab.add(managerStatus_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 120, 40));

        descontadoManagerHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        descontadoManagerHP.setForeground(new java.awt.Color(255, 255, 255));
        descontadoManagerHP.setText("0");
        HPTab.add(descontadoManagerHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 120, 40));

        ramTrabajadoresHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ramTrabajadoresHP.setForeground(new java.awt.Color(255, 255, 255));
        ramTrabajadoresHP.setText("0");
        HPTab.add(ramTrabajadoresHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 40, 40));

        estadoDirectorHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        estadoDirectorHP.setForeground(new java.awt.Color(255, 255, 255));
        estadoDirectorHP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        estadoDirectorHP.setText("Trabajando");
        HPTab.add(estadoDirectorHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 160, 40));

        directorStatus_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        directorStatus_label1.setForeground(new java.awt.Color(255, 255, 255));
        directorStatus_label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        directorStatus_label1.setText("Estado:");
        HPTab.add(directorStatus_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 100, 40));

        managerStatus_label4.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label4.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label4.setText("Fallas:");
        HPTab.add(managerStatus_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 70, 40));

        fallasManagerHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        fallasManagerHP.setForeground(new java.awt.Color(255, 255, 255));
        fallasManagerHP.setText("0");
        HPTab.add(fallasManagerHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 40, 40));

        managerStatus_label5.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        managerStatus_label5.setForeground(new java.awt.Color(255, 255, 255));
        managerStatus_label5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        managerStatus_label5.setText("Estado:");
        HPTab.add(managerStatus_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 70, 40));

        estadoManagerHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        estadoManagerHP.setForeground(new java.awt.Color(255, 255, 255));
        estadoManagerHP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        estadoManagerHP.setText("Nada");
        HPTab.add(estadoManagerHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 250, 40));

        wm_label7.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        wm_label7.setForeground(new java.awt.Color(255, 255, 255));
        wm_label7.setText("PROJECT MANAGER");
        HPTab.add(wm_label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 260, 40));

        DayLeftLamborghini1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        DayLeftLamborghini1.setForeground(new java.awt.Color(255, 255, 255));
        DayLeftLamborghini1.setText("DÍAS FALTANTES:");
        HPTab.add(DayLeftLamborghini1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 180, 40));

        chas19.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas19.setForeground(new java.awt.Color(255, 255, 255));
        chas19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas19.setText("Con tarjeta gráfica:");
        HPTab.add(chas19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 180, 40));

        chas20.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        chas20.setForeground(new java.awt.Color(255, 255, 255));
        chas20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas20.setText("Estándar:");
        HPTab.add(chas20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 100, 40));

        conTarjetaHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        conTarjetaHP.setForeground(new java.awt.Color(255, 255, 255));
        conTarjetaHP.setText("0");
        HPTab.add(conTarjetaHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 40, 40));

        estandarHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        estandarHP.setForeground(new java.awt.Color(255, 255, 255));
        estandarHP.setText("0");
        HPTab.add(estandarHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 40, 40));

        assembled_labelM4.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM4.setForeground(new java.awt.Color(255, 255, 255));
        assembled_labelM4.setText("COMPUTADORAS LISTAS");
        HPTab.add(assembled_labelM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 320, 40));

        diasFaltantesHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        diasFaltantesHP.setForeground(new java.awt.Color(255, 255, 255));
        diasFaltantesHP.setText("0");
        HPTab.add(diasFaltantesHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 50, 40));

        chas21.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas21.setForeground(new java.awt.Color(255, 255, 255));
        chas21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas21.setText("CPUs:");
        HPTab.add(chas21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        ramElementoHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ramElementoHP.setForeground(new java.awt.Color(255, 255, 255));
        ramElementoHP.setText("0");
        HPTab.add(ramElementoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 40, 40));

        chas22.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas22.setForeground(new java.awt.Color(255, 255, 255));
        chas22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas22.setText("Placa base:");
        HPTab.add(chas22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 120, 40));

        chas23.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas23.setForeground(new java.awt.Color(255, 255, 255));
        chas23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas23.setText("Memoria RAM:");
        HPTab.add(chas23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 140, 40));

        chas24.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas24.setForeground(new java.awt.Color(255, 255, 255));
        chas24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas24.setText("Fuente de alimentación:");
        HPTab.add(chas24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 190, 40));

        cpuElementoHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        cpuElementoHP.setForeground(new java.awt.Color(255, 255, 255));
        cpuElementoHP.setText("0");
        HPTab.add(cpuElementoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 40, 40));

        fuenteElementoHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        fuenteElementoHP.setForeground(new java.awt.Color(255, 255, 255));
        fuenteElementoHP.setText("0");
        HPTab.add(fuenteElementoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 40, 40));

        maxTarjetaHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxTarjetaHP.setForeground(new java.awt.Color(255, 255, 255));
        maxTarjetaHP.setText("/ 10");
        HPTab.add(maxTarjetaHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 40, 40));

        placaElementoHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        placaElementoHP.setForeground(new java.awt.Color(255, 255, 255));
        placaElementoHP.setText("0");
        HPTab.add(placaElementoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 40, 40));

        maxPlacaBaseHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxPlacaBaseHP.setForeground(new java.awt.Color(255, 255, 255));
        maxPlacaBaseHP.setText("/ 25");
        HPTab.add(maxPlacaBaseHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 40, 40));

        maxCpuHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxCpuHP.setForeground(new java.awt.Color(255, 255, 255));
        maxCpuHP.setText("/ 20");
        HPTab.add(maxCpuHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 40, 40));

        maxRamHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxRamHP.setForeground(new java.awt.Color(255, 255, 255));
        maxRamHP.setText("/ 55");
        HPTab.add(maxRamHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 40, 40));

        maxFuenteHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        maxFuenteHP.setForeground(new java.awt.Color(255, 255, 255));
        maxFuenteHP.setText("/ 35");
        HPTab.add(maxFuenteHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 40, 40));

        wm_label9.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        wm_label9.setForeground(new java.awt.Color(255, 255, 255));
        wm_label9.setText("Elementos de las computadoras");
        HPTab.add(wm_label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, 40));

        chas25.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chas25.setForeground(new java.awt.Color(255, 255, 255));
        chas25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chas25.setText("Tarjetas gráficas:");
        HPTab.add(chas25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 140, 40));

        tarjetaElementoHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        tarjetaElementoHP.setForeground(new java.awt.Color(255, 255, 255));
        tarjetaElementoHP.setText("0");
        HPTab.add(tarjetaElementoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 40, 40));

        gananciasHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        gananciasHP.setForeground(new java.awt.Color(255, 255, 255));
        gananciasHP.setText("0");
        HPTab.add(gananciasHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 210, 40));

        assembled_labelM5.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM5.setForeground(new java.awt.Color(255, 255, 255));
        assembled_labelM5.setText("GANANCIAS: ");
        HPTab.add(assembled_labelM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 170, 40));

        assembled_labelM6.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        assembled_labelM6.setForeground(new java.awt.Color(255, 255, 255));
        assembled_labelM6.setText("COSTOS:");
        HPTab.add(assembled_labelM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 110, 40));

        costosHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        costosHP.setForeground(new java.awt.Color(255, 255, 255));
        costosHP.setText("0");
        HPTab.add(costosHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 220, 40));

        gananciaTotalHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        gananciaTotalHP.setForeground(new java.awt.Color(255, 255, 255));
        gananciaTotalHP.setText("0");
        HPTab.add(gananciaTotalHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 220, 50));

        placaBasePlusHP.setBackground(new java.awt.Color(213, 170, 39));
        placaBasePlusHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        placaBasePlusHP.setForeground(new java.awt.Color(51, 51, 51));
        placaBasePlusHP.setText("+");
        placaBasePlusHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaBasePlusHPActionPerformed(evt);
            }
        });
        HPTab.add(placaBasePlusHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 50, 20));

        cpuPlusHP.setBackground(new java.awt.Color(213, 170, 39));
        cpuPlusHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        cpuPlusHP.setForeground(new java.awt.Color(51, 51, 51));
        cpuPlusHP.setText("+");
        cpuPlusHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuPlusHPActionPerformed(evt);
            }
        });
        HPTab.add(cpuPlusHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 50, 20));

        ramPlusHP.setBackground(new java.awt.Color(213, 170, 39));
        ramPlusHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ramPlusHP.setForeground(new java.awt.Color(51, 51, 51));
        ramPlusHP.setText("+");
        ramPlusHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramPlusHPActionPerformed(evt);
            }
        });
        HPTab.add(ramPlusHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 50, 20));

        placaBaseMinHP.setBackground(new java.awt.Color(213, 170, 39));
        placaBaseMinHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        placaBaseMinHP.setForeground(new java.awt.Color(51, 51, 51));
        placaBaseMinHP.setText("-");
        placaBaseMinHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaBaseMinHPActionPerformed(evt);
            }
        });
        HPTab.add(placaBaseMinHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 50, 20));

        cpuMinHP.setBackground(new java.awt.Color(213, 170, 39));
        cpuMinHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        cpuMinHP.setForeground(new java.awt.Color(51, 51, 51));
        cpuMinHP.setText("-");
        cpuMinHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuMinHPActionPerformed(evt);
            }
        });
        HPTab.add(cpuMinHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 50, 20));

        ramMinHP.setBackground(new java.awt.Color(213, 170, 39));
        ramMinHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ramMinHP.setForeground(new java.awt.Color(51, 51, 51));
        ramMinHP.setText("-");
        ramMinHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramMinHPActionPerformed(evt);
            }
        });
        HPTab.add(ramMinHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 50, 20));

        fuentePlusHP.setBackground(new java.awt.Color(213, 170, 39));
        fuentePlusHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        fuentePlusHP.setForeground(new java.awt.Color(51, 51, 51));
        fuentePlusHP.setText("+");
        fuentePlusHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuentePlusHPActionPerformed(evt);
            }
        });
        HPTab.add(fuentePlusHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 50, 20));

        fuenteMinHP.setBackground(new java.awt.Color(213, 170, 39));
        fuenteMinHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        fuenteMinHP.setForeground(new java.awt.Color(51, 51, 51));
        fuenteMinHP.setText("-");
        fuenteMinHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuenteMinHPActionPerformed(evt);
            }
        });
        HPTab.add(fuenteMinHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 50, 20));

        tarjetaMinHP.setBackground(new java.awt.Color(213, 170, 39));
        tarjetaMinHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        tarjetaMinHP.setForeground(new java.awt.Color(51, 51, 51));
        tarjetaMinHP.setText("-");
        tarjetaMinHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaMinHPActionPerformed(evt);
            }
        });
        HPTab.add(tarjetaMinHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 50, 20));

        tarjetaPlusHP.setBackground(new java.awt.Color(213, 170, 39));
        tarjetaPlusHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        tarjetaPlusHP.setForeground(new java.awt.Color(51, 51, 51));
        tarjetaPlusHP.setText("+");
        tarjetaPlusHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaPlusHPActionPerformed(evt);
            }
        });
        HPTab.add(tarjetaPlusHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 50, 20));

        ensambladorMinHP.setBackground(new java.awt.Color(213, 170, 39));
        ensambladorMinHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ensambladorMinHP.setForeground(new java.awt.Color(51, 51, 51));
        ensambladorMinHP.setText("-");
        ensambladorMinHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ensambladorMinHPActionPerformed(evt);
            }
        });
        HPTab.add(ensambladorMinHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 50, 20));

        ensambladorPlusHP.setBackground(new java.awt.Color(213, 170, 39));
        ensambladorPlusHP.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        ensambladorPlusHP.setForeground(new java.awt.Color(51, 51, 51));
        ensambladorPlusHP.setText("+");
        ensambladorPlusHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ensambladorPlusHPActionPerformed(evt);
            }
        });
        HPTab.add(ensambladorPlusHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 50, 20));

        utility_label.setEditable(false);
        utility_label.setBackground(new java.awt.Color(213, 170, 39));
        utility_label.setForeground(new java.awt.Color(255, 255, 255));
        utility_label.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        utility_label.setText("GANANCIA TOTAL:");
        utility_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        utility_label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utility_labelActionPerformed(evt);
            }
        });
        HPTab.add(utility_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 210, 50));

        jTabbedPane1.addTab("HP", HPTab);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 605));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void establecerConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_establecerConfiguracionActionPerformed
        String configString = "General\nduracionDias\n";
        boolean pass = true;

        try {
            int duracionDia = Integer.parseInt(duracionDiaInput.getText()) * 1000;
            int diasEntrega = Integer.parseInt(diasEntregaInput.getText());

            configString += Integer.toString(duracionDia) + "\ndiasEntrega\n" + Integer.toString(diasEntrega) + "\n";

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un número\n(Duración del Día y Días para entregar)");
            pass = false;
        }

        if (pass) {
            try {
                //DELL
                configString += "\nDell\nplaca\n";

                Integer placaDell = (Integer) placaBaseDell.getValue();
                configString += placaDell.toString() + "\ncpu\n";

                Integer cpusDell = (Integer) cpuDell.getValue();
                configString += cpusDell + "\nram\n";

                Integer ramsDell = (Integer) ramDell.getValue();
                configString += ramsDell + "\nfuenteA\n";

                Integer fuenteADell = (Integer) fuenteDell.getValue();
                configString += fuenteADell + "\ntarjetaG\n";

                Integer tarjetaGDell = (Integer) tarjetaGraficaDell.getValue();
                configString += tarjetaGDell + "\nensamblador\n";

                Integer ensambDell = (Integer) ensambladorDell.getValue();
                configString += ensambDell + "\n";

                int sumDell = placaDell + cpusDell + ramsDell + fuenteADell + tarjetaGDell + ensambDell;

                //HP
                configString += "\nHP\nplaca\n";

                Integer placaHP = (Integer) placaBaseHP.getValue();
                configString += placaHP.toString() + "\ncpu\n";

                Integer cpusHP = (Integer) cpuHP.getValue();
                configString += cpusHP + "\nram\n";

                Integer ramsHP = (Integer) ramHP.getValue();
                configString += ramsHP + "\nfuenteA\n";

                Integer fuenteAHP = (Integer) fuenteHP.getValue();
                configString += fuenteAHP + "\ntarjetaG\n";

                Integer tarjetaGHP = (Integer) tarjetaGraficaHP.getValue();
                configString += tarjetaGHP + "\nensamblador\n";

                Integer ensambHP = (Integer) ensambladorHP.getValue();
                configString += ensambHP + "\n";

                int sumHP = placaHP + cpusHP + ramsHP + fuenteAHP + tarjetaGHP + ensambHP;

                if ((sumHP > 16) || (sumDell > 21)) {
                    throw new Exception();
                }

                LeerArchivo file = new LeerArchivo();
                file.imprimirTexto(configString);

                String newConfig = file.leerTexto();
                file.leerConfiguracion(newConfig, Configuracion);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Ingresa una cantidad de Trabajadores adecuada.\nLa capacidad máxima para HP es 16 y para DELL es 21.");
            }
        }
    }//GEN-LAST:event_establecerConfiguracionActionPerformed

    //Acciones Interfaz HP
    private void comenzarHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarHPActionPerformed
        corriendoHP = true;
        deshabilitarBotonHP();
        deshabilitarComienzo("HP");

        HPDiasFaltantes(Integer.toString(Configuracion.getDiasDeEntrega()));
        PlantaHP = new EstudioEmpresa("HP", this, Configuracion);
        HPCantidadTrabajadores(Integer.toString(PlantaHP.getPlacaTrabajadores()), Integer.toString(PlantaHP.getCpuTrabajadores()), Integer.toString(PlantaHP.getRamTrabajadores()), Integer.toString(PlantaHP.getFuenteTrabajadores()), Integer.toString(PlantaHP.getTarjetaTrabajadores()), Integer.toString(PlantaHP.getEnsambladores()));
    }//GEN-LAST:event_comenzarHPActionPerformed

    private void placaBasePlusHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaBasePlusHPActionPerformed
        if ((PlantaHP.sumaTrabajadores() < 16)) {
            int placaInt = Integer.parseInt(placaTrabajadoresHP.getText()) + 1;
            placaTrabajadoresHP.setText(Integer.toString(placaInt));

            aumentarTrabajadores(PlantaHP, "placa");
            PlantaHP.incrementaTrabajadoresPlacaB();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad máxima");
        }
    }//GEN-LAST:event_placaBasePlusHPActionPerformed

    private void cpuPlusHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpuPlusHPActionPerformed
        if ((PlantaHP.sumaTrabajadores() < 16)) {
            int cpuInt = Integer.parseInt(cpuTrabajadoresHP.getText()) + 1;
            cpuTrabajadoresHP.setText(Integer.toString(cpuInt));

            aumentarTrabajadores(PlantaHP, "cpu");
            PlantaHP.incrementaTrabajadoresCpu();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad máxima");
        }
    }//GEN-LAST:event_cpuPlusHPActionPerformed

    private void ramPlusHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramPlusHPActionPerformed
        if ((PlantaHP.sumaTrabajadores() < 16)) {
            int ramInt = Integer.parseInt(ramTrabajadoresHP.getText()) + 1;
            ramTrabajadoresHP.setText(Integer.toString(ramInt));

            aumentarTrabajadores(PlantaHP, "ram");
            PlantaHP.incrementaTrabajadoresRam();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad máxima");
        }
    }//GEN-LAST:event_ramPlusHPActionPerformed

    private void placaBaseMinHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaBaseMinHPActionPerformed
        if (Integer.parseInt(placaTrabajadoresHP.getText()) > 1) {
            int placaInt = Integer.parseInt(placaTrabajadoresHP.getText()) - 1;
            placaTrabajadoresHP.setText(Integer.toString(placaInt));
            reducirTrabajadores(PlantaHP, "placa");
            PlantaHP.reduceTrabajadoresPlacaB();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad mínima");
        }
    }//GEN-LAST:event_placaBaseMinHPActionPerformed

    private void cpuMinHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpuMinHPActionPerformed
        if (Integer.parseInt(cpuTrabajadoresHP.getText()) > 1) {
            int cpuInt = Integer.parseInt(cpuTrabajadoresHP.getText()) - 1;
            cpuTrabajadoresHP.setText(Integer.toString(cpuInt));
            reducirTrabajadores(PlantaHP, "cpu");
            PlantaHP.reduceTrabajadoresCPU();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad mínima");
        }
    }//GEN-LAST:event_cpuMinHPActionPerformed

    private void ramMinHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramMinHPActionPerformed
        if (Integer.parseInt(ramTrabajadoresHP.getText()) > 1) {
            int ramInt = Integer.parseInt(ramTrabajadoresHP.getText()) - 1;
            ramTrabajadoresHP.setText(Integer.toString(ramInt));
            reducirTrabajadores(PlantaHP, "ram");
            PlantaHP.reduceTrabajadoresRam();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad mínima");
        }
    }//GEN-LAST:event_ramMinHPActionPerformed

    private void fuentePlusHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuentePlusHPActionPerformed
        if ((PlantaHP.sumaTrabajadores() < 16)) {
            int fuenteInt = Integer.parseInt(fuenteTrabajadoresHP.getText()) + 1;
            fuenteTrabajadoresHP.setText(Integer.toString(fuenteInt));

            aumentarTrabajadores(PlantaHP, "fuente");
            PlantaHP.incrementaTrabajadoresFuente();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad máxima");
        }
    }//GEN-LAST:event_fuentePlusHPActionPerformed

    private void fuenteMinHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuenteMinHPActionPerformed
        if (Integer.parseInt(fuenteTrabajadoresHP.getText()) > 1) {
            int fuenteInt = Integer.parseInt(fuenteTrabajadoresHP.getText()) - 1;
            fuenteTrabajadoresHP.setText(Integer.toString(fuenteInt));
            reducirTrabajadores(PlantaHP, "fuente");
            PlantaHP.reduceTrabajadoresFuente();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad mínima");
        }
    }//GEN-LAST:event_fuenteMinHPActionPerformed

    private void tarjetaMinHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaMinHPActionPerformed
        if (Integer.parseInt(tarjetaTrabajadoresHP.getText()) > 1) {
            int tarjetaInt = Integer.parseInt(tarjetaTrabajadoresHP.getText()) - 1;
            tarjetaTrabajadoresHP.setText(Integer.toString(tarjetaInt));
            reducirTrabajadores(PlantaHP, "tarjeta");
            PlantaHP.reduceTrabajadoresTarjeta();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad mínima");
        }
    }//GEN-LAST:event_tarjetaMinHPActionPerformed

    private void tarjetaPlusHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaPlusHPActionPerformed
        if ((PlantaHP.sumaTrabajadores() < 16)) {
            int tarjetaInt = Integer.parseInt(tarjetaTrabajadoresHP.getText()) + 1;
            tarjetaTrabajadoresHP.setText(Integer.toString(tarjetaInt));

            aumentarTrabajadores(PlantaHP, "tarjeta");
            PlantaHP.incrementaTrabajadoresTarjeta();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad máxima");
        }
    }//GEN-LAST:event_tarjetaPlusHPActionPerformed

    private void ensambladorMinHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ensambladorMinHPActionPerformed
        if (Integer.parseInt(ensambladorTrabajadoresHP.getText()) > 1) {
            int ensambladorInt = Integer.parseInt(ensambladorTrabajadoresHP.getText()) - 1;
            ensambladorTrabajadoresHP.setText(Integer.toString(ensambladorInt));
            reducirTrabajadores(PlantaHP, "ensamblador");
            PlantaHP.reduceEnsambladores();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad mínima");
        }
    }//GEN-LAST:event_ensambladorMinHPActionPerformed

    private void ensambladorPlusHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ensambladorPlusHPActionPerformed
        if ((PlantaHP.sumaTrabajadores() < 16)) {
            int ensambladorInt = Integer.parseInt(ensambladorTrabajadoresHP.getText()) + 1;
            ensambladorTrabajadoresHP.setText(Integer.toString(ensambladorInt));

            aumentarTrabajadores(PlantaHP, "ensamblador");
            PlantaHP.incrementaEnsambladores();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad máxima");
        }
    }//GEN-LAST:event_ensambladorPlusHPActionPerformed


    private void utility_labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utility_labelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utility_labelActionPerformed

    //Acciones Interfaz Dell
    private void comenzarDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarDellActionPerformed
        corriendoDell = true;
        deshabilitarBotonDell();
        deshabilitarComienzo("Dell");

        DellDiasFaltantes(Integer.toString(Configuracion.getDiasDeEntrega()));
        PlantaDell = new EstudioEmpresa("Dell", this, Configuracion);
        DellCantidadTrabajadores(Integer.toString(PlantaDell.getPlacaTrabajadores()), Integer.toString(PlantaDell.getCpuTrabajadores()), Integer.toString(PlantaDell.getRamTrabajadores()), Integer.toString(PlantaDell.getFuenteTrabajadores()), Integer.toString(PlantaDell.getTarjetaTrabajadores()), Integer.toString(PlantaDell.getEnsambladores()));

    }//GEN-LAST:event_comenzarDellActionPerformed

    private void utility_label2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utility_label2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utility_label2ActionPerformed

    private void placaBaseMinDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaBaseMinDellActionPerformed
        if (Integer.parseInt(placaTrabajadoresDell.getText()) > 1) {
            int placaInt = Integer.parseInt(placaTrabajadoresDell.getText()) - 1;
            placaTrabajadoresDell.setText(Integer.toString(placaInt));
            reducirTrabajadores(PlantaDell, "placa");
            PlantaDell.reduceTrabajadoresPlacaB();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad mínima");
        }
    }//GEN-LAST:event_placaBaseMinDellActionPerformed

    private void placaBasePlusDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaBasePlusDellActionPerformed
        if ((PlantaDell.sumaTrabajadores() < 21)) {
            int placaInt = Integer.parseInt(placaTrabajadoresDell.getText()) + 1;
            placaTrabajadoresDell.setText(Integer.toString(placaInt));

            aumentarTrabajadores(PlantaDell, "placa");
            PlantaDell.incrementaTrabajadoresPlacaB();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad máxima");
        }
    }//GEN-LAST:event_placaBasePlusDellActionPerformed

    private void cpuPlusDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpuPlusDellActionPerformed
        if ((PlantaDell.sumaTrabajadores() < 21)) {
            int cpuInt = Integer.parseInt(cpuTrabajadoresDell.getText()) + 1;
            cpuTrabajadoresDell.setText(Integer.toString(cpuInt));

            aumentarTrabajadores(PlantaDell, "cpu");
            PlantaDell.incrementaTrabajadoresCpu();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad máxima");
        }
    }//GEN-LAST:event_cpuPlusDellActionPerformed

    private void cpuMinDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpuMinDellActionPerformed
        if (Integer.parseInt(cpuTrabajadoresDell.getText()) > 1) {
            int cpuInt = Integer.parseInt(cpuTrabajadoresDell.getText()) - 1;
            cpuTrabajadoresDell.setText(Integer.toString(cpuInt));
            reducirTrabajadores(PlantaDell, "cpu");
            PlantaDell.reduceTrabajadoresCPU();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad mínima");
        }
    }//GEN-LAST:event_cpuMinDellActionPerformed

    private void ramMinDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramMinDellActionPerformed
        if (Integer.parseInt(ramTrabajadoresDell.getText()) > 1) {
            int ramInt = Integer.parseInt(ramTrabajadoresDell.getText()) - 1;
            ramTrabajadoresDell.setText(Integer.toString(ramInt));
            reducirTrabajadores(PlantaDell, "ram");
            PlantaDell.reduceTrabajadoresRam();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad mínima");
        }
    }//GEN-LAST:event_ramMinDellActionPerformed

    private void ramPlusDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramPlusDellActionPerformed
        if ((PlantaDell.sumaTrabajadores() < 21)) {
            int ramInt = Integer.parseInt(ramTrabajadoresDell.getText()) + 1;
            ramTrabajadoresDell.setText(Integer.toString(ramInt));

            aumentarTrabajadores(PlantaDell, "ram");
            PlantaDell.incrementaTrabajadoresRam();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad máxima");
        }
    }//GEN-LAST:event_ramPlusDellActionPerformed

    private void fuentePlusDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuentePlusDellActionPerformed
        if ((PlantaDell.sumaTrabajadores() < 21)) {
            int fuenteInt = Integer.parseInt(fuenteTrabajadoresDell.getText()) + 1;
            fuenteTrabajadoresDell.setText(Integer.toString(fuenteInt));

            aumentarTrabajadores(PlantaDell, "fuente");
            PlantaDell.incrementaTrabajadoresFuente();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad máxima");
        }
    }//GEN-LAST:event_fuentePlusDellActionPerformed

    private void fuenteMinDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuenteMinDellActionPerformed
        if (Integer.parseInt(fuenteTrabajadoresDell.getText()) > 1) {
            int fuenteInt = Integer.parseInt(fuenteTrabajadoresDell.getText()) - 1;
            fuenteTrabajadoresDell.setText(Integer.toString(fuenteInt));
            reducirTrabajadores(PlantaDell, "fuente");
            PlantaDell.reduceTrabajadoresFuente();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad mínima");
        }
    }//GEN-LAST:event_fuenteMinDellActionPerformed

    private void tarjetaPlusDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaPlusDellActionPerformed
        if ((PlantaDell.sumaTrabajadores() < 21)) {
            int tarjetaInt = Integer.parseInt(tarjetaTrabajadoresDell.getText()) + 1;
            tarjetaTrabajadoresDell.setText(Integer.toString(tarjetaInt));

            aumentarTrabajadores(PlantaDell, "tarjeta");
            PlantaDell.incrementaTrabajadoresTarjeta();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad máxima");
        }
    }//GEN-LAST:event_tarjetaPlusDellActionPerformed

    private void tarjetaMinDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaMinDellActionPerformed
        if (Integer.parseInt(tarjetaTrabajadoresDell.getText()) > 1) {
            int tarjetaInt = Integer.parseInt(tarjetaTrabajadoresDell.getText()) - 1;
            tarjetaTrabajadoresDell.setText(Integer.toString(tarjetaInt));
            reducirTrabajadores(PlantaDell, "tarjeta");
            PlantaDell.reduceTrabajadoresTarjeta();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad mínima");
        }
    }//GEN-LAST:event_tarjetaMinDellActionPerformed

    private void ensambladorPlusDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ensambladorPlusDellActionPerformed
        if ((PlantaDell.sumaTrabajadores() < 21)) {
            int ensambladorInt = Integer.parseInt(ensambladorTrabajadoresDell.getText()) + 1;
            ensambladorTrabajadoresDell.setText(Integer.toString(ensambladorInt));

            aumentarTrabajadores(PlantaDell, "ensamblador");
            PlantaDell.incrementaEnsambladores();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad máxima");
        }
    }//GEN-LAST:event_ensambladorPlusDellActionPerformed

    private void ensambladorMinDellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ensambladorMinDellActionPerformed
        if (Integer.parseInt(ensambladorTrabajadoresDell.getText()) > 1) {
            int ensambladorInt = Integer.parseInt(ensambladorTrabajadoresDell.getText()) - 1;
            ensambladorTrabajadoresDell.setText(Integer.toString(ensambladorInt));
            reducirTrabajadores(PlantaDell, "ensamblador");
            PlantaDell.reduceEnsambladores();
        } else {
            JOptionPane.showMessageDialog(null, "Has alcanzado la capacidad mínima");
        }
    }//GEN-LAST:event_ensambladorMinDellActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConfigTab;
    private javax.swing.JLabel Config_label;
    private javax.swing.JLabel DELL_label;
    private javax.swing.JLabel DayLeftLamborghini1;
    private javax.swing.JLabel DayLeftLamborghini3;
    private javax.swing.JPanel DellTab;
    private javax.swing.JLabel General_label;
    private javax.swing.JPanel HPTab;
    private javax.swing.JLabel HP_label;
    private javax.swing.JLabel L_label;
    private javax.swing.JLabel M_label;
    private javax.swing.JLabel TarjetaG_label1;
    private javax.swing.JLabel assembled_labelM1;
    private javax.swing.JLabel assembled_labelM4;
    private javax.swing.JLabel assembled_labelM5;
    private javax.swing.JLabel assembled_labelM6;
    private javax.swing.JLabel assembled_labelM7;
    private javax.swing.JLabel assembled_labelM8;
    private javax.swing.JLabel assemblers_label1;
    private javax.swing.JLabel assemblers_label2;
    private javax.swing.JLabel chas13;
    private javax.swing.JLabel chas14;
    private javax.swing.JLabel chas15;
    private javax.swing.JLabel chas16;
    private javax.swing.JLabel chas17;
    private javax.swing.JLabel chas18;
    private javax.swing.JLabel chas19;
    private javax.swing.JLabel chas20;
    private javax.swing.JLabel chas21;
    private javax.swing.JLabel chas22;
    private javax.swing.JLabel chas23;
    private javax.swing.JLabel chas24;
    private javax.swing.JLabel chas25;
    private javax.swing.JLabel chas26;
    private javax.swing.JLabel chas27;
    private javax.swing.JLabel chas28;
    private javax.swing.JLabel chas29;
    private javax.swing.JLabel chas30;
    private javax.swing.JLabel chas31;
    private javax.swing.JLabel chas32;
    private javax.swing.JLabel chas33;
    private javax.swing.JLabel chas34;
    private javax.swing.JLabel chas35;
    private javax.swing.JLabel chas36;
    private javax.swing.JLabel chas37;
    private javax.swing.JLabel chas38;
    private javax.swing.JLabel chasis_label3;
    private javax.swing.JButton comenzarDell;
    private javax.swing.JButton comenzarHP;
    private javax.swing.JLabel conTarjetaDell;
    private javax.swing.JLabel conTarjetaHP;
    private javax.swing.JLabel costosDell;
    private javax.swing.JLabel costosHP;
    private javax.swing.JSpinner cpuDell;
    private javax.swing.JLabel cpuElementoDell;
    private javax.swing.JLabel cpuElementoHP;
    private javax.swing.JSpinner cpuHP;
    private javax.swing.JButton cpuMinDell;
    private javax.swing.JButton cpuMinHP;
    private javax.swing.JButton cpuPlusDell;
    private javax.swing.JButton cpuPlusHP;
    private javax.swing.JLabel cpuTrabajadoresDell;
    private javax.swing.JLabel cpuTrabajadoresHP;
    private javax.swing.JLabel cpu_label;
    private javax.swing.JLabel cpu_label1;
    private javax.swing.JLabel dayDuration_label;
    private javax.swing.JLabel dayDuration_label1;
    private javax.swing.JLabel descontadoManagerDell;
    private javax.swing.JLabel descontadoManagerHP;
    private javax.swing.JTextPane diasEntregaInput;
    private javax.swing.JLabel diasFaltantesDell;
    private javax.swing.JLabel diasFaltantesHP;
    private javax.swing.JLabel directorStatus_label1;
    private javax.swing.JLabel directorStatus_label2;
    private javax.swing.JTextPane duracionDiaInput;
    private javax.swing.JSpinner ensambladorDell;
    private javax.swing.JSpinner ensambladorHP;
    private javax.swing.JButton ensambladorMinDell;
    private javax.swing.JButton ensambladorMinHP;
    private javax.swing.JButton ensambladorPlusDell;
    private javax.swing.JButton ensambladorPlusHP;
    private javax.swing.JLabel ensambladorTrabajadoresDell;
    private javax.swing.JLabel ensambladorTrabajadoresHP;
    private javax.swing.JButton establecerConfiguracion;
    private javax.swing.JLabel estadoDirectorDell;
    private javax.swing.JLabel estadoDirectorHP;
    private javax.swing.JLabel estadoManagerDell;
    private javax.swing.JLabel estadoManagerHP;
    private javax.swing.JLabel estandarDell;
    private javax.swing.JLabel estandarHP;
    private javax.swing.JLabel fallasManagerDell;
    private javax.swing.JLabel fallasManagerHP;
    private javax.swing.JLabel fuenteA_label1;
    private javax.swing.JSpinner fuenteDell;
    private javax.swing.JLabel fuenteElementoDell;
    private javax.swing.JLabel fuenteElementoHP;
    private javax.swing.JSpinner fuenteHP;
    private javax.swing.JButton fuenteMinDell;
    private javax.swing.JButton fuenteMinHP;
    private javax.swing.JButton fuentePlusDell;
    private javax.swing.JButton fuentePlusHP;
    private javax.swing.JLabel fuenteTrabajadoresDell;
    private javax.swing.JLabel fuenteTrabajadoresHP;
    private javax.swing.JLabel fuentea_label;
    private javax.swing.JLabel gananciaTotalDell;
    private javax.swing.JLabel gananciaTotalHP;
    private javax.swing.JLabel gananciasDell;
    private javax.swing.JLabel gananciasHP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel managerStatus_label1;
    private javax.swing.JLabel managerStatus_label4;
    private javax.swing.JLabel managerStatus_label5;
    private javax.swing.JLabel managerStatus_label6;
    private javax.swing.JLabel managerStatus_label7;
    private javax.swing.JLabel managerStatus_label8;
    private javax.swing.JLabel maxCpuDell;
    private javax.swing.JLabel maxCpuHP;
    private javax.swing.JLabel maxFuenteDell;
    private javax.swing.JLabel maxFuenteHP;
    private javax.swing.JLabel maxPlacaBaseDell;
    private javax.swing.JLabel maxPlacaBaseHP;
    private javax.swing.JLabel maxRamDell;
    private javax.swing.JLabel maxRamHP;
    private javax.swing.JLabel maxTarjetaDell;
    private javax.swing.JLabel maxTarjetaHP;
    private javax.swing.JSpinner placaBaseDell;
    private javax.swing.JSpinner placaBaseHP;
    private javax.swing.JButton placaBaseMinDell;
    private javax.swing.JButton placaBaseMinHP;
    private javax.swing.JButton placaBasePlusDell;
    private javax.swing.JButton placaBasePlusHP;
    private javax.swing.JLabel placaElementoDell;
    private javax.swing.JLabel placaElementoHP;
    private javax.swing.JLabel placaTrabajadoresDell;
    private javax.swing.JLabel placaTrabajadoresHP;
    private javax.swing.JLabel placa_label1;
    private javax.swing.JLabel placa_label6;
    private javax.swing.JLabel prod_label5;
    private javax.swing.JLabel prod_label8;
    private javax.swing.JSpinner ramDell;
    private javax.swing.JLabel ramElementoDell;
    private javax.swing.JLabel ramElementoHP;
    private javax.swing.JSpinner ramHP;
    private javax.swing.JButton ramMinDell;
    private javax.swing.JButton ramMinHP;
    private javax.swing.JButton ramPlusDell;
    private javax.swing.JButton ramPlusHP;
    private javax.swing.JLabel ramTrabajadoresDell;
    private javax.swing.JLabel ramTrabajadoresHP;
    private javax.swing.JLabel ram_label;
    private javax.swing.JLabel ram_label1;
    private javax.swing.JLabel tarjetaElementoDell;
    private javax.swing.JLabel tarjetaElementoHP;
    private javax.swing.JLabel tarjetaG_label;
    private javax.swing.JSpinner tarjetaGraficaDell;
    private javax.swing.JSpinner tarjetaGraficaHP;
    private javax.swing.JButton tarjetaMinDell;
    private javax.swing.JButton tarjetaMinHP;
    private javax.swing.JButton tarjetaPlusDell;
    private javax.swing.JButton tarjetaPlusHP;
    private javax.swing.JLabel tarjetaTrabajadoresDell;
    private javax.swing.JLabel tarjetaTrabajadoresHP;
    private javax.swing.JLabel trab_label;
    private javax.swing.JLabel trab_label4;
    private javax.swing.JFormattedTextField utility_label;
    private javax.swing.JFormattedTextField utility_label2;
    private javax.swing.JLabel wm_label;
    private javax.swing.JLabel wm_label1;
    private javax.swing.JLabel wm_label10;
    private javax.swing.JLabel wm_label3;
    private javax.swing.JLabel wm_label4;
    private javax.swing.JLabel wm_label5;
    private javax.swing.JLabel wm_label7;
    private javax.swing.JLabel wm_label9;
    // End of variables declaration//GEN-END:variables

}
