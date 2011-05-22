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

    private boolean TieneComision;
    Comision comision;

    public EmpleadoFijo() {
        TieneComision = false;
    }

    public double calcularSueldo(Calendar fechaInicio, Calendar fechaFin) {
        double comisionTotal = comision.getComision(fechaFin);
        return 0.0;
    }

    public double getSueldo(Calendar fechaInicio, Calendar fechaFin) {
        return this.sueldoFijo;
    }
}
