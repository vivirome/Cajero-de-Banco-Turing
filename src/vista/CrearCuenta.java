package vista;
/* Estas son las librerías que en general se encargan de escribir y leer en un archivo, mostrar mensajes 
de dialogo y generar números aleatorios, manejar excepciones y herremientas para la interfaz*/
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
/* Esta clase se encarga de la creación de nuevas cuentas (usuario, contrasenia, datos personales y 
selección de cuentas: Bolivianos, Dólares o Euros) para los clientes que no cuenten con una en el sistema*/
public class CrearCuenta extends javax.swing.JFrame {

    private int idioma;
    public ArrayList<Cuenta> listaCuentas;
/* En el constructor de la clase se declara la inicialización de los componentes de la interfaz y la creación
    de la lista de cuentas en el sistema*/
    public CrearCuenta() {
        initComponents();
        listaCuentas = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        login = new javax.swing.JTextField();
        BotonCancelar = new javax.swing.JButton();
        contraseña = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginTxt = new javax.swing.JLabel();
        jLabelConfirmarContrasena = new javax.swing.JLabel();
        confcontraseña = new javax.swing.JPasswordField();
        jrBs = new javax.swing.JRadioButton();
        jrSus = new javax.swing.JRadioButton();
        jrEu = new javax.swing.JRadioButton();
        jLabelSeleccion = new javax.swing.JLabel();
        BotonCrearCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelApellido.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(255, 204, 0));
        jLabelApellido.setText("Apellidos:");
        jPanel1.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 38));

        jLabelNombre.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 204, 0));
        jLabelNombre.setText("Nombres:");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 38));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText(" INGRESE SUS DATOS:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 316, -1));

        jLabelContrasena.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabelContrasena.setForeground(new java.awt.Color(255, 204, 0));
        jLabelContrasena.setText("Contraseña:");
        jPanel1.add(jLabelContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 38));

        nombre.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 102));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 250, 24));

        apellido.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(0, 0, 102));
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 250, 26));

        login.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 102));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 250, 26));

        BotonCancelar.setBackground(new java.awt.Color(204, 204, 204));
        BotonCancelar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonCancelar.setForeground(new java.awt.Color(0, 0, 102));
        BotonCancelar.setText("Cancelar");
        BotonCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 188, 40));

        contraseña.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(0, 0, 102));
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 250, 25));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(153, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText(" Crear Cuenta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, -1));

        loginTxt.setBackground(new java.awt.Color(255, 255, 0));
        loginTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginTxt.setForeground(new java.awt.Color(255, 204, 0));
        loginTxt.setText("Usuario :");
        jPanel1.add(loginTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, 36));

        jLabelConfirmarContrasena.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabelConfirmarContrasena.setForeground(new java.awt.Color(255, 204, 0));
        jLabelConfirmarContrasena.setText("Confirmar Contraseña:");
        jPanel1.add(jLabelConfirmarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 38));

        confcontraseña.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        confcontraseña.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.add(confcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 250, 26));

        jrBs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrBs.setForeground(new java.awt.Color(255, 153, 51));
        jrBs.setText("Cuenta en Bolivianos");
        jrBs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBsActionPerformed(evt);
            }
        });
        jPanel1.add(jrBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        jrSus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrSus.setForeground(new java.awt.Color(255, 153, 51));
        jrSus.setText("Cuenta en Dolares");
        jrSus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrSusActionPerformed(evt);
            }
        });
        jPanel1.add(jrSus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jrEu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrEu.setForeground(new java.awt.Color(255, 153, 51));
        jrEu.setText("Cuenta en Euros");
        jrEu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEuActionPerformed(evt);
            }
        });
        jPanel1.add(jrEu, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jLabelSeleccion.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabelSeleccion.setForeground(new java.awt.Color(255, 204, 0));
        jLabelSeleccion.setText("Seleccione las cuentas que desea:");
        jPanel1.add(jLabelSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 290, 40));

        BotonCrearCuenta.setBackground(new java.awt.Color(204, 204, 204));
        BotonCrearCuenta.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonCrearCuenta.setForeground(new java.awt.Color(0, 0, 102));
        BotonCrearCuenta.setText("Crear Cuenta");
        BotonCrearCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 230, 43));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/* Este método gestiona el espacio para colocar el nombre del cliente al momentto de crear su nueva cuenta */
    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed

    }//GEN-LAST:event_nombreActionPerformed
