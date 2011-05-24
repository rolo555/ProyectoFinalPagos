/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.FechaDelSistemaDBHelper;
import java.util.Calendar;
import javax.swing.JComboBox;
import datos.FechaDelSistema;
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

    public void setFecha(JLabel jLabelDia, JLabel jLabelMes, JLabel jLabelAnio,Calendar fechaActual) {
        jLabelDia.setText(Integer.toString(fechaActual.get(Calendar.DAY_OF_MONTH)));
        jLabelMes.setText(Integer.toString(fechaActual.get(Calendar.MONTH)));
        jLabelAnio.setText(Integer.toString(fechaActual.get(Calendar.YEAR)));
    }

    public void viajarEnElTiempo(JComboBox jComboBoxAnio, JComboBox jComboBoxMes, JComboBox jComboBoxDia) {
        int anio = Integer.parseInt(jComboBoxAnio.getSelectedItem().toString());
        int mes = jComboBoxMes.getSelectedIndex();
        int dia = jComboBoxDia.getSelectedIndex()+1;
        viajarEnElTiempo(dia, mes, anio);
    }

    public void modificarOpcionDias(JComboBox jComboBoxAnio, JComboBox jComboBoxMes, JComboBox jComboBoxDia) {
        int anio = Integer.parseInt(jComboBoxAnio.getSelectedItem().toString());
        int mes = jComboBoxMes.getSelectedIndex();
        Calendar fecha = Calendar.getInstance();
        fecha.set(anio, mes, 5);
        int diaMaximo = fecha.getActualMaximum(Calendar.DAY_OF_MONTH);
        llenar_opciones_dias(jComboBoxDia, diaMaximo);
    }

}
