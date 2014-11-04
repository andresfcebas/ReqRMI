
package cliente;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sensor.SensorImp;
import sensor.SensorInt;


public class GUI_ListaLectura extends javax.swing.JFrame {
    
    GestorInfoClient cliente;
    
    public GUI_ListaLectura() {
        initComponents();
    }

    public GUI_ListaLectura(GestorInfoClient cliente) {
        this.cliente = cliente;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLecturas = new javax.swing.JTable();
        boxMes = new javax.swing.JComboBox();
        boxDia = new javax.swing.JComboBox();
        lblDescripcion = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.darkGray, null));

        tblLecturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serie Sensor", "Hora", "Porcentaje CO2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLecturas);

        boxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        boxMes.setSelectedIndex(-1);
        boxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMesActionPerformed(evt);
            }
        });

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcion.setText("Seleccione la fecha para listar las lecturas");

        lblMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMes.setText("Mes");

        lblDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDia.setText("Dia");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescripcion)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMes)
                    .addComponent(boxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDia)
                    .addComponent(boxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Lecturas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void boxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMesActionPerformed
        lblTitulo.setText("Lecturas");
        String mes = (boxMes.getSelectedItem()).toString();
        int nDias = diasMes(mes);
        boxDia.removeAllItems();
        for(int i=1; i<=nDias; i++){
            boxDia.addItem(i);
        }
    }//GEN-LAST:event_boxMesActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
                   
        if(boxMes.getSelectedIndex() != -1){
            String mes = (boxMes.getSelectedItem()).toString();
            String dia = (boxDia.getSelectedItem()).toString();
            String titulo = "Lecturas del " + dia + " de " + mes;
            lblTitulo.setText(titulo);
            DefaultTableModel modelo = (DefaultTableModel)tblLecturas.getModel();
            limpiarTabla(modelo);
            try {
                ArrayList<String> lista = cliente.punto_e(mes, Integer.parseInt(dia));
                llenarTabla(modelo, lista);
            } catch (RemoteException ex) {
                Logger.getLogger(GUI_ListaLectura.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Elija una fecha primero para hacer la consulta", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnConsultarActionPerformed
    
    public void llenarTabla(DefaultTableModel modelo, ArrayList<String> lista){
        
        StringTokenizer st;
        for(String r:lista){
            st = new StringTokenizer(r,"-",false);
            SensorImp dato = (SensorImp)formarDato(st);
            modelo.addRow(new Object[]{dato.getSerie(),dato.getHora(),dato.getPorcentajeCO2()});
        }
    }
    
    public SensorInt formarDato(StringTokenizer st){
        SensorInt s = new SensorImp();

        int serie = Integer.parseInt(st.nextToken());
        int dia = Integer.parseInt(st.nextToken());
        String mes = st.nextToken();
        String hora = st.nextToken();
        Double porcentaje = Double.parseDouble(st.nextToken());

        s.setSerie(serie);
        s.setDia(dia);
        s.setMes(mes);
        s.setHora(hora);
        s.setPorcentajeCO2(porcentaje);

        return s;
    }
    
    public void limpiarTabla(DefaultTableModel modelo){
        int filas = modelo.getRowCount();
        for(int i=0; i<filas; i++){
            modelo.removeRow(0);
        }
    }
    
    public static int diasMes(String mesInt){
            int result;
            String mes = mesInt.toLowerCase();
            switch (mes){
                case "febrero":
                    result = 28;
                    break;
                case "abril": case "junio":
                case "septiembre": case "noviembre":
                    result = 30;
                    break;
                default:
                    result = 31;
                    break;
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
            java.util.logging.Logger.getLogger(GUI_ListaLectura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ListaLectura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ListaLectura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ListaLectura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_ListaLectura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxDia;
    private javax.swing.JComboBox boxMes;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblLecturas;
    // End of variables declaration//GEN-END:variables
}
