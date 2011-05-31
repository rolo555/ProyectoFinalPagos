package controlador;

import datos.EmpleadoDBHelper;
import datos.SindicatoDBHelper;
import java.util.ArrayList;
import vista.VistaAgregarAlSindicato;

/**
 *
 * @author Sanchez, Morales e Ismael
 */
public class ControladorSindicato {

    VistaAgregarAlSindicato vistaSindicato;
    SindicatoDBHelper sindicatoDBHelper = new SindicatoDBHelper();

    public ControladorSindicato(VistaAgregarAlSindicato sindicato){
        this.vistaSindicato = sindicato;
    }

    public void llenarEmpleadosSinSindicato(){
        ArrayList<String> empleadosSinSindicato = EmpleadoDBHelper.getStringEmpleadosSinSindicato();
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
