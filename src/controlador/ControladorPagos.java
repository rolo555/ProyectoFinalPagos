/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.FechaDelSistemaDBHelper;
import java.util.Calendar;
import modelo.Pagos;
import modelo.FechaDelSistema;
import vista.VistaPagos;

/**
 *
 * @author Rolo
 */
public class ControladorPagos {

    VistaPagos vistaPagos;
    FechaDelSistema fechaDelSistema;

    public ControladorPagos(VistaPagos vistaPagos) {
        this.vistaPagos = vistaPagos;
    }

    public void realizarPagos() {
        Calendar fechaActual = FechaDelSistemaDBHelper.getFechaDelSistema();
        fechaDelSistema = new FechaDelSistema(fechaActual);
        Calendar fechaInicio = fechaActual;
        fechaInicio.add(Calendar.DATE, -5);
        if (fechaDelSistema.esViernes()) {
            Pagos.pagarEmpleadosPorHora(fechaInicio, fechaActual);
        }
    }

}
