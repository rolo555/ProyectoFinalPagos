/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import datos.EmpleadoDBHelper;
import datos.SindicatoDBHelper;
import datos.SqlConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;
import vista.VistaAgregarAlSindicato;

/**
 *
 * @author Rolo
 */
public class ControladorSindicato {

    VistaAgregarAlSindicato vistaSindicato;
    SindicatoDBHelper sindicatoDBHelper = new SindicatoDBHelper();

    public ControladorSindicato(VistaAgregarAlSindicato sindicato){
        this.vistaSindicato = sindicato;
    }

    public void llenarEmpleadosSinSindicato(){
        ArrayList<String> empleadosSinSindicato = EmpleadoDBHelper.getEmpleadosSinSindicato();
        vistaSindicato.setEmpleados(empleadosSinSindicato);
    }

    public void agregarAlSindicato(){
        int idEmpleado = vistaSindicato.getIdEmpleado();
        double porcentaje = vistaSindicato.getPorcentajeJubilacion();
        if (EmpleadoDBHelper.setAporteJubilacion(idEmpleado, porcentaje)){
            vistaSindicato.mostrarMensaje("Se agrego con exito!");
        } else {
            vistaSindicato.mostrarError("No se puedo agregar!");
        }
    }

}
