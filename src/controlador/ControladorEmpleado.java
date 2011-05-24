/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.RegistroEmpleadoDBHelper;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.Empleado;
import vista.RegistrarEmpleado;

/**
 *
 * @author HP
 */
public class ControladorEmpleado {

    RegistrarEmpleado registroEmpleado;
    //RegistroEmpleadoDBHelper registroHelper = new RegistroEmpleadoDBHelper();


    public ControladorEmpleado(RegistrarEmpleado registroEmpleado){
        this.registroEmpleado=registroEmpleado;
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
        }
        else {
            jPanelPorcentajeComision.setVisible(false);
        }
    }

    public static String registrarEmpleado(JTextField jTextFieldCi, JComboBox jComboBoxTipoDeEmpleado, JTextField jTextFieldNombre, JTextField jTextFieldTelefono, JTextField jTextFieldDireccion, JTextField jTextFieldEMail, JTextField jTextFieldSueldo, JComboBox jComboBoxFormaDePago) {

        //Empleado empleado = Empleado.FactoryEmpleado(tipoEmpleado);

        String tipoEmpleado= jComboBoxTipoDeEmpleado.getSelectedItem().toString();
        String nombreCompleto = jTextFieldNombre.getText();
        int idEmpleado = Integer.parseInt(jTextFieldCi.getText());
        int telefono = Integer.parseInt(jTextFieldTelefono.getText());
        String direccion = jTextFieldDireccion.getText();
        String correo = jTextFieldEMail.getText();
        double sueldoFijo = Double.parseDouble(jTextFieldSueldo.getText());
        String formaDePago = jComboBoxFormaDePago.getSelectedItem().toString();
        String mensaje = RegistroEmpleadoDBHelper.registrarEmpleado(idEmpleado, tipoEmpleado, nombreCompleto, telefono, direccion, correo,sueldoFijo, formaDePago);
        return mensaje;

    }


    public static String validarDatos(String tipoEmpleado, String nombreCompleto, int telefono, String direccion, String correo, double sueldoFijo, String formaDePago)
    {
        String mensaje = "";
        if (!(tipoEmpleado.equals(Empleado.EmpleadoFijo)||tipoEmpleado.equals(Empleado.EmpleadoPorHora))) {
            mensaje += "Tipo de empleado incorrecto. \n";
        }
        if (nombreCompleto.isEmpty()){
            mensaje += "El nombre de empleado no puede ser vacio \n";
        }
        return mensaje;
    }

    public static void limpiarCampo(JTextField campo){
        campo.setText("");
    }

    public static void mostrarMensaje(JLabel etiqueta,String mensaje,Color color){
        etiqueta.setForeground(color);
        etiqueta.setText(mensaje);
    }
}
