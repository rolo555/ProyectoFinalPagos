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

    VistaAgregarAlSindicato sindicato;
    SindicatoDBHelper sindicatoDBHelper = new SindicatoDBHelper();

    public ControladorSindicato(VistaAgregarAlSindicato sindicato){
        this.sindicato = sindicato;
    }

    public void llenarEmpleadosSinSindicato(){
        ArrayList<String> empleadosSinSindicato = EmpleadoDBHelper.getEmpleadosSinSindicato();
        sindicato.setEmpleados(empleadosSinSindicato);
    }

    public void agregarAlSindicato(){
        int idEmpleado = sindicato.getIdEmpleado();
        double porcentaje = sindicato.getPorcentajeJubilacion();
        if (EmpleadoDBHelper.setAporteJubilacion(idEmpleado, porcentaje)){
            sindicato.mostrarMensaje("Se agrego con exito!");
        } else {
            sindicato.mostrarError("No se puedo agregar!");
        }
    }

}
