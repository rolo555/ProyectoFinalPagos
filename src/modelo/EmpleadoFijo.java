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
public class EmpleadoFijo extends Empleado {

    private double porcentajeComision = -1;
    Comision comision;

    public EmpleadoFijo() {
        
    }
    public boolean tieneComision()
    {
        return porcentajeComision!=-1;
    }
    public double getPorcentajeComision()
    {
        return porcentajeComision;
    }
    public double getSueldo(Calendar fechaInicio, Calendar fechaFin) {
        return this.sueldoFijo;
    }
}
