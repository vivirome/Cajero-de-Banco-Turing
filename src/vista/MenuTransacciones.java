package vista;
/* Estas librerías se encargarán de lectura de archivos, manejo de excepciones, división de cadenas y herramientas para la creación de interfaces */ 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/* Esta clase se encarga de mostrar una lista de todas la operaciones/transacciones que se pueden realizar en el cajero
así como gestionar las mismas*/
public class MenuTransacciones extends javax.swing.JFrame {

    private String nombre;
    private String apellido;
    private int nro;
    private int idioma;
    private ArrayList<TipoCuenta> saldos;
/* En el constructor de la clase solo se inicializarán los componentes y se creará la lista de tipo
    arraylist de saldos que se utiliza para almacenar la información de dinero relacionada a las transacciones*/
    public MenuTransacciones() {
        initComponents();
        saldos = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BotonConsultaSaldo = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        BotonTransferirDinero = new javax.swing.JButton();
        BotonRetiroDinero = new javax.swing.JButton();
        BotonCambioPin = new javax.swing.JButton();
        BotonDepositoDinero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cuentas = new javax.swing.JComboBox<>();
        name = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LineaNaranja = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("QUÉ ACCIÓN");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("BANCO");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("TURING");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("DESEA REALIZAR:");

        BotonConsultaSaldo.setBackground(new java.awt.Color(204, 204, 204));
        BotonConsultaSaldo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonConsultaSaldo.setForeground(new java.awt.Color(0, 0, 102));
        BotonConsultaSaldo.setText("Consultar saldo");
        BotonConsultaSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultaSaldoActionPerformed(evt);
            }
        });

        BotonAtras.setBackground(new java.awt.Color(204, 204, 204));
        BotonAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(0, 0, 102));
        BotonAtras.setText("Salir");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        BotonTransferirDinero.setBackground(new java.awt.Color(204, 204, 204));
        BotonTransferirDinero.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonTransferirDinero.setForeground(new java.awt.Color(0, 0, 102));
        BotonTransferirDinero.setText("Transferir Dinero");
        BotonTransferirDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTransferirDineroActionPerformed(evt);
            }
        });

        BotonRetiroDinero.setBackground(new java.awt.Color(204, 204, 204));
        BotonRetiroDinero.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonRetiroDinero.setForeground(new java.awt.Color(0, 0, 102));
        BotonRetiroDinero.setText("Retirar Dinero");
        BotonRetiroDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRetiroDineroActionPerformed(evt);
            }
        });

        BotonCambioPin.setBackground(new java.awt.Color(204, 204, 204));
        BotonCambioPin.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonCambioPin.setForeground(new java.awt.Color(0, 0, 102));
        BotonCambioPin.setText("Cambiar Contraseña");
        BotonCambioPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambioPinActionPerformed(evt);
            }
        });

        BotonDepositoDinero.setBackground(new java.awt.Color(204, 204, 204));
        BotonDepositoDinero.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonDepositoDinero.setForeground(new java.awt.Color(0, 0, 102));
        BotonDepositoDinero.setText("Depositar Dinero");
        BotonDepositoDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDepositoDineroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("SELECCIONE SU CUENTA:");

        cuentas.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        cuentas.setForeground(new java.awt.Color(0, 0, 102));
        cuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentasActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 153, 51));
        name.setText("nombre");

        lastname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lastname.setForeground(new java.awt.Color(255, 153, 51));
        lastname.setText("apellido");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("USUARIO:");

        LineaNaranja.setBackground(new java.awt.Color(255, 102, 0));
        LineaNaranja.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonCambioPin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonTransferirDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonDepositoDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonRetiroDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonConsultaSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LineaNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(20, 20, 20))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(BotonConsultaSaldo)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lastname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonRetiroDinero)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonDepositoDinero)
                        .addGap(18, 18, 18)
                        .addComponent(BotonTransferirDinero))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LineaNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BotonCambioPin)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BotonAtras))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /* Este método se encarga de mostrar los datos del usuario en la parte superior de la ventana y estar en el idioma 
    seleccionado anteriormente*/
    public void datos(String nombre, int nro, String apellido, int idioma) {
        this.nombre = nombre;
        this.nro = nro;
        this.apellido = apellido;
        this.idioma = idioma;
        name.setText(nombre);
        lastname.setText(apellido);
    }
    /* Este método está destinado para el botón "Consulta Saldo" se encarga de abrir una nueva ventana en la cual se mostraá el saldo disponible de la cuenta
    en la cual eel usuario decidió realizar esta acción, se podrá visualizar también el número de cuenta y un historial de 
    las últimastransacciones realizadas en la cuenta*/
    private void BotonConsultaSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultaSaldoActionPerformed
        String seleccion = (String) cuentas.getSelectedItem();
        ConsultaSaldo saldo = new ConsultaSaldo();
        saldo.idioma(idioma);
        saldo.datos(nombre, nro, apellido, idioma);
        saldo.mostrarContenidoArchivo(seleccion);
        saldo.cargarDatos(seleccion);
        saldo.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_BotonConsultaSaldoActionPerformed
