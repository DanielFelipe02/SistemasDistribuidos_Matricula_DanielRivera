/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasdistribuidos_matricula_danielrivera;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Kathe
 */
public class InicioSupervisor extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public InicioSupervisor() {
        initComponents();
        setSize(360,460);//Para dar tamaño a la ventana
        setResizable(false);//Para que no se pueda retirar
        setLocationRelativeTo(null);//Para que aparezca a la mitad de la pantalla
        setTitle("Ingreso");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInciar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_iniciar_1.png"))); // NOI18N
        btnInciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInciar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_iniciar_2.png"))); // NOI18N
        btnInciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 120, 70));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 200, 40));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 200, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/txt_pass.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 250, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/txt_user.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 250, 40));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa (2).png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\SistemasDistribuidos_Matricula_DanielRivera\\src\\imagenes\\fondo_Ingresar.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInciarActionPerformed
        // Definir las variables a utilizar
            String usuario;
            String password;
            String id = "";
            
            usuario = txtUsuario.getText();
            password = new String(txtPassword.getPassword());

            String sql="SELECT * FROM Supervisor WHERE usuario ='"+usuario+"'AND contraseña = '"+password+"'";
            
            try {
                
                if (txtUsuario.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Digite el usuario");
                    txtUsuario.requestFocus();
                    return;
                }
                if (txtPassword.getPassword().length==0) {
                    JOptionPane.showMessageDialog(null, "Digite la contraseña");
                    txtPassword.requestFocus();
                    return;
                }
                
                Statement st = cn.createStatement();
                ResultSet rs=st.executeQuery(sql);
                
                while (rs.next()){
                    id = rs.getString("id");
                }
                if (id.equals("")){
                    JOptionPane.showMessageDialog (null,"Usuario no registrado");
                }
                else{
                    Registrar obj= new Registrar();
                    obj.setVisible(true);
                    dispose();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_btnInciarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu obj= new Menu();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed
        
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
            java.util.logging.Logger.getLogger(InicioSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new InicioSupervisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInciar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
BaseDeDatos mysql=new BaseDeDatos();
Connection cn = mysql.Connectar();
    
}

