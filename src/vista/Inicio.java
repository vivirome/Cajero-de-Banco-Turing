package vista;
/*algunas de las librerías importadas serán para encriptar y desencriptar archivos de texto y 
todo lo que involucra este proceso, así como lestura de archivos, arreglos, etc*/
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/*Esta clase está diseniada para la selección de idioma {Espaniol, Inglés y Quechua} y también conntiene un botón salir que cerrará por completo
al hacer clic sobre cualquiera de los botones de idioma en el que deseemos iniciar el programa, los archivos de texto del
programa se desencriptaran y al pulsar el botón "Salir" se volverán a encriptar, hecho esto no se podrá realizar ningún cambio
en los archivos del sistema.*/
public class Inicio extends javax.swing.JFrame {
/*Estos son las variables destinadas a la encriptación y desencriptación */
    private static final String ALGORITHM = "AES"; //AES = Advanced Encryption Standard
    private static final byte[] keyValue = "1234567890123456".getBytes(); // clave de 16 bytes para AES
    //En la sección de DIRECTORY_PATH debe ir la dirección en la que se tenga guardada la carpeta del proyecto
    private static final String DIRECTORY_PATH = "C:\\Users\\ALIENWARE X17 R2\\Downloads\\CajeroTuring_Principal"; // Cambia esto a tu ruta
    
    public Inicio() {
        //En el constructor solo se declara el inicio de los componentes utilizando el método initComponents()
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonEspaniol = new javax.swing.JButton();
        BotonIngles = new javax.swing.JButton();
        BotonQuechua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LineaAmarilla1 = new javax.swing.JTextField();
        LineaNaranja = new javax.swing.JTextField();
        LineaAmarilla2 = new javax.swing.JTextField();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("IDIOMA:");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText(" SELECCIONAR");

        BotonEspaniol.setBackground(new java.awt.Color(204, 204, 204));
        BotonEspaniol.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonEspaniol.setForeground(new java.awt.Color(0, 0, 102));
        BotonEspaniol.setText("Español");
        BotonEspaniol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEspaniolActionPerformed(evt);
            }
        });

        BotonIngles.setBackground(new java.awt.Color(204, 204, 204));
        BotonIngles.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonIngles.setForeground(new java.awt.Color(0, 0, 102));
        BotonIngles.setText("English");
        BotonIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInglesActionPerformed(evt);
            }
        });

        BotonQuechua.setBackground(new java.awt.Color(204, 204, 204));
        BotonQuechua.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonQuechua.setForeground(new java.awt.Color(0, 0, 102));
        BotonQuechua.setText("Quechua");
        BotonQuechua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonQuechuaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/203x184.png"))); // NOI18N

        LineaAmarilla1.setBackground(new java.awt.Color(255, 204, 0));
        LineaAmarilla1.setBorder(null);

        LineaNaranja.setBackground(new java.awt.Color(255, 102, 0));
        LineaNaranja.setBorder(null);

        LineaAmarilla2.setBackground(new java.awt.Color(255, 204, 0));
        LineaAmarilla2.setBorder(null);

        BotonSalir.setBackground(new java.awt.Color(204, 204, 204));
        BotonSalir.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(0, 0, 102));
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(167, 167, 167))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BotonEspaniol, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(BotonIngles, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BotonQuechua, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(234, 234, 234)))
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LineaAmarilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LineaAmarilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(LineaNaranja)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LineaAmarilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LineaNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LineaAmarilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonEspaniol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonIngles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonQuechua)
                                .addContainerGap(114, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonSalir))))
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
/* //*Este método se ocupa de inicializar todo el programa en idioma espaniol y posteriormente nos saldrá la ventana de loggin
    (usuario y contrasenia)*/
    private void BotonEspaniolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEspaniolActionPerformed
        desencriptarArchivos();
        new AccederCuenta().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonEspaniolActionPerformed
