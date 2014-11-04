
package servidor;

import java.awt.Color;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sop_rmi.GestorInfoCO2Imp;
import sop_rmi.SensorCllbckInt;

public class GUI_AdministrarSensores extends javax.swing.JFrame {
    
    GestorInfoCO2Imp callback;
    
    public GUI_AdministrarSensores() {
        initComponents();
    }
    
    public GUI_AdministrarSensores(GestorInfoCO2Imp callback) throws RemoteException {
        this.callback = callback;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtSensor1 = new javax.swing.JTextField();
        txtSensor2 = new javax.swing.JTextField();
        txtSensor3 = new javax.swing.JTextField();
        btnSensor1 = new javax.swing.JButton();
        btnSensor2 = new javax.swing.JButton();
        btnSensor3 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Administrador de Sensores");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.darkGray, null));

        txtSensor1.setBackground(new java.awt.Color(204, 204, 204));
        txtSensor1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtSensor1.setForeground(new java.awt.Color(204, 0, 0));
        txtSensor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSensor1.setEnabled(false);

        txtSensor2.setBackground(new java.awt.Color(204, 204, 204));
        txtSensor2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtSensor2.setForeground(new java.awt.Color(204, 0, 0));
        txtSensor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSensor2.setEnabled(false);

        txtSensor3.setBackground(new java.awt.Color(204, 204, 204));
        txtSensor3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtSensor3.setForeground(new java.awt.Color(204, 0, 0));
        txtSensor3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSensor3.setEnabled(false);

        btnSensor1.setText("Encender");
        btnSensor1.setEnabled(false);
        btnSensor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSensor1ActionPerformed(evt);
            }
        });

        btnSensor2.setText("Encender");
        btnSensor2.setEnabled(false);
        btnSensor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSensor2ActionPerformed(evt);
            }
        });

        btnSensor3.setText("Encender");
        btnSensor3.setEnabled(false);
        btnSensor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSensor3ActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel2.setText("Click en Actualizar cuando esten funcionando los Sensores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSensor1)
                            .addComponent(txtSensor2)
                            .addComponent(txtSensor3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSensor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSensor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSensor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSensor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSensor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSensor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSensor2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSensor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSensor3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
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
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            actualizarSensores();
        } catch (RemoteException ex) {
            Logger.getLogger(GUI_AdministrarSensores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSensor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSensor1ActionPerformed
        String texto = btnSensor1.getText();
        if(texto.compareTo("Apagar")==0){
            try {
                ((callback.getCallbacks()).get(0)).setEstado(false);
                btnSensor1.setText("Encender");
                txtSensor1.setBackground(Color.red);
                txtSensor1.setForeground(Color.RED);
            } catch (RemoteException ex) {
                Logger.getLogger(GUI_AdministrarSensores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                ((callback.getCallbacks()).get(0)).setEstado(true);
                btnSensor1.setText("Apagar");
                txtSensor1.setBackground(Color.green);
                txtSensor1.setForeground(Color.GREEN);
            } catch (RemoteException ex) {
                Logger.getLogger(GUI_AdministrarSensores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSensor1ActionPerformed

    private void btnSensor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSensor2ActionPerformed
        String texto = btnSensor2.getText();
        if(texto.compareTo("Apagar")==0){
            try {
                ((callback.getCallbacks()).get(1)).setEstado(false);
                btnSensor2.setText("Encender");
                txtSensor2.setBackground(Color.red);
                txtSensor2.setForeground(Color.RED);
            } catch (RemoteException ex) {
                Logger.getLogger(GUI_AdministrarSensores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                ((callback.getCallbacks()).get(1)).setEstado(true);
                btnSensor2.setText("Apagar");
                txtSensor2.setBackground(Color.green);
                txtSensor2.setForeground(Color.GREEN);
            } catch (RemoteException ex) {
                Logger.getLogger(GUI_AdministrarSensores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSensor2ActionPerformed

    private void btnSensor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSensor3ActionPerformed
        String texto = btnSensor1.getText();
        if(texto.compareTo("Apagar")==0){
            try {
                ((callback.getCallbacks()).get(2)).setEstado(false);
                btnSensor3.setText("Encender");
                txtSensor3.setBackground(Color.red);
                txtSensor3.setForeground(Color.RED);
            } catch (RemoteException ex) {
                Logger.getLogger(GUI_AdministrarSensores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                ((callback.getCallbacks()).get(2)).setEstado(true);
                btnSensor3.setText("Apagar");
                txtSensor3.setBackground(Color.green);
                txtSensor3.setForeground(Color.GREEN);
            } catch (RemoteException ex) {
                Logger.getLogger(GUI_AdministrarSensores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSensor3ActionPerformed
    
    public void actualizarSensores() throws RemoteException{
        ArrayList<SensorCllbckInt> sensores = callback.getCallbacks();
        int cant = sensores.size();
        if(cant == 3){
            txtSensor1.setText( Integer.toString((sensores.get(0)).getId()) );
            txtSensor2.setText( Integer.toString((sensores.get(1)).getId()) );
            txtSensor3.setText( Integer.toString((sensores.get(2)).getId()) );
            btnSensor1.setEnabled(true);
            btnSensor2.setEnabled(true);
            btnSensor3.setEnabled(true);
            btnSensor1.setText("Apagar");
            btnSensor2.setText("Apagar");
            btnSensor3.setText("Apagar");
            txtSensor1.setBackground(Color.green);
            txtSensor1.setForeground(Color.GREEN);
            txtSensor2.setBackground(Color.green);
            txtSensor2.setForeground(Color.GREEN);
            txtSensor3.setBackground(Color.green);
            txtSensor3.setForeground(Color.GREEN);
        }else if(cant == 2){
            txtSensor1.setText( Integer.toString((sensores.get(0)).getId()) );
            txtSensor2.setText( Integer.toString((sensores.get(1)).getId()) );
            btnSensor1.setEnabled(true);
            btnSensor2.setEnabled(true);
            btnSensor1.setText("Apagar");
            btnSensor2.setText("Apagar");
            txtSensor1.setBackground(Color.green);
            txtSensor1.setForeground(Color.GREEN);
            txtSensor2.setBackground(Color.green);
            txtSensor2.setForeground(Color.GREEN);
        }else{
            txtSensor1.setText( Integer.toString((sensores.get(0)).getId()) );
            btnSensor1.setEnabled(true);
            btnSensor1.setText("Apagar");
            txtSensor1.setBackground(Color.green);
            txtSensor1.setForeground(Color.GREEN);
        }
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
            java.util.logging.Logger.getLogger(GUI_AdministrarSensores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_AdministrarSensores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_AdministrarSensores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_AdministrarSensores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_AdministrarSensores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnSensor1;
    private javax.swing.JButton btnSensor2;
    private javax.swing.JButton btnSensor3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtSensor1;
    private javax.swing.JTextField txtSensor2;
    private javax.swing.JTextField txtSensor3;
    // End of variables declaration//GEN-END:variables
}
