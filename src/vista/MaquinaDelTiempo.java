package vista;

import controlador.ControladorFecha;
import controlador.ControladorMaquinaDelTiempo;
import java.util.Calendar;

/**
 *
 * @author Sanchez, Morales e Ismael
 */
public class MaquinaDelTiempo extends javax.swing.JInternalFrame {

    ControladorMaquinaDelTiempo controladorMaquinaDelTiempo;
    ControladorFecha controladorFecha = new ControladorFecha();

    public MaquinaDelTiempo() {
        initComponents();
        controladorMaquinaDelTiempo = new ControladorMaquinaDelTiempo(this);
        mostrarFechaActual();
    }

    private void mostrarFechaActual(){
        controladorMaquinaDelTiempo.llenarFechaActual();
    }

    public void setFechaActual(Calendar fechaActual){
        controladorMaquinaDelTiempo.setFecha(jLabelDia,jLabelMes,jLabelAnio,fechaActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelDia = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelMes = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelAnio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxAnio = new javax.swing.JComboBox();
        jButtonViajar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(vista.MainApp.class).getContext().getResourceMap(MaquinaDelTiempo.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabelDia.setText(resourceMap.getString("jLabelDia.text")); // NOI18N
        jLabelDia.setName("jLabelDia"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabelMes.setText(resourceMap.getString("jLabelMes.text")); // NOI18N
        jLabelMes.setName("jLabelMes"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabelAnio.setText(resourceMap.getString("jLabelAnio.text")); // NOI18N
        jLabelAnio.setName("jLabelAnio"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxDia.setName("jComboBoxDia"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC" }));
        jComboBoxMes.setName("jComboBoxMes"); // NOI18N
        jComboBoxMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modificar_opciones_dias(evt);
            }
        });

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jComboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        jComboBoxAnio.setName("jComboBoxAnio"); // NOI18N
        jComboBoxAnio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modificar_opciones_dias(evt);
            }
        });

        jButtonViajar.setText(resourceMap.getString("jButtonViajar.text")); // NOI18N
        jButtonViajar.setName("jButtonViajar"); // NOI18N
        jButtonViajar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonViajarMouseReleased(evt);
            }
        });

        jButtonCancelar.setText(resourceMap.getString("jButtonCancelar.text")); // NOI18N
        jButtonCancelar.setName("jButtonCancelar"); // NOI18N
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAnio))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonViajar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelDia)
                    .addComponent(jLabel3)
                    .addComponent(jLabelMes)
                    .addComponent(jLabel5)
                    .addComponent(jLabelAnio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonViajar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificar_opciones_dias(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modificar_opciones_dias
        controladorFecha.modificarOpcionDias(jComboBoxAnio,jComboBoxMes,jComboBoxDia);
    }//GEN-LAST:event_modificar_opciones_dias

    private void jButtonCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseReleased
        setVisible(false);
    }//GEN-LAST:event_jButtonCancelarMouseReleased

    private void jButtonViajarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonViajarMouseReleased
        controladorMaquinaDelTiempo.viajarEnElTiempo(jComboBoxAnio, jComboBoxMes, jComboBoxDia);
        mostrarFechaActual();
    }//GEN-LAST:event_jButtonViajarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonViajar;
    private javax.swing.JComboBox jComboBoxAnio;
    private javax.swing.JComboBox jComboBoxDia;
    private javax.swing.JComboBox jComboBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAnio;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelMes;
    // End of variables declaration//GEN-END:variables

}
