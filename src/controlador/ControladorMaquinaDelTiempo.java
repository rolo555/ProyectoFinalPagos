/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.Calendar;
import javax.swing.JComboBox;
import modelo.FechaDelSistema;

/**
 *
 * @author Rolo
 */
public class ControladorMaquinaDelTiempo {

    public void llenar_opciones_dias(JComboBox cbDia, int dias ){
        cbDia.removeAllItems();
        for(int i = 1; i <= dias; i++){
            cbDia.addItem( i );
        }
    }

    public Calendar getFechaDelSistema(){
        return FechaDelSistema.getFechaDelSistema();
    }

    public void viajarEnElTiempo(int dia, int mes, int anio) {
        FechaDelSistema.actualizarFecha(dia, mes, anio);
    }

}
