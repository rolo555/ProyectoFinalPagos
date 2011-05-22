/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import javax.swing.JComboBox;

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
}
