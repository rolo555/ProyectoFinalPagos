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
public class EmpleadoFijo extends Empleado{
    private boolean TieneComision;
    private Sueldo sueldo;
    Comision comision;

    public EmpleadoFijo(){
        TieneComision=false;
        sueldo=new SueldoEmpleadoFijo();
    }

    public double calcularSueldo(Calendar fechaInicio,Calendar fechaFin){
        double comisionTotal =  comision.getComision(fechaFin);
        return 0.0;
    }
}


