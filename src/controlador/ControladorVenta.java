/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.EmpleadoDBHelper;
import datos.VentasDBHelper;
import java.util.ArrayList;
import java.util.Calendar;
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

    public void modificar_opciones_dias() {
        int mes = vistaVenta.getMes();
        int anio = vistaVenta.getAnio();
        Calendar fecha = Calendar.getInstance();
        fecha.set(anio, mes, 5);
        int diaMaximo = fecha.getActualMaximum(Calendar.DAY_OF_MONTH);
        vistaVenta.llenar_opciones_dias(diaMaximo);
    }

    public void llenarEmpleadosConComision() {
        ArrayList<String> empleadoConComicion = EmpleadoDBHelper.getStringEmpleadosConComision();
        vistaVenta.setEmpleados(empleadoConComicion);
    }

    public void agregarVenta() {
        Venta nuevaVenta;
        int idEmpleado = vistaVenta.getIdEmpleado();
        Calendar fecha = vistaVenta.getFecha();
        double monto = vistaVenta.getMonto();
        nuevaVenta = new Venta(fecha, monto, idEmpleado);
        VentasDBHelper.guardarVenta(nuevaVenta);
    }
}
