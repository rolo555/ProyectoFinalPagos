/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import modelo.Servicio;

/**
 *
 * @author HP
 */
public class Sindicato {
    float porcentajeAporteJubilacion;
   
    public static ArrayList<Servicio> getServiciosUsadosPor(String idEmpleado)
    {
        ArrayList<Servicio> servicios = new ArrayList<Servicio>();
        //llamar a DATOS
        return servicios;
    }
    public  double getCargosPorServicios(String idEmpleado)
    {
        ArrayList<Servicio> servicios = getServiciosUsadosPor(idEmpleado);
        double cargos = 0;
        for (Servicio sr:servicios) {
            cargos += sr.getMonto();
        }
        return cargos;
    }
    public float getPorcentajeAporteJubilacion()
    {
        return this.porcentajeAporteJubilacion;
    }
    
}
