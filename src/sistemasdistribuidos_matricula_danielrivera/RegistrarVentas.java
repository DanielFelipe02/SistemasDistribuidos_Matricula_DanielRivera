/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasdistribuidos_matricula_danielrivera;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class RegistrarVentas extends javax.swing.JFrame {

    public int indice;   
    // Instancio la clase
    private Conexion objConexion = new Conexion();
    /**
     * Creates new form Register
     */
    public RegistrarVentas() {
        initComponents();
        setSize(726,558);//Para dar tamaño a la ventana
        setResizable(false);//Para que no se pueda retirar
        setLocationRelativeTo(null);//Para que aparezca a la mitad de la pantalla
        setTitle("Registrar Venta");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        txtIdVenta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCajeros = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtIdCajero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa (2).png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu);
        btnMenu.setBounds(620, 470, 62, 48);

        txtIdVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdVentaActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdVenta);
        txtIdVenta.setBounds(280, 190, 130, 24);

        jLabel1.setText("(Solo apto al Modificar o Actualizar)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 190, 210, 16);

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad);
        txtCantidad.setBounds(50, 190, 170, 24);

        jLabel2.setText("Cantidad:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 170, 110, 16);

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtProducto);
        txtProducto.setBounds(280, 130, 170, 24);

        jLabel3.setText("Película:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 110, 110, 16);

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(510, 130, 170, 24);

        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(510, 110, 110, 16);

        tblCajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCajeros);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(13, 253, 700, 200);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscando-en-la-tierra.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(380, 470, 62, 48);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-flexible.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(320, 470, 62, 48);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(440, 470, 62, 48);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/goma-de-borrar.png"))); // NOI18N
        btnLimpiar.setToolTipText("");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(500, 470, 62, 48);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(560, 470, 62, 48);

        jLabel10.setText("Id del Cajero:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 110, 110, 16);

        txtIdCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCajeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdCajero);
        txtIdCajero.setBounds(50, 130, 170, 24);

        jLabel12.setText("id venta:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(280, 170, 70, 16);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_registrar3.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 730, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu obj= new Menu();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtIdVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdVentaActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        //   ***** Buscar *****
        
        // Abro la conexion con la Base de Datos
        objConexion.conexion();
        
        // Creo el modelo para del JTable
        DefaultTableModel modelo = (DefaultTableModel) tblCajeros.getModel();
        // Defino un vector para el cargue del JTable
        String vector[] = new String[6];
               
        // Limpio el JTable antes del cargue
        modelo.setColumnCount(0);
        modelo.setNumRows(0);
        
        // Cargo las columnas de titulo al Jtable
        modelo.addColumn("CÓDIGO");
        modelo.addColumn("CÓDIGO CAJERO");
        modelo.addColumn("PELICULA");
        modelo.addColumn("PRECIO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO TOTAL");
        
        try{
             ResultSet rs = objConexion.leer("SELECT `id_venta`, `id_venta_cajero`, `producto`, `precio`, `cantidad`, `valorTotal` FROM `ventas`");
            while(rs.next()){
                // Cargo el vector con los valores de la fila a cargar en el JTabl
                vector[0] = String.valueOf(rs.getInt("id_venta"));
                vector[1] = rs.getString("id_venta_cajero");
                vector[2] = rs.getString("producto");
                vector[3] = rs.getString("precio"); 
                vector[4] = rs.getString("cantidad"); 
                vector[5] = rs.getString("valorTotal"); 
                // Adiciono la fila al JTable
                modelo.addRow(vector);                 
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        // Cierro la conexión con la Base de Datos
        objConexion.desconectar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        // *** Defino las variables ***
        int idCajero;
        String producto;
        int precio;
        int cantidad;
        int valorTotal;
        
        if(txtIdCajero.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el Id del Cajero.");
            txtIdCajero.requestFocus();
            return;
        } 

        if(txtProducto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar nombre del Producto.");
            txtProducto.requestFocus();
            return;
        } 

        if(txtCantidad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad.");
            txtCantidad.requestFocus();
            return;
        } 
        
        if(txtPrecio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el precio por unidad.");
            txtPrecio.requestFocus();
            return;
        }
         
         // *** Asigno los elementos gráficos a las variables ***
        idCajero = Integer.parseInt(txtIdCajero.getText());
        producto = txtProducto.getText();
        precio = Integer.parseInt(txtPrecio.getText());
        cantidad = Integer.parseInt(txtCantidad.getText());
        valorTotal = precio * cantidad;
        // *** Realizo los procesos ***
        
        // Abro la conexion con la Base de Datos
        objConexion.conexion();

        try{
            // Busco el ultimo registro de la tabla
            ResultSet rs = objConexion.leer("SELECT MAX(id_venta) FROM ventas");
            // Traigo el siguiente registro
            rs.next();
            
            // Inserto el registro en la tabla
            boolean respuesta = objConexion.consultar("INSERT INTO `ventas`(`id_venta_cajero`, `producto`, `precio`, `cantidad`, `valorTotal`) VALUES('"+idCajero+"','"+producto+"','"+precio+"','"+cantidad+"','"+valorTotal+"') ");
            
            // Imprimo el mensaje para indicar si se guardo o no el registro
            if(respuesta == true){                
                JOptionPane.showMessageDialog(null,"Su registro se guardo con éxito.");
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR: No se pudo guardar el registro.");
            } 
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        // *** Limpio los Campos ***   
        txtIdCajero.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtIdVenta.setText("");
        
        // Cierro la conexión con la Base de Datos
        objConexion.desconectar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtIdCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCajeroActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        // *** Defino las variables ***
        int idCajero;
        String producto;
        int precio;
        int cantidad;
        int valorTotal;
        int idVenta;
        
        if(txtIdCajero.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el Id del Cajero.");
            txtIdCajero.requestFocus();
            return;
        } 

        if(txtProducto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar nombre del Producto.");
            txtProducto.requestFocus();
            return;
        } 

        if(txtCantidad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad.");
            txtCantidad.requestFocus();
            return;
        } 
        
        if(txtPrecio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el precio por unidad.");
            txtPrecio.requestFocus();
            return;
        }
        
        if(txtIdVenta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el Id de la Venta.");
            txtIdVenta.requestFocus();
            return;
        }
         
         // *** Asigno los elementos gráficos a las variables ***
        idVenta = Integer.parseInt(txtIdCajero.getText());
        idCajero = Integer.parseInt(txtIdCajero.getText());
        producto = txtProducto.getText();
        precio = Integer.parseInt(txtPrecio.getText());
        cantidad = Integer.parseInt(txtCantidad.getText());
        valorTotal = precio * cantidad;

        // *** Realizo los procesos ***
        
        // Abro la conexion con la Base de Datos
        objConexion.conexion();

        try{           
            // Modifico el registro en la tabla
            boolean respuesta = objConexion.consultar("UPDATE `ventas` SET `id_venta_cajero`='"+idCajero+"',`producto`='"+producto+"',`precio`='"+precio+"',`cantidad`='"+cantidad+"',`valorTotal`='"+valorTotal+"' WHERE id_venta='"+idVenta+"'");
            
            // Imprimo el mensaje para indicar si se guardo o no el registro
            if(respuesta == true){                
                JOptionPane.showMessageDialog(null,"Su registro se guardo con éxito.");
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR: No se pudo guardar el registro.");
            } 
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        // *** Limpio los Campos ***   
        txtIdCajero.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtIdVenta.setText("");
        
        // Cierro la conexión con la Base de Datos
        objConexion.desconectar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        // Defino el modelo para el JTable
        DefaultTableModel modelo = (DefaultTableModel) tblCajeros.getModel();        

        // Abro la conexión con la Base de Datos
        try{
            objConexion.conexion();

            // Asigno el indice del elemento seleccionado 
            indice = tblCajeros.getSelectedRow();                   

            // Asigno a idCiudad el elemento a eliminar
            int idVenta =  Integer.parseInt((String)modelo.getValueAt(indice, 0));        

            // Elimino el registro del JTable
            modelo.removeRow(indice);

            // Elimino el registro de la tabla ciudad
            boolean respuesta = objConexion.consultar("DELETE FROM ventas WHERE id_venta = '"+idVenta+"' ");

            // Imprimo el mensaje para indicar si se eliminó o no el registro
            if(respuesta == true){
               JOptionPane.showMessageDialog(null, "El registro se elimino.");
            }
            else{
               JOptionPane.showMessageDialog(null, "ERROR: No se elimino el registro.");
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        // *** Limpio los Campos ***   
        txtIdCajero.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtIdVenta.setText("");

        // Limpio las filas y las columnas de la tabla
        modelo.setColumnCount(0);
        modelo.setNumRows(0);      
        
        // Cierro la conexión a la Base de Datos
        objConexion.desconectar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tblCajeros.getModel();
        
        txtIdCajero.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtIdVenta.setText("");
        
        modelo.setColumnCount(0);
        modelo.setNumRows(0); 
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarVentas().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCajeros;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdCajero;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
    BaseDeDatos mysql=new BaseDeDatos();
    Connection cn = mysql.Connectar();
}