/*Este método se ocupa de inicializar todo el programa en idioma ingles y posteriormente nos saldrá la ventana de loggin
    (usuario y contrasenia)*/
    private void BotonInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInglesActionPerformed
        desencriptarArchivos();
        AccederCuenta acceder = new AccederCuenta();
        acceder.ingles();
        acceder.idioma(1);
        acceder.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonInglesActionPerformed
/*Este método se ocupa de inicializar todo el programa en idioma quechua y posteriormente nos saldrá la ventana de loggin
    (usuario y contrasenia)*/
    private void BotonQuechuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonQuechuaActionPerformed
        desencriptarArchivos();
        AccederCuenta acceder = new AccederCuenta();
        acceder.quechua();
        acceder.idioma(2);
        acceder.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonQuechuaActionPerformed
/* Este método está destinado para el botón "Salir" que lista todos los archivos de texto del directorio dado, los encripta
    y finalmente cierra el programa completamente*/
    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        try {
        List<File> archivosAEncriptar = listarArchivosSinExtension(new File(DIRECTORY_PATH));
        for (File archivo : archivosAEncriptar) {
            encryptFile(archivo, new File(archivo.getAbsolutePath() + ".enc"));
            archivo.delete();
        }
         } catch (Exception e) {
            e.printStackTrace();
         } finally {
            System.exit(0);
        }
    }//GEN-LAST:event_BotonSalirActionPerformed
/* Este es el método principal de la clase, método se encarga de inicializar la clase "Inicio" */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });

    }
    /* Este es el método que se encarga de buscar y listar todos los archivos del directorio dado que no tienen ninguna extensión
    en su nombre */
    private static List<File> listarArchivosSinExtension(File directorio) {
        List<File> archivosSinExtension = new ArrayList<>();
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile() && !archivo.getName().contains(".")) {
                    archivosSinExtension.add(archivo);
                } else if (archivo.isDirectory()) {
                    archivosSinExtension.addAll(listarArchivosSinExtension(archivo));
                }
            }
        }
        return archivosSinExtension;
    }
/* Este método se encarga de encriptar dichos archivos sin extensión que se están
    la carpeta del programa*/
    private static void encryptFile(File inputFile, File outputFile) throws Exception {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputStream = new FileOutputStream(outputFile)) {
            byte[] inputBytes = new byte[(int) inputFile.length()];
            inputStream.read(inputBytes);
            byte[] outputBytes = cipher.doFinal(inputBytes);
            outputStream.write(outputBytes);
        }
    }
/* Este método se encarga de desencriptar dichos archivos sin extensión que están en
    la carpeta del programa y hacerlos legibles y editables nuevamente */
    private static void decryptFile(File inputFile, File outputFile) throws Exception {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputStream = new FileOutputStream(outputFile)) {
            byte[] inputBytes = new byte[(int) inputFile.length()];
            inputStream.read(inputBytes);
            byte[] outputBytes = cipher.doFinal(inputBytes);
            outputStream.write(outputBytes);
        }
    }
/* Este método se encarga de generar y devolver una llave de cifrado para el algoritmo dado, en este caso el algoritmo
    es AES*/
    private static Key generateKey() {
        return new SecretKeySpec(keyValue, ALGORITHM);
    }
 /* Este método se encarga de desencriptar todos los archivos de la carpeta del programa que tengan la extensión
    ".enc" que se encuentran en el directorio dado anteriormente */  
     private void desencriptarArchivos() {
        try {
            File[] archivos = new File(DIRECTORY_PATH).listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isFile() && archivo.getName().endsWith(".enc")) {
                        File archivoDesencriptado = new File(archivo.getParent(), archivo.getName().replace(".enc", ""));
                        decryptFile(archivo, archivoDesencriptado);
                        archivo.delete();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEspaniol;
    private javax.swing.JButton BotonIngles;
    private javax.swing.JButton BotonQuechua;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField LineaAmarilla1;
    private javax.swing.JTextField LineaAmarilla2;
    private javax.swing.JTextField LineaNaranja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
