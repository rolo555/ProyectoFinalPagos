/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EmpleadoPorHora.java
 *
 * Created on May 21, 2011, 10:30:01 AM
 */
package vista;

import java.awt.Color;
import org.jdesktop.application.Action;

/**
 *
 * @author Rolo
 */
public class EmpleadoPorHora extends javax.swing.JInternalFrame {

    /** Creates new form EmpleadoPorHora */
    public EmpleadoPorHora() {
        initComponents();
    }

    private void mostrarError(String mensaje) {
        jLabelMensaje.setForeground(Color.RED);
        jLabelMensaje.setText(mensaje);
    }

    private void mostrarMensaje(String mensaje) {
        jLabelMensaje.setForeground(Color.GREEN);
        jLabelMensaje.setText(mensaje);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldSueldo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxFormaDePago = new javax.swing.JComboBox();
        jPanelDatosExtra = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNombreBanco = new javax.swing.JTextField();
        jTextFieldEMail = new javax.swing.JTextField();
        jLabelMensaje = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(vista.MainApp.class).getContext().getResourceMap(EmpleadoPorHora.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jLabelNombre.setText(resourceMap.getString("jLabelNombre.text")); // NOI18N
        jLabelNombre.setName("jLabelNombre"); // NOI18N

        jLabelTelefono.setText(resourceMap.getString("jLabelTelefono.text")); // NOI18N
        jLabelTelefono.setName("jLabelTelefono"); // NOI18N

        jLabelDireccion.setText(resourceMap.getString("jLabelDireccion.text")); // NOI18N
        jLabelDireccion.setName("jLabelDireccion"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jTextFieldNombre.setText(resourceMap.getString("jTextFieldNombre.text")); // NOI18N
        jTextFieldNombre.setName("jTextFieldNombre"); // NOI18N

        jTextFieldTelefono.setName("jTextFieldTelefono"); // NOI18N

        jTextFieldDireccion.setName("jTextFieldDireccion"); // NOI18N

        jTextFieldSueldo.setName("jTextFieldSueldo"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jComboBoxFormaDePago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A banco", "A direccion", "A recursos humanos" }));
        jComboBoxFormaDePago.setName("jComboBoxFormaDePago"); // NOI18N
        jComboBoxFormaDePago.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mostrarDatosExtra(evt);
            }
        });

        jPanelDatosExtra.setName("jPanelDatosExtra"); // NOI18N

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jTextFieldNombreBanco.setText(resourceMap.getString("jTextFieldNombreBanco.text")); // NOI18N
        jTextFieldNombreBanco.setName("jTextFieldNombreBanco"); // NOI18N

        jTextFieldEMail.setName("jTextFieldEMail"); // NOI18N

        javax.swing.GroupLayout jPanelDatosExtraLayout = new javax.swing.GroupLayout(jPanelDatosExtra);
        jPanelDatosExtra.setLayout(jPanelDatosExtraLayout);
        jPanelDatosExtraLayout.setHorizontalGroup(
            jPanelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosExtraLayout.createSequentialGroup()
                .addGroup(jPanelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosExtraLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNombreBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                    .addGroup(jPanelDatosExtraLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(62, 62, 62)
                        .addComponent(jTextFieldEMail, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDatosExtraLayout.setVerticalGroup(
            jPanelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosExtraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabelMensaje.setText(resourceMap.getString("jLabelMensaje.text")); // NOI18N
        jLabelMensaje.setName("jLabelMensaje"); // NOI18N

        jButtonRegistrar.setText(resourceMap.getString("jButtonRegistrar.text")); // NOI18N
        jButtonRegistrar.setName("jButtonRegistrar"); // NOI18N

        jButtonLimpiar.setText(resourceMap.getString("jButtonLimpiar.text")); // NOI18N
        jButtonLimpiar.setActionCommand(resourceMap.getString("jButtonLimpiar.actionCommand")); // NOI18N
        jButtonLimpiar.setName("jButtonLimpiar"); // NOI18N
        jButtonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                limpiarCampos(evt);
            }
        });

        jButtonCancelar.setText(resourceMap.getString("jButtonCancelar.text")); // NOI18N
        jButtonCancelar.setName("jButtonCancelar"); // NOI18N
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ocultarVentana(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMensaje)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTelefono)
                        .addGap(45, 45, 45)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDireccion)
                        .addGap(44, 44, 44)
                        .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxFormaDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))))
                    .addComponent(jPanelDatosExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRegistrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxFormaDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDatosExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarDatosExtra(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mostrarDatosExtra
        if (jComboBoxFormaDePago.getSelectedItem().toString().equals("A banco")) {
            jPanelDatosExtra.setVisible(true);
        } else {
            jPanelDatosExtra.setVisible(false);
        }
    }//GEN-LAST:event_mostrarDatosExtra

    private void limpiarCampos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarCampos
        jTextFieldDireccion.setText("");
        jTextFieldNombre.setText("");
        jTextFieldEMail.setText("");
        jTextFieldNombreBanco.setText("");
        jTextFieldSueldo.setText("");
        jTextFieldTelefono.setText("");
    }//GEN-LAST:event_limpiarCampos

    private void ocultarVentana(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarVentana
        setVisible(false);
    }//GEN-LAST:event_ocultarVentana
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox jComboBoxFormaDePago;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanelDatosExtra;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldEMail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombreBanco;
    private javax.swing.JTextField jTextFieldSueldo;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}