package vista;

import controlador.ControladorEmpleado;

/**
 *
 * @author Sanchez, Morales e Ismael
 */
public class VistaRegistrarEmpleado extends javax.swing.JInternalFrame {

    ControladorEmpleado controladorEmpleado;

    public VistaRegistrarEmpleado() {
        initComponents();
        controladorEmpleado = new ControladorEmpleado(this);
        jPanelDireccionPago.setVisible(false);
    }

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
        jPanelNombreBanco = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombreBanco = new javax.swing.JTextField();
        jLabelMensaje = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTipoDeEmpleado = new javax.swing.JComboBox();
        jPanelPorcentajeComision = new javax.swing.JPanel();
        jTextFieldPorcentajeComision = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEMail = new javax.swing.JTextField();
        jPanelDireccionPago = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDireccionPago = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(vista.MainApp.class).getContext().getResourceMap(VistaRegistrarEmpleado.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(371, 400));

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

        jPanelNombreBanco.setName("jPanelNombreBanco"); // NOI18N

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jTextFieldNombreBanco.setText(resourceMap.getString("jTextFieldNombreBanco.text")); // NOI18N
        jTextFieldNombreBanco.setName("jTextFieldNombreBanco"); // NOI18N

        javax.swing.GroupLayout jPanelNombreBancoLayout = new javax.swing.GroupLayout(jPanelNombreBanco);
        jPanelNombreBanco.setLayout(jPanelNombreBancoLayout);
        jPanelNombreBancoLayout.setHorizontalGroup(
            jPanelNombreBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNombreBancoLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombreBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelNombreBancoLayout.setVerticalGroup(
            jPanelNombreBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNombreBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(jTextFieldNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelMensaje.setText(resourceMap.getString("jLabelMensaje.text")); // NOI18N
        jLabelMensaje.setName("jLabelMensaje"); // NOI18N

        jButtonRegistrar.setText(resourceMap.getString("jButtonRegistrar.text")); // NOI18N
        jButtonRegistrar.setName("jButtonRegistrar"); // NOI18N
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

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

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jComboBoxTipoDeEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Empleado fijo con comision", "Empleado fijo", "Empleado por hora" }));
        jComboBoxTipoDeEmpleado.setName("jComboBoxTipoDeEmpleado"); // NOI18N
        jComboBoxTipoDeEmpleado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mostrarPorcentajeComision(evt);
            }
        });

        jPanelPorcentajeComision.setName("jPanelPorcentajeComision"); // NOI18N

        jTextFieldPorcentajeComision.setText(resourceMap.getString("jTextFieldPorcentajeComision.text")); // NOI18N
        jTextFieldPorcentajeComision.setName("jTextFieldPorcentajeComision"); // NOI18N

        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        javax.swing.GroupLayout jPanelPorcentajeComisionLayout = new javax.swing.GroupLayout(jPanelPorcentajeComision);
        jPanelPorcentajeComision.setLayout(jPanelPorcentajeComisionLayout);
        jPanelPorcentajeComisionLayout.setHorizontalGroup(
            jPanelPorcentajeComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPorcentajeComisionLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPorcentajeComision, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanelPorcentajeComisionLayout.setVerticalGroup(
            jPanelPorcentajeComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPorcentajeComisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jTextFieldPorcentajeComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9))
        );

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jTextFieldEMail.setName("jTextFieldEMail"); // NOI18N

        jPanelDireccionPago.setName("jPanelDireccionPago"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jTextFieldDireccionPago.setText(resourceMap.getString("jTextFieldDireccionPago.text")); // NOI18N
        jTextFieldDireccionPago.setName("jTextFieldDireccionPago"); // NOI18N

        javax.swing.GroupLayout jPanelDireccionPagoLayout = new javax.swing.GroupLayout(jPanelDireccionPago);
        jPanelDireccionPago.setLayout(jPanelDireccionPagoLayout);
        jPanelDireccionPagoLayout.setHorizontalGroup(
            jPanelDireccionPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDireccionPagoLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDireccionPago, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDireccionPagoLayout.setVerticalGroup(
            jPanelDireccionPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDireccionPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jTextFieldDireccionPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        jTextFieldCi.setText(resourceMap.getString("jTextFieldCi.text")); // NOI18N
        jTextFieldCi.setName("jTextFieldCi"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMensaje)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTipoDeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(330, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelNombreBanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTelefono)
                                .addGap(45, 45, 45)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                            .addComponent(jPanelPorcentajeComision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelDireccionPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDireccion)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6))
                                            .addComponent(jTextFieldEMail, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxFormaDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRegistrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCi, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxTipoDeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanelNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDireccionPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPorcentajeComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        getAccessibleContext().setAccessibleName(resourceMap.getString("Form.AccessibleContext.accessibleName")); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarDatosExtra(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mostrarDatosExtra
        ControladorEmpleado.DatosExtras(jComboBoxFormaDePago, jPanelNombreBanco, jPanelDireccionPago);
    }//GEN-LAST:event_mostrarDatosExtra

    private void limpiarCampos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarCampos
        ControladorEmpleado.limpiarCampo(jTextFieldDireccion);
        ControladorEmpleado.limpiarCampo(jTextFieldNombre);
        ControladorEmpleado.limpiarCampo(jTextFieldEMail);
        ControladorEmpleado.limpiarCampo(jTextFieldNombreBanco);
        ControladorEmpleado.limpiarCampo(jTextFieldSueldo);
        ControladorEmpleado.limpiarCampo(jTextFieldTelefono);
    }//GEN-LAST:event_limpiarCampos
    private void ocultarVentana(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarVentana
        setVisible(false);
    }//GEN-LAST:event_ocultarVentana
    private void mostrarPorcentajeComision(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mostrarPorcentajeComision
        ControladorEmpleado.mostrarPorcentajeComision(jComboBoxTipoDeEmpleado, jPanelPorcentajeComision);
    }//GEN-LAST:event_mostrarPorcentajeComision

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        ControladorEmpleado.registrarEmpleado(jTextFieldCi, jComboBoxTipoDeEmpleado, jTextFieldNombre, jTextFieldTelefono, jTextFieldDireccion, jTextFieldEMail, jTextFieldSueldo, jComboBoxFormaDePago, jTextFieldDireccionPago, jTextFieldNombreBanco, jTextFieldPorcentajeComision);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox jComboBoxFormaDePago;
    private javax.swing.JComboBox jComboBoxTipoDeEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanelDireccionPago;
    private javax.swing.JPanel jPanelNombreBanco;
    private javax.swing.JPanel jPanelPorcentajeComision;
    private javax.swing.JTextField jTextFieldCi;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldDireccionPago;
    private javax.swing.JTextField jTextFieldEMail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombreBanco;
    private javax.swing.JTextField jTextFieldPorcentajeComision;
    private javax.swing.JTextField jTextFieldSueldo;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