/* Este método está destinado para el botón "Cancelar" que se encarga de cancelar la operación de creación de 
    cuentas y para confirmar nos saldrá un cuadro de diálogo para confirmar la acción de cancelar o no*/
    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Seguro que deseas cancelar el proceso de Creacion de Cuenta?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        
        if (choice == JOptionPane.YES_OPTION) {
            AccederCuenta acceder = new AccederCuenta();
            acceder.idioma(idioma);
            acceder.setVisible(true);      
            this.setVisible(false);
        } else {
        }
    }//GEN-LAST:event_BotonCancelarActionPerformed
    /* Este método se encarga de generar el número de cuenta para cuenta que haya deseado crear el cliente, 
    el cual está formado por un número que se genera aleatoriamente gracias a la librería "Random"*/
    private int nrocuen(){
        Random random = new Random();
            
            int numeroAleatorio = random.nextInt(900000000) + 100000000;
            return numeroAleatorio;
    }
    /* Este método se encarga de crear un nuevo archivo al cual se le pasa como parámegro un nombre
    especificado y escribir un tipo de contenido en él.*/
    public void crearArchivo(String nombreArchivo,String contenido){
         try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo,true))) {
            writer.write(contenido);
            writer.newLine();
             writer.close();
            System.out.println("Se ha escrito el contenido en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    /* Este método se encarga de anadir un tipo de moneda a una cuenta dada que se encuentra en el arraylist de cuentas */
    public void añadirMoneda(int nroCuenta, String moneda) {
        for (int j = 0; j < listaCuentas.size(); j++) {
            if (nroCuenta == listaCuentas.get(j).getNroCuenta()) {
                listaCuentas.get(j).añadirMoneda(moneda);
            }
        }
    }
/* Este método está destinado a un campo de un check box  que en este caso es para seleccionar un tipo de cuenta en Bolivianos*/
    private void jrBsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBsActionPerformed
        
    }//GEN-LAST:event_jrBsActionPerformed
/* Este método está destinado al espacio en le cual el cliente digitará su apellido*/
    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed

    }//GEN-LAST:event_apellidoActionPerformed
/* Este método está destinado al espacio en le cual el cliente digitará su contrasenia*/
    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        
    }//GEN-LAST:event_contraseñaActionPerformed
/* Este método está destinado a un campo de un check box  que en este caso es para seleccionar un tipo de cuenta en Dolares*/
    private void jrSusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrSusActionPerformed
        
    }//GEN-LAST:event_jrSusActionPerformed
/* Este método está destinado a un campo de un check box  que en este caso es para seleccionar un tipo de cuenta en Euros*/
    private void jrEuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEuActionPerformed
        
    }//GEN-LAST:event_jrEuActionPerformed
