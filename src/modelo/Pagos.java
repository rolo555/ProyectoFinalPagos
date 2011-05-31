package modelo;

import datos.EmpleadoDBHelper;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Sanchez, Morales e Ismael
 */
public class Pagos {

    static Sindicato sindicato = new Sindicato();

    public static ArrayList<Empleado> getEmpleadosFijos() {
        return EmpleadoDBHelper.getEmpleadosFijo();
    }

    private static ArrayList<Empleado> getEmpleadosPorHora() {
        return EmpleadoDBHelper.getEmpleadosPorHora();
    }

    private static ArrayList<EmpleadoFijo> getEmpleadosFijosConComision() {
        return EmpleadoDBHelper.getEmpleadosFijosConComision();
    }

    private static ArrayList<Empleado> getEmpleadosConComision() {
        return EmpleadoDBHelper.getEmpleadosConComision();
    }

    public static ArrayList<PapeletaDePago> pagarFijos(Calendar fechaInicio, Calendar fechaFin) {
        ArrayList<Empleado> empleadosFijos = getEmpleadosFijos();
        return pagarAEmpleados(fechaInicio, fechaFin, empleadosFijos);
    }

    public static ArrayList<PapeletaDePago> pagarEmpleadosPorHora(Calendar fechaInicio, Calendar fechaFin) {
        ArrayList<Empleado> empleados = getEmpleadosPorHora();
        return pagarAEmpleados(fechaInicio, fechaFin, empleados);
    }

    public static ArrayList<PapeletaDePago> pagarAEmpleados(Calendar fechaInicio, Calendar fechaFin, ArrayList<Empleado> empleados) {
        ArrayList<PapeletaDePago> papeletasDePago = new ArrayList<PapeletaDePago>();
        for (int i = 0; i < empleados.size(); i++) {
            PapeletaDePago papeleta;
            Empleado empleadoAux = empleados.get(i);
            double sueldoBruto = empleadoAux.getSueldo(fechaInicio, fechaFin);
            if (sueldoBruto > 0) {
                if (empleadoAux.perteneceAlSindicato()) {
                    double aporte = empleadoAux.getAporteJubilacion();
                    double cargosPorServicio = sindicato.getCargosPorServicios(empleadoAux.getIdEmpleado());
                    papeleta = new PapeletaDePago(empleadoAux.getIdEmpleado(), fechaInicio, fechaFin, sueldoBruto, aporte, cargosPorServicio);
                } else {
                    papeleta = new PapeletaDePago(empleadoAux.getIdEmpleado(), fechaInicio, fechaFin, sueldoBruto);
                }
                papeletasDePago.add(papeleta);
                FormaDePago formaDePago = FormaDePago.factoryformaDePago(empleadoAux.getFormaDePago());
                formaDePago.pagar(papeleta, empleadoAux.getDireccionDePago(), empleadoAux.getEmail());
            }
        }
        return papeletasDePago;
    }

    public static ArrayList<PapeletaDePago> pagarComisiones(Calendar fechaInicio, Calendar fechaFin) {
        ArrayList<PapeletaDePago> papeletasDePago = new ArrayList<PapeletaDePago>();
        ArrayList<EmpleadoFijo> empleados = getEmpleadosFijosConComision();
        for (int i = 0; i < empleados.size(); i++) {
            EmpleadoFijo empleadoAux = empleados.get(i);
            Comision comisionEmpleadoAux = new Comision(empleadoAux.getIdEmpleado(), empleadoAux.getPorcentajeComision());
            double sueldoBruto = comisionEmpleadoAux.getComision(fechaInicio, fechaFin);
            if (sueldoBruto > 0) {
                PapeletaDePago papeleta = new PapeletaDePago(empleadoAux.getIdEmpleado(), fechaInicio, fechaFin, sueldoBruto);
                FormaDePago formaDePago = FormaDePago.factoryformaDePago(empleadoAux.getFormaDePago());
                formaDePago.pagar(papeleta, empleadoAux.getDireccionDePago(), empleadoAux.getEmail());
                papeletasDePago.add(papeleta);
            }
        }
        return papeletasDePago;
    }
}
