/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.SqlConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class EmpleadoFijo extends Empleado {

    public double porcentajeComision = -1;
    Comision comision;

    public EmpleadoFijo() {
        
    }

    public EmpleadoFijo(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
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