/* Este método está destinado al botón "Crear Cuenta" para confirmar la creación de la nueva cuenta de un cliente
    si es que llenó correctamente todos los campos y también creará automáticamente los archivos que tendrá esta nueva cuenta
    como ser sus archivos de cuentas según lo que se haya seleccionado, sobreescribe el archivo de 'Usuarios" y guardar su información para loggin 
    en un archivo con su nombre en específico*/
    private void BotonCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearCuentaActionPerformed
        String nom = nombre.getText();
        String apelli = apellido.getText();
        String log = login.getText();
        String contra = String.valueOf(contraseña.getText());
        String confContra = String.valueOf(confcontraseña.getText());
        String con ="--------------------------------------------------------------------------------------------";

        // Verificar que todos los campos requeridos están llenos
        if (nom.isEmpty() || apelli.isEmpty() || log.isEmpty() || contra.isEmpty() || confContra.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
        }
        // Verificar que las contraseñas coincidan
        if (!contra.equals(confContra)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales.");
            return;
        }
        // Confirmar creación de cuenta
        int confirm = JOptionPane.showConfirmDialog(null, "¿Desea crear la cuenta?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.NO_OPTION) {
            return;
        }

        AccederCuenta acceder=new AccederCuenta();
            System.out.println(nrocuen());
            int nro=nrocuen();
            Cuenta cuenta = new Cuenta(nom, apelli,nro, log, contra);
            String contenido=nom+";"+apelli+";"+nro+";"+log+";"+contra;
            String Usuario=nom+apelli;
            crearArchivo("Usuarios",contenido);
            listaCuentas.add(cuenta);
            if (jrBs.isSelected()) {
                String nombre=""+nro;
                String conte=nrocuen()+";"+"Bolivianos"+";"+"0";
                crearArchivo(nro+"Bolivianos",con);
                crearArchivo(nombre,conte);
            }
            if (jrSus.isSelected()) {
                String conte=nrocuen()+";"+"Dolares"+";"+"0";
                crearArchivo(nro+"Dolares",con);
                crearArchivo(""+nro,conte);
            }
            if (jrEu.isSelected()) {
                String conte=nrocuen()+";"+"Euros"+";"+"0";
                crearArchivo(nro+"Euros",con);
                crearArchivo(""+nro,conte);
            }
        JOptionPane.showMessageDialog(null, "Cuenta creada con éxito.");
        acceder.idioma(idioma);
        acceder.setVisible(true);      
        this.setVisible(false);
    }//GEN-LAST:event_BotonCrearCuentaActionPerformed
/* Este método está destinado para el espacio en el que se escribirá el nombre de usuario del cliente*/
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
     
    }//GEN-LAST:event_loginActionPerformed
/* Este es el método principal de la clase que se encarga de inicializar la interfaz de esta clase */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuenta().setVisible(true);
            }
        });
    }
    /* Este método se encraga de realizar y controlar el el cambio de idioma a Inglés o Quechua, ya que
    por defecto el programa está en espaniol, por dicho motivo en este método solo se listan dos idiomas*/
    public void idioma(int idioma){
        this.idioma=idioma;
        if (idioma==1){
            ingles();
        }else if(idioma==2){
            quechua();
        }
    }
    /* Este método se encarga de traducir la interfaz de dicha clase de espaniol a inglés, seteando los valores
    de cada botón o label*/
    public void ingles(){
        jLabelApellido.setText("Last Name:");
        jLabelNombre.setText("First Name:");
        jLabel8.setText("ENTER YOUR DETAILS::");
        jLabelContrasena.setText("Password:");
        BotonCancelar.setText("Cancel");
        jLabel1.setText(" Create Account");
        loginTxt.setText("User:");
        jLabelConfirmarContrasena.setText("Confirm Password:");
        jrBs.setText("Account in Bolivianos");
        jrSus.setText("Account in Dollars");
        jrEu.setText("Account in Euros");
        jLabelSeleccion.setText("Select the accounts you want:");
        BotonCrearCuenta.setText("Create Account");
    }
/* Este método se encarga de traducir la interfaz de dicha clase de espaniol a quechua, seteando los valores
    de cada botón o label*/
    public void quechua(){
        jLabelApellido.setText("Aylku Suti:");
        jLabelNombre.setText("Suti:");
        jLabel8.setText(" Kachayqaykichis kaykunata:");
        jLabelContrasena.setText("Ñawpaq K'itiy:");
        BotonCancelar.setText("Atrasqay");
        jLabel1.setText(" Ruraq Qillqay");
        loginTxt.setText("Ruraq:");
        jLabelConfirmarContrasena.setText("Apatamawka Ñawpaq K'itiy:");
        jrBs.setText("Wasiq'achapi Bolivianos");
        jrSus.setText("Wasiq'achapi Dolares");
        jrEu.setText("Wasiq'achapi Euros");
        jLabelSeleccion.setText("Taytaypachanayki qillqaykuna:");
        BotonCrearCuenta.setText("Ruraq Qillqa");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonCrearCuenta;
    private javax.swing.JTextField apellido;
    private javax.swing.JPasswordField confcontraseña;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelConfirmarContrasena;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSeleccion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jrBs;
    private javax.swing.JRadioButton jrEu;
    private javax.swing.JRadioButton jrSus;
    private javax.swing.JTextField login;
    private javax.swing.JLabel loginTxt;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
