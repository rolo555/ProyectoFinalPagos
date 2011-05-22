/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author HP
 */
public class ControladorDePagos {
    Sindicato sindicato = new Sindicato();
    public ArrayList<Empleado> getEmpleadosFijos()
    {
        ArrayList<Empleado> empleadosFijos = new ArrayList<Empleado>();
        //consultar a dal
        return empleadosFijos;
    }
    private ArrayList<Empleado> getEmpleadosPorHora() {
         ArrayList<Empleado> empleadosPorHora = new ArrayList<Empleado>();
       //consultar a dal
         return empleadosPorHora;
    }
    public void pagarFijos(Calendar fechaInicio, Calendar fechaFin)
    {
        ArrayList<Empleado> empleadosFijos = getEmpleadosFijos();
        pagarAEmpleadosFijos(fechaInicio, fechaFin, empleadosFijos);
    }
    public void pagarEmpleadosPorHora(Calendar fechaInicio, Calendar fechaFin)
    {
        ArrayList<Empleado> empleadosFijos = getEmpleadosPorHora();
        pagarAEmpleadosFijos(fechaInicio, fechaFin, empleadosFijos);
    }
    public void pagarAEmpleadosFijos(Calendar fechaInicio, Calendar fechaFin, ArrayList<Empleado> empleados)
    {
        for (int i = 0; i < empleados.size(); i++) {
            PapeletaDePago papeleta;
            Empleado empleadoAux=empleados.get(i);
            double sueldoBruto = empleadoAux.getSueldo(fechaInicio, fechaFin);
            if (empleadoAux.perteneceAlSindicato()) {
                double aporte = empleadoAux.getAporteJubilacion();
                double cargosPorServicio = sindicato.getCargosPorServicios(empleadoAux.getIdEmpleado());
                papeleta = new PapeletaDePago(empleadoAux.getIdEmpleado(),fechaInicio,fechaFin,sueldoBruto, aporte, cargosPorServicio);
            }
            else
            {
                papeleta = new PapeletaDePago(empleadoAux.getIdEmpleado(),fechaInicio,fechaFin,sueldoBruto);
            }
            FormaDePago formaDePago = FormaDePago.factoryformaDePago(empleadoAux.getFormaDePago());
            formaDePago.pagar(papeleta);
        }
    }

}
