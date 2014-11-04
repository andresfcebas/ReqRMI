
package cliente;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GUI_Login extends javax.swing.JFrame {
    static GestorInfoClient cliente;
    public GUI_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public GUI_Login(GestorInfoClient cliente) {
        this.cliente = new GestorInfoClient("localhost", "1100");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        lblRegistro = new javax.swing.JLabel();
        lblDescripcion1 = new javax.swing.JLabel();
        lblDescripcion2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesion");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setText("Inicio de Sesion");

        pnlLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.darkGray, null));

        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password");

        btnIniciar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIniciar.setText("Iniciar Sesion");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lblRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRegistro.setText("<html><a href=\"Registrarse\">Registrarse</a></html>");
        lblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblDescripcion1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblDescripcion1.setText("Para poder utilizar el Sistema Ingrese su Usuario y Password");

        lblDescripcion2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblDescripcion2.setText("Si no tiene un Usuario, por favor registrese en el Sistema");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcion1)
                            .addComponent(lblDescripcion2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcion1)
                .addGap(1, 1, 1)
                .addComponent(lblDescripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        String usuario = txtUsuario.getText();
        char[] pass = txtPassword.getPassword();
        String password = password(pass);
        try {
            /*
            -1: No esta registrado
            0: Registrado, login y password no coinciden
            1: Usuario regular
            2: Admin
            */
            int login = cliente.loginUsuario(usuario, password);
            switch (login){
                case 2:
                    JOptionPane.showMessageDialog(null, "Click en OK para Continuar", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);
                    GUI_GestorInfoAdmin Admin = new GUI_GestorInfoAdmin(cliente);
                    Admin.setVisible(true);
                    this.setVisible(false);
                    break;
                case 1:
                    String catcha = cliente.compCatcha();
                    String catchaV = JOptionPane.showInputDialog(null, "Ingrese: " + catcha);
                    if(catchaV.compareTo(catcha)==0){
                        JOptionPane.showMessageDialog(null, "Click en OK para Continuar", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);
                        GUI_GestorInfo User = new GUI_GestorInfo(cliente);
                        User.setVisible(true);
                        this.setVisible(false);
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "Catcha Incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                case -1:
                    JOptionPane.showMessageDialog(null, "El Usuario no esta registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } catch (RemoteException ex) {
            Logger.getLogger(GUI_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        GUI_Registrar registro = new GUI_Registrar(cliente);
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRegistroMouseClicked
    
    public String password(char[] pass){
        String result = "";
        
        for(int i=0; i< pass.length; i++){
            result += Character.toString(pass[i]);
        }
        
        return result;
    }
    
    public static void main(String args[]) {
        cliente = new GestorInfoClient(args[0], args[1]);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
