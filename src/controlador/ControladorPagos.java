/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.FechaDelSistemaDBHelper;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
        Calendar fechaInicio = new GregorianCalendar();
        fechaInicio.setTimeInMillis(fechaActual.getTimeInMillis());
        fechaInicio.add(Calendar.DATE, -5);
        if (fechaDelSistema.esViernes()) {
            Pagos.pagarEmpleadosPorHora(fechaInicio, fechaActual);
        }
        if ( fechaDelSistema.esUltimoDiaDelMes()){
            Pagos.pagarFijos(fechaInicio, fechaInicio);
        }
        if (fechaDelSistema.esViernesPar()){
            Pagos.pagarComisiones(fechaInicio, fechaInicio);
        }
    }

}
