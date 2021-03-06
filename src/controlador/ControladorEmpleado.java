package controlador;

import datos.RegistroEmpleadoDBHelper;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.Empleado;
import vista.VistaRegistrarEmpleado;

/**
 *
 * @author Sanchez, Morales e Ismael
 */
public class ControladorEmpleado {

    VistaRegistrarEmpleado registroEmpleado;

    public ControladorEmpleado(VistaRegistrarEmpleado registroEmpleado) {
        this.registroEmpleado = registroEmpleado;
    }

    public static void DatosExtras(JComboBox jComboBoxFormaDePago, JPanel jPanelNombreBanco, JPanel jPanelDireccionPago) {
        String formaDePago = jComboBoxFormaDePago.getSelectedItem().toString();

        if (formaDePago.equals("A banco")) {
            jPanelNombreBanco.setVisible(true);
            jPanelDireccionPago.setVisible(false);
        } else if (formaDePago.equals("A direccion")) {
            jPanelNombreBanco.setVisible(false);
            jPanelDireccionPago.setVisible(true);
        } else {
            jPanelDireccionPago.setVisible(false);
            jPanelNombreBanco.setVisible(false);
        }
    }

    public static void mostrarPorcentajeComision(JComboBox jComboBoxTipoDeEmpleado, JPanel jPanelPorcentajeComision) {
        if (jComboBoxTipoDeEmpleado.getSelectedItem().toString().equals("Empleado fijo con comision")) {
            jPanelPorcentajeComision.setVisible(true);
        } else {
            jPanelPorcentajeComision.setVisible(false);
        }
    }

    public static void registrarEmpleado(JTextField jTextFieldCi, JComboBox jComboBoxTipoDeEmpleado, JTextField jTextFieldNombre, JTextField jTextFieldTelefono, JTextField jTextFieldDireccion, JTextField jTextFieldEMail, JTextField jTextFieldSueldo, JComboBox jComboBoxFormaDePago, JTextField jTextFieldDireccionPago, JTextField jTextFieldNombreBanco, JTextField jTextFieldPorcentajeComision) {

        String tipoEmpleado = jComboBoxTipoDeEmpleado.getSelectedItem().toString();
        String nombreCompleto = jTextFieldNombre.getText();
        int idEmpleado = Integer.parseInt(jTextFieldCi.getText());
        int telefono = Integer.parseInt(jTextFieldTelefono.getText());
        String direccion = jTextFieldDireccion.getText();
        String correo = jTextFieldEMail.getText();
        double sueldoFijo = Double.parseDouble(jTextFieldSueldo.getText());
        String formaDePago = jComboBoxFormaDePago.getSelectedItem().toString();
        String direccionPago = jTextFieldDireccionPago.getText();
        String banco = jTextFieldNombreBanco.getText();
        double porcentajeComision;

        String destinoPago = "";
        if (formaDePago.equals("A direccion")) {
            destinoPago = direccionPago;
        }
        if (formaDePago.equals("A banco")) {
            destinoPago = banco;
        }
        if (formaDePago.equalsIgnoreCase("A recursos humanos")) {
            destinoPago = "recursos humanos";
            Double d = 1.1;
        }
        if (jTextFieldPorcentajeComision.getText().equals("")) {
            porcentajeComision = -1;
        } else {
            porcentajeComision = Double.parseDouble(jTextFieldPorcentajeComision.getText());
        }
        RegistroEmpleadoDBHelper.registrarEmpleado(idEmpleado, tipoEmpleado, nombreCompleto, telefono, direccion, correo, sueldoFijo, formaDePago, destinoPago, porcentajeComision);

    }

    public static void limpiarCampo(JTextField campo) {
        campo.setText("");
    }

}
