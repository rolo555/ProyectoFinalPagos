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
    public ArrayList<Empleado> getEmpleadosFijos(){
        ArrayList<Empleado> empleadosFijos = new ArrayList<Empleado>();
        //consultar a dal
        return empleadosFijos;
    }

    private ArrayList<Empleado> getEmpleadosPorHora() {
         ArrayList<Empleado> empleadosPorHora = new ArrayList<Empleado>();
       //consultar a dal
         return empleadosPorHora;
    }

    private ArrayList<EmpleadoFijo> getEmpleadosConComision() {
       ArrayList<EmpleadoFijo> empleadosConComision = new ArrayList<EmpleadoFijo>();
       //consultar a dal
       return empleadosConComision;
    }
    public void pagarFijos(Calendar fechaInicio, Calendar fechaFin)
    {
        ArrayList<Empleado> empleadosFijos = getEmpleadosFijos();
        pagarAEmpleados(fechaInicio, fechaFin, empleadosFijos);
    }
    public void pagarEmpleadosPorHora(Calendar fechaInicio, Calendar fechaFin)
    {
        ArrayList<Empleado> empleadosFijos = getEmpleadosPorHora();
        pagarAEmpleados(fechaInicio, fechaFin, empleadosFijos);
    }
    public void pagarAEmpleados(Calendar fechaInicio, Calendar fechaFin, ArrayList<Empleado> empleados)
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
    public void pagarComisiones(Calendar fechaInicio, Calendar fechaFin)
    {
        ArrayList<EmpleadoFijo> empleados = getEmpleadosConComision();
         for (int i = 0; i < empleados.size(); i++) {
            
            EmpleadoFijo empleadoAux = empleados.get(i);
            Comision comisionEmpleadoAux = new Comision(empleadoAux.getIdEmpleado(), empleadoAux.getPorcentajeComision());
            double sueldoBruto = comisionEmpleadoAux.getComision(fechaInicio, fechaFin);
            PapeletaDePago papeleta = new PapeletaDePago(empleadoAux.getIdEmpleado(),fechaInicio,fechaFin,sueldoBruto);
            FormaDePago formaDePago = FormaDePago.factoryformaDePago(empleadoAux.getFormaDePago());
            formaDePago.pagar(papeleta);
        }
    }
}
