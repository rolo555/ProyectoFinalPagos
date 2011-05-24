/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.SindicatoDBHelper;
import datos.SqlConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;
import vista.Sindicato;

/**
 *
 * @author Rolo
 */
public class ControladorSindicato {

    Sindicato sindicato;
    SindicatoDBHelper sindicatoDBHelper = new SindicatoDBHelper();

    public ControladorSindicato(Sindicato sindicato){
        this.sindicato = sindicato;
    }

    public void llenarEmpleadosSinSindicato(){
        ArrayList<String> empleadosSinSindicato = sindicatoDBHelper.getEmpleadosSinSindicato();
        sindicato.setEmpleados(empleadosSinSindicato);
    }

}
