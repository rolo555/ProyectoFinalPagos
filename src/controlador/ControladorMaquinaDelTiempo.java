/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.FechaDelSistemaDBHelper;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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

    public void viajarEnElTiempo(int dia, int mes, int anio) {
        FechaDelSistemaDBHelper.actualizarFecha(dia, mes, anio);
    }

    public void llenarFechaActual() {
        Calendar fecha = fechaHelper.getFechaDelSistema();
        maquinaDelTiempo.setFechaActual(fecha);
    }

    public void setFecha(JLabel jLabelDia, JLabel jLabelMes, JLabel jLabelAnio,Calendar fechaActual) {
        int mes = fechaActual.get(Calendar.MONTH);
        jLabelDia.setText(Integer.toString(fechaActual.get(Calendar.DAY_OF_MONTH)));
        jLabelMes.setText(String.valueOf(mes + 1));
        jLabelAnio.setText(Integer.toString(fechaActual.get(Calendar.YEAR)));
    }

    public void viajarEnElTiempo(JComboBox jComboBoxAnio, JComboBox jComboBoxMes, JComboBox jComboBoxDia) {
        int anio = Integer.parseInt(jComboBoxAnio.getSelectedItem().toString());
        int mes = jComboBoxMes.getSelectedIndex();
        int dia = jComboBoxDia.getSelectedIndex()+1;
        viajarEnElTiempo(dia, mes, anio);
    }

}