/* Este métido está destinado al botón "Atras" que nos permite salir de la cuenta si es que confirmam os la acción, 
    si lo aceptamos nos redireccionará a la ventana de "Acceder Cuenta"*/
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        int response = JOptionPane.showConfirmDialog(
                this,
                "¿Desea salir de su usuario/cuenta?",
                "Confirmar Logout",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (response == JOptionPane.YES_OPTION) {
            // El usuario ha confirmado que desea salir
            AccederCuenta acceder = new AccederCuenta();
            acceder.idioma(idioma);
            acceder.setVisible(true);
            this.setVisible(false);
        } else {
            // El usuario ha cancelado la salida, no se hace nada
            System.out.println("El usuario ha cancelado el cierre de sesión.");
        }
    }//GEN-LAST:event_BotonAtrasActionPerformed
/* Este método está destinado al botón "Transferir Dinero" que se encarga de abrir la ventana de Transferir Dinero 
    la cual se inicializará con un idioma escogido*/
    private void BotonTransferirDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTransferirDineroActionPerformed
        TransferirDinero transferencia = new TransferirDinero();
        String seleccion = (String) cuentas.getSelectedItem();
        transferencia.datos(nombre, nro, seleccion, apellido, idioma);
        //transferencia.cargarDatos();
        transferencia.idioma(idioma);
        transferencia.mostrarContenidoArchivo(nombre);
        transferencia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonTransferirDineroActionPerformed
/* Este método está destinado para el botón "Retirar dinero" que se encargara de abrir la ventana de Retirar dinero como
    lo dice su nombre el cual se inicializará con un idioma escogido*/
    private void BotonRetiroDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRetiroDineroActionPerformed
        RetirarDinero retiro = new RetirarDinero();
        String seleccion = (String) cuentas.getSelectedItem();
        retiro.idioma(idioma);
        retiro.datos(nombre, nro, seleccion, apellido, idioma);

        retiro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRetiroDineroActionPerformed
/* Este método está destinado para el botón "Cambiar Contrasenia" que se encargara de abrir la ventana de Cambiar Contrasenia como
    lo dice su nombre el cual se inicializará con un idioma escogido*/
    private void BotonCambioPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambioPinActionPerformed
        CambiarContrasena cambiarpin = new CambiarContrasena();
         String seleccion = (String) cuentas.getSelectedItem();
        cambiarpin.datos(nombre, nro, apellido, idioma,seleccion);
        cambiarpin.idioma(idioma);
        cambiarpin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonCambioPinActionPerformed
/*Este método está destinado para el botón "Depositar dinero" que se encrag de abrir la ventana de Depositar dinero como
    lo dice su nombre el vual se inicializará con un idioma escogido y permitirá escoger entre depositar en cuenta
    propia o en otra cuenta*/
    private void BotonDepositoDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDepositoDineroActionPerformed
        DepositarDinero deposito = new DepositarDinero();
        String seleccion = (String) cuentas.getSelectedItem();
        deposito.datos(nombre, nro, seleccion, apellido, idioma);
        deposito.idioma(idioma);
        deposito.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonDepositoDineroActionPerformed
