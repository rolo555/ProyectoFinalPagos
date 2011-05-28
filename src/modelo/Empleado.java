/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.EmpleadoDBHelper;
import java.util.Calendar;

/**
 *
 * @author HP
 */
public abstract class Empleado {

    public int idEmpleado;
    public String nombreCompleto;
    public int telefono;
    public String direccion;
    public double aporteJubilacion = -1;
    public double sueldoFijo;
    public String formaDePago;
    public String correoElectronico;
    public String direccionDePago;
    public static String EmpleadoConComision = "Empleado fijo con comision";
    public static String EmpleadoPorHora = "Empleado por hora";
    public static String EmpleadoFijo = "Empleado fijo";

    public void setArgumentosDeEmpleado(int idEmpleado, String nombreCompleto, int telefono, String direccion, String correo, double sueldoFijo, String formaDePago, String direccionDePago, double aporteJubilacion) {
        this.idEmpleado = idEmpleado;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sueldoFijo = sueldoFijo;
        this.formaDePago = formaDePago;
        this.correoElectronico = correo;
        this.direccionDePago = direccionDePago;
        this.aporteJubilacion = aporteJubilacion;
    }

    public static Empleado FactoryEmpleado(String tipoEmpleado, double porcentajeComision) {
        Empleado empleado = null;
        if (tipoEmpleado.equals(EmpleadoPorHora)) {
            empleado = new EmpleadoPorHoras();
        }
        if (tipoEmpleado.equals(EmpleadoFijo) || tipoEmpleado.equals(EmpleadoConComision)) {
            empleado = new EmpleadoFijo(porcentajeComision);
        }
        return empleado;
    }

    public Double getSueldoFijo() {
        return this.sueldoFijo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public abstract double getSueldo(Calendar fechaInicio, Calendar fechaFin);

    String getFormaDePago() {
        return formaDePago;
    }

    boolean perteneceAlSindicato() {
        return aporteJubilacion != -1;
    }

    double getAporteJubilacion() {
        return aporteJubilacion;
    }

    public String getNombre() {
        return nombreCompleto;
    }

    public void setId(int nuevoId) {
        this.idEmpleado = nuevoId;
    }

    public void setNombre(String nuevoNombre) {
        this.nombreCompleto = nuevoNombre;
    }
    public String getDireccionDePago()
    {
        return this.direccionDePago;
    }

    public String getEmail() {
        return this.correoElectronico;
    }

    public void setAporteJubilacion(double aporteJubilacion){
        this.aporteJubilacion = aporteJubilacion;
    }
}
