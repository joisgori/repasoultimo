/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Peliculas extends javax.swing.JFrame {

    //PRIMER PASO
    //JUSTO ABAJO DEL FRAME Y ANTES DEL CONSTRUCTOR DEFINO MIS VARIABLES ESTÁTICAS FINALES (CONSTANTES) 
    public static final String url = "jdbc:mysql://localhost/examenf";  //Al final de la última pleca irá el nombre de la base de datos que queremos llamar.;
    public static final String user = "root";  //usario default
    public static final String pass = ""; //Constraseña default

    //Variables para preparar consulta
    PreparedStatement ps;
    ResultSet rs;

//********************SEGUNDO PASOOOO****************************
// PASO CREACIÓN DE METODO PUBLICO ESTÁTICO DE TIPO CONNECTION GETCONECTION 
    public static Connection getConnection() {
        //CREO VARIABLE DE TIPO CONNECTION QUE SEA NULO
        Connection con = null;
        //CREO EL TRY{} CATCH() {} RETURN
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Nos permite abrir un canal para poder establecer la comunicación con la base de datos.
            //DriverManager.getConnection (): Devuelve un objeto Connection, el cual representa la conexión física a la base de datos.
            //Vamos a castear al tipo "connection" el valor de vuelto solo por cualquier cosa, que se almacenará en una variable que es de tipo connection...
            con = (Connection) DriverManager.getConnection(Peliculas.url, Peliculas.user, Peliculas.pass); //Estos son los parámetros que recibe.
            //ESTO ES PARA MOSTRAR EL MENSAJE DE CONEXIÓN EXITOSA
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (Exception e) {
            //RECIBE UNA VARIABLE DE TIPO EXCEPTION Y LA IMPRIME SI DEBE HACERLO...
            System.out.println(e);
        }
        //RETORNA LA VARIABLE DE TIPO CONNECTION
        return con;
    }
    
    //Creo un método para limpiar
    private void limpiarcajas() {
        //Todas las cajas de texto deberán apuntar a null
        txtNombre.setText(null);
                //Si fuera combox, .setselectindex(0); que será donde pondré "seleccione";

    }

    public Peliculas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        TxtDirector = new javax.swing.JTextField();
        TxtPais = new javax.swing.JTextField();
        TxtClas = new javax.swing.JTextField();
        TxtAnnio = new javax.swing.JTextField();
        TxtEnproyec = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("IdMovie");

        jLabel2.setText("Nombre");

        jLabel3.setText("Director");

        jLabel4.setText("País");

        jLabel5.setText("Clasificación");

        jLabel6.setText("Año");

        jLabel7.setText("En proyección");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");

        BtnLimpiar.setText("Limpiar");

        txtId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(TxtPais)
                    .addComponent(TxtDirector)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtEnproyec)
                            .addComponent(TxtAnnio)
                            .addComponent(TxtClas)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnGuardar)
                .addGap(52, 52, 52)
                .addComponent(btnModificar)
                .addGap(62, 62, 62)
                .addComponent(BtnEliminar)
                .addGap(60, 60, 60)
                .addComponent(BtnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtClas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtAnnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtEnproyec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnLimpiar))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Paso para el botón guardar
        //DEclaro var de tipo connection
        Connection con = null;
        try {
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO movie (nombre, director, pais, clasificacion, anio, en_proyeccion) VALUES(?,?,?,?,?,?)"); //Acá se coloca la consulta...
            //Se le pone el nombre de la tabla y los campos en el orden que es...
            //Colocamos el tipo de variable a utilizar. string, int, float, etc---
            ps.setString(1, txtNombre.getText()); //el índice en el que se ingresará el elemento, será el nombre, y ahora el valor, que es el valor de la caja de texto nombre.
            ps.setString(2, TxtDirector.getText());
            ps.setString(3, TxtPais.getText());
            ps.setString(4, TxtClas.getText());
            ps.setString(5, TxtAnnio.getText());
            ps.setString(6, TxtEnproyec.getText());
            //Si fuera fecha, hay que castearla a fecha, con date --> Date.valueOf(txtLabel.getTExt)
            //Para combobox se una un getSelectItem.toString

            //Ejecutamos la consulta:
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Nombre Guardado");
                //Se llama luego de insertar
                limpiarcajas();

            } else {
                JOptionPane.showMessageDialog(null, "Nombre NO Guardado");
                //aún si da error:
                limpiarcajas();
            }
            //SE CIERRA LA CONEXION
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Connection con = null;
        try {
            con = getConnection();
	    ps = con.prepareStatement("SELECT * FROM movie WHERE nombre = ?"); //Acá se coloca la consulta DE MODIFICAR
            ps.setString(1, txtNombre.getText()); //Lo mismo, se manda a llamr el campo en su índice...
                       
            //Validar si trajo datos o no...
            rs = ps.executeQuery();
            if(rs.next()){
                TxtPais.setText(rs.getString("pais")); //para llenar los campos de las interfaz sacados de la tabla...
                //Si hubiera un combobox. setSelectItem(rs.getString("genero"));
            } else {
                JOptionPane.showMessageDialog(null, "No hay datos.");
            }
        } catch(Exception e){
            
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Peliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JTextField TxtAnnio;
    private javax.swing.JTextField TxtClas;
    private javax.swing.JTextField TxtDirector;
    private javax.swing.JTextField TxtEnproyec;
    private javax.swing.JTextField TxtPais;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