/* Este método está encragado para apartado de combo box para seleccionar las cuentas (Bolivianos, Dólares o Euros)
    según las cuentas que tenga el cliente */
    private void cuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentasActionPerformed
        
    }//GEN-LAST:event_cuentasActionPerformed
    /* Este método se encarga de cargar datos relacionados con el combo box de seleccionar cuentas del usuario (
    Bolivianos, Dolares o Euros)*/
    public void cargarDatos() {
        llenarLista("" + nro);
        cuentas.removeAllItems();
        for (int i = 0; i < saldos.size(); i++) {
            if (saldos.get(i).getTipoMoneda().equals("Bolivianos")) {
                cuentas.addItem("Bolivianos");
            }
            if (saldos.get(i).getTipoMoneda().equals("Dolares")) {
                cuentas.addItem("Dolares");
            }
            if (saldos.get(i).getTipoMoneda().equals("Euros")) {
                cuentas.addItem("Euros");
            }

        }

    }
/* Este método se encarga de mantener la selección de la cuenta que escogió el cliente, sin cambiarse 
    por defecto hasta que el mismo cliente ,o haga manualmente*/
    public void mantCuenta(String cuen) {
        if (cuen.equals("Bolivianos")) {

        } else {
            if (cuen.endsWith("Dolares")) {
                cuentas.setSelectedIndex(1);
            } else {
                if (cuen.endsWith("Euros")) {
                    cuentas.setSelectedIndex(2);
                }
            }
        }
    }
/* Este método se encarga de leer un archivo de texto relacionado a las cuentas, extrae los datos importantes de cada línea y los almacena*/
    public void llenarLista(String archivo) {
        AccederCuenta acc = new AccederCuenta();
        ArrayList<String> lineas = acc.obtenerTexto(archivo);
        if (lineas != null) {
            for (String linea : lineas) {
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                if (tokens.countTokens() >= 3) {

                    int nros = Integer.parseInt(tokens.nextToken());// Verificar si hay al menos 5 tokens en la línea
                    String moneda = tokens.nextToken();
                    double saldo = Double.parseDouble(tokens.nextToken());
                    TipoCuenta tipoMoneda = new TipoCuenta(nros, moneda, saldo);
                    //System.out.println(nros+moneda+saldo);
                    saldos.add(tipoMoneda);
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado.");
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios.");
        }

    }
/*Este es el método principal de la clase que se encargará de inicializar la interfaz de esta clase junto
    con sus funcionalidades */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTransacciones().setVisible(true);
            }
        });
    }
/* Este método se encarga de realizar y controlar el el cambio de idioma a Inglés o Quechua, ya que
    por defecto el programa está en espaniol, por dicho motivo en este método solo se listan dos idiomas*/
    public void idioma(int idioma) {
        if (idioma == 1) {
            ingles();
        } else if (idioma == 2) {
            quechua();
        }
    }
/* Este método se encarga de traducir la interfaz de dicha clase de espaniol a inglés, seteando los valores
    de cada botón o label*/
    public void ingles() {
        jLabel3.setText("WHAT ACTION");
        jLabel4.setText("BANK");
        jLabel5.setText("USER:");
        jLabel8.setText("WOULD YOU LIKE TO PERFORM:");
        BotonConsultaSaldo.setText("Check Balance");
        BotonAtras.setText("Exit");
        BotonTransferirDinero.setText("Transfer Money");
        BotonRetiroDinero.setText("Withdraw Money");
        BotonCambioPin.setText("Change Password");
        BotonDepositoDinero.setText("Deposit Money");
        jLabel1.setText("SELECT ACCOUNT:");
    }
/* Este método se encarga de traducir la interfaz de dicha clase de espaniol a quechua, seteando los valores
    de cada botón o label*/
    public void quechua() {
        jLabel3.setText("IMATA");
        jLabel4.setText("BANCO");
        jLabel5.setText("RUWASQA:");
        jLabel8.setText("RUWANAKAYTA MUNANKI:");
        BotonConsultaSaldo.setText("Qulpuykita Yachay");
        BotonAtras.setText("Lloqsiy");
        BotonTransferirDinero.setText("Qullqi Waktay");
        BotonRetiroDinero.setText("Qullqi Apaq");
        BotonCambioPin.setText("Simi Ñit'iyta tukuy");
        BotonDepositoDinero.setText("Qullqi Churay");
        jLabel1.setText("QUILLQAYTA AKLLAY:");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonCambioPin;
    private javax.swing.JButton BotonConsultaSaldo;
    private javax.swing.JButton BotonDepositoDinero;
    private javax.swing.JButton BotonRetiroDinero;
    private javax.swing.JButton BotonTransferirDinero;
    private javax.swing.JTextField LineaNaranja;
    private javax.swing.JComboBox<String> cuentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastname;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
