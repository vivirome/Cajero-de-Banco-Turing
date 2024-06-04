package vista;
/* Estas librerías se encargan de leer y escribir archivos, creación de cuadros de diálogo, herrramientas para
interfaces, manejo de exceciones, listas y manipulación de datos, combo box*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/* Esta clase se encarga de permitir al usuario poder retirar dinero de cualquyiera de las cuentas que elija
esto se podrá realizar con éxito en caso de que el usuario tenga suficiente saldo, si es así o caso contrario saldrá un
aviso respectivamente*/
public class RetirarDinero extends javax.swing.JFrame {

    private String nombre;
    private int nro;
    private String selecte;
    private String apellido;
    private int idioma;
    private ArrayList<TipoCuenta> saldos;
/* En el constructor de la clase se creraá la lista de saldos y se inicializarán los componentes de la clase*/
    public RetirarDinero() {
        saldos = new ArrayList<>();

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        montoRetiro = new javax.swing.JTextField();
        jbRetiro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese la cantidad de");

        BotonAtras.setBackground(new java.awt.Color(204, 204, 204));
        BotonAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(0, 0, 102));
        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("dinero a retirar:");

        montoRetiro.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        montoRetiro.setForeground(new java.awt.Color(0, 0, 102));
        montoRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoRetiroActionPerformed(evt);
            }
        });

        jbRetiro.setBackground(new java.awt.Color(204, 204, 204));
        jbRetiro.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jbRetiro.setForeground(new java.awt.Color(0, 0, 102));
        jbRetiro.setText("Confirmar");
        jbRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetiroActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(153, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Retirar Dinero");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55))
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
                .addComponent(jbRetiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(montoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(montoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAtras)
                    .addComponent(jbRetiro)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/* Este método destinado al botón "Atrás" que nos redireccionará a la ventana del menú de transacciones */
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuTransacciones menu = new MenuTransacciones();
        menu.datos(nombre, nro,apellido,idioma);
        menu.idioma(idioma);
        
        menu.cargarDatos();
        menu.mantCuenta(selecte);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAtrasActionPerformed
    /* Este método se encarga de escribir el retiro realizado en el archivo de historial al final del archivo*/
    public void Historial(String selecte){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nro+selecte,true))) {
            writer.write("");
            // Escribir cada elemento del ArrayList en una línea separada
                writer.write("Se realizo un retiro de : "+montoRetiro.getText()+" "+selecte);
                writer.newLine(); // Agregar un salto de línea después de cada elemento
            System.out.println("ArrayList guardado en " + nombre+"historial" + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
        }
    }
    /* Este método se encarga de cargar los datos del cliente para luego recuperarlos*/
    public void datos(String nombre, int nro,String selecte,String apellido,int idioma) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.nro = nro;
        this.selecte=selecte;
        this.idioma=idioma;
    }
/* Este método se encarga de leer un archivo de texto con información relacionada a las cuentas, extraer
    los datos importantes y finalmente almacenarlos en una lista  */
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
                    TipoCuenta tipoMoneda = new TipoCuenta(nros,moneda, saldo);
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
/* Este método está destinado para el espacio en donde se digitará el monto de dinero que se desea retirar*/
    private void montoRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoRetiroActionPerformed

    }//GEN-LAST:event_montoRetiroActionPerformed
/* Este método se encarga de confirmar la acción para realizar el retiro de dinero de la cuenta que escogió el cliente
    y también se recibirán cuadros de diálogo si la acción se realizó con éxito o no */
    private void jbRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetiroActionPerformed
        //jComboBox1<String> combo = (jComboBox1<String>) e.getSource();
        //String selectedOption = (String) jComboBox1.getSelectedItem();
        llenarLista(nro + "");
        double retiro;
        try {
            retiro = Double.parseDouble(montoRetiro.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, introduzca una cantidad válida");
            return;
        }

        for (int i = 0; i < saldos.size(); i++) {
            if (selecte.equals(saldos.get(i).getTipoMoneda())) {
                if (saldos.get(i).getSaldo() >= retiro) {
                    double money = saldos.get(i).getSaldo();
                    saldos.get(i).setSaldo(money - retiro);
                    Historial(selecte);
                    guardarCambios("" + nro);
                    JOptionPane.showMessageDialog(null, "Se realizó el Retiro con Éxito.");
                    montoRetiro.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "No tiene suficiente monto para realizar el retiro.");
                }
                break; // Se rompe el bucle después de encontrar la moneda, ya que no es necesario seguir buscando
            }
        }
        montoRetiro.setText("");
    }//GEN-LAST:event_jbRetiroActionPerformed
    /* Este método se encarga de guardar los cambios realizados en una lista de cuentas de un archivo de texto especificado*/
    public void guardarCambios(String Archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Archivo))) {
            writer.write("");
            // Escribir cada elemento del ArrayList en una línea separada
            for (int i = 0; i < saldos.size(); i++) {
                long n=saldos.get(i).getNroCuenta();
                String m=saldos.get(i).getTipoMoneda();
                double s=saldos.get(i).getSaldo();
                writer.write(n+";"+m + ";" + s);
                writer.newLine(); // Agregar un salto de línea después de cada elemento
                
            }
            System.out.println("ArrayList guardado en " + Archivo + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
        }
    }
/* Este es el método principal de la clase que se encargará de inicializar la interfaz de la clase con todas
    sus funcionalidades */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetirarDinero().setVisible(true);
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
      jLabel2.setText("Enter the amount of");
      BotonAtras.setText("Back");
      jLabel3.setText("Amount to withdraw:");
      jbRetiro.setText("Confirm");
      jLabel1.setText("Withdraw money");
    }
  /* Este método se encarga de traducir la interfaz de dicha clase de espaniol a quechua, seteando los valores
    de cada botón o label*/  
    public void quechua(){
      jLabel2.setText("Qullqiyta ch'isqay");
      BotonAtras.setText("Qhipa");
      jLabel3.setText("Qullqi apaq:");
      jbRetiro.setText("Kachkanay");
      jLabel1.setText("Qullqi apaq");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbRetiro;
    private javax.swing.JTextField montoRetiro;
    // End of variables declaration//GEN-END:variables
}
