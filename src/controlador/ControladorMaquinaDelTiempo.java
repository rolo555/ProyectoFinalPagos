/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.FechaDelSistemaDBHelper;
import java.util.Calendar;
import javax.swing.JComboBox;
import datos.FechaDelSistema;
import vista.MaquinaDelTiempo;

/**
 *
 * @author Rolo
 */
public class ControladorMaquinaDelTiempo {

    MaquinaDelTiempo maquinaDelTiempo;
    FechaDelSistemaDBHelper fechaHelper = new FechaDelSistemaDBHelper();

    public ControladorMaquinaDelTiempo(MaquinaDelTiempo maquinaDelTiempo) {
        this.maquinaDelTiempo = maquinaDelTiempo;
    }

    public void llenar_opciones_dias(JComboBox cbDia, int dias ){
        cbDia.removeAllItems();
        for(int i = 1; i <= dias; i++){
            cbDia.addItem( i );
        }
    }

    public void viajarEnElTiempo(int dia, int mes, int anio) {
        fechaHelper.actualizarFecha(dia, mes, anio);
    }

    public void llenarFechaActual() {
        Calendar fecha = fechaHelper.getFechaDelSistema();
        maquinaDelTiempo.setFechaActual(fecha);
    }

}
