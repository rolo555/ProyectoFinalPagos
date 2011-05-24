/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.EmpleadoDBHelper;
import datos.ServicioDBHelper;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.Servicio;
import vista.VistaServicio;

/**
 *
 * @author Rolo
 */
public class ControladorServicio {
    
    VistaServicio vistaServicio;

    public ControladorServicio(VistaServicio servicio) {
        this.vistaServicio = servicio;
    }

    public void modificar_opciones_dias() {
        int mes = vistaServicio.getMes();
        int anio = vistaServicio.getAnio();
        Calendar fecha = Calendar.getInstance();
        fecha.set(anio, mes, 5);
        int diaMaximo = fecha.getActualMaximum(Calendar.DAY_OF_MONTH);
        vistaServicio.llenar_opciones_dias(diaMaximo);
    }

    public void llenarEmpleadosDelSindicato() {
        ArrayList<String> empleadosDelSindicato = EmpleadoDBHelper.getEmpleadosDelSindicato();
        vistaServicio.setEmpleados(empleadosDelSindicato);
    }

    public void agregarServicio() {
        Servicio nuevoServicio;
        int idEmpleado = vistaServicio.getIdEmpleados();
        String descripcion = vistaServicio.getConcepto();
        Double monto = vistaServicio.getMonto();
        Calendar fecha = vistaServicio.getFecha();
        nuevoServicio = new Servicio(idEmpleado, descripcion, monto, fecha);
        ServicioDBHelper.guardarServicio(nuevoServicio);
    }
}
