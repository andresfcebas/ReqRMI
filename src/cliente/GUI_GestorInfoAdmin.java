
package cliente;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GUI_GestorInfoAdmin extends javax.swing.JFrame {
    static GestorInfoClient cliente;
    public GUI_GestorInfoAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnGroup.add(rbtnOpcion1);
        btnGroup.add(rbtnOpcion2);
        btnGroup.add(rbtnOpcion3);
        btnGroup.add(rbtnOpcion4);
        btnGroup.add(rbtnOpcion5);
        btnGroup.add(rbtnOpcion6);
    }
    
    public GUI_GestorInfoAdmin(GestorInfoClient cliente) {
        this.cliente = cliente;
        initComponents();
        this.setLocationRelativeTo(null);
        btnGroup.add(rbtnOpcion1);
        btnGroup.add(rbtnOpcion2);
        btnGroup.add(rbtnOpcion3);
        btnGroup.add(rbtnOpcion4);
        btnGroup.add(rbtnOpcion5);
        btnGroup.add(rbtnOpcion6);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtnOpcion1 = new javax.swing.JRadioButton();
        rbtnOpcion2 = new javax.swing.JRadioButton();
        rbtnOpcion3 = new javax.swing.JRadioButton();
        rbtnOpcion4 = new javax.swing.JRadioButton();
        rbtnOpcion5 = new javax.swing.JRadioButton();
        btnEjecutar = new javax.swing.JButton();
        lblCerrarSesion = new javax.swing.JLabel();
        rbtnOpcion6 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Gestor Informacion Sensor");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.darkGray, null));

        rbtnOpcion1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtnOpcion1.setText("1. Listar lecturas obtenidas de un dia");

        rbtnOpcion2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtnOpcion2.setText("2. Dia con el Porcentaje Medio mas alto de un mes");

        rbtnOpcion3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtnOpcion3.setText("3. Horas en los que el porcentaje fue mayor que el valor medio");

        rbtnOpcion4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtnOpcion4.setText("4. Numero de horas en los que el porcentaje fue mayor que el valor medio");

        rbtnOpcion5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtnOpcion5.setText("5. Modificar porcentaje obtenido por el sensor");

        btnEjecutar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        lblCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCerrarSesion.setText("<html><a href=\"Logout\">Cerrar Sesion</a></html>");
        lblCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });

        rbtnOpcion6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbtnOpcion6.setText("6. Modificar un Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnOpcion6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnOpcion5)
                            .addComponent(rbtnOpcion4)
                            .addComponent(rbtnOpcion3)
                            .addComponent(rbtnOpcion2)
                            .addComponent(rbtnOpcion1))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rbtnOpcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnOpcion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnOpcion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnOpcion4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnOpcion5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnOpcion6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEjecutar)
                    .addComponent(lblCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        if(rbtnOpcion1.isSelected()){
            GUI_ListaLectura lista = new GUI_ListaLectura(cliente);
            lista.setVisible(true);
        }else{
            if(rbtnOpcion2.isSelected()){
                String mes = JOptionPane.showInputDialog(null, "Ingrese el Mes para la consulta");
                try {
                    String op2 = cliente.punto_f(mes);
                    JOptionPane.showMessageDialog(null, op2, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                } catch (RemoteException ex) {
                    Logger.getLogger(GUI_GestorInfoAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                if(rbtnOpcion3.isSelected()){
                    GUI_ListaHoras lista = new GUI_ListaHoras(cliente);
                    lista.setVisible(true);
                }else{
                    if(rbtnOpcion4.isSelected()){
                        try {
                            int op4 = cliente.punto_c();
                            if(op4 != -1){
                                String cadena = "Numero total de horas: " + op4;
                                JOptionPane.showMessageDialog(null, cadena, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null, "Ejecute la opcion 3 primero", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (RemoteException ex) {
                            Logger.getLogger(GUI_GestorInfoAdmin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        if(rbtnOpcion5.isSelected()){
                            GUI_ListaLectura lista = new GUI_ListaLectura(cliente);
                            lista.setVisible(true);
                            GUI_ModificarPorcentaje modPorcentaje = new GUI_ModificarPorcentaje(cliente);
                            modPorcentaje.setVisible(true);
                        }else{
                            if(rbtnOpcion6.isSelected()){
                                GUI_ModificarUsuario modUsuario;
                                try {
                                    modUsuario = new GUI_ModificarUsuario(cliente);
                                    modUsuario.setVisible(true);
                                } catch (RemoteException ex) {
                                    Logger.getLogger(GUI_GestorInfoAdmin.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                
                            
                            }else{
                                JOptionPane.showMessageDialog(null, "Seleccione una opcion primero", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        boolean yes; 
        yes = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "¿Seguro desea salir del Sistema?", "Cerrar Sesion", JOptionPane.YES_NO_OPTION);
        if(yes){
            GUI_Login login = new GUI_Login();
            login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        boolean yes; 
        yes = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "¿Seguro desea salir del Sistema?", "Cerrar Sesion", JOptionPane.YES_NO_OPTION);
        if(yes){
            GUI_Login login = new GUI_Login();
            login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(GUI_GestorInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_GestorInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_GestorInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_GestorInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_GestorInfoAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtnOpcion1;
    private javax.swing.JRadioButton rbtnOpcion2;
    private javax.swing.JRadioButton rbtnOpcion3;
    private javax.swing.JRadioButton rbtnOpcion4;
    private javax.swing.JRadioButton rbtnOpcion5;
    private javax.swing.JRadioButton rbtnOpcion6;
    // End of variables declaration//GEN-END:variables
}
