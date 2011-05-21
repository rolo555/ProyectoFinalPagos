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
    private ArrayList<Empleado> empleadosFijos;
    private ArrayList<Empleado> empleadosPorHora;
    private ArrayList<Comision> empleadosConComision;
    Sindicato sindicato = new Sindicato();
    public void pagarAEmpleadosFijos(Calendar fecha)
    {
        for (int i = 0; i < empleadosFijos.size(); i++) {

            Empleado empleado = empleadosFijos.get(i);
            PapeletaDePago papeleta;
            double sueldo = empleado.getSueldo(fecha);
            if (empleado.perteneceAlSindicato()) {
                double cargos = sindicato.getCargosPorServicios(empleado.getIdEmpleado());
                double aporte = empleado.getAporteJubilacion();
                double montoPagado = sueldo - aporte - cargos;
                papeleta = new PapeletaDePago(empleado.getIdEmpleado(), fecha, sueldo, montoPagado, aporte, cargos);
            }
            else
            {
                papeleta = new PapeletaDePago(empleado.getIdEmpleado(), fecha, sueldo);
            }
            String formaDePagoString = empleado.getFormaDePago();
            FormaDePago formaDePago = FormaDePago.factoryformaDePago(formaDePagoString);
            formaDePago.pagar(papeleta);
        }
    }
     public void pagarComisiones(Calendar fecha)
    {
        for (int i = 0; i < empleadosConComision.size(); i++) {

            Empleado empleado = empleadosConComision.get(i);
            PapeletaDePago papeleta;
            double sueldo = empleado.getSueldo(fecha);
            if (empleado.perteneceAlSindicato()) {
                double aporte = sindicato.getCargosPorServicios(empleado.getIdEmpleado());
                double montoPagado = sueldo - aporte;
                papeleta = new PapeletaDePago(empleado.getIdEmpleado(), fecha, sueldo, montoPagado);
            }
            else
            {
                papeleta = new PapeletaDePago(empleado.getIdEmpleado(), fecha, sueldo);
            }
            String formaDePagoString = empleado.getFormaDePago();
            FormaDePago formaDePago = FormaDePago.factoryformaDePago(formaDePagoString);
            formaDePago.pagar(papeleta);
        }
    }
    
}
