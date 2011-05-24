/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.ServicioDBHelper;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.Servicio;

/**
 *
 * @author HP
 */
public class Sindicato {
   
    public static ArrayList<Servicio> getServiciosUsadosPor(int idEmpleado)
    {
        Calendar fechaActual = Calendar.getInstance();
        return ServicioDBHelper.getServicios(fechaActual, idEmpleado);
    }
    public double getCargosPorServicios(int idEmpleado)
    {
        ArrayList<Servicio> servicios = getServiciosUsadosPor(idEmpleado);
        double cargos = 0;
        for (Servicio sr:servicios) {
            cargos += sr.getMonto();
        }
        return cargos;
    }
}
