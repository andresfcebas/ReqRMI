
package cliente;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GUI_Registrar extends javax.swing.JFrame {
    
    GestorInfoClient cliente;
    
    public GUI_Registrar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public GUI_Registrar(GestorInfoClient cliente) {
        this.cliente = cliente;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblVerPassword = new javax.swing.JLabel();
        txtVerPassword = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        chkRol = new javax.swing.JCheckBox();
        txtRol = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registro de nuevo Usuario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Registro");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.darkGray, null));

        lblNombre.setText("Nombre:");

        lblCedula.setText("Documento de Indentidad:");

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblLogin.setText("Nombre de Usuario (Login):");

        txtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblPassword.setText("Password:");

        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        lblVerPassword.setText("Verificar Password:");

        txtVerPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVerPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVerPasswordKeyTyped(evt);
            }
        });

        btnRegistrar.setText("Registrarse");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        chkRol.setText("Soy Administrador");
        chkRol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkRolMouseClicked(evt);
            }
        });

        txtRol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRol.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(lblNombre)
                    .addComponent(lblLogin)
                    .addComponent(lblPassword)
                    .addComponent(txtNombre)
                    .addComponent(txtLogin)
                    .addComponent(txtPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCedula)
                    .addComponent(lblCedula)
                    .addComponent(lblVerPassword)
                    .addComponent(txtVerPassword)
                    .addComponent(chkRol)
                    .addComponent(txtRol)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(chkRol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(lblVerPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        boolean val = validacion();
        UsuarioInt usuario = new UsuarioImp();
        
        if(val){
            usuario.setNombre(txtNombre.getText());
            usuario.setCedula(Integer.parseInt(txtCedula.getText()));
            usuario.setLogin(txtLogin.getText());
            usuario.setPassword(password(txtPassword.getPassword()));
            if(chkRol.isSelected()){
                usuario.setAdmin(true);
            }else{
                usuario.setAdmin(false);
            }
            try {
                boolean reg = cliente.registrarUsuario(usuario);
                if(reg){
                    JOptionPane.showMessageDialog(null, "El registro ha sido satisfactorio", "CORRECTO", JOptionPane.INFORMATION_MESSAGE);
                    GUI_Login login = new GUI_Login(cliente);
                    login.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido completar el registro", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(GUI_Registrar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void chkRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkRolMouseClicked
        if(chkRol.isSelected()){
            txtRol.setEnabled(true);
        }else{
            txtRol.setEnabled(false);
        }
    }//GEN-LAST:event_chkRolMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        boolean yes; 
        yes = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "¿Seguro que desea cancelar el registro?", "Cancelar", JOptionPane.YES_NO_OPTION);
        if(yes){
            GUI_Login login = new GUI_Login();
            login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        boolean yes; 
        yes = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "¿Seguro que desea cancelar el registro?", "Cancelar", JOptionPane.YES_NO_OPTION);
        if(yes){
            GUI_Login login = new GUI_Login();
            login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_formWindowClosing

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        String password = password(txtPassword.getPassword());
        if(password.length()==6){
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtVerPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVerPasswordKeyTyped
        String password = password(txtVerPassword.getPassword());
        if(password.length()==6){
            evt.consume();
        }
    }//GEN-LAST:event_txtVerPasswordKeyTyped
    
    public boolean validacion(){
        boolean d1, d2, d3, d4, d5, d6, val, rolb, result=false;
        String nombre = txtNombre.getText();
        String cedula = txtCedula.getText();
        String login = txtLogin.getText();
        String rol = txtRol.getText();
        String password = password(txtPassword.getPassword());
        String password2 = password(txtVerPassword.getPassword());
        
        d1 = nombre.compareTo("") == 0;
        d2 = cedula.compareTo("") == 0;
        d3 = login.compareTo("") == 0;
        
        rolb = chkRol.isSelected();
        if(rolb){
            d4 = rol.compareTo("") == 0;
        }else{
            d4 = true;
        }
        
        d5 = password.compareTo("") == 0;
        d6 = password2.compareTo("") == 0;
        val = d1 && d2 && d3 && d4 && d5 && d6;
        
        if(!val){
            //TODO
            if(password.compareTo(password2) == 0){
                if(chkRol.isSelected() ){
                    if(rol.compareTo("2769") == 0){
                        result = true;
                    }else{
                        JOptionPane.showMessageDialog(null, "La contraseña de administrador es incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    result = true;
                }
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }
    
    public String password(char[] pass){
        String result = "";
        
        for(int i=0; i< pass.length; i++){
            result += Character.toString(pass[i]);
        }
        
        return result;
    }
    
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
            java.util.logging.Logger.getLogger(GUI_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox chkRol;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVerPassword;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRol;
    private javax.swing.JPasswordField txtVerPassword;
    // End of variables declaration//GEN-END:variables
}
