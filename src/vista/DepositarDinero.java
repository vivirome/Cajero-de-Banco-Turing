package vista;
/* Esta clase se encraga de mostrarnos dos opciones a elegir: Depositar dinero en cuenta propia o Depositar
dinero en otra cuenta, donde ambos aparecerán como botones y dependiendo la elección se abriá una nueva ventana
para cada uno respectivamente*/
public class DepositarDinero extends javax.swing.JFrame {
    private String nombre;
    private int nro;
    private String apellido;
    private String selec;
    private int idioma;
    /* En el cosntructor de la clase se inicializan los componentes propios de la misma clase*/
    public DepositarDinero() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonAtras = new javax.swing.JButton();
        BotonDepositoOtraCuenta = new javax.swing.JButton();
        BotonDepositoCuentaPropia = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        BotonAtras.setBackground(new java.awt.Color(204, 204, 204));
        BotonAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(0, 0, 102));
        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        BotonDepositoOtraCuenta.setBackground(new java.awt.Color(204, 204, 204));
        BotonDepositoOtraCuenta.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonDepositoOtraCuenta.setForeground(new java.awt.Color(0, 0, 102));
        BotonDepositoOtraCuenta.setText("Depositar en otra cuenta");
        BotonDepositoOtraCuenta.setActionCommand("Depositar en cuenta propia");
        BotonDepositoOtraCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDepositoOtraCuentaActionPerformed(evt);
            }
        });

        BotonDepositoCuentaPropia.setBackground(new java.awt.Color(204, 204, 204));
        BotonDepositoCuentaPropia.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonDepositoCuentaPropia.setForeground(new java.awt.Color(0, 0, 102));
        BotonDepositoCuentaPropia.setText("Depositar en cuenta propia");
        BotonDepositoCuentaPropia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDepositoCuentaPropiaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(153, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Depositar Dinero");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonDepositoCuentaPropia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonDepositoOtraCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(BotonDepositoCuentaPropia)
                .addGap(32, 32, 32)
                .addComponent(BotonDepositoOtraCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(BotonAtras))
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
    /* Este método se encarga de cargar los datos del cliente para luego recuperarlos*/
    public void datos(String nombre, int nro,String selec,String apellido,int idioma) {
        this.nombre = nombre;
        this.nro = nro;
        this.selec=selec;
        this.apellido=apellido;
        this.idioma=idioma;
    }
/* Este método está destinado al boton "Atras" que al hacer clic nos redireccionará a la ventana de menú de transacciones*/
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuTransacciones menu=new MenuTransacciones();
        menu.datos(nombre, nro,apellido,idioma);
        menu.idioma(idioma);
        menu.cargarDatos();
        menu.mantCuenta(selec);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed
/* Este ,étodo está destinado al botón "Depositar en Otra Cuenta", al hacer clic en él se abrira una nueva ventana
    en la cual se nos mostrará un campo para poner el número de cuenta destinatario que debe existir en el sistema 
    y la cantidad a depositar*/
    private void BotonDepositoOtraCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDepositoOtraCuentaActionPerformed
        DepositoOtraCuenta depositotro=new DepositoOtraCuenta();
        depositotro.datos(nombre, nro,selec,apellido,idioma);
        depositotro.idioma(idioma);
        depositotro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonDepositoOtraCuentaActionPerformed
/* Este ,étodo está destinado al botón "Depositar en Cuenta Propia", al hacer clic en él se abrira una nueva ventana
    en la cual se nos mostrará un campo para digitar la cantidad a depositar en nuestra cuenta*/
    private void BotonDepositoCuentaPropiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDepositoCuentaPropiaActionPerformed
         DepositoCuentaPropia propia=new DepositoCuentaPropia();
         propia.datos(nombre,nro,selec,apellido,idioma);
         propia.idioma(idioma);
         //propia.cargarDatos();
         propia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonDepositoCuentaPropiaActionPerformed
/* Este es el método principal de la clase que se encargará de inicializar la interfaz de la clase con todas
    sus funcionalidades */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositarDinero().setVisible(true);
            }
        });
    }
  /* Este método se encarga de realizar y controlar el el cambio de idioma a Inglés o Quechua, ya que
    por defecto el programa está en espaniol, por dicho motivo en este método solo se listan dos idiomas*/    
    public void idioma(int idioma){
        if (idioma==1){
            ingles();
        }else if(idioma==2){
            quechua();
        }
    }
   /* Este método se encarga de traducir la interfaz de dicha clase de espaniol a inglés, seteando los valores
    de cada botón o label*/  
    public void ingles(){
        BotonAtras.setText("Back");
        BotonDepositoOtraCuenta.setText("Deposit in another account");
        BotonDepositoCuentaPropia.setText("Deposit in own account");
        jLabel1.setText("Deposit Money");
    }
/* Este método se encarga de traducir la interfaz de dicha clase de espaniol a quechua, seteando los valores
    de cada botón o label*/ 
    public void quechua(){
        BotonAtras.setText("Qhipa");
        BotonDepositoOtraCuenta.setText("Huk qillqaypi qullqi churay");
        BotonDepositoCuentaPropia.setText("Sapaq qillqaypi qullqi churay");
        jLabel1.setText("Qullqi churay");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonDepositoCuentaPropia;
    private javax.swing.JButton BotonDepositoOtraCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}