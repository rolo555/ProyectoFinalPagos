/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.util.Calendar;
import vista.Servicio;

/**
 *
 * @author Rolo
 */
public class ControladorServicio {
    
    Servicio servicio;

    public ControladorServicio(Servicio servicio) {
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

}
