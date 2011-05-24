/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.util.ArrayList;
import java.util.Calendar;
import modelo.Servicio;
import vista.VistaServicio;

/**
 *
 * @author Rolo
 */
public class ControladorServicio {
    
    VistaServicio servicio;

    public ControladorServicio(VistaServicio servicio) {
        this.servicio = servicio;
    }

    public void modificar_opciones_dias() {
        int mes = servicio.getMes();
        int anio = servicio.getAnio();
        Calendar fecha = Calendar.getInstance();
        fecha.set(anio, mes, 5);
        int diaMaximo = fecha.getActualMaximum(Calendar.DAY_OF_MONTH);
        servicio.llenar_opciones_dias(diaMaximo);
    }

    public void llenarEmpleadosDelSindicato() {
        ArrayList<String> empleadosDelSindicato = EmpleadoDBHelper.getEmpleadosDelSindicato();
        servicio.setEmpleados(empleadosDelSindicato);
    }

    public void agregarServicio() {
        Servicio nuevoServicio;
        int idEmpleado = servicio.getIdEmpleado();
        String descripcion = servicio.getConcepto();
        Double monto = servicio.getMonto();
        Calendar fecha = servicio.getFecha();
        nuevoServicio = new Servicio(idEmpleado, descripcion, monto, fecha);
        ServicioDBHelper.guardarServicio(nuevoServicio);
    }
}
