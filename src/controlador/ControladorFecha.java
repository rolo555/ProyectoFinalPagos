/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.Calendar;
import javax.swing.JComboBox;

/**
 *
 * @author Rolo
 */
public class ControladorFecha {

    public void llenar_opciones_dias(JComboBox CBDia, int dias ){
        CBDia.removeAllItems();
        for(int i = 1; i <= dias; i++){
            CBDia.addItem( i );
        }
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
