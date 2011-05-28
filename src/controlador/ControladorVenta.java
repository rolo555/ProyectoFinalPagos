/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.EmpleadoDBHelper;
import datos.VentasDBHelper;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JComboBox;
import modelo.Venta;
import vista.VistaVenta;

/**
 *
 * @author Rolo
 */
public class ControladorVenta {

    VistaVenta vistaVenta;

    public ControladorVenta(VistaVenta vistaVenta) {
        this.vistaVenta = vistaVenta;
    }

    public void agregarVenta() {
        Venta nuevaVenta;
        int idEmpleado = vistaVenta.getIdEmpleado();
        Calendar fecha = vistaVenta.getFecha();
        double monto = vistaVenta.getMonto();
        nuevaVenta = new Venta(fecha, monto, idEmpleado);
        VentasDBHelper.guardarVenta(nuevaVenta);
    }

    public void llenarEmpleadosConComision(JComboBox jComboBoxEmpleados) {
        ArrayList<String> empleadoConComicion = EmpleadoDBHelper.getStringEmpleadosConComision();
        jComboBoxEmpleados.removeAllItems();
        for (String empleado : empleadoConComicion) {
            jComboBoxEmpleados.addItem(empleado);
        }
    }
}
