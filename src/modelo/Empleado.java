/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author HP
 */
public abstract class Empleado {
    protected String idEmpleado;
    protected String nombreCompleto;
    protected int telefono;
    protected String direccion;
    protected double aporteJubilacion=-1;
    protected double sueldoFijo;
    protected String formaDePago;

    public void setArgumentosDeEmpleado(String idEmpleado, String nombreCompleto, int telefono,String direccion, double sueldoFijo, String formaDePago )
    {
        this.idEmpleado = idEmpleado;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sueldoFijo = sueldoFijo;
        this.formaDePago = formaDePago;
    }
    public void agregarAlSindicato(double aporteJubilacion)
    {
        this.aporteJubilacion = aporteJubilacion;
    }

    public Double getSueldoFijo() {
        return this.sueldoFijo;
    }
    String getIdEmpleado() {
        return idEmpleado;
    }
    public abstract double getSueldo(Calendar fechaInicio, Calendar fechaFin);

    String getFormaDePago() {
        return formaDePago;
    }

    boolean perteneceAlSindicato() {
        return aporteJubilacion==-1;
    }

    double getAporteJubilacion() {
       return aporteJubilacion;
    }

}
