/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorEmpleado;
import datos.EmpleadoDBHelper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Pagos {
    static Sindicato sindicato = new Sindicato();
    public static ArrayList<Empleado> getEmpleadosFijos(){
        return EmpleadoDBHelper.getEmpleadosFijo();
    }

    private static ArrayList<Empleado> getEmpleadosPorHora() {
         return EmpleadoDBHelper.getEmpleadosPorHora();
    }

    private static ArrayList<EmpleadoFijo> getEmpleadosConComision() {
       return EmpleadoDBHelper.getEmpleadosConComision();
    }

    private static ArrayList<Empleado> getEmpleadosFijo() {
       return EmpleadoDBHelper.getEmpleadosFijo();
    }

    public static void pagarFijos(Calendar fechaInicio, Calendar fechaFin)
    {
        ArrayList<Empleado> empleadosFijos = getEmpleadosFijos();
        pagarAEmpleados(fechaInicio, fechaFin, empleadosFijos);
    }
    public static void pagarEmpleadosPorHora(Calendar fechaInicio, Calendar fechaFin)
    {
        ArrayList<Empleado> empleados = getEmpleadosPorHora();
        pagarAEmpleados(fechaInicio, fechaFin, empleados);
    }
    public static void pagarAEmpleados(Calendar fechaInicio, Calendar fechaFin, ArrayList<Empleado> empleados)
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
            formaDePago.pagar(papeleta, empleadoAux.getDireccionDePago(),empleadoAux.getEmail());
        }
    }
    public static void pagarComisiones(Calendar fechaInicio, Calendar fechaFin)
    {
        ArrayList<EmpleadoFijo> empleados = getEmpleadosConComision();
         for (int i = 0; i < empleados.size(); i++) {
            
            EmpleadoFijo empleadoAux = empleados.get(i);
            Comision comisionEmpleadoAux = new Comision(empleadoAux.getIdEmpleado(), empleadoAux.getPorcentajeComision());
            double sueldoBruto = comisionEmpleadoAux.getComision(fechaInicio, fechaFin);
            PapeletaDePago papeleta = new PapeletaDePago(empleadoAux.getIdEmpleado(),fechaInicio,fechaFin,sueldoBruto);
            FormaDePago formaDePago = FormaDePago.factoryformaDePago(empleadoAux.getFormaDePago());
            formaDePago.pagar(papeleta, empleadoAux.getDireccionDePago(),empleadoAux.getEmail());
        }
    }
}
