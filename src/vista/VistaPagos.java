package vista;

import controlador.ControladorPagos;
import datos.EmpleadoDBHelper;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JTable;
import modelo.PapeletaDePago;

/**
 *
 * @author Sanchez, Morales e Ismael
 */
public class VistaPagos extends javax.swing.JInternalFrame {

    ControladorPagos controladorPagos;
    private String[] nombresColumnas = {"Nombre", "Sueldo bruto", "Sueldo liquido", "Aporte jubilacion", "Descuento servicios", "Fecha inicio", "Fecha fin"};
    private Object[][] datos = {{"","","","","","",""}};
    private ArrayList<PapeletaDePago> papeletas = new ArrayList<PapeletaDePago>();

    public VistaPagos() throws PrinterException {
        initComponents();
        cargarNombresTabla();
        controladorPagos = new ControladorPagos(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonPagar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePagos = new javax.swing.JTable();
        jButtonSalir = new javax.swing.JButton();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(vista.MainApp.class).getContext().getResourceMap(VistaPagos.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jButtonPagar.setFont(resourceMap.getFont("jButtonPagar.font")); // NOI18N
        jButtonPagar.setText(resourceMap.getString("jButtonPagar.text")); // NOI18N
        jButtonPagar.setName("jButtonPagar"); // NOI18N
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel1.border.title"))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTablePagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePagos.setName("jTablePagos"); // NOI18N
        jScrollPane1.setViewportView(jTablePagos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSalir.setText(resourceMap.getString("jButtonSalir.text")); // NOI18N
        jButtonSalir.setName("jButtonSalir"); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButtonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(498, 498, 498)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSalir)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed
        papeletas.clear();
        papeletas = controladorPagos.realizarPagos();
        cargarTabla();
    }//GEN-LAST:event_jButtonPagarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePagos;
    // End of variables declaration//GEN-END:variables

    private void cargarNombresTabla() {
        jTablePagos = new JTable(datos, nombresColumnas);
        jScrollPane1.setViewportView(jTablePagos);
    }

    private void cargarTabla() {
        datos = new Object[papeletas.size()][];
        for(int i = 0; i < papeletas.size(); i++){
            PapeletaDePago papeleta = papeletas.get(i);
            datos[i] = new Object[7];
            datos[i][0]=EmpleadoDBHelper.getNombreEmpleado(papeleta.idEmpleado);
            datos[i][1]=papeleta.sueldoBruto;
            datos[i][2]=papeleta.sueldoLiquido;
            if( papeleta.AporteJubilacion < 0 ){
                datos[i][3]=0.0;
            } else {
                datos[i][3]=papeleta.AporteJubilacion;
            }
            datos[i][4]=papeleta.descuentoPorServicios;
            datos[i][5]=papeleta.fechaInicio.get(Calendar.DAY_OF_MONTH) + "\\"+papeleta.fechaInicio.get(Calendar.MONTH)+ "\\"+papeleta.fechaInicio.get(Calendar.YEAR);
            datos[i][6]=papeleta.fechaFin.get(Calendar.DAY_OF_MONTH) + "\\"+papeleta.fechaFin.get(Calendar.MONTH)+ "\\"+papeleta.fechaFin.get(Calendar.YEAR);
        }
        jTablePagos = new JTable(datos, nombresColumnas);
        jScrollPane1.setViewportView(jTablePagos);
    }
}
